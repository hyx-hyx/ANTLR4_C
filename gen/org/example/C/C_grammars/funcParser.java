// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, Type=51, INT=52, STRING=53, 
		LINE_COMMENT=54, COMMENT=55, ID=56, NEWLINE=57, WS=58;
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
			null, "'('", "')'", "'\\n'", "','", "'='", "'{'", "'}'", "'['", "']'", 
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
			null, null, null, "Type", "INT", "STRING", "LINE_COMMENT", "COMMENT", 
			"ID", "NEWLINE", "WS"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
		public TerminalNode ID() { return getToken(funcParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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

			setState(49);
			block();
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
			setState(51);
			arg();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(52);
				match(T__3);
				setState(53);
				arg();
				}
				}
				setState(58);
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
			setState(59);
			match(Type);
			setState(60);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(61);
				match(T__4);
				setState(62);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
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
			{
			setState(65);
			match(T__5);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(66);
				match(T__2);
				}
			}

			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(71);
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
				case T__46:
				case T__48:
				case T__49:
				case Type:
				case INT:
				case ID:
					{
					setState(69);
					statement();
					}
					break;
				case T__5:
					{
					setState(70);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 80642580828647490L) != 0 );
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(75);
				match(T__2);
				}
			}

			}
			setState(78);
			match(T__6);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(81);
				match(ID);
				setState(82);
				match(T__7);
				setState(83);
				expr(0);
				setState(84);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(86);
				match(T__0);
				setState(87);
				expr(0);
				setState(88);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(90);
				match(T__11);
				setState(91);
				expr(21);
				}
				break;
			case 4:
				{
				{
				setState(92);
				match(Type);
				}
				setState(93);
				expr(20);
				}
				break;
			case 5:
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				expr(19);
				}
				break;
			case 6:
				{
				setState(96);
				match(T__14);
				setState(97);
				expr(17);
				}
				break;
			case 7:
				{
				setState(98);
				match(T__15);
				setState(99);
				expr(16);
				}
				break;
			case 8:
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				expr(15);
				}
				break;
			case 9:
				{
				setState(102);
				match(INT);
				}
				break;
			case 10:
				{
				setState(103);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(107);
						match(T__9);
						setState(108);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(110);
						match(T__10);
						setState(111);
						expr(23);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(113);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3178496L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(116);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(119);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(122);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(125);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(128);
						match(T__15);
						setState(129);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						match(T__30);
						setState(132);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						match(T__31);
						setState(135);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						match(T__32);
						setState(138);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						match(T__33);
						setState(141);
						expr(6);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						match(T__34);
						setState(144);
						expr(0);
						setState(145);
						match(T__35);
						setState(146);
						expr(4);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 140600049401856L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						expr(3);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(152);
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
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(164);
				expr(0);
				setState(165);
				match(T__35);
				}
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
			setState(169);
			match(T__46);
			{
			setState(170);
			match(T__0);
			setState(171);
			expr(0);
			setState(172);
			match(T__1);
			}
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(174);
						match(T__2);
						}
					}

					setState(179);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
						{
						setState(177);
						block();
						}
						break;
					case T__0:
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
						setState(178);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(183);
						match(T__2);
						}
					}

					{
					setState(186);
					match(T__47);
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(187);
						match(T__2);
						}
					}

					setState(192);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
						{
						setState(190);
						block();
						}
						break;
					case T__0:
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
						setState(191);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__48);
			{
			setState(199);
			match(T__0);
			setState(200);
			expr(0);
			setState(201);
			match(T__1);
			}
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(203);
					match(T__2);
					}
				}

				}
				setState(209);
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
				case T__46:
				case T__48:
				case T__49:
				case Type:
				case INT:
				case ID:
					{
					setState(206);
					statement();
					}
					break;
				case T__5:
					{
					setState(207);
					block();
					}
					break;
				case T__35:
					{
					setState(208);
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
		public List<TerminalNode> ID() { return getTokens(funcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(funcParser.ID, i);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode Type() { return getToken(funcParser.Type, 0); }
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				expr(0);
				setState(214);
				match(T__4);
				setState(215);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Type) {
					{
					setState(217);
					match(Type);
					}
				}

				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(220);
					match(ID);
					setState(221);
					match(T__4);
					setState(222);
					call();
					}
					break;
				case 2:
					{
					setState(223);
					match(ID);
					setState(224);
					match(T__4);
					setState(225);
					expr(0);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(226);
						match(T__3);
						setState(227);
						match(ID);
						setState(228);
						match(T__4);
						setState(229);
						expr(0);
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(237);
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
			setState(241);
			match(ID);
			setState(242);
			match(T__0);
			setState(258);
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
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(243);
					match(ID);
					}
					break;
				case 2:
					{
					setState(244);
					expr(0);
					}
					break;
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(247);
					match(T__3);
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
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
					}
					}
					setState(256);
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
			setState(260);
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
			setState(262);
			call();
			setState(263);
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
			setState(282);
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
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(265);
					match(Type);
					}
					break;
				}
				{
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					{
					setState(268);
					match(ID);
					setState(269);
					match(T__4);
					setState(270);
					expr(0);
					}
					}
					break;
				case 2:
					{
					setState(271);
					expr(0);
					}
					break;
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(274);
						match(T__3);
						setState(275);
						for_first_expr();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				}
				break;
			case T__3:
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
			setState(302);
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
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					{
					setState(284);
					match(ID);
					setState(285);
					match(T__4);
					setState(286);
					expr(0);
					}
					}
					break;
				case 2:
					{
					{
					setState(287);
					expr(0);
					setState(288);
					match(T__4);
					setState(289);
					expr(0);
					}
					}
					break;
				case 3:
					{
					setState(291);
					expr(0);
					}
					break;
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(294);
						match(T__3);
						setState(295);
						for_third_expr();
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case T__1:
			case T__3:
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
			setState(304);
			match(T__49);
			{
			setState(305);
			match(T__0);
			setState(306);
			for_first_expr();
			setState(307);
			match(T__35);
			setState(310);
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
				setState(308);
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
			setState(312);
			match(T__35);
			setState(313);
			for_third_expr();
			setState(314);
			match(T__1);
			}
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(316);
				match(T__35);
				}
				break;
			case 2:
				{
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(317);
						match(T__2);
						}
					}

					setState(320);
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
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(Type);
				setState(327);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(Type);
				{
				setState(329);
				match(ID);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(330);
					match(T__4);
					setState(331);
					expr(0);
					}
				}

				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(334);
					match(T__3);
					setState(335);
					match(ID);
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(336);
						match(T__4);
						setState(337);
						expr(0);
						}
					}

					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
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
		"\u0004\u0001:\u015d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002\n\u0002"+
		"\f\u0002:\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004D\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004\f\u0004I\u0001\u0004\u0003"+
		"\u0004M\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009a"+
		"\b\u0005\n\u0005\f\u0005\u009d\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a8\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00b0\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b4\b\u0007\u0003\u0007\u00b6\b\u0007\u0001\u0007\u0003"+
		"\u0007\u00b9\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bd\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00c1\b\u0007\u0003\u0007\u00c3\b"+
		"\u0007\u0003\u0007\u00c5\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00cd\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d2\b\b"+
		"\u0003\b\u00d4\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00db"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00e7\b\t\n\t\f\t\u00ea\t\t\u0003\t\u00ec\b\t\u0001"+
		"\t\u0001\t\u0003\t\u00f0\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f6"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00fb\b\n\u0005\n\u00fd\b\n\n\n\f"+
		"\n\u0100\t\n\u0001\n\u0003\n\u0103\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0003\f\u010b\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0111\b\f\u0001\f\u0001\f\u0005\f\u0115\b\f\n\f\f\f\u0118\t"+
		"\f\u0001\f\u0003\f\u011b\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0125\b\r\u0001\r\u0001\r\u0005\r\u0129\b\r"+
		"\n\r\f\r\u012c\t\r\u0001\r\u0003\r\u012f\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0137\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u013f\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0143\b\u000e"+
		"\u0003\u000e\u0145\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u014d\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0153\b\u000f\u0005\u000f\u0155\b"+
		"\u000f\n\u000f\f\u000f\u0158\t\u000f\u0001\u000f\u0003\u000f\u015b\b\u000f"+
		"\u0001\u000f\u0000\u0001\n\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\b\u0001\u0000\r\u000e"+
		"\u0001\u0000\u0010\u0013\u0002\u0000\u000f\u000f\u0014\u0015\u0002\u0000"+
		"\f\f\u0016\u0016\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001c\u0001"+
		"\u0000\u001d\u001e\u0001\u0000%.\u0198\u0000!\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006;"+
		"\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000"+
		"\u0000\f\u00a7\u0001\u0000\u0000\u0000\u000e\u00a9\u0001\u0000\u0000\u0000"+
		"\u0010\u00c6\u0001\u0000\u0000\u0000\u0012\u00ef\u0001\u0000\u0000\u0000"+
		"\u0014\u00f1\u0001\u0000\u0000\u0000\u0016\u0106\u0001\u0000\u0000\u0000"+
		"\u0018\u011a\u0001\u0000\u0000\u0000\u001a\u012e\u0001\u0000\u0000\u0000"+
		"\u001c\u0130\u0001\u0000\u0000\u0000\u001e\u015a\u0001\u0000\u0000\u0000"+
		" \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001"+
		"\u0000\u0000\u0000%&\u00053\u0000\u0000&\'\u00058\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(*\u0005\u0001\u0000\u0000)+\u0003\u0004\u0002\u0000"+
		"*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,-\u0005\u0002\u0000\u0000-/\u0001\u0000\u0000\u0000.0\u0005\u0003"+
		"\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000012\u0003\b\u0004\u00002\u0003\u0001\u0000\u0000\u0000"+
		"38\u0003\u0006\u0003\u000045\u0005\u0004\u0000\u000057\u0003\u0006\u0003"+
		"\u000064\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000;<\u00053\u0000\u0000<?\u00058\u0000\u0000="+
		">\u0005\u0005\u0000\u0000>@\u0003\n\u0005\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AC\u0005\u0006"+
		"\u0000\u0000BD\u0005\u0003\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EH\u0003\f\u0006\u0000FH\u0003"+
		"\b\u0004\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JL\u0001\u0000\u0000\u0000KM\u0005\u0003\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0007"+
		"\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0006\u0005\uffff\uffff\u0000"+
		"QR\u00058\u0000\u0000RS\u0005\b\u0000\u0000ST\u0003\n\u0005\u0000TU\u0005"+
		"\t\u0000\u0000Ui\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0003"+
		"\n\u0005\u0000XY\u0005\u0002\u0000\u0000Yi\u0001\u0000\u0000\u0000Z[\u0005"+
		"\f\u0000\u0000[i\u0003\n\u0005\u0015\\]\u00053\u0000\u0000]i\u0003\n\u0005"+
		"\u0014^_\u0007\u0000\u0000\u0000_i\u0003\n\u0005\u0013`a\u0005\u000f\u0000"+
		"\u0000ai\u0003\n\u0005\u0011bc\u0005\u0010\u0000\u0000ci\u0003\n\u0005"+
		"\u0010de\u0007\u0001\u0000\u0000ei\u0003\n\u0005\u000ffi\u00054\u0000"+
		"\u0000gi\u00058\u0000\u0000hP\u0001\u0000\u0000\u0000hV\u0001\u0000\u0000"+
		"\u0000hZ\u0001\u0000\u0000\u0000h\\\u0001\u0000\u0000\u0000h^\u0001\u0000"+
		"\u0000\u0000h`\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000\u0000hd\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"i\u009b\u0001\u0000\u0000\u0000jk\n\u0017\u0000\u0000kl\u0005\n\u0000"+
		"\u0000l\u009a\u0003\n\u0005\u0018mn\n\u0016\u0000\u0000no\u0005\u000b"+
		"\u0000\u0000o\u009a\u0003\n\u0005\u0017pq\n\u000e\u0000\u0000qr\u0007"+
		"\u0002\u0000\u0000r\u009a\u0003\n\u0005\u000fst\n\r\u0000\u0000tu\u0007"+
		"\u0003\u0000\u0000u\u009a\u0003\n\u0005\u000evw\n\f\u0000\u0000wx\u0007"+
		"\u0004\u0000\u0000x\u009a\u0003\n\u0005\ryz\n\u000b\u0000\u0000z{\u0007"+
		"\u0005\u0000\u0000{\u009a\u0003\n\u0005\f|}\n\n\u0000\u0000}~\u0007\u0006"+
		"\u0000\u0000~\u009a\u0003\n\u0005\u000b\u007f\u0080\n\t\u0000\u0000\u0080"+
		"\u0081\u0005\u0010\u0000\u0000\u0081\u009a\u0003\n\u0005\n\u0082\u0083"+
		"\n\b\u0000\u0000\u0083\u0084\u0005\u001f\u0000\u0000\u0084\u009a\u0003"+
		"\n\u0005\t\u0085\u0086\n\u0007\u0000\u0000\u0086\u0087\u0005 \u0000\u0000"+
		"\u0087\u009a\u0003\n\u0005\b\u0088\u0089\n\u0006\u0000\u0000\u0089\u008a"+
		"\u0005!\u0000\u0000\u008a\u009a\u0003\n\u0005\u0007\u008b\u008c\n\u0005"+
		"\u0000\u0000\u008c\u008d\u0005\"\u0000\u0000\u008d\u009a\u0003\n\u0005"+
		"\u0006\u008e\u008f\n\u0004\u0000\u0000\u008f\u0090\u0005#\u0000\u0000"+
		"\u0090\u0091\u0003\n\u0005\u0000\u0091\u0092\u0005$\u0000\u0000\u0092"+
		"\u0093\u0003\n\u0005\u0004\u0093\u009a\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\n\u0003\u0000\u0000\u0095\u0096\u0007\u0007\u0000\u0000\u0096\u009a\u0003"+
		"\n\u0005\u0003\u0097\u0098\n\u0012\u0000\u0000\u0098\u009a\u0007\u0000"+
		"\u0000\u0000\u0099j\u0001\u0000\u0000\u0000\u0099m\u0001\u0000\u0000\u0000"+
		"\u0099p\u0001\u0000\u0000\u0000\u0099s\u0001\u0000\u0000\u0000\u0099v"+
		"\u0001\u0000\u0000\u0000\u0099y\u0001\u0000\u0000\u0000\u0099|\u0001\u0000"+
		"\u0000\u0000\u0099\u007f\u0001\u0000\u0000\u0000\u0099\u0082\u0001\u0000"+
		"\u0000\u0000\u0099\u0085\u0001\u0000\u0000\u0000\u0099\u0088\u0001\u0000"+
		"\u0000\u0000\u0099\u008b\u0001\u0000\u0000\u0000\u0099\u008e\u0001\u0000"+
		"\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u000b\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a8\u0003\u0012"+
		"\t\u0000\u009f\u00a8\u0003\u000e\u0007\u0000\u00a0\u00a8\u0003\u0010\b"+
		"\u0000\u00a1\u00a8\u0003\u001c\u000e\u0000\u00a2\u00a8\u0003\u001e\u000f"+
		"\u0000\u00a3\u00a8\u0003\u0016\u000b\u0000\u00a4\u00a5\u0003\n\u0005\u0000"+
		"\u00a5\u00a6\u0005$\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7"+
		"\u009e\u0001\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a8\r\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005/\u0000\u0000\u00aa\u00ab\u0005\u0001\u0000\u0000\u00ab\u00ac\u0003"+
		"\n\u0005\u0000\u00ac\u00ad\u0005\u0002\u0000\u0000\u00ad\u00c4\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0005\u0003\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0003\b\u0004\u0000\u00b2\u00b4\u0003\f\u0006"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00c2\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b9\u0005\u0003\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u00050\u0000\u0000\u00bb\u00bd\u0005\u0003\u0000\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00c1\u0003\b\u0004\u0000\u00bf"+
		"\u00c1\u0003\f\u0006\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00b5\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u000f\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u00051\u0000\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00c9\u0003"+
		"\n\u0005\u0000\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca\u00d3\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0005\u0003\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d1\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d2\u0003\f\u0006\u0000\u00cf\u00d2\u0003\b\u0004"+
		"\u0000\u00d0\u00d2\u0005$\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0011\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0003\n\u0005\u0000\u00d6\u00d7\u0005\u0005\u0000\u0000\u00d7"+
		"\u00d8\u0003\n\u0005\u0000\u00d8\u00f0\u0001\u0000\u0000\u0000\u00d9\u00db"+
		"\u00053\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00eb\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"8\u0000\u0000\u00dd\u00de\u0005\u0005\u0000\u0000\u00de\u00ec\u0003\u0014"+
		"\n\u0000\u00df\u00e0\u00058\u0000\u0000\u00e0\u00e1\u0005\u0005\u0000"+
		"\u0000\u00e1\u00e8\u0003\n\u0005\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000"+
		"\u00e3\u00e4\u00058\u0000\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5"+
		"\u00e7\u0003\n\u0005\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e7\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00dc\u0001\u0000\u0000\u0000\u00eb\u00df"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005$\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00d5\u0001"+
		"\u0000\u0000\u0000\u00ef\u00da\u0001\u0000\u0000\u0000\u00f0\u0013\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u00058\u0000\u0000\u00f2\u0102\u0005\u0001"+
		"\u0000\u0000\u00f3\u00f6\u00058\u0000\u0000\u00f4\u00f6\u0003\n\u0005"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00fe\u0001\u0000\u0000\u0000\u00f7\u00fa\u0005\u0004\u0000"+
		"\u0000\u00f8\u00fb\u00058\u0000\u0000\u00f9\u00fb\u0003\n\u0005\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0103\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000"+
		"\u0102\u00f5\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0002\u0000\u0000"+
		"\u0105\u0015\u0001\u0000\u0000\u0000\u0106\u0107\u0003\u0014\n\u0000\u0107"+
		"\u0108\u0005$\u0000\u0000\u0108\u0017\u0001\u0000\u0000\u0000\u0109\u010b"+
		"\u00053\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u0110\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		"8\u0000\u0000\u010d\u010e\u0005\u0005\u0000\u0000\u010e\u0111\u0003\n"+
		"\u0005\u0000\u010f\u0111\u0003\n\u0005\u0000\u0110\u010c\u0001\u0000\u0000"+
		"\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0116\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u0004\u0000\u0000\u0113\u0115\u0003\u0018\f\u0000"+
		"\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u011b\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u010a\u0001\u0000\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u0019\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u00058\u0000\u0000\u011d\u011e\u0005\u0005\u0000\u0000\u011e"+
		"\u0125\u0003\n\u0005\u0000\u011f\u0120\u0003\n\u0005\u0000\u0120\u0121"+
		"\u0005\u0005\u0000\u0000\u0121\u0122\u0003\n\u0005\u0000\u0122\u0125\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0003\n\u0005\u0000\u0124\u011c\u0001\u0000"+
		"\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u012a\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0004"+
		"\u0000\u0000\u0127\u0129\u0003\u001a\r\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012f\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000"+
		"\u0000\u012e\u0124\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u001b\u0001\u0000\u0000\u0000\u0130\u0131\u00052\u0000\u0000"+
		"\u0131\u0132\u0005\u0001\u0000\u0000\u0132\u0133\u0003\u0018\f\u0000\u0133"+
		"\u0136\u0005$\u0000\u0000\u0134\u0137\u0003\n\u0005\u0000\u0135\u0137"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0005$\u0000\u0000\u0139\u013a\u0003\u001a\r\u0000\u013a\u013b\u0005"+
		"\u0002\u0000\u0000\u013b\u0144\u0001\u0000\u0000\u0000\u013c\u0145\u0005"+
		"$\u0000\u0000\u013d\u013f\u0005\u0003\u0000\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0143\u0003\b\u0004\u0000\u0141\u0143\u0001\u0000\u0000"+
		"\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u013c\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u001d\u0001\u0000\u0000\u0000\u0146\u0147\u00053\u0000\u0000"+
		"\u0147\u015b\u00058\u0000\u0000\u0148\u0149\u00053\u0000\u0000\u0149\u014c"+
		"\u00058\u0000\u0000\u014a\u014b\u0005\u0005\u0000\u0000\u014b\u014d\u0003"+
		"\n\u0005\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u0156\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0004"+
		"\u0000\u0000\u014f\u0152\u00058\u0000\u0000\u0150\u0151\u0005\u0005\u0000"+
		"\u0000\u0151\u0153\u0003\n\u0005\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000"+
		"\u0154\u014e\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000"+
		"\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0005$\u0000\u0000\u015a\u0146\u0001\u0000\u0000\u0000\u015a"+
		"\u0148\u0001\u0000\u0000\u0000\u015b\u001f\u0001\u0000\u0000\u0000/#*"+
		"/8?CGILh\u0099\u009b\u00a7\u00af\u00b3\u00b5\u00b8\u00bc\u00c0\u00c2\u00c4"+
		"\u00cc\u00d1\u00d3\u00da\u00e8\u00eb\u00ef\u00f5\u00fa\u00fe\u0102\u010a"+
		"\u0110\u0116\u011a\u0124\u012a\u012e\u0136\u013e\u0142\u0144\u014c\u0152"+
		"\u0156\u015a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}