module Main where

import CodigosPostais
import Nomes
import Utils
import Control.Monad
import Control.Monad.State.Strict
import Test.QuickCheck


-- | Função principal.
main :: IO ()
main = do cps <- codigosPostais "../codigos_postais.csv"
          users <- generate $ evalStateT (gerador cps (-1)) defaultState
          writeFile "../../projecto/log.txt" $ unlines $ filter (/="") users

gerador :: [CodigoPostal] -> Int -> MyState [String]
gerador _ 0 = return []
gerador cps (-1) = do
  n <- lift $ choose(700,1000)
  h <- gerador cps n
  return h
gerador cps n = do 
  function <- lift $ elements [genRegistar cps ,genLogin]
  head <- function
  tail <- gerador cps (n-1)
  return (head:tail)

regUser = elements [1,2,2]

genRegistar :: [CodigoPostal] -> MyState String
genRegistar cps = do (Lista clientes drivers emp) <- get
                     f <- lift $ frequency [(8, regUser),(2, elements [3])]
                     a <- registar f cps
                     return a

genLogin :: MyState String
genLogin = do (Lista clientes drivers emp) <- get
              s <-lift $ elements [1,2,3]
              a <- login s
              return $ a 

registar:: Int -> [CodigoPostal] -> MyState String
registar c cps = do (Lista clientes drivers emp) <- get
                    let reg = if (c==1) then (genCliente cps)
                              else if (c==2) then (genDriver cps) 
                                   else genCompany
                    fin <- reg
                    return fin

login :: Int -> MyState String
login c = do (Lista clientes drivers emp) <- get
             let reg = if (c==1) then (loginCliente clientes)
                       else if (c==2) then (loginDriver drivers) 
                            else (loginCompany emp)
             s <- lift $ reg
             let estado = if ((c==1) && (s /= "")) then (clienteLogado)
                          else if (c==2 && (s /= "")) then (driverLogado)
                          else if (s /= "") then (companyLogado)
                          else return ("")  
             es <- estado
             return (s ++ "\n" ++ es)




-- * Estado do Gerador de Logs
-- | Estado do gerador.
data GenState
  = GenState
  { stLocalidades :: [CodigoPostal]
  }  

data User = User { name :: String
                 , pass :: String
                 }
                 deriving (Eq,Show)

data Lista = Lista 
    { stClientes :: [User]
  , stDrivers :: [User]
  , stEmpresas :: [User]
    }

-- | Estado por pré-definido para o gerado.
defaultState = Lista [] [] []

defaultGenState :: GenState
defaultGenState
  = GenState 
    { stLocalidades = []
    }


-- | Tipo do gerador com estado.
type StGen a = StateT GenState Gen a

type MyState a = StateT Lista Gen a 
-- | Executa um gerador com estado.
runGeneration :: [CodigoPostal] -> StGen a -> Gen a
runGeneration localidades g = evalStateT g defaultGenState { stLocalidades = localidades }
 
-- * Geradores
------------------------------------ Clientes------------------------------------------------

-- | Gera uma Password
genPass :: Gen String
genPass = do
  pass <- listOf1 $ elements ['a'..'z']
  return pass 
  

-- | Gera um nome e mail
genNome :: Gen String 
genNome = do
  nome <- elements listaNomes
  apelido <- elements listaApelidos
  return $ nome++" "++apelido

genMail :: String -> Gen String
genMail a = do
  let b = splitOn ' ' a 
  c <- vectorOf 1 $ elements [' ','_','-','.']
  end <- elements ["@hotmail.com","@gmail.com","@alunos.uminho.pt","@sapo.pt"]
  let mail = if (c==" ") then b!!0++b!!1++end
              else b!!0++c++b!!1++end
  return mail

-- | Gera uma morada.
genMorada :: StGen String
genMorada = do
  -- busca a lista de códigos postais
  localidades <- gets stLocalidades
  -- selecciona uma das localidades
  loc <- lift $ elements localidades
  -- gera um número de polícia
  num <- lift $ choose (1::Int, 2500)
  -- retorna uma representação textual da morada
  return $ cpRua loc ++ ", " ++ show num ++ ", " ++ cpCodigo loc ++ " " ++ cpLocalidade loc

