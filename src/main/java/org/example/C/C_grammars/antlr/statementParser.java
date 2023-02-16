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
public class statementParser extends Parser {
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
		RULE_debug = 0, RULE_statement = 1, RULE_if_stmt = 2, RULE_expr = 3, RULE_statements = 4, 
		RULE_block = 5, RULE_while_stmt = 6, RULE_type_assign = 7, RULE_expr_assign = 8, 
		RULE_assign_stmt = 9, RULE_call = 10, RULE_callstmt = 11, RULE_for_stmt = 12, 
		RULE_vardecl = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "statement", "if_stmt", "expr", "statements", "block", "while_stmt", 
			"type_assign", "expr_assign", "assign_stmt", "call", "callstmt", "for_stmt", 
			"vardecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'('", "')'", "'else'", "'['", "']'", "'.'", "'->'", 
			"'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", "'/'", 
			"'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", 
			"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "','", "'\\n'", "'{'", 
			"'}'", "'while'", "'='"
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

	public statementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitDebug(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 367324844607667212L) != 0 );
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(39);
				expr(0);
				setState(40);
				match(T__0);
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			expr(0);
			setState(47);
			match(T__3);
			setState(48);
			block();
			setState(49);
			match(T__4);
			setState(50);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(statementParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(statementParser.Type, 0); }
		public TerminalNode INT() { return getToken(statementParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitExpr(this);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(53);
				match(ID);
				setState(54);
				match(T__5);
				setState(55);
				expr(0);
				setState(56);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(58);
				match(T__2);
				setState(59);
				expr(0);
				setState(60);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(62);
				match(T__9);
				setState(63);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(64);
				match(Type);
				}
				setState(65);
				expr(21);
				}
				break;
			case 5:
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				expr(20);
				}
				break;
			case 6:
				{
				setState(68);
				match(T__12);
				setState(69);
				expr(18);
				}
				break;
			case 7:
				{
				setState(70);
				match(T__13);
				setState(71);
				expr(17);
				}
				break;
			case 8:
				{
				setState(72);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				expr(16);
				}
				break;
			case 9:
				{
				setState(74);
				match(INT);
				}
				break;
			case 10:
				{
				setState(75);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(79);
						match(T__7);
						setState(80);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(82);
						match(T__8);
						setState(83);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(85);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 794624L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(91);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(94);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(97);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(100);
						match(T__13);
						setState(101);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(103);
						match(T__28);
						setState(104);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(106);
						match(T__29);
						setState(107);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(109);
						match(T__30);
						setState(110);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(112);
						match(T__31);
						setState(113);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(115);
						match(T__32);
						setState(116);
						expr(0);
						setState(117);
						match(T__0);
						setState(118);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(121);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17575006175232L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(124);
						match(T__43);
						}
						setState(125);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(127);
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
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 367324844607667212L) != 0) {
				{
				{
				setState(133);
				statement();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(139);
				match(T__44);
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(142);
			match(T__45);
			setState(143);
			statements();
			setState(144);
			match(T__46);
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__47);
			{
			setState(147);
			match(T__2);
			setState(148);
			expr(0);
			setState(149);
			match(T__3);
			}
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(151);
					match(T__44);
					}
				}

				}
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__47:
				case Type:
				case INT:
				case ID:
				case FOR:
					{
					setState(154);
					statement();
					}
					break;
				case T__45:
					{
					setState(155);
					block();
					}
					break;
				case T__0:
					{
					setState(156);
					match(T__0);
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
		public TerminalNode Type() { return getToken(statementParser.Type, 0); }
		public TerminalNode ID() { return getToken(statementParser.ID, 0); }
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterType_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitType_assign(this);
		}
	}

	public final Type_assignContext type_assign() throws RecognitionException {
		Type_assignContext _localctx = new Type_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			match(Type);
			}
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(162);
				match(ID);
				}
				break;
			case 2:
				{
				setState(163);
				expr(0);
				}
				break;
			}
			setState(166);
			match(T__48);
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(167);
				call();
				}
				break;
			case 2:
				{
				setState(168);
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
		public TerminalNode ID() { return getToken(statementParser.ID, 0); }
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(171);
				match(ID);
				}
				break;
			case 2:
				{
				setState(172);
				expr(0);
				}
				break;
			}
			setState(175);
			match(T__48);
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(176);
				call();
				}
				break;
			case 2:
				{
				setState(177);
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(180);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(181);
				type_assign();
				}
				break;
			}
			setState(184);
			match(T__0);
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
		public List<TerminalNode> ID() { return getTokens(statementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(statementParser.ID, i);
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(187);
			match(T__2);
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
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
				{
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(188);
					match(ID);
					}
					break;
				case 2:
					{
					setState(189);
					expr(0);
					}
					break;
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(192);
					match(T__43);
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(193);
						match(ID);
						}
						break;
					case 2:
						{
						setState(194);
						expr(0);
						}
						break;
					}
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__3:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			match(T__3);
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			call();
			setState(208);
			match(T__0);
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
		public TerminalNode FOR() { return getToken(statementParser.FOR, 0); }
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
			if ( listener instanceof statementListener ) ((statementListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			match(FOR);
			{
			setState(211);
			match(T__2);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(212);
				type_assign();
				}
				break;
			case 2:
				{
				setState(213);
				expr_assign();
				}
				break;
			}
			setState(216);
			match(T__0);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
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
				setState(217);
				expr(0);
				}
				break;
			case T__0:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			match(T__0);
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(222);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(223);
				expr(0);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(227);
			match(T__3);
			}
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(229);
				match(T__0);
				}
				break;
			case T__45:
				{
				setState(230);
				block();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
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
	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(statementParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(statementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(statementParser.ID, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof statementListener ) ((statementListener)listener).exitVardecl(this);
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
			setState(234);
			match(Type);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(235);
				match(ID);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(236);
					match(T__43);
					setState(237);
					match(ID);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(243);
				expr(0);
				}
				break;
			}
			}
			setState(246);
			match(T__0);
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
		"\u0004\u0001A\u00f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0081\b\u0003\n\u0003\f\u0003\u0084\t\u0003\u0001\u0004"+
		"\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004\u008a\t\u0004\u0001\u0004\u0003"+
		"\u0004\u008d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0099\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009e"+
		"\b\u0006\u0003\u0006\u00a0\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00aa\b\u0007\u0001\b\u0001\b\u0003\b\u00ae\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00b3\b\b\u0001\t\u0001\t\u0003\t\u00b7\b\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bf\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c4\b\n\u0005\n\u00c6\b\n\n\n\f\n\u00c9\t\n\u0001\n\u0003"+
		"\n\u00cc\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d7\b\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00dc\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e2\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e9\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00ef\b\r\n\r\f\r\u00f2\t\r\u0001\r\u0003\r\u00f5\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0006\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\b\u0001\u0000\u000b"+
		"\f\u0001\u0000\u000e\u0011\u0002\u0000\r\r\u0012\u0013\u0002\u0000\n\n"+
		"\u0014\u0014\u0001\u0000\u0015\u0016\u0001\u0000\u0017\u001a\u0001\u0000"+
		"\u001b\u001c\u0001\u0000\"+\u0121\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0002*\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006L"+
		"\u0001\u0000\u0000\u0000\b\u0088\u0001\u0000\u0000\u0000\n\u008e\u0001"+
		"\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000\u000e\u00a1\u0001\u0000"+
		"\u0000\u0000\u0010\u00ad\u0001\u0000\u0000\u0000\u0012\u00b6\u0001\u0000"+
		"\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000\u0016\u00cf\u0001\u0000"+
		"\u0000\u0000\u0018\u00d2\u0001\u0000\u0000\u0000\u001a\u00ea\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000"+
		"!+\u0003\u0012\t\u0000\"+\u0003\u0004\u0002\u0000#+\u0003\f\u0006\u0000"+
		"$+\u0003\u0018\f\u0000%+\u0003\u001a\r\u0000&+\u0003\u0016\u000b\u0000"+
		"\'(\u0003\u0006\u0003\u0000()\u0005\u0001\u0000\u0000)+\u0001\u0000\u0000"+
		"\u0000*!\u0001\u0000\u0000\u0000*\"\u0001\u0000\u0000\u0000*#\u0001\u0000"+
		"\u0000\u0000*$\u0001\u0000\u0000\u0000*%\u0001\u0000\u0000\u0000*&\u0001"+
		"\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000"+
		"\u0000,-\u0005\u0002\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0003\u0006"+
		"\u0003\u0000/0\u0005\u0004\u0000\u000001\u0003\n\u0005\u000012\u0005\u0005"+
		"\u0000\u000023\u0003\n\u0005\u00003\u0005\u0001\u0000\u0000\u000045\u0006"+
		"\u0003\uffff\uffff\u000056\u00058\u0000\u000067\u0005\u0006\u0000\u0000"+
		"78\u0003\u0006\u0003\u000089\u0005\u0007\u0000\u00009M\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0003\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u0004"+
		"\u0000\u0000=M\u0001\u0000\u0000\u0000>?\u0005\n\u0000\u0000?M\u0003\u0006"+
		"\u0003\u0016@A\u00053\u0000\u0000AM\u0003\u0006\u0003\u0015BC\u0007\u0000"+
		"\u0000\u0000CM\u0003\u0006\u0003\u0014DE\u0005\r\u0000\u0000EM\u0003\u0006"+
		"\u0003\u0012FG\u0005\u000e\u0000\u0000GM\u0003\u0006\u0003\u0011HI\u0007"+
		"\u0001\u0000\u0000IM\u0003\u0006\u0003\u0010JM\u00054\u0000\u0000KM\u0005"+
		"8\u0000\u0000L4\u0001\u0000\u0000\u0000L:\u0001\u0000\u0000\u0000L>\u0001"+
		"\u0000\u0000\u0000L@\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000\u0000"+
		"LD\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0082\u0001"+
		"\u0000\u0000\u0000NO\n\u0018\u0000\u0000OP\u0005\b\u0000\u0000P\u0081"+
		"\u0003\u0006\u0003\u0019QR\n\u0017\u0000\u0000RS\u0005\t\u0000\u0000S"+
		"\u0081\u0003\u0006\u0003\u0018TU\n\u000f\u0000\u0000UV\u0007\u0002\u0000"+
		"\u0000V\u0081\u0003\u0006\u0003\u0010WX\n\u000e\u0000\u0000XY\u0007\u0003"+
		"\u0000\u0000Y\u0081\u0003\u0006\u0003\u000fZ[\n\r\u0000\u0000[\\\u0007"+
		"\u0004\u0000\u0000\\\u0081\u0003\u0006\u0003\u000e]^\n\f\u0000\u0000^"+
		"_\u0007\u0005\u0000\u0000_\u0081\u0003\u0006\u0003\r`a\n\u000b\u0000\u0000"+
		"ab\u0007\u0006\u0000\u0000b\u0081\u0003\u0006\u0003\fcd\n\n\u0000\u0000"+
		"de\u0005\u000e\u0000\u0000e\u0081\u0003\u0006\u0003\u000bfg\n\t\u0000"+
		"\u0000gh\u0005\u001d\u0000\u0000h\u0081\u0003\u0006\u0003\nij\n\b\u0000"+
		"\u0000jk\u0005\u001e\u0000\u0000k\u0081\u0003\u0006\u0003\tlm\n\u0007"+
		"\u0000\u0000mn\u0005\u001f\u0000\u0000n\u0081\u0003\u0006\u0003\bop\n"+
		"\u0006\u0000\u0000pq\u0005 \u0000\u0000q\u0081\u0003\u0006\u0003\u0007"+
		"rs\n\u0005\u0000\u0000st\u0005!\u0000\u0000tu\u0003\u0006\u0003\u0000"+
		"uv\u0005\u0001\u0000\u0000vw\u0003\u0006\u0003\u0005w\u0081\u0001\u0000"+
		"\u0000\u0000xy\n\u0004\u0000\u0000yz\u0007\u0007\u0000\u0000z\u0081\u0003"+
		"\u0006\u0003\u0004{|\n\u0003\u0000\u0000|}\u0005,\u0000\u0000}\u0081\u0003"+
		"\u0006\u0003\u0004~\u007f\n\u0013\u0000\u0000\u007f\u0081\u0007\u0000"+
		"\u0000\u0000\u0080N\u0001\u0000\u0000\u0000\u0080Q\u0001\u0000\u0000\u0000"+
		"\u0080T\u0001\u0000\u0000\u0000\u0080W\u0001\u0000\u0000\u0000\u0080Z"+
		"\u0001\u0000\u0000\u0000\u0080]\u0001\u0000\u0000\u0000\u0080`\u0001\u0000"+
		"\u0000\u0000\u0080c\u0001\u0000\u0000\u0000\u0080f\u0001\u0000\u0000\u0000"+
		"\u0080i\u0001\u0000\u0000\u0000\u0080l\u0001\u0000\u0000\u0000\u0080o"+
		"\u0001\u0000\u0000\u0000\u0080r\u0001\u0000\u0000\u0000\u0080x\u0001\u0000"+
		"\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0007\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u0002\u0001\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0005-\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\t\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005.\u0000\u0000\u008f\u0090\u0003\b\u0004\u0000\u0090\u0091\u0005"+
		"/\u0000\u0000\u0091\u000b\u0001\u0000\u0000\u0000\u0092\u0093\u00050\u0000"+
		"\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094\u0095\u0003\u0006\u0003"+
		"\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u009f\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u0005-\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000"+
		"\u009a\u009e\u0003\u0002\u0001\u0000\u009b\u009e\u0003\n\u0005\u0000\u009c"+
		"\u009e\u0005\u0001\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\r\u0001\u0000\u0000\u0000\u00a1\u00a4"+
		"\u00053\u0000\u0000\u00a2\u00a5\u00058\u0000\u0000\u00a3\u00a5\u0003\u0006"+
		"\u0003\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u00051\u0000"+
		"\u0000\u00a7\u00aa\u0003\u0014\n\u0000\u00a8\u00aa\u0003\u0006\u0003\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u000f\u0001\u0000\u0000\u0000\u00ab\u00ae\u00058\u0000\u0000\u00ac"+
		"\u00ae\u0003\u0006\u0003\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u00051\u0000\u0000\u00b0\u00b3\u0003\u0014\n\u0000\u00b1\u00b3"+
		"\u0003\u0006\u0003\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0003\u0010\b\u0000\u00b5\u00b7\u0003\u000e\u0007\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005\u0001\u0000\u0000\u00b9\u0013\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u00058\u0000\u0000\u00bb\u00cb\u0005\u0003"+
		"\u0000\u0000\u00bc\u00bf\u00058\u0000\u0000\u00bd\u00bf\u0003\u0006\u0003"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c7\u0001\u0000\u0000\u0000\u00c0\u00c3\u0005,\u0000\u0000"+
		"\u00c1\u00c4\u00058\u0000\u0000\u00c2\u00c4\u0003\u0006\u0003\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cc\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00be\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0004\u0000\u0000\u00ce"+
		"\u0015\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003\u0014\n\u0000\u00d0\u00d1"+
		"\u0005\u0001\u0000\u0000\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005:\u0000\u0000\u00d3\u00d6\u0005\u0003\u0000\u0000\u00d4\u00d7\u0003"+
		"\u000e\u0007\u0000\u00d5\u00d7\u0003\u0010\b\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0005\u0001\u0000\u0000\u00d9\u00dc\u0003\u0006"+
		"\u0003\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e1\u0005\u0001\u0000\u0000\u00de\u00e2\u0003\u0010"+
		"\b\u0000\u00df\u00e2\u0003\u0006\u0003\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e9\u0005\u0001\u0000\u0000\u00e6\u00e9\u0003\n\u0005\u0000"+
		"\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea\u00f4\u00053\u0000\u0000\u00eb"+
		"\u00f0\u00058\u0000\u0000\u00ec\u00ed\u0005,\u0000\u0000\u00ed\u00ef\u0005"+
		"8\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0003\u0006\u0003\u0000\u00f4\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\u0001\u0000\u0000\u00f7\u001b\u0001\u0000"+
		"\u0000\u0000\u0019\u001f*L\u0080\u0082\u0088\u008c\u0098\u009d\u009f\u00a4"+
		"\u00a9\u00ad\u00b2\u00b6\u00be\u00c3\u00c7\u00cb\u00d6\u00db\u00e1\u00e8"+
		"\u00f0\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}