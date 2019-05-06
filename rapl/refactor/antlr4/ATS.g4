grammar ATS;

@header
{
  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.util.*;
  import java.util.concurrent.ThreadLocalRandom;

}

@members
{
  UMeR umer = null;
  String mail = null;
  int viagem = 0;
  int cond = 0;
  int cliente = 0;
  int emp = 0;

  private String unquote(String str) {
    return str.substring(1,str.length()-1);
  }

  private boolean addVeiculo(String licencePlate, String vehicleClass, String condition, Point2D.Double position){
            double reliable = -1;
            if (condition.equals("Muito Bom"))  reliable = ThreadLocalRandom.current().nextDouble(80, 100);
            else if (condition.equals("Bom"))        reliable = ThreadLocalRandom.current().nextDouble(60, 80);
            else if (condition.equals("Razoável"))   reliable = ThreadLocalRandom.current().nextDouble(40, 60);
            else if (condition.equals("Mau"))        reliable = ThreadLocalRandom.current().nextDouble(20, 40);
            else if (condition.equals("Muito Mau"))  reliable = ThreadLocalRandom.current().nextDouble(0, 20);

            Vehicle vehicle = null;
            if (vehicleClass.equals("Carro"))       vehicle = new Car(licencePlate, reliable, position, mail);
            else if (vehicleClass.equals("Mota"))        vehicle = new Bike(licencePlate, reliable, position, mail);
            else if (vehicleClass.equals("Carrinha"))    vehicle = new Van(licencePlate, reliable, position, mail);
            else if (vehicleClass.equals("Helicoptero")) vehicle = new Helicopter(licencePlate, reliable, position, mail);

            if (umer.getAllDrivers().get(mail)!=null) {
                    if (umer.registerVehicleP(vehicle)) {
                    umer.changeDriverVehicle(mail, licencePlate);
                    return true;
                }
                else return false;
            }
            else return umer.registerCompanyVehicle(mail, vehicle);
    }
}

/**
 *
 * REGRAS
 *
 */

/** início */

log : funcao ';' log
    | EOF ;

fim : EOF {
    System.out.println("Clientes a registar: "+ cliente);
    System.out.println("Condutores a registar: "+ cond);
    System.out.println("Empresas a registar: "+ emp);
    System.out.println("Viagens Solicitadas: "+ viagem);

};

funcao : regCond
       | regAut
       | regCliente
       | regEmpresa
       | login ';' autenticado;

autenticado : logout ';' funcao
            | solicitar ';' autenticado
            | solicitarE ';' autenticado
            | regAut ';' autenticado
            | viajar ';' autenticado
            | altDisp ';' autenticado;


regCond : 'registar condutor' a=STRING b=STRING c=STRING d=STRING e=DATA g=NUMBER f=STRING? {
    cond++;
    mail=unquote($a.text);
    LocalDate data = LocalDate.parse($e.text);
    double v = Double.parseDouble($g.text);
    String emp = null;
    if ($f.text!=null) emp = unquote($f.text);
    Driver d = new Driver(unquote($a.text),unquote($b.text),unquote($c.text),unquote($d.text),data,v,emp);
    umer.registerUser(d,emp);
};

regCliente : 'registar cliente'  a=STRING b=STRING c=STRING d=STRING e=DATA ('('f=FLOAT', 'g=FLOAT')') {
    cliente++;
    LocalDate data = LocalDate.parse($e.text);
    Client c = new Client(unquote($a.text),unquote($b.text),unquote($c.text),unquote($d.text),data);
    umer.registerUser(c,null);

    if ($f.text!=null){
    double x = Double.parseDouble($f.text);
    double y = Double.parseDouble($g.text);
    Point2D.Double p = new Point2D.Double(x,y);
    umer.getClients().get(unquote($a.text)).setPosition(p);
    }
};

regEmpresa : 'registar empresa' a=STRING b=STRING {
    emp++;
    umer.registerCompany(unquote($a.text),unquote($b.text));
};

regAut : 'registar veiculo' matricula=STRING tipo=STRING estado=STRING ('('x=FLOAT', 'y=FLOAT')'){
  double x = Double.parseDouble($x.text);
  double y = Double.parseDouble($y.text);
  Point2D.Double p = new Point2D.Double(x,y);

  addVeiculo(unquote($matricula.text),unquote($tipo.text),unquote($estado.text),p);
};

login : 'login' a=STRING b=STRING {
    mail=unquote($a.text);
};

logout : 'logout'{
    mail = null;
};

solicitar : 'solicitar' '('a=FLOAT', 'b=FLOAT')' {
    viagem++;
    double x = Double.parseDouble($a.text);
    double y = Double.parseDouble($b.text);
    Point2D.Double p = new Point2D.Double(x,y);
    Trip trip = umer.newTripClosest(umer.getClients().get(mail), p);
    umer.addTrip(mail, trip.getDriver(), trip.getLicencePlate(), trip);
   } ;


solicitarE : 'solicitar especifico' d=STRING '('a=FLOAT', 'b=FLOAT')' {
    System.out.println($d.text);
    viagem++;
    double x = Double.parseDouble($a.text);
    double y = Double.parseDouble($b.text);
    Point2D.Double p = new Point2D.Double(x,y);
    Trip trip = umer.newTripSpecific(umer.getClients().get(mail),unquote($d.text) ,p);
    umer.addTrip(mail, trip.getDriver(), trip.getLicencePlate(), trip);
   } ;


altDisp : 'alterar disponibilidade' {
  umer.changeDriverAvailability(mail,!(umer.getAllDrivers().get(mail).isAvailable()));
};

viajar : 'viajar' {
    umer.doTripQueue(mail);
};


/**
 *
 * TOKENS
 *
 */



/** uma string entre aspas */
STRING : '"' (~[\\"] | '\\' [\\"])* '"' ;

/** data no formato YYYY-MM-DD */
DATA : DIGIT DIGIT DIGIT DIGIT '-' DIGIT? DIGIT '-' DIGIT? DIGIT ;

/** dígito */
DIGIT : [0-9] ;
FLOAT : DIGIT+'.'DIGIT+;
NUMBER : DIGIT+ ;
/** espaço em branco (que é ignorado) */
WS : [ \t\r\n]+ -> skip ;
