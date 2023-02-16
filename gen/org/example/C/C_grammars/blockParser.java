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
public class blockParser extends Parser {
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
		RULE_debug = 0, RULE_block = 1, RULE_expr = 2, RULE_statement = 3, RULE_if_stmt = 4, 
		RULE_while_stmt = 5, RULE_assign_stmt = 6, RULE_for_first_expr = 7, RULE_for_third_expr = 8, 
		RULE_for_stmt = 9, RULE_vardecl = 10, RULE_call = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "block", "expr", "statement", "if_stmt", "while_stmt", "assign_stmt", 
			"for_first_expr", "for_third_expr", "for_stmt", "vardecl", "call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'\\n'", "'}'", "'['", "']'", "'('", "')'", "'.'", "'->'", 
			"'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", "'/'", 
			"'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", 
			"'^'", "'|'", "'&&'", "'||'", "'?'", "';'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'if'", "'else'", "'while'", 
			"'='", "','", "'for'"
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

	public blockParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitDebug(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitDebug(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
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
			if ( listener instanceof blockListener ) ((blockListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(27);
				match(T__1);
				}
			}

			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__44:
				case T__46:
				case T__49:
				case Type:
				case INT:
				case ID:
					{
					setState(30);
					statement();
					}
					break;
				case T__0:
					{
					setState(31);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 158927808725515330L) != 0 );
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(36);
				match(T__1);
				}
			}

			setState(39);
			match(T__2);
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
		public TerminalNode ID() { return getToken(blockParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(blockParser.Type, 0); }
		public TerminalNode INT() { return getToken(blockParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(42);
				match(ID);
				setState(43);
				match(T__3);
				setState(44);
				expr(0);
				setState(45);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(47);
				match(T__5);
				setState(48);
				expr(0);
				setState(49);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(51);
				match(T__9);
				setState(52);
				expr(21);
				}
				break;
			case 4:
				{
				{
				setState(53);
				match(Type);
				}
				setState(54);
				expr(20);
				}
				break;
			case 5:
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				expr(19);
				}
				break;
			case 6:
				{
				setState(57);
				match(T__12);
				setState(58);
				expr(17);
				}
				break;
			case 7:
				{
				setState(59);
				match(T__13);
				setState(60);
				expr(16);
				}
				break;
			case 8:
				{
				setState(61);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(62);
				expr(15);
				}
				break;
			case 9:
				{
				setState(63);
				match(INT);
				}
				break;
			case 10:
				{
				setState(64);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(68);
						match(T__7);
						setState(69);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(71);
						match(T__8);
						setState(72);
						expr(23);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(74);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 794624L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(77);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(80);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(83);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(86);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(89);
						match(T__13);
						setState(90);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(92);
						match(T__28);
						setState(93);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(95);
						match(T__29);
						setState(96);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(98);
						match(T__30);
						setState(99);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(101);
						match(T__31);
						setState(102);
						expr(6);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						match(T__32);
						setState(105);
						expr(0);
						setState(106);
						match(T__33);
						setState(107);
						expr(4);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(110);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 35150012350464L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expr(3);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(113);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
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
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
			if ( listener instanceof blockListener ) ((blockListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(125);
				expr(0);
				setState(126);
				match(T__33);
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
			if ( listener instanceof blockListener ) ((blockListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__44);
			{
			setState(131);
			match(T__5);
			setState(132);
			expr(0);
			setState(133);
			match(T__6);
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(135);
						match(T__1);
						}
					}

					setState(140);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(138);
						block();
						}
						break;
					case T__5:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__44:
					case T__46:
					case T__49:
					case Type:
					case INT:
					case ID:
						{
						setState(139);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(144);
						match(T__1);
						}
					}

					{
					setState(147);
					match(T__45);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(148);
						match(T__1);
						}
					}

					setState(153);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(151);
						block();
						}
						break;
					case T__5:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__44:
					case T__46:
					case T__49:
					case Type:
					case INT:
					case ID:
						{
						setState(152);
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
			if ( listener instanceof blockListener ) ((blockListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__46);
			setState(160);
			match(T__5);
			setState(161);
			expr(0);
			setState(162);
			match(T__6);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				{
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(163);
					match(T__1);
					}
				}

				}
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__44:
				case T__46:
				case T__49:
				case Type:
				case INT:
				case ID:
					{
					setState(166);
					statement();
					}
					break;
				case T__0:
					{
					setState(167);
					block();
					}
					break;
				case T__33:
					{
					setState(168);
					match(T__33);
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
		public List<TerminalNode> ID() { return getTokens(blockParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(blockParser.ID, i);
		}
		public TerminalNode Type() { return getToken(blockParser.Type, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Type) {
					{
					setState(173);
					match(Type);
					}
				}

				{
				setState(176);
				match(ID);
				setState(177);
				match(T__47);
				setState(178);
				expr(0);
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__48) {
					{
					{
					setState(180);
					match(T__48);
					{
					setState(181);
					match(ID);
					setState(182);
					match(T__47);
					setState(183);
					expr(0);
					}
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(189);
				expr(0);
				setState(190);
				match(T__47);
				setState(191);
				expr(0);
				setState(192);
				match(T__33);
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
	public static class For_first_exprContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(blockParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<For_first_exprContext> for_first_expr() {
			return getRuleContexts(For_first_exprContext.class);
		}
		public For_first_exprContext for_first_expr(int i) {
			return getRuleContext(For_first_exprContext.class,i);
		}
		public TerminalNode ID() { return getToken(blockParser.ID, 0); }
		public For_first_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_first_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).enterFor_first_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitFor_first_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitFor_first_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_first_exprContext for_first_expr() throws RecognitionException {
		For_first_exprContext _localctx = new For_first_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_first_expr);
		try {
			int _alt;
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case Type:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(196);
					match(Type);
					}
					break;
				}
				{
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					{
					setState(199);
					match(ID);
					setState(200);
					match(T__47);
					setState(201);
					expr(0);
					}
					}
					break;
				case 2:
					{
					setState(202);
					expr(0);
					}
					break;
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205);
						match(T__48);
						setState(206);
						for_first_expr();
						}
						} 
					}
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				}
				break;
			case T__33:
			case T__48:
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
		public TerminalNode ID() { return getToken(blockParser.ID, 0); }
		public For_third_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_third_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).enterFor_third_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitFor_third_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitFor_third_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_third_exprContext for_third_expr() throws RecognitionException {
		For_third_exprContext _localctx = new For_third_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_third_expr);
		try {
			int _alt;
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case Type:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					{
					setState(215);
					match(ID);
					setState(216);
					match(T__47);
					setState(217);
					expr(0);
					}
					}
					break;
				case 2:
					{
					{
					setState(218);
					expr(0);
					setState(219);
					match(T__47);
					setState(220);
					expr(0);
					}
					}
					break;
				case 3:
					{
					setState(222);
					expr(0);
					}
					break;
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(225);
						match(T__48);
						setState(226);
						for_third_expr();
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case T__6:
			case T__48:
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
			if ( listener instanceof blockListener ) ((blockListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__49);
			{
			setState(236);
			match(T__5);
			setState(237);
			for_first_expr();
			setState(238);
			match(T__33);
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case Type:
			case INT:
			case ID:
				{
				setState(239);
				expr(0);
				}
				break;
			case T__33:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
			match(T__33);
			setState(244);
			for_third_expr();
			setState(245);
			match(T__6);
			}
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(247);
				match(T__33);
				}
				break;
			case 2:
				{
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(248);
						match(T__1);
						}
					}

					setState(251);
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
		public TerminalNode Type() { return getToken(blockParser.Type, 0); }
		public List<TerminalNode> ID() { return getTokens(blockParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(blockParser.ID, i);
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
			if ( listener instanceof blockListener ) ((blockListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardecl);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(Type);
				setState(258);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(Type);
				{
				setState(260);
				match(ID);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(261);
					match(T__47);
					setState(262);
					expr(0);
					}
				}

				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__48) {
					{
					{
					setState(265);
					match(T__48);
					setState(266);
					match(ID);
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__47) {
						{
						setState(267);
						match(T__47);
						setState(268);
						expr(0);
						}
					}

					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(T__33);
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
		public List<TerminalNode> ID() { return getTokens(blockParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(blockParser.ID, i);
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
			if ( listener instanceof blockListener ) ((blockListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof blockListener ) ((blockListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof blockVisitor ) return ((blockVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
			setState(280);
			match(T__5);
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case Type:
			case INT:
			case ID:
				{
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(281);
					match(ID);
					}
					break;
				case 2:
					{
					setState(282);
					expr(0);
					}
					break;
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__48) {
					{
					{
					setState(285);
					match(T__48);
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(286);
						match(ID);
						}
						break;
					case 2:
						{
						setState(287);
						expr(0);
						}
						break;
					}
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(298);
			match(T__6);
			setState(299);
			match(T__33);
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
		case 2:
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
		"\u0004\u0001:\u012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u001d\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001!\b\u0001\u000b\u0001\f\u0001\"\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"s\b\u0002\n\u0002\f\u0002v\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0081\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0089\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u008d\b\u0004\u0003\u0004\u008f\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0092\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0096\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004\u0003\u0004\u009c\b"+
		"\u0004\u0003\u0004\u009e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00a5\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00aa\b\u0005\u0003\u0005\u00ac\b\u0005\u0001\u0006"+
		"\u0003\u0006\u00af\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b9\b\u0006"+
		"\n\u0006\f\u0006\u00bc\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00c3\b\u0006\u0001\u0007\u0003\u0007\u00c6"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cc"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d0\b\u0007\n\u0007\f\u0007"+
		"\u00d3\t\u0007\u0001\u0007\u0003\u0007\u00d6\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e0\b\b\u0001\b\u0001"+
		"\b\u0005\b\u00e4\b\b\n\b\f\b\u00e7\t\b\u0001\b\u0003\b\u00ea\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f2\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00fa\b\t\u0001\t\u0001\t\u0003"+
		"\t\u00fe\b\t\u0003\t\u0100\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0108\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u010e"+
		"\b\n\u0005\n\u0110\b\n\n\n\f\n\u0113\t\n\u0001\n\u0003\n\u0116\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011c\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0121\b\u000b\u0005\u000b\u0123"+
		"\b\u000b\n\u000b\f\u000b\u0126\t\u000b\u0001\u000b\u0003\u000b\u0129\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0001\u0004"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\b"+
		"\u0001\u0000\u000b\f\u0001\u0000\u000e\u0011\u0002\u0000\r\r\u0012\u0013"+
		"\u0002\u0000\n\n\u0014\u0014\u0001\u0000\u0015\u0016\u0001\u0000\u0017"+
		"\u001a\u0001\u0000\u001b\u001c\u0001\u0000#,\u0167\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000"+
		"\u0000\u0006\u0080\u0001\u0000\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000"+
		"\n\u009f\u0001\u0000\u0000\u0000\f\u00c2\u0001\u0000\u0000\u0000\u000e"+
		"\u00d5\u0001\u0000\u0000\u0000\u0010\u00e9\u0001\u0000\u0000\u0000\u0012"+
		"\u00eb\u0001\u0000\u0000\u0000\u0014\u0115\u0001\u0000\u0000\u0000\u0016"+
		"\u0117\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001c\u0005\u0001\u0000\u0000\u001b"+
		"\u001d\u0005\u0002\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e!\u0003"+
		"\u0006\u0003\u0000\u001f!\u0003\u0002\u0001\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000"+
		"$&\u0005\u0002\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0003\u0000\u0000(\u0003\u0001"+
		"\u0000\u0000\u0000)*\u0006\u0002\uffff\uffff\u0000*+\u00059\u0000\u0000"+
		"+,\u0005\u0004\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005\u0005\u0000"+
		"\u0000.B\u0001\u0000\u0000\u0000/0\u0005\u0006\u0000\u000001\u0003\u0004"+
		"\u0002\u000012\u0005\u0007\u0000\u00002B\u0001\u0000\u0000\u000034\u0005"+
		"\n\u0000\u00004B\u0003\u0004\u0002\u001556\u00054\u0000\u00006B\u0003"+
		"\u0004\u0002\u001478\u0007\u0000\u0000\u00008B\u0003\u0004\u0002\u0013"+
		"9:\u0005\r\u0000\u0000:B\u0003\u0004\u0002\u0011;<\u0005\u000e\u0000\u0000"+
		"<B\u0003\u0004\u0002\u0010=>\u0007\u0001\u0000\u0000>B\u0003\u0004\u0002"+
		"\u000f?B\u00055\u0000\u0000@B\u00059\u0000\u0000A)\u0001\u0000\u0000\u0000"+
		"A/\u0001\u0000\u0000\u0000A3\u0001\u0000\u0000\u0000A5\u0001\u0000\u0000"+
		"\u0000A7\u0001\u0000\u0000\u0000A9\u0001\u0000\u0000\u0000A;\u0001\u0000"+
		"\u0000\u0000A=\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000Bt\u0001\u0000\u0000\u0000CD\n\u0017\u0000\u0000DE\u0005"+
		"\b\u0000\u0000Es\u0003\u0004\u0002\u0018FG\n\u0016\u0000\u0000GH\u0005"+
		"\t\u0000\u0000Hs\u0003\u0004\u0002\u0017IJ\n\u000e\u0000\u0000JK\u0007"+
		"\u0002\u0000\u0000Ks\u0003\u0004\u0002\u000fLM\n\r\u0000\u0000MN\u0007"+
		"\u0003\u0000\u0000Ns\u0003\u0004\u0002\u000eOP\n\f\u0000\u0000PQ\u0007"+
		"\u0004\u0000\u0000Qs\u0003\u0004\u0002\rRS\n\u000b\u0000\u0000ST\u0007"+
		"\u0005\u0000\u0000Ts\u0003\u0004\u0002\fUV\n\n\u0000\u0000VW\u0007\u0006"+
		"\u0000\u0000Ws\u0003\u0004\u0002\u000bXY\n\t\u0000\u0000YZ\u0005\u000e"+
		"\u0000\u0000Zs\u0003\u0004\u0002\n[\\\n\b\u0000\u0000\\]\u0005\u001d\u0000"+
		"\u0000]s\u0003\u0004\u0002\t^_\n\u0007\u0000\u0000_`\u0005\u001e\u0000"+
		"\u0000`s\u0003\u0004\u0002\bab\n\u0006\u0000\u0000bc\u0005\u001f\u0000"+
		"\u0000cs\u0003\u0004\u0002\u0007de\n\u0005\u0000\u0000ef\u0005 \u0000"+
		"\u0000fs\u0003\u0004\u0002\u0006gh\n\u0004\u0000\u0000hi\u0005!\u0000"+
		"\u0000ij\u0003\u0004\u0002\u0000jk\u0005\"\u0000\u0000kl\u0003\u0004\u0002"+
		"\u0004ls\u0001\u0000\u0000\u0000mn\n\u0003\u0000\u0000no\u0007\u0007\u0000"+
		"\u0000os\u0003\u0004\u0002\u0003pq\n\u0012\u0000\u0000qs\u0007\u0000\u0000"+
		"\u0000rC\u0001\u0000\u0000\u0000rF\u0001\u0000\u0000\u0000rI\u0001\u0000"+
		"\u0000\u0000rL\u0001\u0000\u0000\u0000rO\u0001\u0000\u0000\u0000rR\u0001"+
		"\u0000\u0000\u0000rU\u0001\u0000\u0000\u0000rX\u0001\u0000\u0000\u0000"+
		"r[\u0001\u0000\u0000\u0000r^\u0001\u0000\u0000\u0000ra\u0001\u0000\u0000"+
		"\u0000rd\u0001\u0000\u0000\u0000rg\u0001\u0000\u0000\u0000rm\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0005\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000w\u0081\u0003\f\u0006\u0000x\u0081\u0003"+
		"\b\u0004\u0000y\u0081\u0003\n\u0005\u0000z\u0081\u0003\u0012\t\u0000{"+
		"\u0081\u0003\u0014\n\u0000|\u0081\u0003\u0016\u000b\u0000}~\u0003\u0004"+
		"\u0002\u0000~\u007f\u0005\"\u0000\u0000\u007f\u0081\u0001\u0000\u0000"+
		"\u0000\u0080w\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000\u0000\u0080"+
		"y\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001"+
		"\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0081\u0007\u0001\u0000\u0000\u0000\u0082\u0083\u0005-\u0000\u0000"+
		"\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0085\u0003\u0004\u0002\u0000"+
		"\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u009d\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0005\u0002\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0003\u0002\u0001\u0000\u008b\u008d\u0003\u0006\u0003\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0088\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u009b\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0005\u0002\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0005.\u0000\u0000\u0094\u0096\u0005\u0002\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0099\u0001\u0000\u0000\u0000\u0097\u009a\u0003\u0002\u0001\u0000\u0098"+
		"\u009a\u0003\u0006\u0003\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0091\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u008e\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\t\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005/\u0000\u0000\u00a0\u00a1\u0005\u0006\u0000\u0000\u00a1\u00a2\u0003"+
		"\u0004\u0002\u0000\u00a2\u00ab\u0005\u0007\u0000\u0000\u00a3\u00a5\u0005"+
		"\u0002\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a9\u0001\u0000\u0000\u0000\u00a6\u00aa\u0003"+
		"\u0006\u0003\u0000\u00a7\u00aa\u0003\u0002\u0001\u0000\u00a8\u00aa\u0005"+
		"\"\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00af\u00054\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u00059\u0000\u0000"+
		"\u00b1\u00b2\u00050\u0000\u0000\u00b2\u00b3\u0003\u0004\u0002\u0000\u00b3"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b4\u00b5\u00051\u0000\u0000\u00b5\u00b6"+
		"\u00059\u0000\u0000\u00b6\u00b7\u00050\u0000\u0000\u00b7\u00b9\u0003\u0004"+
		"\u0002\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00c3\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0003\u0004\u0002\u0000\u00be\u00bf\u00050\u0000"+
		"\u0000\u00bf\u00c0\u0003\u0004\u0002\u0000\u00c0\u00c1\u0005\"\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00ae\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c3\r\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c6\u00054\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00cb\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u00059\u0000\u0000\u00c8\u00c9\u00050\u0000\u0000\u00c9\u00cc\u0003\u0004"+
		"\u0002\u0000\u00ca\u00cc\u0003\u0004\u0002\u0000\u00cb\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u00051\u0000\u0000\u00ce\u00d0\u0003\u000e\u0007"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d6\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00c5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u000f\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u00059\u0000\u0000\u00d8\u00d9\u00050\u0000\u0000\u00d9"+
		"\u00e0\u0003\u0004\u0002\u0000\u00da\u00db\u0003\u0004\u0002\u0000\u00db"+
		"\u00dc\u00050\u0000\u0000\u00dc\u00dd\u0003\u0004\u0002\u0000\u00dd\u00e0"+
		"\u0001\u0000\u0000\u0000\u00de\u00e0\u0003\u0004\u0002\u0000\u00df\u00d7"+
		"\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000\u00df\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e5\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u00051\u0000\u0000\u00e2\u00e4\u0003\u0010\b\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00df\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u0011\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"2\u0000\u0000\u00ec\u00ed\u0005\u0006\u0000\u0000\u00ed\u00ee\u0003\u000e"+
		"\u0007\u0000\u00ee\u00f1\u0005\"\u0000\u0000\u00ef\u00f2\u0003\u0004\u0002"+
		"\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005\"\u0000\u0000\u00f4\u00f5\u0003\u0010\b\u0000"+
		"\u00f5\u00f6\u0005\u0007\u0000\u0000\u00f6\u00ff\u0001\u0000\u0000\u0000"+
		"\u00f7\u0100\u0005\"\u0000\u0000\u00f8\u00fa\u0005\u0002\u0000\u0000\u00f9"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003\u0002\u0001\u0000\u00fc"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f7\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0013\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u00054\u0000\u0000\u0102\u0116\u00059\u0000\u0000\u0103\u0104\u0005"+
		"4\u0000\u0000\u0104\u0107\u00059\u0000\u0000\u0105\u0106\u00050\u0000"+
		"\u0000\u0106\u0108\u0003\u0004\u0002\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0111\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u00051\u0000\u0000\u010a\u010d\u00059\u0000\u0000\u010b"+
		"\u010c\u00050\u0000\u0000\u010c\u010e\u0003\u0004\u0002\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110"+
		"\u0001\u0000\u0000\u0000\u010f\u0109\u0001\u0000\u0000\u0000\u0110\u0113"+
		"\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0114\u0116\u0005\"\u0000\u0000\u0115\u0101\u0001"+
		"\u0000\u0000\u0000\u0115\u0103\u0001\u0000\u0000\u0000\u0116\u0015\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u00059\u0000\u0000\u0118\u0128\u0005\u0006"+
		"\u0000\u0000\u0119\u011c\u00059\u0000\u0000\u011a\u011c\u0003\u0004\u0002"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u0124\u0001\u0000\u0000\u0000\u011d\u0120\u00051\u0000\u0000"+
		"\u011e\u0121\u00059\u0000\u0000\u011f\u0121\u0003\u0004\u0002\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0001\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000\u0123"+
		"\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0129\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128"+
		"\u011b\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0007\u0000\u0000\u012b"+
		"\u012c\u0005\"\u0000\u0000\u012c\u0017\u0001\u0000\u0000\u0000)\u001c"+
		" \"%Art\u0080\u0088\u008c\u008e\u0091\u0095\u0099\u009b\u009d\u00a4\u00a9"+
		"\u00ab\u00ae\u00ba\u00c2\u00c5\u00cb\u00d1\u00d5\u00df\u00e5\u00e9\u00f1"+
		"\u00f9\u00fd\u00ff\u0107\u010d\u0111\u0115\u011b\u0120\u0124\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}