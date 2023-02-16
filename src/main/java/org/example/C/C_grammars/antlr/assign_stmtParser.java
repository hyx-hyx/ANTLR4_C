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
public class assign_stmtParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, WS=44, Type=45, INT=46, 
		STRING=47, LINE_COMMENT=48, COMMENT=49, ID=50, NEWLINE=51;
	public static final int
		RULE_debug = 0, RULE_type_assign = 1, RULE_expr_assign = 2, RULE_assign_stmt = 3, 
		RULE_expr = 4, RULE_call = 5, RULE_callstmt = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "type_assign", "expr_assign", "assign_stmt", "expr", "call", 
			"callstmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'['", "']'", "'('", "')'", "'.'", "'->'", "'-'", 
			"'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", "'/'", "'%'", 
			"'+'", "'<<'", "'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", 
			"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "Type", "INT", 
			"STRING", "LINE_COMMENT", "COMMENT", "ID", "NEWLINE"
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

	public assign_stmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public List<Assign_stmtContext> assign_stmt() {
			return getRuleContexts(Assign_stmtContext.class);
		}
		public Assign_stmtContext assign_stmt(int i) {
			return getRuleContext(Assign_stmtContext.class,i);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).exitDebug(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				assign_stmt();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 1231453023239712L) != 0 );
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
	public static class Type_assignContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(assign_stmtParser.Type, 0); }
		public TerminalNode ID() { return getToken(assign_stmtParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Type_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).enterType_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).exitType_assign(this);
		}
	}

	public final Type_assignContext type_assign() throws RecognitionException {
		Type_assignContext _localctx = new Type_assignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(19);
			match(Type);
			}
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(20);
				match(ID);
				}
				break;
			case 2:
				{
				setState(21);
				expr(0);
				}
				break;
			}
			setState(24);
			match(T__0);
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(25);
				call();
				}
				break;
			case 2:
				{
				setState(26);
				expr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(assign_stmtParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(29);
				match(ID);
				}
				break;
			case 2:
				{
				setState(30);
				expr(0);
				}
				break;
			}
			setState(33);
			match(T__0);
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(34);
				call();
				}
				break;
			case 2:
				{
				setState(35);
				expr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Type_assignContext type_assign() {
			return getRuleContext(Type_assignContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(38);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(39);
				type_assign();
				}
				break;
			}
			setState(42);
			match(T__1);
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
		public TerminalNode ID() { return getToken(assign_stmtParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(assign_stmtParser.Type, 0); }
		public TerminalNode INT() { return getToken(assign_stmtParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).exitExpr(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(45);
				match(ID);
				setState(46);
				match(T__2);
				setState(47);
				expr(0);
				setState(48);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(50);
				match(T__4);
				setState(51);
				expr(0);
				setState(52);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(54);
				match(T__8);
				setState(55);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(56);
				match(Type);
				}
				setState(57);
				expr(21);
				}
				break;
			case 5:
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				expr(20);
				}
				break;
			case 6:
				{
				setState(60);
				match(T__11);
				setState(61);
				expr(18);
				}
				break;
			case 7:
				{
				setState(62);
				match(T__12);
				setState(63);
				expr(17);
				}
				break;
			case 8:
				{
				setState(64);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				expr(16);
				}
				break;
			case 9:
				{
				setState(66);
				match(INT);
				}
				break;
			case 10:
				{
				setState(67);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(71);
						match(T__6);
						setState(72);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(74);
						match(T__7);
						setState(75);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(77);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 397312L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(80);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(83);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(86);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(89);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(92);
						match(T__12);
						setState(93);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(95);
						match(T__27);
						setState(96);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(98);
						match(T__28);
						setState(99);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(101);
						match(T__29);
						setState(102);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104);
						match(T__30);
						setState(105);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						match(T__31);
						setState(108);
						expr(0);
						setState(109);
						match(T__1);
						setState(110);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(113);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8787503087616L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(116);
						match(T__42);
						}
						setState(117);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(119);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
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
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(assign_stmtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(assign_stmtParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(T__4);
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case Type:
			case INT:
			case ID:
				{
				{
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(127);
					match(ID);
					}
					break;
				case 2:
					{
					setState(128);
					expr(0);
					}
					break;
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__42) {
					{
					{
					setState(131);
					match(T__42);
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(132);
						match(ID);
						}
						break;
					case 2:
						{
						setState(133);
						expr(0);
						}
						break;
					}
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(144);
			match(T__5);
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
	public static class CallstmtContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assign_stmtListener ) ((assign_stmtListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			call();
			setState(147);
			match(T__1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
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
		"\u0004\u00013\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0017\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001c\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003)\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004E\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004y\b\u0004\n\u0004\f\u0004|\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0082\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0087\b\u0005\u0005\u0005"+
		"\u0089\b\u0005\n\u0005\f\u0005\u008c\t\u0005\u0001\u0005\u0003\u0005\u008f"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0000\u0001\b\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\b\u0001"+
		"\u0000\n\u000b\u0001\u0000\r\u0010\u0002\u0000\f\f\u0011\u0012\u0002\u0000"+
		"\t\t\u0013\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0019\u0001"+
		"\u0000\u001a\u001b\u0001\u0000!*\u00b1\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000"+
		"\u0006(\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\n}\u0001\u0000"+
		"\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0006\u0003"+
		"\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"+
		"\u0000\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0016\u0005-\u0000\u0000"+
		"\u0014\u0017\u00052\u0000\u0000\u0015\u0017\u0003\b\u0004\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u001b\u0005\u0001\u0000\u0000\u0019"+
		"\u001c\u0003\n\u0005\u0000\u001a\u001c\u0003\b\u0004\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0003"+
		"\u0001\u0000\u0000\u0000\u001d \u00052\u0000\u0000\u001e \u0003\b\u0004"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!$\u0005\u0001\u0000\u0000\"%\u0003\n"+
		"\u0005\u0000#%\u0003\b\u0004\u0000$\"\u0001\u0000\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&)\u0003\u0004\u0002"+
		"\u0000\')\u0003\u0002\u0001\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000+\u0007"+
		"\u0001\u0000\u0000\u0000,-\u0006\u0004\uffff\uffff\u0000-.\u00052\u0000"+
		"\u0000./\u0005\u0003\u0000\u0000/0\u0003\b\u0004\u000001\u0005\u0004\u0000"+
		"\u00001E\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0003\b\u0004"+
		"\u000045\u0005\u0006\u0000\u00005E\u0001\u0000\u0000\u000067\u0005\t\u0000"+
		"\u00007E\u0003\b\u0004\u001689\u0005-\u0000\u00009E\u0003\b\u0004\u0015"+
		":;\u0007\u0000\u0000\u0000;E\u0003\b\u0004\u0014<=\u0005\f\u0000\u0000"+
		"=E\u0003\b\u0004\u0012>?\u0005\r\u0000\u0000?E\u0003\b\u0004\u0011@A\u0007"+
		"\u0001\u0000\u0000AE\u0003\b\u0004\u0010BE\u0005.\u0000\u0000CE\u0005"+
		"2\u0000\u0000D,\u0001\u0000\u0000\u0000D2\u0001\u0000\u0000\u0000D6\u0001"+
		"\u0000\u0000\u0000D8\u0001\u0000\u0000\u0000D:\u0001\u0000\u0000\u0000"+
		"D<\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000Ez\u0001\u0000"+
		"\u0000\u0000FG\n\u0018\u0000\u0000GH\u0005\u0007\u0000\u0000Hy\u0003\b"+
		"\u0004\u0019IJ\n\u0017\u0000\u0000JK\u0005\b\u0000\u0000Ky\u0003\b\u0004"+
		"\u0018LM\n\u000f\u0000\u0000MN\u0007\u0002\u0000\u0000Ny\u0003\b\u0004"+
		"\u0010OP\n\u000e\u0000\u0000PQ\u0007\u0003\u0000\u0000Qy\u0003\b\u0004"+
		"\u000fRS\n\r\u0000\u0000ST\u0007\u0004\u0000\u0000Ty\u0003\b\u0004\u000e"+
		"UV\n\f\u0000\u0000VW\u0007\u0005\u0000\u0000Wy\u0003\b\u0004\rXY\n\u000b"+
		"\u0000\u0000YZ\u0007\u0006\u0000\u0000Zy\u0003\b\u0004\f[\\\n\n\u0000"+
		"\u0000\\]\u0005\r\u0000\u0000]y\u0003\b\u0004\u000b^_\n\t\u0000\u0000"+
		"_`\u0005\u001c\u0000\u0000`y\u0003\b\u0004\nab\n\b\u0000\u0000bc\u0005"+
		"\u001d\u0000\u0000cy\u0003\b\u0004\tde\n\u0007\u0000\u0000ef\u0005\u001e"+
		"\u0000\u0000fy\u0003\b\u0004\bgh\n\u0006\u0000\u0000hi\u0005\u001f\u0000"+
		"\u0000iy\u0003\b\u0004\u0007jk\n\u0005\u0000\u0000kl\u0005 \u0000\u0000"+
		"lm\u0003\b\u0004\u0000mn\u0005\u0002\u0000\u0000no\u0003\b\u0004\u0005"+
		"oy\u0001\u0000\u0000\u0000pq\n\u0004\u0000\u0000qr\u0007\u0007\u0000\u0000"+
		"ry\u0003\b\u0004\u0004st\n\u0003\u0000\u0000tu\u0005+\u0000\u0000uy\u0003"+
		"\b\u0004\u0004vw\n\u0013\u0000\u0000wy\u0007\u0000\u0000\u0000xF\u0001"+
		"\u0000\u0000\u0000xI\u0001\u0000\u0000\u0000xL\u0001\u0000\u0000\u0000"+
		"xO\u0001\u0000\u0000\u0000xR\u0001\u0000\u0000\u0000xU\u0001\u0000\u0000"+
		"\u0000xX\u0001\u0000\u0000\u0000x[\u0001\u0000\u0000\u0000x^\u0001\u0000"+
		"\u0000\u0000xa\u0001\u0000\u0000\u0000xd\u0001\u0000\u0000\u0000xg\u0001"+
		"\u0000\u0000\u0000xj\u0001\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000"+
		"xs\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\t\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u00052\u0000\u0000~\u008e\u0005"+
		"\u0005\u0000\u0000\u007f\u0082\u00052\u0000\u0000\u0080\u0082\u0003\b"+
		"\u0004\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u008a\u0001\u0000\u0000\u0000\u0083\u0086\u0005+\u0000"+
		"\u0000\u0084\u0087\u00052\u0000\u0000\u0085\u0087\u0003\b\u0004\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008f\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000"+
		"\u008e\u0081\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0006\u0000\u0000"+
		"\u0091\u000b\u0001\u0000\u0000\u0000\u0092\u0093\u0003\n\u0005\u0000\u0093"+
		"\u0094\u0005\u0002\u0000\u0000\u0094\r\u0001\u0000\u0000\u0000\r\u0011"+
		"\u0016\u001b\u001f$(Dxz\u0081\u0086\u008a\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}