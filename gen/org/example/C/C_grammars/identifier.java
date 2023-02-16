// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
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
		Type=1, INT=2, STRING=3, LINE_COMMENT=4, COMMENT=5, ID=6, NEWLINE=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Type", "INT", "STRING", "ESC", "LINE_COMMENT", "COMMENT", "ID", "NEWLINE", 
			"WS"
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
			null, "Type", "INT", "STRING", "LINE_COMMENT", "COMMENT", "ID", "NEWLINE", 
			"WS"
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
		"\u0004\u0000\bz\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00009\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001\n\u0001\f\u0001A\t"+
		"\u0001\u0003\u0001C\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004Y\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005a\b"+
		"\u0005\n\u0005\f\u0005d\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006m\b\u0006\n\u0006"+
		"\f\u0006p\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\bu\b\b\u000b\b"+
		"\f\bv\u0001\b\u0001\b\u0003IWb\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0000\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0001\u0000"+
		"\u0007\u0001\u000019\u0001\u000009\u0006\u0000\"\"\\\\bbnnrrtt\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\n\n\r\r??\u0003\u0000\t\n\r\r "+
		" \u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001"+
		"8\u0001\u0000\u0000\u0000\u0003B\u0001\u0000\u0000\u0000\u0005D\u0001"+
		"\u0000\u0000\u0000\u0007N\u0001\u0000\u0000\u0000\tQ\u0001\u0000\u0000"+
		"\u0000\u000b\\\u0001\u0000\u0000\u0000\rj\u0001\u0000\u0000\u0000\u000f"+
		"q\u0001\u0000\u0000\u0000\u0011t\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"i\u0000\u0000\u0014\u0015\u0005n\u0000\u0000\u00159\u0005t\u0000\u0000"+
		"\u0016\u0017\u0005f\u0000\u0000\u0017\u0018\u0005l\u0000\u0000\u0018\u0019"+
		"\u0005o\u0000\u0000\u0019\u001a\u0005a\u0000\u0000\u001a9\u0005t\u0000"+
		"\u0000\u001b\u001c\u0005d\u0000\u0000\u001c\u001d\u0005o\u0000\u0000\u001d"+
		"\u001e\u0005u\u0000\u0000\u001e\u001f\u0005b\u0000\u0000\u001f \u0005"+
		"l\u0000\u0000 9\u0005e\u0000\u0000!\"\u0005c\u0000\u0000\"#\u0005h\u0000"+
		"\u0000#$\u0005a\u0000\u0000$9\u0005r\u0000\u0000%&\u0005b\u0000\u0000"+
		"&\'\u0005o\u0000\u0000\'(\u0005o\u0000\u0000(9\u0005l\u0000\u0000)*\u0005"+
		"l\u0000\u0000*+\u0005o\u0000\u0000+,\u0005n\u0000\u0000,9\u0005g\u0000"+
		"\u0000-.\u0005v\u0000\u0000./\u0005o\u0000\u0000/0\u0005i\u0000\u0000"+
		"09\u0005d\u0000\u000012\u0005i\u0000\u000023\u0005n\u0000\u000034\u0005"+
		"c\u0000\u000045\u0005l\u0000\u000056\u0005u\u0000\u000067\u0005d\u0000"+
		"\u000079\u0005e\u0000\u00008\u0013\u0001\u0000\u0000\u00008\u0016\u0001"+
		"\u0000\u0000\u00008\u001b\u0001\u0000\u0000\u00008!\u0001\u0000\u0000"+
		"\u00008%\u0001\u0000\u0000\u00008)\u0001\u0000\u0000\u00008-\u0001\u0000"+
		"\u0000\u000081\u0001\u0000\u0000\u00009\u0002\u0001\u0000\u0000\u0000"+
		":C\u00050\u0000\u0000;?\u0007\u0000\u0000\u0000<>\u0007\u0001\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000B:\u0001\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000C\u0004"+
		"\u0001\u0000\u0000\u0000DI\u0005\"\u0000\u0000EH\u0003\u0007\u0003\u0000"+
		"FH\t\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\"\u0000"+
		"\u0000M\u0006\u0001\u0000\u0000\u0000NO\u0005\\\u0000\u0000OP\u0007\u0002"+
		"\u0000\u0000P\b\u0001\u0000\u0000\u0000QR\u0005/\u0000\u0000RS\u0005/"+
		"\u0000\u0000SW\u0001\u0000\u0000\u0000TV\t\u0000\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000VY\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"Z[\u0006\u0004\u0000\u0000[\n\u0001\u0000\u0000\u0000\\]\u0005/\u0000"+
		"\u0000]^\u0005*\u0000\u0000^b\u0001\u0000\u0000\u0000_a\t\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005*\u0000\u0000fg\u0005/\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hi\u0006\u0005\u0000\u0000i\f\u0001\u0000\u0000\u0000jn\u0007"+
		"\u0003\u0000\u0000km\u0007\u0004\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000o\u000e\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0007"+
		"\u0005\u0000\u0000r\u0010\u0001\u0000\u0000\u0000su\u0007\u0006\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006"+
		"\b\u0000\u0000y\u0012\u0001\u0000\u0000\u0000\n\u00008?BGIWbnv\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}