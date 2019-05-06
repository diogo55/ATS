// Generated from /home/diogo/universidade/4/ATS/2018atsg004/projecto/src/antlr4/ATS.g4 by ANTLR 4.7

  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.util.*;
  import java.util.concurrent.ThreadLocalRandom;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, DATA=16, DIGIT=17, 
		FLOAT=18, NUMBER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "STRING", "DATA", "DIGIT", 
		"FLOAT", "NUMBER", "WS"
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


	public ATSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ATS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00f7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\7\20\u00c9\n\20\f\20\16\20\u00cc\13\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00d6\n\21\3\21\3\21\3\21\5\21\u00db\n\21\3\21"+
		"\3\21\3\22\3\22\3\23\6\23\u00e2\n\23\r\23\16\23\u00e3\3\23\3\23\6\23\u00e8"+
		"\n\23\r\23\16\23\u00e9\3\24\6\24\u00ed\n\24\r\24\16\24\u00ee\3\25\6\25"+
		"\u00f2\n\25\r\25\16\25\u00f3\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"\3\2\5\4\2$$^^\3\2\62;\5\2\13\f\17\17\"\"\2\u00fe\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7?\3\2\2\2\tP\3\2\2\2\13R\3\2"+
		"\2\2\rU\3\2\2\2\17W\3\2\2\2\21h\3\2\2\2\23y\3\2\2\2\25\177\3\2\2\2\27"+
		"\u0086\3\2\2\2\31\u0090\3\2\2\2\33\u00a5\3\2\2\2\35\u00bd\3\2\2\2\37\u00c4"+
		"\3\2\2\2!\u00cf\3\2\2\2#\u00de\3\2\2\2%\u00e1\3\2\2\2\'\u00ec\3\2\2\2"+
		")\u00f1\3\2\2\2+,\7=\2\2,\4\3\2\2\2-.\7t\2\2./\7g\2\2/\60\7i\2\2\60\61"+
		"\7k\2\2\61\62\7u\2\2\62\63\7v\2\2\63\64\7c\2\2\64\65\7t\2\2\65\66\7\""+
		"\2\2\66\67\7e\2\2\678\7q\2\289\7p\2\29:\7f\2\2:;\7w\2\2;<\7v\2\2<=\7q"+
		"\2\2=>\7t\2\2>\6\3\2\2\2?@\7t\2\2@A\7g\2\2AB\7i\2\2BC\7k\2\2CD\7u\2\2"+
		"DE\7v\2\2EF\7c\2\2FG\7t\2\2GH\7\"\2\2HI\7e\2\2IJ\7n\2\2JK\7k\2\2KL\7g"+
		"\2\2LM\7p\2\2MN\7v\2\2NO\7g\2\2O\b\3\2\2\2PQ\7*\2\2Q\n\3\2\2\2RS\7.\2"+
		"\2ST\7\"\2\2T\f\3\2\2\2UV\7+\2\2V\16\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7i\2"+
		"\2Z[\7k\2\2[\\\7u\2\2\\]\7v\2\2]^\7c\2\2^_\7t\2\2_`\7\"\2\2`a\7g\2\2a"+
		"b\7o\2\2bc\7r\2\2cd\7t\2\2de\7g\2\2ef\7u\2\2fg\7c\2\2g\20\3\2\2\2hi\7"+
		"t\2\2ij\7g\2\2jk\7i\2\2kl\7k\2\2lm\7u\2\2mn\7v\2\2no\7c\2\2op\7t\2\2p"+
		"q\7\"\2\2qr\7x\2\2rs\7g\2\2st\7k\2\2tu\7e\2\2uv\7w\2\2vw\7n\2\2wx\7q\2"+
		"\2x\22\3\2\2\2yz\7n\2\2z{\7q\2\2{|\7i\2\2|}\7k\2\2}~\7p\2\2~\24\3\2\2"+
		"\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081\u0082\7i\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0084\7w\2\2\u0084\u0085\7v\2\2\u0085\26\3\2\2\2\u0086\u0087"+
		"\7u\2\2\u0087\u0088\7q\2\2\u0088\u0089\7n\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7e\2\2\u008b\u008c\7k\2\2\u008c\u008d\7v\2\2\u008d\u008e\7c\2\2"+
		"\u008e\u008f\7t\2\2\u008f\30\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092\7"+
		"q\2\2\u0092\u0093\7n\2\2\u0093\u0094\7k\2\2\u0094\u0095\7e\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7v\2\2\u0097\u0098\7c\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7\"\2\2\u009a\u009b\7g\2\2\u009b\u009c\7u\2\2\u009c\u009d\7r\2"+
		"\2\u009d\u009e\7g\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\32\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2"+
		"\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7k\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7p\2\2\u00b3"+
		"\u00b4\7k\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2"+
		"\u00b7\u00b8\7k\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7x\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7l\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\36\3\2\2\2\u00c4\u00ca\7$\2\2\u00c5\u00c9\n\2\2\2"+
		"\u00c6\u00c7\7^\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce \3\2\2\2\u00cf"+
		"\u00d0\5#\22\2\u00d0\u00d1\5#\22\2\u00d1\u00d2\5#\22\2\u00d2\u00d3\5#"+
		"\22\2\u00d3\u00d5\7/\2\2\u00d4\u00d6\5#\22\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5#\22\2\u00d8\u00da\7/"+
		"\2\2\u00d9\u00db\5#\22\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\5#\22\2\u00dd\"\3\2\2\2\u00de\u00df\t\3\2\2"+
		"\u00df$\3\2\2\2\u00e0\u00e2\5#\22\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\7\60\2\2\u00e6\u00e8\5#\22\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea&\3\2\2\2\u00eb\u00ed"+
		"\5#\22\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef(\3\2\2\2\u00f0\u00f2\t\4\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\b\25\2\2\u00f6*\3\2\2\2\13\2\u00c8\u00ca\u00d5\u00da"+
		"\u00e3\u00e9\u00ee\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}