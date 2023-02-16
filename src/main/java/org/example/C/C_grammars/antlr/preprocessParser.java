// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class preprocessParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, WS=48, Type=49, INT=50, STRING=51, LINE_COMMENT=52, 
		COMMENT=53, ID=54, NEWLINE=55, FOR=56, WHILE=57, DO=58, INCLUDE=59, SWITCH=60, 
		RETURN=61, IF=62, DEFINE=63;
	public static final int
		RULE_debug = 0, RULE_head = 1, RULE_preprocess = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "head", "preprocess", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'include'", "'<'", "'.h'", "'>'", "'define'", "'\\n'", 
			"'['", "']'", "'('", "')'", "'.'", "'->'", "'-'", "'++'", "'--'", "'*'", 
			"'&'", "'!'", "'~'", "'sizeof'", "'/'", "'%'", "'+'", "'<<'", "'>>'", 
			"'<='", "'>='", "'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", 
			"';'", "'+='", "'-='", "'*='", "'/='", "'%='", "'<<='", "'>>='", "'&='", 
			"'^='", "'|='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS", "Type", "INT", "STRING", "LINE_COMMENT", "COMMENT", "ID", "NEWLINE", 
			"FOR", "WHILE", "DO", "INCLUDE", "SWITCH", "RETURN", "IF", "DEFINE"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public preprocessParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public List<PreprocessContext> preprocess() {
			return getRuleContexts(PreprocessContext.class);
		}
		public PreprocessContext preprocess(int i) {
			return getRuleContext(PreprocessContext.class,i);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).exitDebug(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				preprocess();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__6 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(preprocessParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		int _la;
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(13);
				match(T__0);
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					{
					setState(14);
					match(T__1);
					setState(15);
					match(T__2);
					{
					setState(16);
					match(ID);
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(17);
						match(T__3);
						}
					}

					}
					setState(20);
					match(T__4);
					}
					}
					break;
				case T__5:
					{
					{
					setState(21);
					match(T__5);
					setState(22);
					match(ID);
					setState(23);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessContext extends ParserRuleContext {
		public List<HeadContext> head() {
			return getRuleContexts(HeadContext.class);
		}
		public HeadContext head(int i) {
			return getRuleContext(HeadContext.class,i);
		}
		public PreprocessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).enterPreprocess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).exitPreprocess(this);
		}
	}

	public final PreprocessContext preprocess() throws RecognitionException {
		PreprocessContext _localctx = new PreprocessContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(29);
					head();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(32); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(preprocessParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(preprocessParser.Type, 0); }
		public TerminalNode INT() { return getToken(preprocessParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessListener ) ((preprocessListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(35);
				match(ID);
				setState(36);
				match(T__7);
				setState(37);
				expr(0);
				setState(38);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(40);
				match(T__9);
				setState(41);
				expr(0);
				setState(42);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(44);
				match(T__13);
				setState(45);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(46);
				match(Type);
				}
				setState(47);
				expr(21);
				}
				break;
			case 5:
				{
				setState(48);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(49);
				expr(20);
				}
				break;
			case 6:
				{
				setState(50);
				match(T__16);
				setState(51);
				expr(18);
				}
				break;
			case 7:
				{
				setState(52);
				match(T__17);
				setState(53);
				expr(17);
				}
				break;
			case 8:
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				expr(16);
				}
				break;
			case 9:
				{
				setState(56);
				match(INT);
				}
				break;
			case 10:
				{
				setState(57);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(61);
						match(T__11);
						setState(62);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(64);
						match(T__12);
						setState(65);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(67);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 12713984L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(70);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(71);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(73);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(76);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 402653224L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(79);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(82);
						match(T__17);
						setState(83);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(85);
						match(T__30);
						setState(86);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(88);
						match(T__31);
						setState(89);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(91);
						match(T__32);
						setState(92);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						match(T__33);
						setState(95);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						match(T__34);
						setState(98);
						expr(0);
						setState(99);
						match(T__35);
						setState(100);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(103);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 140600049401856L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(106);
						match(T__46);
						}
						setState(107);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b\u0000"+
		"\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0003\u0001\u001c\b"+
		"\u0001\u0001\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002 \u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003;\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003o\b\u0003\n\u0003"+
		"\f\u0003r\t\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\b\u0001\u0000\u000f\u0010\u0001\u0000\u0012\u0015\u0002\u0000"+
		"\u0011\u0011\u0016\u0017\u0002\u0000\u000e\u000e\u0018\u0018\u0001\u0000"+
		"\u0019\u001a\u0003\u0000\u0003\u0003\u0005\u0005\u001b\u001c\u0001\u0000"+
		"\u001d\u001e\u0001\u0000%.\u008d\u0000\t\u0001\u0000\u0000\u0000\u0002"+
		"\u001b\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000\u0006"+
		":\u0001\u0000\u0000\u0000\b\n\u0003\u0004\u0002\u0000\t\b\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000"+
		"\r\u0018\u0005\u0001\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f"+
		"\u0010\u0005\u0003\u0000\u0000\u0010\u0012\u00056\u0000\u0000\u0011\u0013"+
		"\u0005\u0004\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0019"+
		"\u0005\u0005\u0000\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u0017"+
		"\u00056\u0000\u0000\u0017\u0019\u0003\u0006\u0003\u0000\u0018\u000e\u0001"+
		"\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0019\u001c\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0005\u0007\u0000\u0000\u001b\r\u0001\u0000"+
		"\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000"+
		"\u0000\u0000\u001d\u001f\u0003\u0002\u0001\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0006\u0003"+
		"\uffff\uffff\u0000#$\u00056\u0000\u0000$%\u0005\b\u0000\u0000%&\u0003"+
		"\u0006\u0003\u0000&\'\u0005\t\u0000\u0000\';\u0001\u0000\u0000\u0000("+
		")\u0005\n\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0005\u000b\u0000\u0000"+
		"+;\u0001\u0000\u0000\u0000,-\u0005\u000e\u0000\u0000-;\u0003\u0006\u0003"+
		"\u0016./\u00051\u0000\u0000/;\u0003\u0006\u0003\u001501\u0007\u0000\u0000"+
		"\u00001;\u0003\u0006\u0003\u001423\u0005\u0011\u0000\u00003;\u0003\u0006"+
		"\u0003\u001245\u0005\u0012\u0000\u00005;\u0003\u0006\u0003\u001167\u0007"+
		"\u0001\u0000\u00007;\u0003\u0006\u0003\u00108;\u00052\u0000\u00009;\u0005"+
		"6\u0000\u0000:\"\u0001\u0000\u0000\u0000:(\u0001\u0000\u0000\u0000:,\u0001"+
		"\u0000\u0000\u0000:.\u0001\u0000\u0000\u0000:0\u0001\u0000\u0000\u0000"+
		":2\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;p\u0001\u0000"+
		"\u0000\u0000<=\n\u0018\u0000\u0000=>\u0005\f\u0000\u0000>o\u0003\u0006"+
		"\u0003\u0019?@\n\u0017\u0000\u0000@A\u0005\r\u0000\u0000Ao\u0003\u0006"+
		"\u0003\u0018BC\n\u000f\u0000\u0000CD\u0007\u0002\u0000\u0000Do\u0003\u0006"+
		"\u0003\u0010EF\n\u000e\u0000\u0000FG\u0007\u0003\u0000\u0000Go\u0003\u0006"+
		"\u0003\u000fHI\n\r\u0000\u0000IJ\u0007\u0004\u0000\u0000Jo\u0003\u0006"+
		"\u0003\u000eKL\n\f\u0000\u0000LM\u0007\u0005\u0000\u0000Mo\u0003\u0006"+
		"\u0003\rNO\n\u000b\u0000\u0000OP\u0007\u0006\u0000\u0000Po\u0003\u0006"+
		"\u0003\fQR\n\n\u0000\u0000RS\u0005\u0012\u0000\u0000So\u0003\u0006\u0003"+
		"\u000bTU\n\t\u0000\u0000UV\u0005\u001f\u0000\u0000Vo\u0003\u0006\u0003"+
		"\nWX\n\b\u0000\u0000XY\u0005 \u0000\u0000Yo\u0003\u0006\u0003\tZ[\n\u0007"+
		"\u0000\u0000[\\\u0005!\u0000\u0000\\o\u0003\u0006\u0003\b]^\n\u0006\u0000"+
		"\u0000^_\u0005\"\u0000\u0000_o\u0003\u0006\u0003\u0007`a\n\u0005\u0000"+
		"\u0000ab\u0005#\u0000\u0000bc\u0003\u0006\u0003\u0000cd\u0005$\u0000\u0000"+
		"de\u0003\u0006\u0003\u0005eo\u0001\u0000\u0000\u0000fg\n\u0004\u0000\u0000"+
		"gh\u0007\u0007\u0000\u0000ho\u0003\u0006\u0003\u0004ij\n\u0003\u0000\u0000"+
		"jk\u0005/\u0000\u0000ko\u0003\u0006\u0003\u0004lm\n\u0013\u0000\u0000"+
		"mo\u0007\u0000\u0000\u0000n<\u0001\u0000\u0000\u0000n?\u0001\u0000\u0000"+
		"\u0000nB\u0001\u0000\u0000\u0000nE\u0001\u0000\u0000\u0000nH\u0001\u0000"+
		"\u0000\u0000nK\u0001\u0000\u0000\u0000nN\u0001\u0000\u0000\u0000nQ\u0001"+
		"\u0000\u0000\u0000nT\u0001\u0000\u0000\u0000nW\u0001\u0000\u0000\u0000"+
		"nZ\u0001\u0000\u0000\u0000n]\u0001\u0000\u0000\u0000n`\u0001\u0000\u0000"+
		"\u0000nf\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000\b\u000b\u0012\u0018\u001b :np";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}