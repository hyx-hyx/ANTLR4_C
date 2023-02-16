// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, Type=11, INT=12, TWO_OP=13, STRING=14, LINE_COMMENT=15, COMMENT=16, 
		ID=17, NEWLINE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"WS", "Type", "INT", "TWO_OP", "STRING", "ESC", "LINE_COMMENT", "COMMENT", 
			"ID", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "Type", 
			"INT", "TWO_OP", "STRING", "LINE_COMMENT", "COMMENT", "ID", "NEWLINE"
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


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

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
		"\u0004\u0000\u0012\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0004\t;\b\t\u000b\t\f\t<\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n_\b\n\u0001\u000b\u0001\u000b\u0005\u000bc\b"+
		"\u000b\n\u000b\f\u000bf\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\fp\b\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\ru\b\r\n\r\f\rx\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0083\b\u000f"+
		"\n\u000f\f\u000f\u0086\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u008e\b\u0010\n\u0010\f\u0010"+
		"\u0091\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u009a\b\u0011\n\u0011\f\u0011\u009d"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0003v\u0084\u008f\u0000\u0013\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u0000\u001f\u000f!\u0010#\u0011%\u0012\u0001\u0000\t\u0003\u0000\t\n"+
		"\r\r  \u0001\u000019\u0001\u000009\u0002\u0000<<>>\u0003\u0000*+--//\u0006"+
		"\u0000\"\"\\\\bbnnrrtt\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000"+
		"\n\n\r\r??\u00af\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'"+
		"\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000"+
		"\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000"+
		"\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001"+
		"\u0000\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u0013:\u0001\u0000\u0000"+
		"\u0000\u0015^\u0001\u0000\u0000\u0000\u0017`\u0001\u0000\u0000\u0000\u0019"+
		"o\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001d{\u0001"+
		"\u0000\u0000\u0000\u001f~\u0001\u0000\u0000\u0000!\u0089\u0001\u0000\u0000"+
		"\u0000#\u0097\u0001\u0000\u0000\u0000%\u009e\u0001\u0000\u0000\u0000\'"+
		"(\u0005=\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005;\u0000\u0000"+
		"*\u0004\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0006\u0001\u0000"+
		"\u0000\u0000-.\u0005)\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005,"+
		"\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005{\u0000\u00002\f\u0001"+
		"\u0000\u0000\u000034\u0005}\u0000\u00004\u000e\u0001\u0000\u0000\u0000"+
		"56\u0005[\u0000\u00006\u0010\u0001\u0000\u0000\u000078\u0005]\u0000\u0000"+
		"8\u0012\u0001\u0000\u0000\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0006\t\u0000\u0000?\u0014"+
		"\u0001\u0000\u0000\u0000@A\u0005i\u0000\u0000AB\u0005n\u0000\u0000B_\u0005"+
		"t\u0000\u0000CD\u0005f\u0000\u0000DE\u0005l\u0000\u0000EF\u0005o\u0000"+
		"\u0000FG\u0005a\u0000\u0000G_\u0005t\u0000\u0000HI\u0005d\u0000\u0000"+
		"IJ\u0005o\u0000\u0000JK\u0005u\u0000\u0000KL\u0005b\u0000\u0000LM\u0005"+
		"l\u0000\u0000M_\u0005e\u0000\u0000NO\u0005c\u0000\u0000OP\u0005h\u0000"+
		"\u0000PQ\u0005a\u0000\u0000Q_\u0005r\u0000\u0000RS\u0005b\u0000\u0000"+
		"ST\u0005o\u0000\u0000TU\u0005o\u0000\u0000U_\u0005l\u0000\u0000VW\u0005"+
		"l\u0000\u0000WX\u0005o\u0000\u0000XY\u0005n\u0000\u0000Y_\u0005g\u0000"+
		"\u0000Z[\u0005v\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005i\u0000\u0000"+
		"]_\u0005d\u0000\u0000^@\u0001\u0000\u0000\u0000^C\u0001\u0000\u0000\u0000"+
		"^H\u0001\u0000\u0000\u0000^N\u0001\u0000\u0000\u0000^R\u0001\u0000\u0000"+
		"\u0000^V\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000_\u0016\u0001"+
		"\u0000\u0000\u0000`d\u0007\u0001\u0000\u0000ac\u0007\u0002\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000e\u0018\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gh\u0005<\u0000\u0000hp\u0005=\u0000\u0000ij\u0005>"+
		"\u0000\u0000jp\u0005=\u0000\u0000kp\u0007\u0003\u0000\u0000lm\u0005=\u0000"+
		"\u0000mp\u0005=\u0000\u0000np\u0007\u0004\u0000\u0000og\u0001\u0000\u0000"+
		"\u0000oi\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000p\u001a\u0001\u0000\u0000\u0000"+
		"qv\u0005\"\u0000\u0000ru\u0003\u001d\u000e\u0000su\t\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\"\u0000\u0000z\u001c\u0001"+
		"\u0000\u0000\u0000{|\u0005\\\u0000\u0000|}\u0007\u0005\u0000\u0000}\u001e"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005/\u0000\u0000\u007f\u0080\u0005/"+
		"\u0000\u0000\u0080\u0084\u0001\u0000\u0000\u0000\u0081\u0083\t\u0000\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0006\u000f\u0000\u0000\u0088 \u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005/\u0000\u0000\u008a\u008b\u0005*\u0000\u0000\u008b\u008f"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\t\u0000\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"*\u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0006\u0010\u0000\u0000\u0096\"\u0001\u0000\u0000\u0000"+
		"\u0097\u009b\u0007\u0006\u0000\u0000\u0098\u009a\u0007\u0007\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c$\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0007\b\u0000\u0000\u009f&\u0001\u0000\u0000\u0000\n\u0000<^do"+
		"tv\u0084\u008f\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}