genCliente :: [CodigoPostal] -> MyState String
genCliente cps = do (Lista clientes drivers emp) <- get
                    mor <- lift $ runGeneration cps genMorada
                    n <- lift $ genNome
                    m <- lift $ genMail n
                    p <- lift $ genPass
                    d <- lift $ genDate
                    pos <- lift $ genCoordenadas
                    let usr = User m p
                    put (Lista (usr:clientes) drivers emp)
                    return ("registar cliente " ++ show m ++ " " ++ show n ++" "++ show p ++ " " ++ show mor ++" "++ d ++ " " ++ pos++";\n")


loginCliente :: [User] -> Gen String
loginCliente x = do 
                  case x of
                       [] -> return ""
                       l -> do usr <- elements l
                               let f = "login " ++ show (name usr) ++ " " ++ show (pass usr) ++ ";"
                               return (f)

clienteLogado :: MyState String
clienteLogado = do
  funcao <- lift $ elements [genSolicitar,logout]
  f <- funcao
  return f

-------------------------------------------------------------------------------------------------------         
------------------------------------ Condutores------------------------------------------------
-- | Gera uma Data
genDate :: Gen String
genDate = do
  d <- elements [1..30]
  m <- elements [01..12]
  a <- elements [1955..2000]
  let mes = if (m<10) then ("0"++show m)
            else (show m)
  let dia = if(d<10) then ("0"++show d)
            else show d
  let date = dataToString(a,mes,dia)
  return date

-- | Gera Time Compliance para o condutor
genTimeCompliance :: Gen Int
genTimeCompliance = do
  a <- choose (10,100)
  return a


genViajar :: MyState String
genViajar= do 
        a <- lift $ elements ["viajar ;"]
        f <- driverLogado
        return $ a ++ "\n" ++ f 

-- | Alterar disponibilidade
genDisponivel :: MyState String
genDisponivel = do 
        a <- lift $ elements ["alterar disponibilidade ;"]
        f <- driverLogado
        return $ a ++ "\n" ++ f 
                      
-- | Gera um Condutor
genDriver :: [CodigoPostal] -> MyState String
genDriver cps = do (Lista clientes drivers emp) <- get
                   mor <- lift $ runGeneration cps genMorada
                   n <- lift $ genNome
                   m <- lift $ genMail n
                   p <- lift $ genPass
                   d <- lift $ genDate
                   t <- lift $ genTimeCompliance
                   e <- lift $ frequency [(8,elements ["null"]),(2,(getUser emp))]
                   let usr = User m p
                   put (Lista clientes (usr:drivers) emp)
                   let driver = if (e=="null") then show m ++ " " ++ show n ++" "++ show p ++ " " ++ show mor ++ " " ++ d ++ " " ++ show t
                                else show m ++ " " ++ show n ++" "++ show p ++ " " ++ show mor ++ " " ++ d ++ " " ++ show t ++ " " ++ show e
                   let int = if (e=="null") then 0
                             else -1
                   car <- genVeiculo int
                   let fin = if (e=="null") then "registar condutor "++ driver ++ ";\n" ++ car 
                             else "registar condutor "++ driver ++ ";\n"
                   return (fin)

getUser :: [User] -> Gen String
getUser emp = do 
              case emp of 
                   [] -> return "null"
                   l -> do emp <- elements l
                           return $ (name emp)

loginDriver :: [User] -> Gen String
loginDriver x = do 
                  case x of
                       [] -> return ""
                       l -> do usr <- elements l
                               return ("login " ++ show (name usr) ++ " " ++ show (pass usr) ++ ";")

driverLogado :: MyState String
driverLogado = do
  funcao <- lift $ elements [genDisponivel,logout]
  f <- funcao
  return f
  
  ----------------------------------------------------------------------------------------------------------
