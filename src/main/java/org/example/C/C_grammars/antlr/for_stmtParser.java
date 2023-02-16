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
public class for_stmtParser extends Parser {
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
		T__45=46, T__46=47, T__47=48, T__48=49, WS=50, Type=51, INT=52, STRING=53, 
		LINE_COMMENT=54, COMMENT=55, ID=56, NEWLINE=57, FOR=58, WHILE=59, DO=60, 
		INCLUDE=61, SWITCH=62, RETURN=63, IF=64, DEFINE=65;
	public static final int
		RULE_debug = 0, RULE_for_stmt = 1, RULE_statements = 2, RULE_block = 3, 
		RULE_expr = 4, RULE_statement = 5, RULE_if_stmt = 6, RULE_while_stmt = 7, 
		RULE_type_assign = 8, RULE_expr_assign = 9, RULE_assign_stmt = 10, RULE_call = 11, 
		RULE_callstmt = 12, RULE_vardecl = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "for_stmt", "statements", "block", "expr", "statement", "if_stmt", 
			"while_stmt", "type_assign", "expr_assign", "assign_stmt", "call", "callstmt", 
			"vardecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "';'", "')'", "'\\n'", "'{'", "'}'", "'['", "']'", "'.'", 
			"'->'", "'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", 
			"'/'", "'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", 
			"'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "','", "'if'", 
			"'else'", "'while'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "Type", "INT", "STRING", "LINE_COMMENT", "COMMENT", 
			"ID", "NEWLINE", "FOR", "WHILE", "DO", "INCLUDE", "SWITCH", "RETURN", 
			"IF", "DEFINE"
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

