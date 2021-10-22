// Generated from lab2.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lab2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, DecimalConst=15, OctalConst=16, 
		HexadecimalConst=17, HexadecimalPrefix=18, Digit=19, NonzeroDigit=20, 
		OctalDigit=21, HexadecimalDigit=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "WS", "DecimalConst", "DC", "OctalConst", 
			"OC", "HexadecimalConst", "HC", "HexadecimalPrefix", "Digit", "NonzeroDigit", 
			"OctalDigit", "HexadecimalDigit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'int'", "'main'", "'{'", "'}'", "'return'", "';'", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "DecimalConst", "OctalConst", "HexadecimalConst", "HexadecimalPrefix", 
			"Digit", "NonzeroDigit", "OctalDigit", "HexadecimalDigit"
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


	public lab2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lab2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17[\n\17\r\17\16\17\\\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\5\21g\n\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23"+
		"o\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25x\n\25\3\26\3\26\3\26\3"+
		"\26\5\26~\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\2\2\33\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2"+
		"#\22%\2\'\23)\2+\24-\25/\26\61\27\63\30\3\2\4\5\2\13\f\17\17\"\"\5\2\62"+
		";CHch\2\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2"+
		"\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t=\3\2\2\2\13B\3\2\2\2\rD"+
		"\3\2\2\2\17F\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31"+
		"U\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2\37`\3\2\2\2!f\3\2\2\2#h\3\2\2\2%n\3"+
		"\2\2\2\'p\3\2\2\2)w\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\u0083"+
		"\3\2\2\2\63\u0085\3\2\2\2\65\66\7*\2\2\66\4\3\2\2\2\678\7+\2\28\6\3\2"+
		"\2\29:\7k\2\2:;\7p\2\2;<\7v\2\2<\b\3\2\2\2=>\7o\2\2>?\7c\2\2?@\7k\2\2"+
		"@A\7p\2\2A\n\3\2\2\2BC\7}\2\2C\f\3\2\2\2DE\7\177\2\2E\16\3\2\2\2FG\7t"+
		"\2\2GH\7g\2\2HI\7v\2\2IJ\7w\2\2JK\7t\2\2KL\7p\2\2L\20\3\2\2\2MN\7=\2\2"+
		"N\22\3\2\2\2OP\7-\2\2P\24\3\2\2\2QR\7/\2\2R\26\3\2\2\2ST\7,\2\2T\30\3"+
		"\2\2\2UV\7\61\2\2V\32\3\2\2\2WX\7\'\2\2X\34\3\2\2\2Y[\t\2\2\2ZY\3\2\2"+
		"\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\17\2\2_\36\3\2\2\2`"+
		"a\5/\30\2ab\5!\21\2b \3\2\2\2cd\5-\27\2de\5!\21\2eg\3\2\2\2fc\3\2\2\2"+
		"fg\3\2\2\2g\"\3\2\2\2hi\7\62\2\2ij\5%\23\2j$\3\2\2\2kl\5\61\31\2lm\5%"+
		"\23\2mo\3\2\2\2nk\3\2\2\2no\3\2\2\2o&\3\2\2\2pq\5+\26\2qr\5\63\32\2rs"+
		"\5)\25\2s(\3\2\2\2tu\5\63\32\2uv\5)\25\2vx\3\2\2\2wt\3\2\2\2wx\3\2\2\2"+
		"x*\3\2\2\2yz\7\62\2\2z~\7z\2\2{|\7\62\2\2|~\7Z\2\2}y\3\2\2\2}{\3\2\2\2"+
		"~,\3\2\2\2\177\u0080\4\62;\2\u0080.\3\2\2\2\u0081\u0082\4\63;\2\u0082"+
		"\60\3\2\2\2\u0083\u0084\4\629\2\u0084\62\3\2\2\2\u0085\u0086\t\3\2\2\u0086"+
		"\64\3\2\2\2\b\2\\fnw}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}