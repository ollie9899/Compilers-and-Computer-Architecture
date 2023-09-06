// Generated from C:/Users/ofp20/OneDrive - University of Sussex/Compiler and Computer Architecture/CWorkTask1/src\CWorkGram.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CWorkGramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		While=1, If=2, Do=3, Then=4, Repeat=5, Else=6, Until=7, Assign=8, Eq=9, 
		Less=10, Gtr=11, LessEq=12, GtrEq=13, Plus=14, Times=15, Minus=16, Div=17, 
		And=18, Or=19, Xor=20, IntType=21, BoolType=22, UnitType=23, LParen=24, 
		Comma=25, RParen=26, LBrace=27, Semicolon=28, RBrace=29, Skip=30, WS=31, 
		Idfr=32, IntLit=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"While", "If", "Do", "Then", "Repeat", "Else", "Until", "Assign", "Eq", 
			"Less", "Gtr", "LessEq", "GtrEq", "Plus", "Times", "Minus", "Div", "And", 
			"Or", "Xor", "IntType", "BoolType", "UnitType", "LParen", "Comma", "RParen", 
			"LBrace", "Semicolon", "RBrace", "Skip", "WS", "Idfr", "IntLit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'do'", "'then'", "'repeat'", "'else'", "'until'", 
			"':='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'-'", "'/'", 
			"'&&'", "'||'", "'^^'", "'int'", "'bool'", "'unit'", "'('", "','", "')'", 
			"'{'", "';'", "'}'", "'skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "While", "If", "Do", "Then", "Repeat", "Else", "Until", "Assign", 
			"Eq", "Less", "Gtr", "LessEq", "GtrEq", "Plus", "Times", "Minus", "Div", 
			"And", "Or", "Xor", "IntType", "BoolType", "UnitType", "LParen", "Comma", 
			"RParen", "LBrace", "Semicolon", "RBrace", "Skip", "WS", "Idfr", "IntLit"
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


	public CWorkGramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CWorkGram.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \6 \u00aa\n \r \16 \u00ab\3"+
		" \3 \3!\3!\7!\u00b2\n!\f!\16!\u00b5\13!\3\"\3\"\3\"\7\"\u00ba\n\"\f\""+
		"\16\"\u00bd\13\"\5\"\u00bf\n\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\5\2\13\f\17\17\"\""+
		"\3\2c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5K\3\2\2\2\7N\3\2\2\2\tQ\3\2\2\2"+
		"\13V\3\2\2\2\r]\3\2\2\2\17b\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25n\3\2\2"+
		"\2\27p\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!|\3\2\2"+
		"\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0083\3\2\2\2)\u0086\3\2\2\2+\u0089\3\2"+
		"\2\2-\u008d\3\2\2\2/\u0092\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65"+
		"\u009b\3\2\2\2\67\u009d\3\2\2\29\u009f\3\2\2\2;\u00a1\3\2\2\2=\u00a3\3"+
		"\2\2\2?\u00a9\3\2\2\2A\u00af\3\2\2\2C\u00be\3\2\2\2EF\7y\2\2FG\7j\2\2"+
		"GH\7k\2\2HI\7n\2\2IJ\7g\2\2J\4\3\2\2\2KL\7k\2\2LM\7h\2\2M\6\3\2\2\2NO"+
		"\7f\2\2OP\7q\2\2P\b\3\2\2\2QR\7v\2\2RS\7j\2\2ST\7g\2\2TU\7p\2\2U\n\3\2"+
		"\2\2VW\7t\2\2WX\7g\2\2XY\7r\2\2YZ\7g\2\2Z[\7c\2\2[\\\7v\2\2\\\f\3\2\2"+
		"\2]^\7g\2\2^_\7n\2\2_`\7u\2\2`a\7g\2\2a\16\3\2\2\2bc\7w\2\2cd\7p\2\2d"+
		"e\7v\2\2ef\7k\2\2fg\7n\2\2g\20\3\2\2\2hi\7<\2\2ij\7?\2\2j\22\3\2\2\2k"+
		"l\7?\2\2lm\7?\2\2m\24\3\2\2\2no\7>\2\2o\26\3\2\2\2pq\7@\2\2q\30\3\2\2"+
		"\2rs\7>\2\2st\7?\2\2t\32\3\2\2\2uv\7@\2\2vw\7?\2\2w\34\3\2\2\2xy\7-\2"+
		"\2y\36\3\2\2\2z{\7,\2\2{ \3\2\2\2|}\7/\2\2}\"\3\2\2\2~\177\7\61\2\2\177"+
		"$\3\2\2\2\u0080\u0081\7(\2\2\u0081\u0082\7(\2\2\u0082&\3\2\2\2\u0083\u0084"+
		"\7~\2\2\u0084\u0085\7~\2\2\u0085(\3\2\2\2\u0086\u0087\7`\2\2\u0087\u0088"+
		"\7`\2\2\u0088*\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c"+
		"\7v\2\2\u008c,\3\2\2\2\u008d\u008e\7d\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7n\2\2\u0091.\3\2\2\2\u0092\u0093\7w\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7k\2\2\u0095\u0096\7v\2\2\u0096\60\3\2\2\2\u0097\u0098"+
		"\7*\2\2\u0098\62\3\2\2\2\u0099\u009a\7.\2\2\u009a\64\3\2\2\2\u009b\u009c"+
		"\7+\2\2\u009c\66\3\2\2\2\u009d\u009e\7}\2\2\u009e8\3\2\2\2\u009f\u00a0"+
		"\7=\2\2\u00a0:\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2<\3\2\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a5\7m\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7r\2\2\u00a7"+
		">\3\2\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\b \2\2\u00ae@\3\2\2\2\u00af\u00b3\t\3\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"B\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bf\7\62\2\2\u00b7\u00bb\t\5\2\2"+
		"\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00b6\3\2\2\2\u00be\u00b7\3\2\2\2\u00bfD\3\2\2\2\7\2\u00ab\u00b3\u00bb"+
		"\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}