	public for_stmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitDebug(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			for_stmt();
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
		public TerminalNode FOR() { return getToken(for_stmtParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Type_assignContext type_assign() {
			return getRuleContext(Type_assignContext.class,0);
		}
		public List<Expr_assignContext> expr_assign() {
			return getRuleContexts(Expr_assignContext.class);
		}
		public Expr_assignContext expr_assign(int i) {
			return getRuleContext(Expr_assignContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(30);
			match(FOR);
			{
			setState(31);
			match(T__0);
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(32);
				type_assign();
				}
				break;
			case 2:
				{
				setState(33);
				expr_assign();
				}
				break;
			}
			setState(36);
			match(T__1);
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case Type:
			case INT:
			case ID:
				{
				setState(37);
				expr(0);
				}
				break;
			case T__1:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(41);
			match(T__1);
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(43);
				expr(0);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(47);
			match(T__2);
			}
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(49);
				match(T__1);
				}
				break;
			case T__4:
				{
				setState(50);
				block();
				}
				break;
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__45:
			case T__47:
			case Type:
			case INT:
			case ID:
			case FOR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 367395213352105986L) != 0) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(60);
				match(T__3);
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			match(T__4);
			setState(64);
			statements();
			setState(65);
			match(T__5);
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
		public TerminalNode ID() { return getToken(for_stmtParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(for_stmtParser.Type, 0); }
		public TerminalNode INT() { return getToken(for_stmtParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitExpr(this);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(68);
				match(ID);
				setState(69);
				match(T__6);
				setState(70);
				expr(0);
				setState(71);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(73);
				match(T__0);
				setState(74);
				expr(0);
				setState(75);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(77);
				match(T__10);
				setState(78);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(79);
				match(Type);
				}
				setState(80);
				expr(21);
				}
				break;
			case 5:
				{
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(82);
				expr(20);
				}
				break;
			case 6:
				{
				setState(83);
				match(T__13);
				setState(84);
				expr(18);
				}
				break;
			case 7:
				{
				setState(85);
				match(T__14);
				setState(86);
				expr(17);
				}
				break;
			case 8:
				{
				setState(87);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				expr(16);
				}
				break;
			case 9:
				{
				setState(89);
				match(INT);
				}
				break;
			case 10:
				{
				setState(90);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(94);
						match(T__8);
						setState(95);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(97);
						match(T__9);
						setState(98);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(100);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1589248L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(103);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(109);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(115);
						match(T__14);
						setState(116);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						match(T__29);
						setState(119);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						match(T__30);
						setState(122);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						match(T__31);
						setState(125);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(127);
						match(T__32);
						setState(128);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(130);
						match(T__33);
						setState(131);
						expr(0);
						setState(132);
						match(T__1);
						setState(133);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 35150012350464L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(139);
						match(T__44);
						}
						setState(140);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
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
				setState(147);
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
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(154);
				expr(0);
				setState(155);
				match(T__1);
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
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__45);
			setState(160);
			match(T__0);
			setState(161);
			expr(0);
			setState(162);
			match(T__2);
			setState(163);
			block();
			setState(164);
			match(T__46);
			setState(165);
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
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__47);
			{
			setState(168);
			match(T__0);
			setState(169);
			expr(0);
			setState(170);
			match(T__2);
			}
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(172);
					match(T__3);
					}
				}

				}
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__45:
				case T__47:
				case Type:
				case INT:
				case ID:
				case FOR:
					{
					setState(175);
					statement();
					}
					break;
				case T__4:
					{
					setState(176);
					block();
					}
					break;
				case T__1:
					{
					setState(177);
					match(T__1);
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
	public static class Type_assignContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(for_stmtParser.Type, 0); }
		public TerminalNode ID() { return getToken(for_stmtParser.ID, 0); }
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
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterType_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitType_assign(this);
		}
	}

	public final Type_assignContext type_assign() throws RecognitionException {
		Type_assignContext _localctx = new Type_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			match(Type);
			}
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(183);
				match(ID);
				}
				break;
			case 2:
				{
				setState(184);
				expr(0);
				}
				break;
			}
			setState(187);
			match(T__48);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(188);
				call();
				}
				break;
			case 2:
				{
				setState(189);
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
		public TerminalNode ID() { return getToken(for_stmtParser.ID, 0); }
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
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(192);
				match(ID);
				}
				break;
			case 2:
				{
				setState(193);
				expr(0);
				}
				break;
			}
			setState(196);
			match(T__48);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(197);
				call();
				}
				break;
			case 2:
				{
				setState(198);
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
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(201);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(202);
				type_assign();
				}
				break;
			}
			setState(205);
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
	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(for_stmtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(for_stmtParser.ID, i);
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
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ID);
			setState(208);
			match(T__0);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case Type:
			case INT:
			case ID:
				{
				{
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(209);
					match(ID);
					}
					break;
				case 2:
					{
					setState(210);
					expr(0);
					}
					break;
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(213);
					match(T__44);
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(214);
						match(ID);
						}
						break;
					case 2:
						{
						setState(215);
						expr(0);
						}
						break;
					}
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
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
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			call();
			setState(229);
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
	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(for_stmtParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(for_stmtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(for_stmtParser.ID, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof for_stmtListener ) ((for_stmtListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			match(Type);
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(232);
				match(ID);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(233);
					match(T__44);
					setState(234);
					match(ID);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(240);
				expr(0);
				}
				break;
			}
			}
			setState(243);
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
		"\u0004\u0001A\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0005\u0002"+
		"8\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0090\b\u0004\n\u0004\f\u0004\u0093\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009e\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00ae\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b3\b\u0007\u0003\u0007\u00b5\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00ba\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bf\b\b\u0001\t"+
		"\u0001\t\u0003\t\u00c3\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c8\b\t\u0001"+
		"\n\u0001\n\u0003\n\u00cc\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00d4\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00d9\b\u000b\u0005\u000b\u00db\b\u000b\n\u000b\f\u000b"+
		"\u00de\t\u000b\u0001\u000b\u0003\u000b\u00e1\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u00ec\b\r\n\r\f\r\u00ef\t\r\u0001\r\u0003\r\u00f2\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0000\u0001\b\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u0000\b\u0001\u0000\f\r\u0001\u0000\u000f"+
		"\u0012\u0002\u0000\u000e\u000e\u0013\u0014\u0002\u0000\u000b\u000b\u0015"+
		"\u0015\u0001\u0000\u0016\u0017\u0001\u0000\u0018\u001b\u0001\u0000\u001c"+
		"\u001d\u0001\u0000#,\u011d\u0000\u001c\u0001\u0000\u0000\u0000\u0002\u001e"+
		"\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006?\u0001\u0000"+
		"\u0000\u0000\b[\u0001\u0000\u0000\u0000\n\u009d\u0001\u0000\u0000\u0000"+
		"\f\u009f\u0001\u0000\u0000\u0000\u000e\u00a7\u0001\u0000\u0000\u0000\u0010"+
		"\u00b6\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000\u0000\u0000\u0014"+
		"\u00cb\u0001\u0000\u0000\u0000\u0016\u00cf\u0001\u0000\u0000\u0000\u0018"+
		"\u00e4\u0001\u0000\u0000\u0000\u001a\u00e7\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0002\u0001\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005:\u0000\u0000\u001f\"\u0005\u0001\u0000\u0000 #\u0003\u0010"+
		"\b\u0000!#\u0003\u0012\t\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\'\u0005\u0002\u0000\u0000%(\u0003"+
		"\b\u0004\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'"+
		"&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)-\u0005\u0002\u0000"+
		"\u0000*.\u0003\u0012\t\u0000+.\u0003\b\u0004\u0000,.\u0001\u0000\u0000"+
		"\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000\u000004\u0001"+
		"\u0000\u0000\u000015\u0005\u0002\u0000\u000025\u0003\u0006\u0003\u0000"+
		"35\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000043\u0001\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u000068\u0003"+
		"\n\u0005\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<>\u0005\u0004\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0005\u0000\u0000@A\u0003\u0004\u0002\u0000AB\u0005\u0006\u0000\u0000"+
		"B\u0007\u0001\u0000\u0000\u0000CD\u0006\u0004\uffff\uffff\u0000DE\u0005"+
		"8\u0000\u0000EF\u0005\u0007\u0000\u0000FG\u0003\b\u0004\u0000GH\u0005"+
		"\b\u0000\u0000H\\\u0001\u0000\u0000\u0000IJ\u0005\u0001\u0000\u0000JK"+
		"\u0003\b\u0004\u0000KL\u0005\u0003\u0000\u0000L\\\u0001\u0000\u0000\u0000"+
		"MN\u0005\u000b\u0000\u0000N\\\u0003\b\u0004\u0016OP\u00053\u0000\u0000"+
		"P\\\u0003\b\u0004\u0015QR\u0007\u0000\u0000\u0000R\\\u0003\b\u0004\u0014"+
		"ST\u0005\u000e\u0000\u0000T\\\u0003\b\u0004\u0012UV\u0005\u000f\u0000"+
		"\u0000V\\\u0003\b\u0004\u0011WX\u0007\u0001\u0000\u0000X\\\u0003\b\u0004"+
		"\u0010Y\\\u00054\u0000\u0000Z\\\u00058\u0000\u0000[C\u0001\u0000\u0000"+
		"\u0000[I\u0001\u0000\u0000\u0000[M\u0001\u0000\u0000\u0000[O\u0001\u0000"+
		"\u0000\u0000[Q\u0001\u0000\u0000\u0000[S\u0001\u0000\u0000\u0000[U\u0001"+
		"\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\\u0091\u0001\u0000\u0000\u0000]^\n\u0018\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_\u0090\u0003\b\u0004\u0019`a\n\u0017\u0000"+
		"\u0000ab\u0005\n\u0000\u0000b\u0090\u0003\b\u0004\u0018cd\n\u000f\u0000"+
		"\u0000de\u0007\u0002\u0000\u0000e\u0090\u0003\b\u0004\u0010fg\n\u000e"+
		"\u0000\u0000gh\u0007\u0003\u0000\u0000h\u0090\u0003\b\u0004\u000fij\n"+
		"\r\u0000\u0000jk\u0007\u0004\u0000\u0000k\u0090\u0003\b\u0004\u000elm"+
		"\n\f\u0000\u0000mn\u0007\u0005\u0000\u0000n\u0090\u0003\b\u0004\rop\n"+
		"\u000b\u0000\u0000pq\u0007\u0006\u0000\u0000q\u0090\u0003\b\u0004\frs"+
		"\n\n\u0000\u0000st\u0005\u000f\u0000\u0000t\u0090\u0003\b\u0004\u000b"+
		"uv\n\t\u0000\u0000vw\u0005\u001e\u0000\u0000w\u0090\u0003\b\u0004\nxy"+
		"\n\b\u0000\u0000yz\u0005\u001f\u0000\u0000z\u0090\u0003\b\u0004\t{|\n"+
		"\u0007\u0000\u0000|}\u0005 \u0000\u0000}\u0090\u0003\b\u0004\b~\u007f"+
		"\n\u0006\u0000\u0000\u007f\u0080\u0005!\u0000\u0000\u0080\u0090\u0003"+
		"\b\u0004\u0007\u0081\u0082\n\u0005\u0000\u0000\u0082\u0083\u0005\"\u0000"+
		"\u0000\u0083\u0084\u0003\b\u0004\u0000\u0084\u0085\u0005\u0002\u0000\u0000"+
		"\u0085\u0086\u0003\b\u0004\u0005\u0086\u0090\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\n\u0004\u0000\u0000\u0088\u0089\u0007\u0007\u0000\u0000\u0089\u0090"+
		"\u0003\b\u0004\u0004\u008a\u008b\n\u0003\u0000\u0000\u008b\u008c\u0005"+
		"-\u0000\u0000\u008c\u0090\u0003\b\u0004\u0004\u008d\u008e\n\u0013\u0000"+
		"\u0000\u008e\u0090\u0007\u0000\u0000\u0000\u008f]\u0001\u0000\u0000\u0000"+
		"\u008f`\u0001\u0000\u0000\u0000\u008fc\u0001\u0000\u0000\u0000\u008ff"+
		"\u0001\u0000\u0000\u0000\u008fi\u0001\u0000\u0000\u0000\u008fl\u0001\u0000"+
		"\u0000\u0000\u008fo\u0001\u0000\u0000\u0000\u008fr\u0001\u0000\u0000\u0000"+
		"\u008fu\u0001\u0000\u0000\u0000\u008fx\u0001\u0000\u0000\u0000\u008f{"+
		"\u0001\u0000\u0000\u0000\u008f~\u0001\u0000\u0000\u0000\u008f\u0081\u0001"+
		"\u0000\u0000\u0000\u008f\u0087\u0001\u0000\u0000\u0000\u008f\u008a\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u009e\u0003\u0014\n\u0000\u0095\u009e\u0003\f\u0006"+
		"\u0000\u0096\u009e\u0003\u000e\u0007\u0000\u0097\u009e\u0003\u0002\u0001"+
		"\u0000\u0098\u009e\u0003\u001a\r\u0000\u0099\u009e\u0003\u0018\f\u0000"+
		"\u009a\u009b\u0003\b\u0004\u0000\u009b\u009c\u0005\u0002\u0000\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u0094\u0001\u0000\u0000\u0000\u009d"+
		"\u0095\u0001\u0000\u0000\u0000\u009d\u0096\u0001\u0000\u0000\u0000\u009d"+
		"\u0097\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009d"+
		"\u0099\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e"+
		"\u000b\u0001\u0000\u0000\u0000\u009f\u00a0\u0005.\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0001\u0000\u0000\u00a1\u00a2\u0003\b\u0004\u0000\u00a2\u00a3\u0005"+
		"\u0003\u0000\u0000\u00a3\u00a4\u0003\u0006\u0003\u0000\u00a4\u00a5\u0005"+
		"/\u0000\u0000\u00a5\u00a6\u0003\u0006\u0003\u0000\u00a6\r\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u00050\u0000\u0000\u00a8\u00a9\u0005\u0001\u0000"+
		"\u0000\u00a9\u00aa\u0003\b\u0004\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000"+
		"\u00ab\u00b4\u0001\u0000\u0000\u0000\u00ac\u00ae\u0005\u0004\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b2\u0001\u0000\u0000\u0000\u00af\u00b3\u0003\n\u0005\u0000\u00b0"+
		"\u00b3\u0003\u0006\u0003\u0000\u00b1\u00b3\u0005\u0002\u0000\u0000\u00b2"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u000f\u0001\u0000\u0000\u0000\u00b6\u00b9\u00053\u0000\u0000\u00b7\u00ba"+
		"\u00058\u0000\u0000\u00b8\u00ba\u0003\b\u0004\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u00051\u0000\u0000\u00bc\u00bf\u0003\u0016"+
		"\u000b\u0000\u00bd\u00bf\u0003\b\u0004\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u0011\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u00058\u0000\u0000\u00c1\u00c3\u0003\b\u0004\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u00051\u0000\u0000\u00c5"+
		"\u00c8\u0003\u0016\u000b\u0000\u00c6\u00c8\u0003\b\u0004\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u0013"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0003\u0012\t\u0000\u00ca\u00cc\u0003"+
		"\u0010\b\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0002"+
		"\u0000\u0000\u00ce\u0015\u0001\u0000\u0000\u0000\u00cf\u00d0\u00058\u0000"+
		"\u0000\u00d0\u00e0\u0005\u0001\u0000\u0000\u00d1\u00d4\u00058\u0000\u0000"+
		"\u00d2\u00d4\u0003\b\u0004\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00dc\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0005-\u0000\u0000\u00d6\u00d9\u00058\u0000\u0000\u00d7\u00d9\u0003"+
		"\b\u0004\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e1\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e0\u00d3\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0003"+
		"\u0000\u0000\u00e3\u0017\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u0016"+
		"\u000b\u0000\u00e5\u00e6\u0005\u0002\u0000\u0000\u00e6\u0019\u0001\u0000"+
		"\u0000\u0000\u00e7\u00f1\u00053\u0000\u0000\u00e8\u00ed\u00058\u0000\u0000"+
		"\u00e9\u00ea\u0005-\u0000\u0000\u00ea\u00ec\u00058\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f2"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2"+
		"\u0003\b\u0004\u0000\u00f1\u00e8\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"\u0002\u0000\u0000\u00f4\u001b\u0001\u0000\u0000\u0000\u0018\"\'-49=["+
		"\u008f\u0091\u009d\u00ad\u00b2\u00b4\u00b9\u00be\u00c2\u00c7\u00cb\u00d3"+
		"\u00d8\u00dc\u00e0\u00ed\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}