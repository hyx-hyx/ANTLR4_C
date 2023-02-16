// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class funcParser extends Parser {
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, WS=51, Type=52, INT=53, 
		STRING=54, LINE_COMMENT=55, COMMENT=56, ID=57, NEWLINE=58;
	public static final int
		RULE_debug = 0, RULE_func = 1, RULE_args = 2, RULE_arg = 3, RULE_block = 4, 
		RULE_expr = 5, RULE_statement = 6, RULE_if_stmt = 7, RULE_while_stmt = 8, 
		RULE_assign_stmt = 9, RULE_call = 10, RULE_callstmt = 11, RULE_for_first_expr = 12, 
		RULE_for_third_expr = 13, RULE_for_stmt = 14, RULE_vardecl = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "func", "args", "arg", "block", "expr", "statement", "if_stmt", 
			"while_stmt", "assign_stmt", "call", "callstmt", "for_first_expr", "for_third_expr", 
			"for_stmt", "vardecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'\\n'", "'{'", "'}'", "','", "'='", "'['", "']'", 
			"'.'", "'->'", "'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", 
			"'/'", "'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", 
			"'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "';'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'if'", "'else'", 
			"'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WS", "Type", "INT", "STRING", "LINE_COMMENT", "COMMENT", 
			"ID", "NEWLINE"
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

	public funcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitDebug(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitDebug(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				func();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Type );
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
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
		public TerminalNode ID() { return getToken(funcParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37);
			match(Type);
			setState(38);
			match(ID);
			}
			{
			setState(40);
			match(T__0);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(41);
				args();
				}
			}

			setState(44);
			match(T__1);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(46);
				match(T__2);
				}
			}

			{
			setState(49);
			match(T__3);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 159455574307631114L) != 0) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__4);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			arg();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(59);
				match(T__5);
				setState(60);
				arg();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
		public TerminalNode ID() { return getToken(funcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(Type);
			setState(67);
			match(ID);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(68);
				match(T__6);
				setState(69);
				expr(0);
				}
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode WS() { return getToken(funcParser.WS, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__3);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 159455574307631114L) != 0) {
				{
				{
				setState(73);
				statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(79);
				match(WS);
				}
			}

			setState(82);
			match(T__4);
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
		public TerminalNode ID() { return getToken(funcParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
		public TerminalNode INT() { return getToken(funcParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(85);
				match(ID);
				setState(86);
				match(T__7);
				setState(87);
				expr(0);
				setState(88);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(90);
				match(T__0);
				setState(91);
				expr(0);
				setState(92);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(94);
				match(T__11);
				setState(95);
				expr(21);
				}
				break;
			case 4:
				{
				{
				setState(96);
				match(Type);
				}
				setState(97);
				expr(20);
				}
				break;
			case 5:
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				expr(19);
				}
				break;
			case 6:
				{
				setState(100);
				match(T__14);
				setState(101);
				expr(17);
				}
				break;
			case 7:
				{
				setState(102);
				match(T__15);
				setState(103);
				expr(16);
				}
				break;
			case 8:
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				expr(15);
				}
				break;
			case 9:
				{
				setState(106);
				match(INT);
				}
				break;
			case 10:
				{
				setState(107);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(111);
						match(T__9);
						setState(112);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(114);
						match(T__10);
						setState(115);
						expr(23);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(117);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3178496L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(120);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(126);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(129);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(132);
						match(T__15);
						setState(133);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(135);
						match(T__30);
						setState(136);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(138);
						match(T__31);
						setState(139);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(141);
						match(T__32);
						setState(142);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(144);
						match(T__33);
						setState(145);
						expr(6);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(147);
						match(T__34);
						setState(148);
						expr(0);
						setState(149);
						match(T__35);
						setState(150);
						expr(4);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 140600049401856L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expr(3);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(156);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
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
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class StatementContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(168);
				expr(0);
				setState(169);
				match(T__35);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				match(T__2);
				}
				break;
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
	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__46);
			{
			setState(175);
			match(T__0);
			setState(176);
			expr(0);
			setState(177);
			match(T__1);
			}
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(179);
						match(T__2);
						}
						break;
					}
					setState(184);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(182);
						block();
						}
						break;
					case T__0:
					case T__2:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__46:
					case T__48:
					case T__49:
					case Type:
					case INT:
					case ID:
						{
						setState(183);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(188);
						match(T__2);
						}
					}

					{
					setState(191);
					match(T__47);
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(192);
						match(T__2);
						}
						break;
					}
					setState(197);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(195);
						block();
						}
						break;
					case T__0:
					case T__2:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__46:
					case T__48:
					case T__49:
					case Type:
					case INT:
					case ID:
						{
						setState(196);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				}
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
	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__48);
			{
			setState(204);
			match(T__0);
			setState(205);
			expr(0);
			setState(206);
			match(T__1);
			}
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				{
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(208);
					match(T__2);
					}
					break;
				}
				}
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__46:
				case T__48:
				case T__49:
				case Type:
				case INT:
				case ID:
					{
					setState(211);
					statement();
					}
					break;
				case T__3:
					{
					setState(212);
					block();
					}
					break;
				case T__35:
					{
					setState(213);
					match(T__35);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
		public List<TerminalNode> ID() { return getTokens(funcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(funcParser.ID, i);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(218);
				expr(0);
				setState(219);
				match(T__6);
				setState(220);
				expr(0);
				}
				break;
			case 2:
				{
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Type) {
					{
					setState(222);
					match(Type);
					}
				}

				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					{
					setState(225);
					match(ID);
					setState(226);
					match(T__6);
					setState(227);
					call();
					}
					}
					break;
				case 2:
					{
					{
					setState(228);
					match(ID);
					setState(229);
					match(T__6);
					setState(230);
					expr(0);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(231);
						match(T__5);
						setState(232);
						match(ID);
						setState(233);
						match(T__6);
						setState(234);
						expr(0);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				}
				}
				break;
			}
			setState(244);
			match(T__35);
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
	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(funcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(funcParser.ID, i);
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
			if ( listener instanceof funcListener ) ((funcListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ID);
			setState(247);
			match(T__0);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Type:
			case INT:
			case ID:
				{
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(248);
					match(ID);
					}
					break;
				case 2:
					{
					setState(249);
					expr(0);
					}
					break;
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(252);
					match(T__5);
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(253);
						match(ID);
						}
						break;
					case 2:
						{
						setState(254);
						expr(0);
						}
						break;
					}
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
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
			if ( listener instanceof funcListener ) ((funcListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitCallstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitCallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			call();
			setState(268);
			match(T__35);
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
	public static class For_first_exprContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<For_first_exprContext> for_first_expr() {
			return getRuleContexts(For_first_exprContext.class);
		}
		public For_first_exprContext for_first_expr(int i) {
			return getRuleContext(For_first_exprContext.class,i);
		}
		public TerminalNode ID() { return getToken(funcParser.ID, 0); }
		public For_first_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_first_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterFor_first_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitFor_first_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitFor_first_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_first_exprContext for_first_expr() throws RecognitionException {
		For_first_exprContext _localctx = new For_first_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_first_expr);
		try {
			int _alt;
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Type:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(270);
					match(Type);
					}
					break;
				}
				{
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					{
					setState(273);
					match(ID);
					setState(274);
					match(T__6);
					setState(275);
					expr(0);
					}
					}
					break;
				case 2:
					{
					setState(276);
					expr(0);
					}
					break;
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						match(T__5);
						setState(280);
						for_first_expr();
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				}
				break;
			case T__5:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class For_third_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<For_third_exprContext> for_third_expr() {
			return getRuleContexts(For_third_exprContext.class);
		}
		public For_third_exprContext for_third_expr(int i) {
			return getRuleContext(For_third_exprContext.class,i);
		}
		public TerminalNode ID() { return getToken(funcParser.ID, 0); }
		public For_third_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_third_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterFor_third_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitFor_third_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitFor_third_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_third_exprContext for_third_expr() throws RecognitionException {
		For_third_exprContext _localctx = new For_third_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_third_expr);
		try {
			int _alt;
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Type:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					{
					setState(289);
					match(ID);
					setState(290);
					match(T__6);
					setState(291);
					expr(0);
					}
					}
					break;
				case 2:
					{
					{
					setState(292);
					expr(0);
					setState(293);
					match(T__6);
					setState(294);
					expr(0);
					}
					}
					break;
				case 3:
					{
					setState(296);
					expr(0);
					}
					break;
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						match(T__5);
						setState(300);
						for_third_expr();
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case T__1:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class For_stmtContext extends ParserRuleContext {
		public For_first_exprContext for_first_expr() {
			return getRuleContext(For_first_exprContext.class,0);
		}
		public For_third_exprContext for_third_expr() {
			return getRuleContext(For_third_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__49);
			{
			setState(310);
			match(T__0);
			setState(311);
			for_first_expr();
			setState(312);
			match(T__35);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Type:
			case INT:
			case ID:
				{
				setState(313);
				expr(0);
				}
				break;
			case T__35:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			match(T__35);
			setState(318);
			for_third_expr();
			setState(319);
			match(T__1);
			}
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(321);
				match(T__35);
				}
				break;
			case 2:
				{
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(322);
						match(T__2);
						}
					}

					setState(325);
					block();
					}
					break;
				case 2:
					{
					}
					break;
				}
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
	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
		public List<TerminalNode> ID() { return getTokens(funcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(funcParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof funcListener ) ((funcListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof funcVisitor ) return ((funcVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vardecl);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(Type);
				setState(332);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(Type);
				{
				setState(334);
				match(ID);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(335);
					match(T__6);
					setState(336);
					expr(0);
					}
				}

				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(339);
					match(T__5);
					setState(340);
					match(ID);
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(341);
						match(T__6);
						setState(342);
						expr(0);
						}
					}

					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(T__35);
				}
				break;
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002\n\u0002"+
		"\f\u0002A\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f"+
		"\u0004N\t\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005m\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u009e\b\u0005\n\u0005\f\u0005\u00a1\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ad\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00b5\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b9\b\u0007"+
		"\u0003\u0007\u00bb\b\u0007\u0001\u0007\u0003\u0007\u00be\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00c2\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00c6\b\u0007\u0003\u0007\u00c8\b\u0007\u0003\u0007\u00ca\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d2\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00d7\b\b\u0003\b\u00d9\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u00e0\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ec\b\t\n"+
		"\t\f\t\u00ef\t\t\u0003\t\u00f1\b\t\u0003\t\u00f3\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00fb\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0100\b\n\u0005\n\u0102\b\n\n\n\f\n\u0105\t\n\u0001\n\u0003\n\u0108"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0003"+
		"\f\u0110\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0116\b\f\u0001\f"+
		"\u0001\f\u0005\f\u011a\b\f\n\f\f\f\u011d\t\f\u0001\f\u0003\f\u0120\b\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u012a\b\r\u0001\r\u0001\r\u0005\r\u012e\b\r\n\r\f\r\u0131\t\r\u0001"+
		"\r\u0003\r\u0134\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u013c\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0144\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0148\b\u000e\u0003\u000e\u014a\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0152\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0158\b\u000f\u0005\u000f\u015a\b\u000f\n\u000f\f\u000f\u015d"+
		"\t\u000f\u0001\u000f\u0003\u000f\u0160\b\u000f\u0001\u000f\u0000\u0001"+
		"\n\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\b\u0001\u0000\r\u000e\u0001\u0000\u0010\u0013"+
		"\u0002\u0000\u000f\u000f\u0014\u0015\u0002\u0000\f\f\u0016\u0016\u0001"+
		"\u0000\u0017\u0018\u0001\u0000\u0019\u001c\u0001\u0000\u001d\u001e\u0001"+
		"\u0000%.\u019d\u0000!\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000"+
		"\u0000\u0004:\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\b"+
		"H\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000"+
		"\u0000\u0000\u000e\u00ae\u0001\u0000\u0000\u0000\u0010\u00cb\u0001\u0000"+
		"\u0000\u0000\u0012\u00f2\u0001\u0000\u0000\u0000\u0014\u00f6\u0001\u0000"+
		"\u0000\u0000\u0016\u010b\u0001\u0000\u0000\u0000\u0018\u011f\u0001\u0000"+
		"\u0000\u0000\u001a\u0133\u0001\u0000\u0000\u0000\u001c\u0135\u0001\u0000"+
		"\u0000\u0000\u001e\u015f\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001"+
		"\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001\u0000\u0000\u0000"+
		"%&\u00054\u0000\u0000&\'\u00059\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(*\u0005\u0001\u0000\u0000)+\u0003\u0004\u0002\u0000*)\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\u0002"+
		"\u0000\u0000-/\u0001\u0000\u0000\u0000.0\u0005\u0003\u0000\u0000/.\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"15\u0005\u0004\u0000\u000024\u0003\f\u0006\u000032\u0001\u0000\u0000\u0000"+
		"47\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0005"+
		"\u0000\u00009\u0003\u0001\u0000\u0000\u0000:?\u0003\u0006\u0003\u0000"+
		";<\u0005\u0006\u0000\u0000<>\u0003\u0006\u0003\u0000=;\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@\u0005\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u00054\u0000\u0000CF\u00059\u0000\u0000DE\u0005\u0007\u0000\u0000E"+
		"G\u0003\n\u0005\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"G\u0007\u0001\u0000\u0000\u0000HL\u0005\u0004\u0000\u0000IK\u0003\f\u0006"+
		"\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000OQ\u00053\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000\u0000"+
		"S\t\u0001\u0000\u0000\u0000TU\u0006\u0005\uffff\uffff\u0000UV\u00059\u0000"+
		"\u0000VW\u0005\b\u0000\u0000WX\u0003\n\u0005\u0000XY\u0005\t\u0000\u0000"+
		"Ym\u0001\u0000\u0000\u0000Z[\u0005\u0001\u0000\u0000[\\\u0003\n\u0005"+
		"\u0000\\]\u0005\u0002\u0000\u0000]m\u0001\u0000\u0000\u0000^_\u0005\f"+
		"\u0000\u0000_m\u0003\n\u0005\u0015`a\u00054\u0000\u0000am\u0003\n\u0005"+
		"\u0014bc\u0007\u0000\u0000\u0000cm\u0003\n\u0005\u0013de\u0005\u000f\u0000"+
		"\u0000em\u0003\n\u0005\u0011fg\u0005\u0010\u0000\u0000gm\u0003\n\u0005"+
		"\u0010hi\u0007\u0001\u0000\u0000im\u0003\n\u0005\u000fjm\u00055\u0000"+
		"\u0000km\u00059\u0000\u0000lT\u0001\u0000\u0000\u0000lZ\u0001\u0000\u0000"+
		"\u0000l^\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000lb\u0001\u0000"+
		"\u0000\u0000ld\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000lh\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"m\u009f\u0001\u0000\u0000\u0000no\n\u0017\u0000\u0000op\u0005\n\u0000"+
		"\u0000p\u009e\u0003\n\u0005\u0018qr\n\u0016\u0000\u0000rs\u0005\u000b"+
		"\u0000\u0000s\u009e\u0003\n\u0005\u0017tu\n\u000e\u0000\u0000uv\u0007"+
		"\u0002\u0000\u0000v\u009e\u0003\n\u0005\u000fwx\n\r\u0000\u0000xy\u0007"+
		"\u0003\u0000\u0000y\u009e\u0003\n\u0005\u000ez{\n\f\u0000\u0000{|\u0007"+
		"\u0004\u0000\u0000|\u009e\u0003\n\u0005\r}~\n\u000b\u0000\u0000~\u007f"+
		"\u0007\u0005\u0000\u0000\u007f\u009e\u0003\n\u0005\f\u0080\u0081\n\n\u0000"+
		"\u0000\u0081\u0082\u0007\u0006\u0000\u0000\u0082\u009e\u0003\n\u0005\u000b"+
		"\u0083\u0084\n\t\u0000\u0000\u0084\u0085\u0005\u0010\u0000\u0000\u0085"+
		"\u009e\u0003\n\u0005\n\u0086\u0087\n\b\u0000\u0000\u0087\u0088\u0005\u001f"+
		"\u0000\u0000\u0088\u009e\u0003\n\u0005\t\u0089\u008a\n\u0007\u0000\u0000"+
		"\u008a\u008b\u0005 \u0000\u0000\u008b\u009e\u0003\n\u0005\b\u008c\u008d"+
		"\n\u0006\u0000\u0000\u008d\u008e\u0005!\u0000\u0000\u008e\u009e\u0003"+
		"\n\u0005\u0007\u008f\u0090\n\u0005\u0000\u0000\u0090\u0091\u0005\"\u0000"+
		"\u0000\u0091\u009e\u0003\n\u0005\u0006\u0092\u0093\n\u0004\u0000\u0000"+
		"\u0093\u0094\u0005#\u0000\u0000\u0094\u0095\u0003\n\u0005\u0000\u0095"+
		"\u0096\u0005$\u0000\u0000\u0096\u0097\u0003\n\u0005\u0004\u0097\u009e"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\n\u0003\u0000\u0000\u0099\u009a\u0007"+
		"\u0007\u0000\u0000\u009a\u009e\u0003\n\u0005\u0003\u009b\u009c\n\u0012"+
		"\u0000\u0000\u009c\u009e\u0007\u0000\u0000\u0000\u009dn\u0001\u0000\u0000"+
		"\u0000\u009dq\u0001\u0000\u0000\u0000\u009dt\u0001\u0000\u0000\u0000\u009d"+
		"w\u0001\u0000\u0000\u0000\u009dz\u0001\u0000\u0000\u0000\u009d}\u0001"+
		"\u0000\u0000\u0000\u009d\u0080\u0001\u0000\u0000\u0000\u009d\u0083\u0001"+
		"\u0000\u0000\u0000\u009d\u0086\u0001\u0000\u0000\u0000\u009d\u0089\u0001"+
		"\u0000\u0000\u0000\u009d\u008c\u0001\u0000\u0000\u0000\u009d\u008f\u0001"+
		"\u0000\u0000\u0000\u009d\u0092\u0001\u0000\u0000\u0000\u009d\u0098\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u000b\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00ad\u0003\u0012\t\u0000\u00a3\u00ad\u0003\u000e"+
		"\u0007\u0000\u00a4\u00ad\u0003\u0010\b\u0000\u00a5\u00ad\u0003\u001c\u000e"+
		"\u0000\u00a6\u00ad\u0003\u001e\u000f\u0000\u00a7\u00ad\u0003\u0016\u000b"+
		"\u0000\u00a8\u00a9\u0003\n\u0005\u0000\u00a9\u00aa\u0005$\u0000\u0000"+
		"\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\u0003\u0000\u0000"+
		"\u00ac\u00a2\u0001\u0000\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\r\u0001\u0000\u0000\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af"+
		"\u00b0\u0005\u0001\u0000\u0000\u00b0\u00b1\u0003\n\u0005\u0000\u00b1\u00b2"+
		"\u0005\u0002\u0000\u0000\u00b2\u00c9\u0001\u0000\u0000\u0000\u00b3\u00b5"+
		"\u0005\u0003\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0003\b\u0004\u0000\u00b7\u00b9\u0003\f\u0006\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00c7\u0001\u0000\u0000\u0000\u00bc\u00be\u0005"+
		"\u0003\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005"+
		"0\u0000\u0000\u00c0\u00c2\u0005\u0003\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0003\b\u0004\u0000\u00c4\u00c6\u0003\f\u0006"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ba\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u000f\u0001\u0000\u0000\u0000\u00cb\u00cc\u00051\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0001\u0000\u0000\u00cd\u00ce\u0003\n\u0005\u0000\u00ce"+
		"\u00cf\u0005\u0002\u0000\u0000\u00cf\u00d8\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d2\u0005\u0003\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d6\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d7\u0003\f\u0006\u0000\u00d4\u00d7\u0003\b\u0004\u0000\u00d5\u00d7"+
		"\u0005$\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u0011\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		"\n\u0005\u0000\u00db\u00dc\u0005\u0007\u0000\u0000\u00dc\u00dd\u0003\n"+
		"\u0005\u0000\u00dd\u00f3\u0001\u0000\u0000\u0000\u00de\u00e0\u00054\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00f0\u0001\u0000\u0000\u0000\u00e1\u00e2\u00059\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0007\u0000\u0000\u00e3\u00f1\u0003\u0014\n\u0000\u00e4"+
		"\u00e5\u00059\u0000\u0000\u00e5\u00e6\u0005\u0007\u0000\u0000\u00e6\u00ed"+
		"\u0003\n\u0005\u0000\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00e9\u0005"+
		"9\u0000\u0000\u00e9\u00ea\u0005\u0007\u0000\u0000\u00ea\u00ec\u0003\n"+
		"\u0005\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e1\u0001\u0000\u0000\u0000\u00f0\u00e4\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00da\u0001\u0000"+
		"\u0000\u0000\u00f2\u00df\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005$\u0000\u0000\u00f5\u0013\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u00059\u0000\u0000\u00f7\u0107\u0005\u0001\u0000\u0000"+
		"\u00f8\u00fb\u00059\u0000\u0000\u00f9\u00fb\u0003\n\u0005\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u0103\u0001\u0000\u0000\u0000\u00fc\u00ff\u0005\u0006\u0000\u0000\u00fd"+
		"\u0100\u00059\u0000\u0000\u00fe\u0100\u0003\n\u0005\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0108\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u00fa"+
		"\u0001\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0002\u0000\u0000\u010a\u0015"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u0014\n\u0000\u010c\u010d\u0005"+
		"$\u0000\u0000\u010d\u0017\u0001\u0000\u0000\u0000\u010e\u0110\u00054\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0115\u0001\u0000\u0000\u0000\u0111\u0112\u00059\u0000\u0000"+
		"\u0112\u0113\u0005\u0007\u0000\u0000\u0113\u0116\u0003\n\u0005\u0000\u0114"+
		"\u0116\u0003\n\u0005\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0115\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u011b\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0005\u0006\u0000\u0000\u0118\u011a\u0003\u0018\f\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u0120\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0120\u0001"+
		"\u0000\u0000\u0000\u011f\u010f\u0001\u0000\u0000\u0000\u011f\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0019\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"9\u0000\u0000\u0122\u0123\u0005\u0007\u0000\u0000\u0123\u012a\u0003\n"+
		"\u0005\u0000\u0124\u0125\u0003\n\u0005\u0000\u0125\u0126\u0005\u0007\u0000"+
		"\u0000\u0126\u0127\u0003\n\u0005\u0000\u0127\u012a\u0001\u0000\u0000\u0000"+
		"\u0128\u012a\u0003\n\u0005\u0000\u0129\u0121\u0001\u0000\u0000\u0000\u0129"+
		"\u0124\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u012f\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0006\u0000\u0000\u012c"+
		"\u012e\u0003\u001a\r\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0131"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0134\u0001\u0000\u0000\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0129"+
		"\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u001b"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u00052\u0000\u0000\u0136\u0137\u0005"+
		"\u0001\u0000\u0000\u0137\u0138\u0003\u0018\f\u0000\u0138\u013b\u0005$"+
		"\u0000\u0000\u0139\u013c\u0003\n\u0005\u0000\u013a\u013c\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005$\u0000\u0000"+
		"\u013e\u013f\u0003\u001a\r\u0000\u013f\u0140\u0005\u0002\u0000\u0000\u0140"+
		"\u0149\u0001\u0000\u0000\u0000\u0141\u014a\u0005$\u0000\u0000\u0142\u0144"+
		"\u0005\u0003\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0148"+
		"\u0003\b\u0004\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0143\u0001"+
		"\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014a\u0001"+
		"\u0000\u0000\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u001d\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u00054\u0000\u0000\u014c\u0160\u00059\u0000"+
		"\u0000\u014d\u014e\u00054\u0000\u0000\u014e\u0151\u00059\u0000\u0000\u014f"+
		"\u0150\u0005\u0007\u0000\u0000\u0150\u0152\u0003\n\u0005\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u015b"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0006\u0000\u0000\u0154\u0157"+
		"\u00059\u0000\u0000\u0155\u0156\u0005\u0007\u0000\u0000\u0156\u0158\u0003"+
		"\n\u0005\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0153\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0160\u0005$\u0000"+
		"\u0000\u015f\u014b\u0001\u0000\u0000\u0000\u015f\u014d\u0001\u0000\u0000"+
		"\u0000\u0160\u001f\u0001\u0000\u0000\u0000.#*/5?FLPl\u009d\u009f\u00ac"+
		"\u00b4\u00b8\u00ba\u00bd\u00c1\u00c5\u00c7\u00c9\u00d1\u00d6\u00d8\u00df"+
		"\u00ed\u00f0\u00f2\u00fa\u00ff\u0103\u0107\u010f\u0115\u011b\u011f\u0129"+
		"\u012f\u0133\u013b\u0143\u0147\u0149\u0151\u0157\u015b\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}