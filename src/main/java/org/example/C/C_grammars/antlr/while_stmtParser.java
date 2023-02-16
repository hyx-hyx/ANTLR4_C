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
public class while_stmtParser extends Parser {
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
		RULE_debug = 0, RULE_while_stmt = 1, RULE_expr = 2, RULE_statements = 3, 
		RULE_block = 4, RULE_statement = 5, RULE_if_stmt = 6, RULE_type_assign = 7, 
		RULE_expr_assign = 8, RULE_assign_stmt = 9, RULE_call = 10, RULE_callstmt = 11, 
		RULE_for_stmt = 12, RULE_vardecl = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "while_stmt", "expr", "statements", "block", "statement", "if_stmt", 
			"type_assign", "expr_assign", "assign_stmt", "call", "callstmt", "for_stmt", 
			"vardecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'('", "')'", "'\\n'", "';'", "'['", "']'", "'.'", "'->'", 
			"'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", "'/'", 
			"'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", 
			"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "','", "'{'", "'}'", 
			"'if'", "'else'", "'='"
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

	public while_stmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitDebug(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			while_stmt();
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			{
			setState(31);
			match(T__1);
			setState(32);
			expr(0);
			setState(33);
			match(T__2);
			}
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(35);
					match(T__3);
					}
				}

				}
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__46:
				case Type:
				case INT:
				case ID:
				case FOR:
					{
					setState(38);
					statement();
					}
					break;
				case T__44:
					{
					setState(39);
					block();
					}
					break;
				case T__4:
					{
					setState(40);
					match(T__4);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(while_stmtParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(while_stmtParser.Type, 0); }
		public TerminalNode INT() { return getToken(while_stmtParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitExpr(this);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(46);
				match(ID);
				setState(47);
				match(T__5);
				setState(48);
				expr(0);
				setState(49);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(51);
				match(T__1);
				setState(52);
				expr(0);
				setState(53);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(55);
				match(T__9);
				setState(56);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(57);
				match(Type);
				}
				setState(58);
				expr(21);
				}
				break;
			case 5:
				{
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				expr(20);
				}
				break;
			case 6:
				{
				setState(61);
				match(T__12);
				setState(62);
				expr(18);
				}
				break;
			case 7:
				{
				setState(63);
				match(T__13);
				setState(64);
				expr(17);
				}
				break;
			case 8:
				{
				setState(65);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(66);
				expr(16);
				}
				break;
			case 9:
				{
				setState(67);
				match(INT);
				}
				break;
			case 10:
				{
				setState(68);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(72);
						match(T__7);
						setState(73);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(75);
						match(T__8);
						setState(76);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(78);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 794624L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(81);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(84);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(87);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(90);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(93);
						match(T__13);
						setState(94);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(96);
						match(T__28);
						setState(97);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(99);
						match(T__29);
						setState(100);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(102);
						match(T__30);
						setState(103);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(105);
						match(T__31);
						setState(106);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(108);
						match(T__32);
						setState(109);
						expr(0);
						setState(110);
						match(T__4);
						setState(111);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(114);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17575006175232L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(117);
						match(T__43);
						}
						setState(118);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(120);
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
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 367184107119311878L) != 0) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(132);
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			match(T__44);
			setState(136);
			statements();
			setState(137);
			match(T__45);
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(145);
				expr(0);
				setState(146);
				match(T__4);
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__46);
			setState(151);
			match(T__1);
			setState(152);
			expr(0);
			setState(153);
			match(T__2);
			setState(154);
			block();
			setState(155);
			match(T__47);
			setState(156);
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
	public static class Type_assignContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(while_stmtParser.Type, 0); }
		public TerminalNode ID() { return getToken(while_stmtParser.ID, 0); }
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterType_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitType_assign(this);
		}
	}

	public final Type_assignContext type_assign() throws RecognitionException {
		Type_assignContext _localctx = new Type_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(158);
			match(Type);
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(159);
				match(ID);
				}
				break;
			case 2:
				{
				setState(160);
				expr(0);
				}
				break;
			}
			setState(163);
			match(T__48);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(164);
				call();
				}
				break;
			case 2:
				{
				setState(165);
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
		public TerminalNode ID() { return getToken(while_stmtParser.ID, 0); }
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(168);
				match(ID);
				}
				break;
			case 2:
				{
				setState(169);
				expr(0);
				}
				break;
			}
			setState(172);
			match(T__48);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(173);
				call();
				}
				break;
			case 2:
				{
				setState(174);
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(177);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(178);
				type_assign();
				}
				break;
			}
			setState(181);
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
	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(while_stmtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(while_stmtParser.ID, i);
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ID);
			setState(184);
			match(T__1);
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
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
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(185);
					match(ID);
					}
					break;
				case 2:
					{
					setState(186);
					expr(0);
					}
					break;
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(189);
					match(T__43);
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(190);
						match(ID);
						}
						break;
					case 2:
						{
						setState(191);
						expr(0);
						}
						break;
					}
					}
					}
					setState(198);
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
			setState(202);
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			call();
			setState(205);
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(while_stmtParser.FOR, 0); }
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
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(207);
			match(FOR);
			{
			setState(208);
			match(T__1);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(209);
				type_assign();
				}
				break;
			case 2:
				{
				setState(210);
				expr_assign();
				}
				break;
			}
			setState(213);
			match(T__4);
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
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
				setState(214);
				expr(0);
				}
				break;
			case T__4:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			match(T__4);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(219);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(220);
				expr(0);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(224);
			match(T__2);
			}
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(226);
				match(T__4);
				}
				break;
			case T__44:
				{
				setState(227);
				block();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__3:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__45:
			case T__46:
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
		public TerminalNode Type() { return getToken(while_stmtParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(while_stmtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(while_stmtParser.ID, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof while_stmtListener ) ((while_stmtListener)listener).exitVardecl(this);
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
				while (_la==T__43) {
					{
					{
					setState(233);
					match(T__43);
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0003\u0001"+
		",\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"z\b\u0002\n\u0002\f\u0002}\t\u0002\u0001\u0003\u0005\u0003\u0080\b\u0003"+
		"\n\u0003\f\u0003\u0083\t\u0003\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0095\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00a2\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00a7\b\u0007\u0001\b\u0001\b\u0003\b\u00ab\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00b0\b\b\u0001\t\u0001\t\u0003\t\u00b4\b\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bc\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00c1\b\n\u0005\n\u00c3\b\n\n\n\f\n\u00c6\t"+
		"\n\u0001\n\u0003\n\u00c9\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d4\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00d9\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00df"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e6\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u00ec\b\r\n\r\f\r\u00ef\t\r\u0001\r\u0003"+
		"\r\u00f2\b\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0004\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\b\u0001"+
		"\u0000\u000b\f\u0001\u0000\u000e\u0011\u0002\u0000\r\r\u0012\u0013\u0002"+
		"\u0000\n\n\u0014\u0014\u0001\u0000\u0015\u0016\u0001\u0000\u0017\u001a"+
		"\u0001\u0000\u001b\u001c\u0001\u0000\"+\u011d\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000"+
		"\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u0087\u0001\u0000\u0000\u0000"+
		"\n\u0094\u0001\u0000\u0000\u0000\f\u0096\u0001\u0000\u0000\u0000\u000e"+
		"\u009e\u0001\u0000\u0000\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012"+
		"\u00b3\u0001\u0000\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016"+
		"\u00cc\u0001\u0000\u0000\u0000\u0018\u00cf\u0001\u0000\u0000\u0000\u001a"+
		"\u00e7\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d"+
		"\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f"+
		" \u0005\u0002\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\u0003\u0000"+
		"\u0000\"+\u0001\u0000\u0000\u0000#%\u0005\u0004\u0000\u0000$#\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%)\u0001\u0000\u0000\u0000&*\u0003"+
		"\n\u0005\u0000\'*\u0003\b\u0004\u0000(*\u0005\u0005\u0000\u0000)&\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		"*,\u0001\u0000\u0000\u0000+$\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0006\u0002\uffff\uffff\u0000"+
		"./\u00058\u0000\u0000/0\u0005\u0006\u0000\u000001\u0003\u0004\u0002\u0000"+
		"12\u0005\u0007\u0000\u00002F\u0001\u0000\u0000\u000034\u0005\u0002\u0000"+
		"\u000045\u0003\u0004\u0002\u000056\u0005\u0003\u0000\u00006F\u0001\u0000"+
		"\u0000\u000078\u0005\n\u0000\u00008F\u0003\u0004\u0002\u00169:\u00053"+
		"\u0000\u0000:F\u0003\u0004\u0002\u0015;<\u0007\u0000\u0000\u0000<F\u0003"+
		"\u0004\u0002\u0014=>\u0005\r\u0000\u0000>F\u0003\u0004\u0002\u0012?@\u0005"+
		"\u000e\u0000\u0000@F\u0003\u0004\u0002\u0011AB\u0007\u0001\u0000\u0000"+
		"BF\u0003\u0004\u0002\u0010CF\u00054\u0000\u0000DF\u00058\u0000\u0000E"+
		"-\u0001\u0000\u0000\u0000E3\u0001\u0000\u0000\u0000E7\u0001\u0000\u0000"+
		"\u0000E9\u0001\u0000\u0000\u0000E;\u0001\u0000\u0000\u0000E=\u0001\u0000"+
		"\u0000\u0000E?\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F{\u0001\u0000\u0000\u0000"+
		"GH\n\u0018\u0000\u0000HI\u0005\b\u0000\u0000Iz\u0003\u0004\u0002\u0019"+
		"JK\n\u0017\u0000\u0000KL\u0005\t\u0000\u0000Lz\u0003\u0004\u0002\u0018"+
		"MN\n\u000f\u0000\u0000NO\u0007\u0002\u0000\u0000Oz\u0003\u0004\u0002\u0010"+
		"PQ\n\u000e\u0000\u0000QR\u0007\u0003\u0000\u0000Rz\u0003\u0004\u0002\u000f"+
		"ST\n\r\u0000\u0000TU\u0007\u0004\u0000\u0000Uz\u0003\u0004\u0002\u000e"+
		"VW\n\f\u0000\u0000WX\u0007\u0005\u0000\u0000Xz\u0003\u0004\u0002\rYZ\n"+
		"\u000b\u0000\u0000Z[\u0007\u0006\u0000\u0000[z\u0003\u0004\u0002\f\\]"+
		"\n\n\u0000\u0000]^\u0005\u000e\u0000\u0000^z\u0003\u0004\u0002\u000b_"+
		"`\n\t\u0000\u0000`a\u0005\u001d\u0000\u0000az\u0003\u0004\u0002\nbc\n"+
		"\b\u0000\u0000cd\u0005\u001e\u0000\u0000dz\u0003\u0004\u0002\tef\n\u0007"+
		"\u0000\u0000fg\u0005\u001f\u0000\u0000gz\u0003\u0004\u0002\bhi\n\u0006"+
		"\u0000\u0000ij\u0005 \u0000\u0000jz\u0003\u0004\u0002\u0007kl\n\u0005"+
		"\u0000\u0000lm\u0005!\u0000\u0000mn\u0003\u0004\u0002\u0000no\u0005\u0005"+
		"\u0000\u0000op\u0003\u0004\u0002\u0005pz\u0001\u0000\u0000\u0000qr\n\u0004"+
		"\u0000\u0000rs\u0007\u0007\u0000\u0000sz\u0003\u0004\u0002\u0004tu\n\u0003"+
		"\u0000\u0000uv\u0005,\u0000\u0000vz\u0003\u0004\u0002\u0004wx\n\u0013"+
		"\u0000\u0000xz\u0007\u0000\u0000\u0000yG\u0001\u0000\u0000\u0000yJ\u0001"+
		"\u0000\u0000\u0000yM\u0001\u0000\u0000\u0000yP\u0001\u0000\u0000\u0000"+
		"yS\u0001\u0000\u0000\u0000yV\u0001\u0000\u0000\u0000yY\u0001\u0000\u0000"+
		"\u0000y\\\u0001\u0000\u0000\u0000y_\u0001\u0000\u0000\u0000yb\u0001\u0000"+
		"\u0000\u0000ye\u0001\u0000\u0000\u0000yh\u0001\u0000\u0000\u0000yk\u0001"+
		"\u0000\u0000\u0000yq\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u0005\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u0080\u0003\n\u0005\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0005\u0004\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0007\u0001\u0000\u0000\u0000\u0087\u0088\u0005-\u0000\u0000"+
		"\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u008a\u0005.\u0000\u0000\u008a"+
		"\t\u0001\u0000\u0000\u0000\u008b\u0095\u0003\u0012\t\u0000\u008c\u0095"+
		"\u0003\f\u0006\u0000\u008d\u0095\u0003\u0002\u0001\u0000\u008e\u0095\u0003"+
		"\u0018\f\u0000\u008f\u0095\u0003\u001a\r\u0000\u0090\u0095\u0003\u0016"+
		"\u000b\u0000\u0091\u0092\u0003\u0004\u0002\u0000\u0092\u0093\u0005\u0005"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000"+
		"\u0000\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0094\u008d\u0001\u0000"+
		"\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0094\u008f\u0001\u0000"+
		"\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000"+
		"\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u0097\u0005/\u0000"+
		"\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u0099\u0003\u0004\u0002"+
		"\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0003\b\u0004\u0000"+
		"\u009b\u009c\u00050\u0000\u0000\u009c\u009d\u0003\b\u0004\u0000\u009d"+
		"\r\u0001\u0000\u0000\u0000\u009e\u00a1\u00053\u0000\u0000\u009f\u00a2"+
		"\u00058\u0000\u0000\u00a0\u00a2\u0003\u0004\u0002\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u00051\u0000\u0000\u00a4\u00a7\u0003\u0014"+
		"\n\u0000\u00a5\u00a7\u0003\u0004\u0002\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u000f\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u00058\u0000\u0000\u00a9\u00ab\u0003\u0004\u0002\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00af\u00051\u0000\u0000\u00ad"+
		"\u00b0\u0003\u0014\n\u0000\u00ae\u00b0\u0003\u0004\u0002\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u0011"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b4\u0003\u0010\b\u0000\u00b2\u00b4\u0003"+
		"\u000e\u0007\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0005\u0000\u0000\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"8\u0000\u0000\u00b8\u00c8\u0005\u0002\u0000\u0000\u00b9\u00bc\u00058\u0000"+
		"\u0000\u00ba\u00bc\u0003\u0004\u0002\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00c4\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0005,\u0000\u0000\u00be\u00c1\u00058\u0000\u0000\u00bf"+
		"\u00c1\u0003\u0004\u0002\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0003\u0000\u0000\u00cb\u0015\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0003\u0014\n\u0000\u00cd\u00ce\u0005\u0005\u0000\u0000\u00ce\u0017"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005:\u0000\u0000\u00d0\u00d3\u0005"+
		"\u0002\u0000\u0000\u00d1\u00d4\u0003\u000e\u0007\u0000\u00d2\u00d4\u0003"+
		"\u0010\b\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d8\u0005\u0005"+
		"\u0000\u0000\u00d6\u00d9\u0003\u0004\u0002\u0000\u00d7\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00de\u0005\u0005"+
		"\u0000\u0000\u00db\u00df\u0003\u0010\b\u0000\u00dc\u00df\u0003\u0004\u0002"+
		"\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000"+
		"\u0000\u00e1\u00e5\u0001\u0000\u0000\u0000\u00e2\u00e6\u0005\u0005\u0000"+
		"\u0000\u00e3\u00e6\u0003\b\u0004\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u0019\u0001\u0000\u0000\u0000"+
		"\u00e7\u00f1\u00053\u0000\u0000\u00e8\u00ed\u00058\u0000\u0000\u00e9\u00ea"+
		"\u0005,\u0000\u0000\u00ea\u00ec\u00058\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f2\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003\u0004"+
		"\u0002\u0000\u00f1\u00e8\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0005"+
		"\u0000\u0000\u00f4\u001b\u0001\u0000\u0000\u0000\u0018$)+Ey{\u0081\u0085"+
		"\u0094\u00a1\u00a6\u00aa\u00af\u00b3\u00bb\u00c0\u00c4\u00c8\u00d3\u00d8"+
		"\u00de\u00e5\u00ed\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}