-- | Gera Coordenadas
genCoordenadas :: Gen String
genCoordenadas = do
  x <- choose(0,100)
  x1 <- choose (0,9)
  y <- choose (0,100)
  y1 <- choose (0,9)
  let c = coordToString(x,x1,y,y1)
  return c



genSolicitar :: MyState String
genSolicitar = do (Lista clientes drivers emp) <- get
                  s <-lift $ frequency[(10,solicitar),(0,solicitarE emp),(0,solicitarM drivers)]
                  f <- clienteLogado
                  return (s++ "\n" ++ f)

solicitar :: Gen String
solicitar = do
    coord <- genCoordenadas
    return ("solicitar "++ coord ++ ";")

solicitarM :: [User] -> Gen String
solicitarM u = do
  coord <- genCoordenadas
  usr <- getUser u
  let final = if (usr=="null") then "solicitar " ++ coord ++ ";"
              else "solicitar especifico " ++ show usr ++" "++coord ++";"
  return final

solicitarE :: [User] -> Gen String
solicitarE u = do
  coord <- genCoordenadas
  usr <- getUser u
  let final = if (usr=="null") then "solicitar " ++ coord ++ ";"
              else "solicitar especifico " ++ show usr ++" "++coord ++";"
  return final

-------------------------------------------------------------------------------------------------
------------------------------------ Veiculos------------------------------------------------
genMatricula :: Gen String
genMatricula = do
  a <- vectorOf 2 $ elements ['0'..'9']
  b <- vectorOf 2 $ elements ['0'..'9']
  c <- vectorOf 2 $ elements ['A'..'Z']
  tipo <- choose(1,3)
  let m = matToString(a,b,c,tipo)
  return m

genVeiculo :: Int -> MyState String
genVeiculo x = do
  m <- lift $ genMatricula
  classe <- lift $ frequency[(5,elements ["Carro"]),(4,elements ["Mota","Carrinha"]),(1,elements ["Helicoptero"])]
  estado <- lift $ frequency[(3,elements["Razoavel"]),(5,elements["Muito Bom","Bom"]),(2,elements["Mau","Muito Mau"])]
  pos <- lift $ genCoordenadas
  let a = if (x==0) then "registar veiculo "++show m ++" "++show classe++" "++show estado++" "++pos++ ";\n"
          else if(x==1) then "registar veiculo "++show m ++" "++show classe++" "++show estado++" "++pos++ ";\n"
          else ""

  let b = if (x==1) then (companyLogado)
          else return ("")
  c <- b
  return $ a++" "++ c

-------------------------------------------------------------------------------------------------------
-----------------------------------------Empresas------------------------------------------------------
genCompany :: MyState String
genCompany = do (Lista clientes drivers emp) <- get
                n <- lift $ elements listaCompanhias
                p <- lift $ genPass
                let usr = User n p
                put (Lista clientes drivers (usr:emp))
                return ("registar empresa " ++ show n ++" "++ show p ++ ";\n")

loginCompany :: [User] -> Gen String
loginCompany x = do 
                    case x of
                         [] -> return ""
                         l -> do usr <- elements l
                                 return ("login " ++ show (name usr) ++ " " ++ show (pass usr) ++ ";")

companyLogado :: MyState String
companyLogado = do
  funcao <- lift $ elements [(genVeiculo 1),logout]
  f <- funcao
  return f

logout :: MyState String
logout = do
        a <- lift $ elements ["logout;\n"]
        return $ a
-------------------------------------------------------------------------------------------------------
                                      -- AUX 
dataToString :: (Int,String,String) -> String
dataToString (d,m,a) = show d ++ "-" ++ m ++ "-" ++ a

coordToString :: (Int,Int,Int,Int) -> String
coordToString (x,x1,y,y1) = "("++show x++"."++show x1 ++", "++show y++"."++show y1 ++ ")"

matToString :: (String,String,String,Int) -> String
matToString (a,b,c,d) = if (d==1) then a ++"-"++b ++ "-"++ c
            else if (d==2) then a ++"-"++c ++ "-"++b
            else c ++"-"++b ++ "-"++a
