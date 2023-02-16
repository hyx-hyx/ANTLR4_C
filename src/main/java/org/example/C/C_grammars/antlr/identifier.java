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
public class identifier extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Type=1, INT=2, STRING=3, LINE_COMMENT=4, COMMENT=5, PRE=6, ID=7, NEWLINE=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Type", "INT", "STRING", "ESC", "LINE_COMMENT", "COMMENT", "PRE", "ID", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Type", "INT", "STRING", "LINE_COMMENT", "COMMENT", "PRE", "ID", 
			"NEWLINE", "WS"
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


	public identifier(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "identifier.g4"; }

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
		"\u0004\u0000\t\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000;\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001?\b\u0001\n\u0001\f\u0001B\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002G\b\u0002\n\u0002"+
		"\f\u0002J\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004U\b"+
		"\u0004\n\u0004\f\u0004X\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005c\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006w\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007|\b\u0007\n\u0007\f\u0007\u007f\t\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0004\t\u0084\b\t\u000b\t\f\t\u0085\u0001\t\u0001\t\u0003HVa\u0000\n"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0000\t\u0004\u000b\u0005\r"+
		"\u0006\u000f\u0007\u0011\b\u0013\t\u0001\u0000\b\u0001\u000019\u0001\u0000"+
		"09\u0006\u0000\"\"\\\\bbnnrrtt\u0004\u0000TTeeppyy\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\n\n\r\r??\u0003\u0000\t\n\r\r  \u0096\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0001:\u0001\u0000\u0000\u0000\u0003<\u0001\u0000\u0000"+
		"\u0000\u0005C\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\t"+
		"P\u0001\u0000\u0000\u0000\u000b[\u0001\u0000\u0000\u0000\rv\u0001\u0000"+
		"\u0000\u0000\u000fx\u0001\u0000\u0000\u0000\u0011\u0080\u0001\u0000\u0000"+
		"\u0000\u0013\u0083\u0001\u0000\u0000\u0000\u0015\u0016\u0005i\u0000\u0000"+
		"\u0016\u0017\u0005n\u0000\u0000\u0017;\u0005t\u0000\u0000\u0018\u0019"+
		"\u0005f\u0000\u0000\u0019\u001a\u0005l\u0000\u0000\u001a\u001b\u0005o"+
		"\u0000\u0000\u001b\u001c\u0005a\u0000\u0000\u001c;\u0005t\u0000\u0000"+
		"\u001d\u001e\u0005d\u0000\u0000\u001e\u001f\u0005o\u0000\u0000\u001f "+
		"\u0005u\u0000\u0000 !\u0005b\u0000\u0000!\"\u0005l\u0000\u0000\";\u0005"+
		"e\u0000\u0000#$\u0005c\u0000\u0000$%\u0005h\u0000\u0000%&\u0005a\u0000"+
		"\u0000&;\u0005r\u0000\u0000\'(\u0005b\u0000\u0000()\u0005o\u0000\u0000"+
		")*\u0005o\u0000\u0000*;\u0005l\u0000\u0000+,\u0005l\u0000\u0000,-\u0005"+
		"o\u0000\u0000-.\u0005n\u0000\u0000.;\u0005g\u0000\u0000/0\u0005v\u0000"+
		"\u000001\u0005o\u0000\u000012\u0005i\u0000\u00002;\u0005d\u0000\u0000"+
		"34\u0005i\u0000\u000045\u0005n\u0000\u000056\u0005c\u0000\u000067\u0005"+
		"l\u0000\u000078\u0005u\u0000\u000089\u0005d\u0000\u00009;\u0005e\u0000"+
		"\u0000:\u0015\u0001\u0000\u0000\u0000:\u0018\u0001\u0000\u0000\u0000:"+
		"\u001d\u0001\u0000\u0000\u0000:#\u0001\u0000\u0000\u0000:\'\u0001\u0000"+
		"\u0000\u0000:+\u0001\u0000\u0000\u0000:/\u0001\u0000\u0000\u0000:3\u0001"+
		"\u0000\u0000\u0000;\u0002\u0001\u0000\u0000\u0000<@\u0007\u0000\u0000"+
		"\u0000=?\u0007\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0004"+
		"\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CH\u0005\"\u0000\u0000"+
		"DG\u0003\u0007\u0003\u0000EG\t\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000KL\u0005\"\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005"+
		"\\\u0000\u0000NO\u0007\u0002\u0000\u0000O\b\u0001\u0000\u0000\u0000PQ"+
		"\u0005/\u0000\u0000QR\u0005/\u0000\u0000RV\u0001\u0000\u0000\u0000SU\t"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0006\u0004\u0000\u0000Z\n\u0001\u0000"+
		"\u0000\u0000[\\\u0005/\u0000\u0000\\]\u0005*\u0000\u0000]a\u0001\u0000"+
		"\u0000\u0000^`\t\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005*\u0000\u0000ef\u0005"+
		"/\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0006\u0005\u0000\u0000h\f\u0001"+
		"\u0000\u0000\u0000ij\u0005i\u0000\u0000jk\u0005n\u0000\u0000kl\u0005c"+
		"\u0000\u0000lm\u0005l\u0000\u0000mn\u0005u\u0000\u0000no\u0005d\u0000"+
		"\u0000ow\u0005e\u0000\u0000pq\u0005d\u0000\u0000qr\u0005e\u0000\u0000"+
		"rs\u0005f\u0000\u0000st\u0005i\u0000\u0000tu\u0005n\u0000\u0000uw\u0005"+
		"e\u0000\u0000vi\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000w\u000e"+
		"\u0001\u0000\u0000\u0000xy\b\u0003\u0000\u0000y}\u0007\u0004\u0000\u0000"+
		"z|\u0007\u0005\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0010"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0007"+
		"\u0006\u0000\u0000\u0081\u0012\u0001\u0000\u0000\u0000\u0082\u0084\u0007"+
		"\u0007\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006"+
		"\t\u0000\u0000\u0088\u0014\u0001\u0000\u0000\u0000\n\u0000:@FHVav}\u0085"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}