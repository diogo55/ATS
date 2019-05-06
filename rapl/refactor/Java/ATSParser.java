// Generated from /home/diogo/universidade/4/ATS/2018atsg004/projecto/src/antlr4/ATS.g4 by ANTLR 4.7

  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.util.*;
  import java.util.concurrent.ThreadLocalRandom;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, DATA=16, DIGIT=17, 
		FLOAT=18, NUMBER=19, WS=20;
	public static final int
		RULE_log = 0, RULE_fim = 1, RULE_funcao = 2, RULE_autenticado = 3, RULE_regCond = 4, 
		RULE_regCliente = 5, RULE_regEmpresa = 6, RULE_regAut = 7, RULE_login = 8, 
		RULE_logout = 9, RULE_solicitar = 10, RULE_solicitarE = 11, RULE_altDisp = 12, 
		RULE_viajar = 13;
	public static final String[] ruleNames = {
		"log", "fim", "funcao", "autenticado", "regCond", "regCliente", "regEmpresa", 
		"regAut", "login", "logout", "solicitar", "solicitarE", "altDisp", "viajar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'registar condutor'", "'registar cliente'", "'('", "', '", 
		"')'", "'registar empresa'", "'registar veiculo'", "'login'", "'logout'", 
		"'solicitar'", "'solicitar especifico'", "'alterar disponibilidade'", 
		"'viajar'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "STRING", "DATA", "DIGIT", "FLOAT", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ATS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public ATSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LogContext extends ParserRuleContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ATSParser.EOF, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				funcao();
				setState(29);
				match(T__0);
				setState(30);
				log();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FimContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ATSParser.EOF, 0); }
		public FimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterFim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitFim(this);
		}
	}

	public final FimContext fim() throws RecognitionException {
		FimContext _localctx = new FimContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(EOF);

			    System.out.println("Clientes a registar: "+ cliente);
			    System.out.println("Condutores a registar: "+ cond);
			    System.out.println("Empresas a registar: "+ emp);
			    System.out.println("Viagens Solicitadas: "+ viagem);


			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public RegCondContext regCond() {
			return getRuleContext(RegCondContext.class,0);
		}
		public RegAutContext regAut() {
			return getRuleContext(RegAutContext.class,0);
		}
		public RegClienteContext regCliente() {
			return getRuleContext(RegClienteContext.class,0);
		}
		public RegEmpresaContext regEmpresa() {
			return getRuleContext(RegEmpresaContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public AutenticadoContext autenticado() {
			return getRuleContext(AutenticadoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				regCond();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				regAut();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				regCliente();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				regEmpresa();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				login();
				setState(43);
				match(T__0);
				setState(44);
				autenticado();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutenticadoContext extends ParserRuleContext {
		public LogoutContext logout() {
			return getRuleContext(LogoutContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public SolicitarContext solicitar() {
			return getRuleContext(SolicitarContext.class,0);
		}
		public AutenticadoContext autenticado() {
			return getRuleContext(AutenticadoContext.class,0);
		}
		public SolicitarEContext solicitarE() {
			return getRuleContext(SolicitarEContext.class,0);
		}
		public RegAutContext regAut() {
			return getRuleContext(RegAutContext.class,0);
		}
		public ViajarContext viajar() {
			return getRuleContext(ViajarContext.class,0);
		}
		public AltDispContext altDisp() {
			return getRuleContext(AltDispContext.class,0);
		}
		public AutenticadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autenticado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterAutenticado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitAutenticado(this);
		}
	}

	public final AutenticadoContext autenticado() throws RecognitionException {
		AutenticadoContext _localctx = new AutenticadoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_autenticado);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				logout();
				setState(49);
				match(T__0);
				setState(50);
				funcao();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				solicitar();
				setState(53);
				match(T__0);
				setState(54);
				autenticado();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				solicitarE();
				setState(57);
				match(T__0);
				setState(58);
				autenticado();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				regAut();
				setState(61);
				match(T__0);
				setState(62);
				autenticado();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				viajar();
				setState(65);
				match(T__0);
				setState(66);
				autenticado();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				altDisp();
				setState(69);
				match(T__0);
				setState(70);
				autenticado();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegCondContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public Token e;
		public Token g;
		public Token f;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public TerminalNode DATA() { return getToken(ATSParser.DATA, 0); }
		public TerminalNode NUMBER() { return getToken(ATSParser.NUMBER, 0); }
		public RegCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterRegCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitRegCond(this);
		}
	}

	public final RegCondContext regCond() throws RecognitionException {
		RegCondContext _localctx = new RegCondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_regCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__1);
			setState(75);
			((RegCondContext)_localctx).a = match(STRING);
			setState(76);
			((RegCondContext)_localctx).b = match(STRING);
			setState(77);
			((RegCondContext)_localctx).c = match(STRING);
			setState(78);
			((RegCondContext)_localctx).d = match(STRING);
			setState(79);
			((RegCondContext)_localctx).e = match(DATA);
			setState(80);
			((RegCondContext)_localctx).g = match(NUMBER);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(81);
				((RegCondContext)_localctx).f = match(STRING);
				}
			}


			    cond++;
			    mail=unquote((((RegCondContext)_localctx).a!=null?((RegCondContext)_localctx).a.getText():null));
			    LocalDate data = LocalDate.parse((((RegCondContext)_localctx).e!=null?((RegCondContext)_localctx).e.getText():null));
			    double v = Double.parseDouble((((RegCondContext)_localctx).g!=null?((RegCondContext)_localctx).g.getText():null));
			    String emp = null;
			    if ((((RegCondContext)_localctx).f!=null?((RegCondContext)_localctx).f.getText():null)!=null) emp = unquote((((RegCondContext)_localctx).f!=null?((RegCondContext)_localctx).f.getText():null));
			    Driver d = new Driver(unquote((((RegCondContext)_localctx).a!=null?((RegCondContext)_localctx).a.getText():null)),unquote((((RegCondContext)_localctx).b!=null?((RegCondContext)_localctx).b.getText():null)),unquote((((RegCondContext)_localctx).c!=null?((RegCondContext)_localctx).c.getText():null)),unquote((((RegCondContext)_localctx).d!=null?((RegCondContext)_localctx).d.getText():null)),data,v,emp);
			    umer.registerUser(d,emp);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegClienteContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public Token e;
		public Token f;
		public Token g;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public TerminalNode DATA() { return getToken(ATSParser.DATA, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(ATSParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ATSParser.FLOAT, i);
		}
		public RegClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regCliente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterRegCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitRegCliente(this);
		}
	}

	public final RegClienteContext regCliente() throws RecognitionException {
		RegClienteContext _localctx = new RegClienteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_regCliente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__2);
			setState(87);
			((RegClienteContext)_localctx).a = match(STRING);
			setState(88);
			((RegClienteContext)_localctx).b = match(STRING);
			setState(89);
			((RegClienteContext)_localctx).c = match(STRING);
			setState(90);
			((RegClienteContext)_localctx).d = match(STRING);
			setState(91);
			((RegClienteContext)_localctx).e = match(DATA);
			{
			setState(92);
			match(T__3);
			setState(93);
			((RegClienteContext)_localctx).f = match(FLOAT);
			setState(94);
			match(T__4);
			setState(95);
			((RegClienteContext)_localctx).g = match(FLOAT);
			setState(96);
			match(T__5);
			}

			    cliente++;
			    LocalDate data = LocalDate.parse((((RegClienteContext)_localctx).e!=null?((RegClienteContext)_localctx).e.getText():null));
			    Client c = new Client(unquote((((RegClienteContext)_localctx).a!=null?((RegClienteContext)_localctx).a.getText():null)),unquote((((RegClienteContext)_localctx).b!=null?((RegClienteContext)_localctx).b.getText():null)),unquote((((RegClienteContext)_localctx).c!=null?((RegClienteContext)_localctx).c.getText():null)),unquote((((RegClienteContext)_localctx).d!=null?((RegClienteContext)_localctx).d.getText():null)),data);
			    umer.registerUser(c,null);

			    if ((((RegClienteContext)_localctx).f!=null?((RegClienteContext)_localctx).f.getText():null)!=null){
			    double x = Double.parseDouble((((RegClienteContext)_localctx).f!=null?((RegClienteContext)_localctx).f.getText():null));
			    double y = Double.parseDouble((((RegClienteContext)_localctx).g!=null?((RegClienteContext)_localctx).g.getText():null));
			    Point2D.Double p = new Point2D.Double(x,y);
			    umer.getClients().get(unquote((((RegClienteContext)_localctx).a!=null?((RegClienteContext)_localctx).a.getText():null))).setPosition(p);
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegEmpresaContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public RegEmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regEmpresa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterRegEmpresa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitRegEmpresa(this);
		}
	}

	public final RegEmpresaContext regEmpresa() throws RecognitionException {
		RegEmpresaContext _localctx = new RegEmpresaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_regEmpresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__6);
			setState(101);
			((RegEmpresaContext)_localctx).a = match(STRING);
			setState(102);
			((RegEmpresaContext)_localctx).b = match(STRING);

			    emp++;
			    umer.registerCompany(unquote((((RegEmpresaContext)_localctx).a!=null?((RegEmpresaContext)_localctx).a.getText():null)),unquote((((RegEmpresaContext)_localctx).b!=null?((RegEmpresaContext)_localctx).b.getText():null)));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegAutContext extends ParserRuleContext {
		public Token matricula;
		public Token tipo;
		public Token estado;
		public Token x;
		public Token y;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ATSParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ATSParser.FLOAT, i);
		}
		public RegAutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regAut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterRegAut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitRegAut(this);
		}
	}

	public final RegAutContext regAut() throws RecognitionException {
		RegAutContext _localctx = new RegAutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_regAut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__7);
			setState(106);
			((RegAutContext)_localctx).matricula = match(STRING);
			setState(107);
			((RegAutContext)_localctx).tipo = match(STRING);
			setState(108);
			((RegAutContext)_localctx).estado = match(STRING);
			{
			setState(109);
			match(T__3);
			setState(110);
			((RegAutContext)_localctx).x = match(FLOAT);
			setState(111);
			match(T__4);
			setState(112);
			((RegAutContext)_localctx).y = match(FLOAT);
			setState(113);
			match(T__5);
			}

			  double x = Double.parseDouble((((RegAutContext)_localctx).x!=null?((RegAutContext)_localctx).x.getText():null));
			  double y = Double.parseDouble((((RegAutContext)_localctx).y!=null?((RegAutContext)_localctx).y.getText():null));
			  Point2D.Double p = new Point2D.Double(x,y);

			  addVeiculo(unquote((((RegAutContext)_localctx).matricula!=null?((RegAutContext)_localctx).matricula.getText():null)),unquote((((RegAutContext)_localctx).tipo!=null?((RegAutContext)_localctx).tipo.getText():null)),unquote((((RegAutContext)_localctx).estado!=null?((RegAutContext)_localctx).estado.getText():null)),p);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoginContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public List<TerminalNode> STRING() { return getTokens(ATSParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATSParser.STRING, i);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitLogin(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);
			setState(118);
			((LoginContext)_localctx).a = match(STRING);
			setState(119);
			((LoginContext)_localctx).b = match(STRING);

			    mail=unquote((((LoginContext)_localctx).a!=null?((LoginContext)_localctx).a.getText():null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogoutContext extends ParserRuleContext {
		public LogoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterLogout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitLogout(this);
		}
	}

	public final LogoutContext logout() throws RecognitionException {
		LogoutContext _localctx = new LogoutContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__9);

			    mail = null;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SolicitarContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public List<TerminalNode> FLOAT() { return getTokens(ATSParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ATSParser.FLOAT, i);
		}
		public SolicitarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solicitar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterSolicitar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitSolicitar(this);
		}
	}

	public final SolicitarContext solicitar() throws RecognitionException {
		SolicitarContext _localctx = new SolicitarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_solicitar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__10);
			setState(126);
			match(T__3);
			setState(127);
			((SolicitarContext)_localctx).a = match(FLOAT);
			setState(128);
			match(T__4);
			setState(129);
			((SolicitarContext)_localctx).b = match(FLOAT);
			setState(130);
			match(T__5);

			    viagem++;
			    double x = Double.parseDouble((((SolicitarContext)_localctx).a!=null?((SolicitarContext)_localctx).a.getText():null));
			    double y = Double.parseDouble((((SolicitarContext)_localctx).b!=null?((SolicitarContext)_localctx).b.getText():null));
			    Point2D.Double p = new Point2D.Double(x,y);
			    Trip trip = umer.newTripClosest(umer.getClients().get(mail), p);
			    umer.addTrip(mail, trip.getDriver(), trip.getLicencePlate(), trip);
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SolicitarEContext extends ParserRuleContext {
		public Token d;
		public Token a;
		public Token b;
		public TerminalNode STRING() { return getToken(ATSParser.STRING, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(ATSParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ATSParser.FLOAT, i);
		}
		public SolicitarEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solicitarE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterSolicitarE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitSolicitarE(this);
		}
	}

	public final SolicitarEContext solicitarE() throws RecognitionException {
		SolicitarEContext _localctx = new SolicitarEContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_solicitarE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__11);
			setState(134);
			((SolicitarEContext)_localctx).d = match(STRING);
			setState(135);
			match(T__3);
			setState(136);
			((SolicitarEContext)_localctx).a = match(FLOAT);
			setState(137);
			match(T__4);
			setState(138);
			((SolicitarEContext)_localctx).b = match(FLOAT);
			setState(139);
			match(T__5);

			    viagem++;
			    double x = Double.parseDouble((((SolicitarEContext)_localctx).a!=null?((SolicitarEContext)_localctx).a.getText():null));
			    double y = Double.parseDouble((((SolicitarEContext)_localctx).b!=null?((SolicitarEContext)_localctx).b.getText():null));
			    Point2D.Double p = new Point2D.Double(x,y);
			    Trip trip = umer.newTripSpecific(umer.getClients().get(mail),unquote((((SolicitarEContext)_localctx).d!=null?((SolicitarEContext)_localctx).d.getText():null)) ,p);
			    umer.addTrip(mail, trip.getDriver(), trip.getLicencePlate(), trip);
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltDispContext extends ParserRuleContext {
		public AltDispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altDisp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterAltDisp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitAltDisp(this);
		}
	}

	public final AltDispContext altDisp() throws RecognitionException {
		AltDispContext _localctx = new AltDispContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_altDisp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__12);

			  umer.changeDriverAvailability(mail,!(umer.getAllDrivers().get(mail).isAvailable()));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViajarContext extends ParserRuleContext {
		public ViajarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viajar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).enterViajar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATSListener ) ((ATSListener)listener).exitViajar(this);
		}
	}

	public final ViajarContext viajar() throws RecognitionException {
		ViajarContext _localctx = new ViajarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_viajar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__13);

			    umer.doTripQueue(mail);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\5\2$\n\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\2\2\u0093\2#\3\2\2\2\4%\3\2\2\2\6\60\3\2"+
		"\2\2\bJ\3\2\2\2\nL\3\2\2\2\fX\3\2\2\2\16f\3\2\2\2\20k\3\2\2\2\22w\3\2"+
		"\2\2\24|\3\2\2\2\26\177\3\2\2\2\30\u0087\3\2\2\2\32\u0090\3\2\2\2\34\u0093"+
		"\3\2\2\2\36\37\5\6\4\2\37 \7\3\2\2 !\5\2\2\2!$\3\2\2\2\"$\7\2\2\3#\36"+
		"\3\2\2\2#\"\3\2\2\2$\3\3\2\2\2%&\7\2\2\3&\'\b\3\1\2\'\5\3\2\2\2(\61\5"+
		"\n\6\2)\61\5\20\t\2*\61\5\f\7\2+\61\5\16\b\2,-\5\22\n\2-.\7\3\2\2./\5"+
		"\b\5\2/\61\3\2\2\2\60(\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60"+
		",\3\2\2\2\61\7\3\2\2\2\62\63\5\24\13\2\63\64\7\3\2\2\64\65\5\6\4\2\65"+
		"K\3\2\2\2\66\67\5\26\f\2\678\7\3\2\289\5\b\5\29K\3\2\2\2:;\5\30\r\2;<"+
		"\7\3\2\2<=\5\b\5\2=K\3\2\2\2>?\5\20\t\2?@\7\3\2\2@A\5\b\5\2AK\3\2\2\2"+
		"BC\5\34\17\2CD\7\3\2\2DE\5\b\5\2EK\3\2\2\2FG\5\32\16\2GH\7\3\2\2HI\5\b"+
		"\5\2IK\3\2\2\2J\62\3\2\2\2J\66\3\2\2\2J:\3\2\2\2J>\3\2\2\2JB\3\2\2\2J"+
		"F\3\2\2\2K\t\3\2\2\2LM\7\4\2\2MN\7\21\2\2NO\7\21\2\2OP\7\21\2\2PQ\7\21"+
		"\2\2QR\7\22\2\2RT\7\25\2\2SU\7\21\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW"+
		"\b\6\1\2W\13\3\2\2\2XY\7\5\2\2YZ\7\21\2\2Z[\7\21\2\2[\\\7\21\2\2\\]\7"+
		"\21\2\2]^\7\22\2\2^_\7\6\2\2_`\7\24\2\2`a\7\7\2\2ab\7\24\2\2bc\7\b\2\2"+
		"cd\3\2\2\2de\b\7\1\2e\r\3\2\2\2fg\7\t\2\2gh\7\21\2\2hi\7\21\2\2ij\b\b"+
		"\1\2j\17\3\2\2\2kl\7\n\2\2lm\7\21\2\2mn\7\21\2\2no\7\21\2\2op\7\6\2\2"+
		"pq\7\24\2\2qr\7\7\2\2rs\7\24\2\2st\7\b\2\2tu\3\2\2\2uv\b\t\1\2v\21\3\2"+
		"\2\2wx\7\13\2\2xy\7\21\2\2yz\7\21\2\2z{\b\n\1\2{\23\3\2\2\2|}\7\f\2\2"+
		"}~\b\13\1\2~\25\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\7\6\2\2\u0081\u0082"+
		"\7\24\2\2\u0082\u0083\7\7\2\2\u0083\u0084\7\24\2\2\u0084\u0085\7\b\2\2"+
		"\u0085\u0086\b\f\1\2\u0086\27\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089"+
		"\7\21\2\2\u0089\u008a\7\6\2\2\u008a\u008b\7\24\2\2\u008b\u008c\7\7\2\2"+
		"\u008c\u008d\7\24\2\2\u008d\u008e\7\b\2\2\u008e\u008f\b\r\1\2\u008f\31"+
		"\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0092\b\16\1\2\u0092\33\3\2\2\2\u0093"+
		"\u0094\7\20\2\2\u0094\u0095\b\17\1\2\u0095\35\3\2\2\2\6#\60JT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}