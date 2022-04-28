// Generated from /Users/jack/Documents/compilers/Assignment/ccal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ccalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Const=2, Return=3, Integer=4, Void=5, Main=6, If=7, Else=8, 
		While=9, Skip=10, Boolean=11, True=12, False=13, BOOLEAN=14, ID=15, NUMBER=16, 
		LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, SEMI=21, COMMA=22, ASSIGN=23, 
		GT=24, LT=25, TILDE=26, COLON=27, EQUAL=28, LE=29, GE=30, NOTEQUAL=31, 
		AND=32, OR=33, ADD=34, SUB=35, WS=36, MULTI_LINE_COMMENT=37, SINGLE_LINE_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Variable", "Const", "Return", "Integer", "Void", "Main", "If", "Else", 
			"While", "Skip", "Boolean", "True", "False", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", 
			"V", "W", "Letter", "Digit", "UnderScore", "BOOLEAN", "ID", "NUMBER", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", "ASSIGN", "GT", 
			"LT", "TILDE", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
			"ADD", "SUB", "WS", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'='", "'>'", "'<'", "'~'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variable", "Const", "Return", "Integer", "Void", "Main", "If", 
			"Else", "While", "Skip", "Boolean", "True", "False", "BOOLEAN", "ID", 
			"NUMBER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", "ASSIGN", 
			"GT", "LT", "TILDE", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "ADD", "SUB", "WS", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ccalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ccal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0166\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0102\n\'\3(\3(\3(\3(\7(\u0108\n(\f(\16(\u010b\13(\3)\3)\5"+
		")\u010f\n)\3)\3)\7)\u0113\n)\f)\16)\u0116\13)\5)\u0118\n)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3"+
		":\3:\3:\3;\3;\3<\3<\3=\6=\u0147\n=\r=\16=\u0148\3=\3=\3>\3>\3>\3>\3>\7"+
		">\u0152\n>\f>\16>\u0155\13>\3>\3>\3>\3>\3>\3?\3?\3?\3?\7?\u0160\n?\f?"+
		"\16?\u0163\13?\3?\3?\3\u0153\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2"+
		"\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\20O\21Q\22S\23U\24W\25Y\26["+
		"\27]\30_\31a\32c\33e\34g\35i\36k\37m o!q\"s#u$w%y&{\'}(\3\2\35\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2C\\c|\3\2\62;\3\2\63;\4\2//\u2214\u2214\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\2\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2M\3\2"+
		"\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2"+
		"\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g"+
		"\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2"+
		"\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2"+
		"\2\2\5\u0083\3\2\2\2\7\u0089\3\2\2\2\t\u0090\3\2\2\2\13\u0098\3\2\2\2"+
		"\r\u009d\3\2\2\2\17\u00a2\3\2\2\2\21\u00a5\3\2\2\2\23\u00aa\3\2\2\2\25"+
		"\u00b0\3\2\2\2\27\u00b5\3\2\2\2\31\u00bd\3\2\2\2\33\u00c2\3\2\2\2\35\u00c8"+
		"\3\2\2\2\37\u00ca\3\2\2\2!\u00cc\3\2\2\2#\u00ce\3\2\2\2%\u00d0\3\2\2\2"+
		"\'\u00d2\3\2\2\2)\u00d4\3\2\2\2+\u00d6\3\2\2\2-\u00d8\3\2\2\2/\u00da\3"+
		"\2\2\2\61\u00dc\3\2\2\2\63\u00de\3\2\2\2\65\u00e0\3\2\2\2\67\u00e2\3\2"+
		"\2\29\u00e4\3\2\2\2;\u00e6\3\2\2\2=\u00e8\3\2\2\2?\u00ea\3\2\2\2A\u00ec"+
		"\3\2\2\2C\u00ee\3\2\2\2E\u00f0\3\2\2\2G\u00f2\3\2\2\2I\u00f4\3\2\2\2K"+
		"\u00f6\3\2\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u0117\3\2\2\2S\u0119\3\2"+
		"\2\2U\u011b\3\2\2\2W\u011d\3\2\2\2Y\u011f\3\2\2\2[\u0121\3\2\2\2]\u0123"+
		"\3\2\2\2_\u0125\3\2\2\2a\u0127\3\2\2\2c\u0129\3\2\2\2e\u012b\3\2\2\2g"+
		"\u012d\3\2\2\2i\u012f\3\2\2\2k\u0132\3\2\2\2m\u0135\3\2\2\2o\u0138\3\2"+
		"\2\2q\u013b\3\2\2\2s\u013e\3\2\2\2u\u0141\3\2\2\2w\u0143\3\2\2\2y\u0146"+
		"\3\2\2\2{\u014c\3\2\2\2}\u015b\3\2\2\2\177\u0080\5C\"\2\u0080\u0081\5"+
		"\35\17\2\u0081\u0082\5;\36\2\u0082\4\3\2\2\2\u0083\u0084\5!\21\2\u0084"+
		"\u0085\5\67\34\2\u0085\u0086\5\65\33\2\u0086\u0087\5=\37\2\u0087\u0088"+
		"\5? \2\u0088\6\3\2\2\2\u0089\u008a\5;\36\2\u008a\u008b\5%\23\2\u008b\u008c"+
		"\5? \2\u008c\u008d\5A!\2\u008d\u008e\5;\36\2\u008e\u008f\5\65\33\2\u008f"+
		"\b\3\2\2\2\u0090\u0091\5-\27\2\u0091\u0092\5\65\33\2\u0092\u0093\5? \2"+
		"\u0093\u0094\5%\23\2\u0094\u0095\5)\25\2\u0095\u0096\5%\23\2\u0096\u0097"+
		"\5;\36\2\u0097\n\3\2\2\2\u0098\u0099\5C\"\2\u0099\u009a\5\67\34\2\u009a"+
		"\u009b\5-\27\2\u009b\u009c\5#\22\2\u009c\f\3\2\2\2\u009d\u009e\5\63\32"+
		"\2\u009e\u009f\5\35\17\2\u009f\u00a0\5-\27\2\u00a0\u00a1\5\65\33\2\u00a1"+
		"\16\3\2\2\2\u00a2\u00a3\5-\27\2\u00a3\u00a4\5\'\24\2\u00a4\20\3\2\2\2"+
		"\u00a5\u00a6\5%\23\2\u00a6\u00a7\5\61\31\2\u00a7\u00a8\5=\37\2\u00a8\u00a9"+
		"\5%\23\2\u00a9\22\3\2\2\2\u00aa\u00ab\5E#\2\u00ab\u00ac\5+\26\2\u00ac"+
		"\u00ad\5-\27\2\u00ad\u00ae\5\61\31\2\u00ae\u00af\5%\23\2\u00af\24\3\2"+
		"\2\2\u00b0\u00b1\5=\37\2\u00b1\u00b2\5/\30\2\u00b2\u00b3\5-\27\2\u00b3"+
		"\u00b4\59\35\2\u00b4\26\3\2\2\2\u00b5\u00b6\5\37\20\2\u00b6\u00b7\5\67"+
		"\34\2\u00b7\u00b8\5\67\34\2\u00b8\u00b9\5\61\31\2\u00b9\u00ba\5%\23\2"+
		"\u00ba\u00bb\5\35\17\2\u00bb\u00bc\5\65\33\2\u00bc\30\3\2\2\2\u00bd\u00be"+
		"\5? \2\u00be\u00bf\5;\36\2\u00bf\u00c0\5A!\2\u00c0\u00c1\5%\23\2\u00c1"+
		"\32\3\2\2\2\u00c2\u00c3\5\'\24\2\u00c3\u00c4\5\35\17\2\u00c4\u00c5\5\61"+
		"\31\2\u00c5\u00c6\5=\37\2\u00c6\u00c7\5%\23\2\u00c7\34\3\2\2\2\u00c8\u00c9"+
		"\t\2\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb \3\2\2\2\u00cc\u00cd"+
		"\t\4\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\t\5\2\2\u00cf$\3\2\2\2\u00d0\u00d1"+
		"\t\6\2\2\u00d1&\3\2\2\2\u00d2\u00d3\t\7\2\2\u00d3(\3\2\2\2\u00d4\u00d5"+
		"\t\b\2\2\u00d5*\3\2\2\2\u00d6\u00d7\t\t\2\2\u00d7,\3\2\2\2\u00d8\u00d9"+
		"\t\n\2\2\u00d9.\3\2\2\2\u00da\u00db\t\13\2\2\u00db\60\3\2\2\2\u00dc\u00dd"+
		"\t\f\2\2\u00dd\62\3\2\2\2\u00de\u00df\t\r\2\2\u00df\64\3\2\2\2\u00e0\u00e1"+
		"\t\16\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\t\17\2\2\u00e38\3\2\2\2\u00e4\u00e5"+
		"\t\20\2\2\u00e5:\3\2\2\2\u00e6\u00e7\t\21\2\2\u00e7<\3\2\2\2\u00e8\u00e9"+
		"\t\22\2\2\u00e9>\3\2\2\2\u00ea\u00eb\t\23\2\2\u00eb@\3\2\2\2\u00ec\u00ed"+
		"\t\24\2\2\u00edB\3\2\2\2\u00ee\u00ef\t\25\2\2\u00efD\3\2\2\2\u00f0\u00f1"+
		"\t\26\2\2\u00f1F\3\2\2\2\u00f2\u00f3\t\27\2\2\u00f3H\3\2\2\2\u00f4\u00f5"+
		"\t\30\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7a\2\2\u00f7L\3\2\2\2\u00f8\u00f9"+
		"\7v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7w\2\2\u00fb\u0102\7g\2\2\u00fc"+
		"\u00fd\7h\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2"+
		"\u0100\u0102\7g\2\2\u0101\u00f8\3\2\2\2\u0101\u00fc\3\2\2\2\u0102N\3\2"+
		"\2\2\u0103\u0109\5G$\2\u0104\u0108\5G$\2\u0105\u0108\5I%\2\u0106\u0108"+
		"\5K&\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aP\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010c\u0118\7\62\2\2\u010d\u010f\5w<\2\u010e\u010d"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\t\31\2\2"+
		"\u0111\u0113\5I%\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u010c\3\2\2\2\u0117\u010e\3\2\2\2\u0118R\3\2\2\2\u0119\u011a\7*\2\2\u011a"+
		"T\3\2\2\2\u011b\u011c\7+\2\2\u011cV\3\2\2\2\u011d\u011e\7}\2\2\u011eX"+
		"\3\2\2\2\u011f\u0120\7\177\2\2\u0120Z\3\2\2\2\u0121\u0122\7=\2\2\u0122"+
		"\\\3\2\2\2\u0123\u0124\7.\2\2\u0124^\3\2\2\2\u0125\u0126\7?\2\2\u0126"+
		"`\3\2\2\2\u0127\u0128\7@\2\2\u0128b\3\2\2\2\u0129\u012a\7>\2\2\u012ad"+
		"\3\2\2\2\u012b\u012c\7\u0080\2\2\u012cf\3\2\2\2\u012d\u012e\7<\2\2\u012e"+
		"h\3\2\2\2\u012f\u0130\7?\2\2\u0130\u0131\7?\2\2\u0131j\3\2\2\2\u0132\u0133"+
		"\7>\2\2\u0133\u0134\7?\2\2\u0134l\3\2\2\2\u0135\u0136\7@\2\2\u0136\u0137"+
		"\7?\2\2\u0137n\3\2\2\2\u0138\u0139\7#\2\2\u0139\u013a\7?\2\2\u013ap\3"+
		"\2\2\2\u013b\u013c\7(\2\2\u013c\u013d\7(\2\2\u013dr\3\2\2\2\u013e\u013f"+
		"\7~\2\2\u013f\u0140\7~\2\2\u0140t\3\2\2\2\u0141\u0142\7-\2\2\u0142v\3"+
		"\2\2\2\u0143\u0144\t\32\2\2\u0144x\3\2\2\2\u0145\u0147\t\33\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b=\2\2\u014bz\3\2\2\2\u014c\u014d"+
		"\7\61\2\2\u014d\u014e\7,\2\2\u014e\u0153\3\2\2\2\u014f\u0152\5{>\2\u0150"+
		"\u0152\13\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0157\7,\2\2\u0157\u0158\7\61\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\b>\2\2\u015a|\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d"+
		"\7\61\2\2\u015d\u0161\3\2\2\2\u015e\u0160\n\34\2\2\u015f\u015e\3\2\2\2"+
		"\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b?\2\2\u0165~\3\2\2\2\r\2\u0101"+
		"\u0107\u0109\u010e\u0114\u0117\u0148\u0151\u0153\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}