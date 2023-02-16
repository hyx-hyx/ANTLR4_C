// Generated from java-escape by ANTLR 4.11.1
    // place this header action only in lexer, not the parser
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class keyword extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, WHILE=2, DO=3, INCLUDE=4, SWITCH=5, RETURN=6, IF=7, DEFINE=8, WS=9, 
		Type=10, INT=11, STRING=12, LINE_COMMENT=13, COMMENT=14, ID=15, NEWLINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "Type", "INT", "STRING", "ESC", "LINE_COMMENT", "COMMENT", "ID", 
			"NEWLINE"
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
			null, "FOR", "WHILE", "DO", "INCLUDE", "SWITCH", "RETURN", "IF", "DEFINE", 
			"WS", "Type", "INT", "STRING", "LINE_COMMENT", "COMMENT", "ID", "NEWLINE"
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

	   // place this class member only in lexer
	Map<String,Integer> keywords = new HashMap<String,Integer>() {{
	    put("for", KeywordsParser.FOR);
	    put("while",   KeywordsParser.WHILE);
	    put("if",    KeywordsParser.IF);
	    put("return",  KeywordsParser.RETURN);
	    put("switch",  KeywordsParser.SWITCH);
	    put("include",  KeywordsParser.INCLUDE);
	    put("define",  KeywordsParser.DEFINE);
	    put("do", KeywordsParser.DO);
	}};


	public keyword(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "keyword.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        if ( keywords.containsKey(getText()) ) {
			            setType(keywords.get(getText())); // reset token type
			        }
			        
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0015\b\u0000"+
		"\u000b\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002\n\u0002"+
		"\f\u0002H\t\u0002\u0003\u0002J\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005]\b\u0005\n\u0005\f\u0005`\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"h\b\u0006\n\u0006\f\u0006k\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007t\b\u0007"+
		"\n\u0007\f\u0007w\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b|\b\b"+
		"\u0001\b\u0001\b\u0003P^i\u0000\t\u0001\t\u0003\n\u0005\u000b\u0007\f"+
		"\t\u0000\u000b\r\r\u000e\u000f\u000f\u0011\u0010\u0001\u0000\u0006\u0003"+
		"\u0000\t\n\r\r  \u0001\u000019\u0001\u000009\u0006\u0000\"\"\\\\bbnnr"+
		"rtt\u0003\u0000AZ__az\u0004\u000009AZ__az\u008d\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000"+
		"\u0000\u0003?\u0001\u0000\u0000\u0000\u0005I\u0001\u0000\u0000\u0000\u0007"+
		"K\u0001\u0000\u0000\u0000\tU\u0001\u0000\u0000\u0000\u000bX\u0001\u0000"+
		"\u0000\u0000\rc\u0001\u0000\u0000\u0000\u000fq\u0001\u0000\u0000\u0000"+
		"\u0011{\u0001\u0000\u0000\u0000\u0013\u0015\u0007\u0000\u0000\u0000\u0014"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0006\u0000\u0000\u0000\u0019"+
		"\u0002\u0001\u0000\u0000\u0000\u001a\u001b\u0005i\u0000\u0000\u001b\u001c"+
		"\u0005n\u0000\u0000\u001c@\u0005t\u0000\u0000\u001d\u001e\u0005f\u0000"+
		"\u0000\u001e\u001f\u0005l\u0000\u0000\u001f \u0005o\u0000\u0000 !\u0005"+
		"a\u0000\u0000!@\u0005t\u0000\u0000\"#\u0005d\u0000\u0000#$\u0005o\u0000"+
		"\u0000$%\u0005u\u0000\u0000%&\u0005b\u0000\u0000&\'\u0005l\u0000\u0000"+
		"\'@\u0005e\u0000\u0000()\u0005c\u0000\u0000)*\u0005h\u0000\u0000*+\u0005"+
		"a\u0000\u0000+@\u0005r\u0000\u0000,-\u0005b\u0000\u0000-.\u0005o\u0000"+
		"\u0000./\u0005o\u0000\u0000/@\u0005l\u0000\u000001\u0005l\u0000\u0000"+
		"12\u0005o\u0000\u000023\u0005n\u0000\u00003@\u0005g\u0000\u000045\u0005"+
		"v\u0000\u000056\u0005o\u0000\u000067\u0005i\u0000\u00007@\u0005d\u0000"+
		"\u000089\u0005i\u0000\u00009:\u0005n\u0000\u0000:;\u0005c\u0000\u0000"+
		";<\u0005l\u0000\u0000<=\u0005u\u0000\u0000=>\u0005d\u0000\u0000>@\u0005"+
		"e\u0000\u0000?\u001a\u0001\u0000\u0000\u0000?\u001d\u0001\u0000\u0000"+
		"\u0000?\"\u0001\u0000\u0000\u0000?(\u0001\u0000\u0000\u0000?,\u0001\u0000"+
		"\u0000\u0000?0\u0001\u0000\u0000\u0000?4\u0001\u0000\u0000\u0000?8\u0001"+
		"\u0000\u0000\u0000@\u0004\u0001\u0000\u0000\u0000AJ\u00050\u0000\u0000"+
		"BF\u0007\u0001\u0000\u0000CE\u0007\u0002\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IA\u0001"+
		"\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000J\u0006\u0001\u0000\u0000"+
		"\u0000KP\u0005\"\u0000\u0000LO\u0003\t\u0004\u0000MO\t\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\"\u0000\u0000T\b\u0001"+
		"\u0000\u0000\u0000UV\u0005\\\u0000\u0000VW\u0007\u0003\u0000\u0000W\n"+
		"\u0001\u0000\u0000\u0000XY\u0005/\u0000\u0000YZ\u0005/\u0000\u0000Z^\u0001"+
		"\u0000\u0000\u0000[]\t\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]`"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0006\u0005"+
		"\u0000\u0000b\f\u0001\u0000\u0000\u0000cd\u0005/\u0000\u0000de\u0005*"+
		"\u0000\u0000ei\u0001\u0000\u0000\u0000fh\t\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005*\u0000\u0000mn\u0005/\u0000\u0000no\u0001\u0000\u0000\u0000o"+
		"p\u0006\u0006\u0000\u0000p\u000e\u0001\u0000\u0000\u0000qu\u0007\u0004"+
		"\u0000\u0000rt\u0007\u0005\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0006\u0007\u0001"+
		"\u0000y\u0010\u0001\u0000\u0000\u0000z|\u0005\r\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005"+
		"\n\u0000\u0000~\u0012\u0001\u0000\u0000\u0000\u000b\u0000\u0016?FINP^"+
		"iu{\u0002\u0006\u0000\u0000\u0001\u0007\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}