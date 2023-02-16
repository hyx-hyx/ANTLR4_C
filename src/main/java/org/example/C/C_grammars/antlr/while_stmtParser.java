// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class while_stmtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NEWLINE=15, WS=16, Type=17, 
		INT=18, TWO_OP=19, STRING=20, LINE_COMMENT=21, COMMENT=22, ID=23;
	public static final int
		RULE_debug = 0, RULE_while_stmt = 1, RULE_expr = 2, RULE_block = 3, RULE_statement = 4, 
		RULE_if_stmt = 5, RULE_assign_stmt = 6, RULE_for_stmt = 7, RULE_vardecl = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "while_stmt", "expr", "block", "statement", "if_stmt", "assign_stmt", 
			"for_stmt", "vardecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'('", "')'", "'['", "']'", "'{'", "'\\n'", "'}'", "'if'", 
			"'else'", "'='", "';'", "'for'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NEWLINE", "WS", "Type", "INT", "TWO_OP", "STRING", 
			"LINE_COMMENT", "COMMENT", "ID"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitDebug(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(T__1);
			setState(22);
			expr(0);
			setState(23);
			match(T__2);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(while_stmtParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(while_stmtParser.INT, 0); }
		public TerminalNode TWO_OP() { return getToken(while_stmtParser.TWO_OP, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitExpr(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(27);
				match(ID);
				setState(28);
				match(T__3);
				setState(29);
				expr(0);
				setState(30);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(32);
				match(T__1);
				setState(33);
				expr(0);
				setState(34);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(36);
				match(INT);
				}
				break;
			case 4:
				{
				setState(37);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(40);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(41);
					match(TWO_OP);
					setState(42);
					expr(4);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__5);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8790534L) != 0) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(55);
				match(T__6);
				}
			}

			setState(58);
			match(T__7);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				assign_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				if_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				while_stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				for_stmt();
				}
				break;
			case Type:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				vardecl();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__8);
			setState(68);
			match(T__1);
			setState(69);
			expr(0);
			setState(70);
			match(T__2);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(71);
				match(T__6);
				}
			}

			setState(74);
			block();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(75);
				match(T__9);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(76);
					match(T__6);
					}
				}

				setState(79);
				block();
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
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(while_stmtParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_stmt);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(ID);
				setState(83);
				match(T__10);
				setState(84);
				expr(0);
				setState(85);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				expr(0);
				setState(88);
				match(T__10);
				setState(89);
				expr(0);
				setState(90);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				expr(0);
				setState(93);
				match(T__11);
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
	public static class For_stmtContext extends ParserRuleContext {
		public List<Assign_stmtContext> assign_stmt() {
			return getRuleContexts(Assign_stmtContext.class);
		}
		public Assign_stmtContext assign_stmt(int i) {
			return getRuleContext(Assign_stmtContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(while_stmtParser.ID, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__12);
			setState(98);
			match(T__1);
			setState(99);
			assign_stmt();
			setState(100);
			assign_stmt();
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(101);
				match(ID);
				}
				break;
			case 2:
				{
				setState(102);
				expr(0);
				}
				break;
			}
			setState(105);
			match(T__10);
			setState(106);
			expr(0);
			setState(107);
			match(T__2);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(108);
				match(T__11);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__12:
			case Type:
			case INT:
			case ID:
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(109);
					block();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof while_stmtVisitor ) return ((while_stmtVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardecl);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(Type);
				setState(118);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(Type);
				{
				setState(120);
				match(ID);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(121);
					match(T__10);
					setState(122);
					expr(0);
					}
				}

				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(125);
					match(T__13);
					setState(126);
					match(ID);
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(127);
						match(T__10);
						setState(128);
						expr(0);
						}
					}

					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__11);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0005\u00033\b\u0003\n\u0003\f\u00036\t"+
		"\u0003\u0001\u0003\u0003\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005I\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005"+
		"\u0001\u0005\u0003\u0005Q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006`\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007h\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007r\t\u0007\u0003\u0007"+
		"t\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b|\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0082\b\b\u0005\b\u0084\b\b\n"+
		"\b\f\b\u0087\t\b\u0001\b\u0003\b\u008a\b\b\u0001\b\u0000\u0001\u0004\t"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000\u0098\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004&\u0001"+
		"\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000"+
		"\u0000\nC\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000ea\u0001"+
		"\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u0013\u0003"+
		"\u0002\u0001\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0001\u0000\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0003"+
		"\u0004\u0002\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0019\u0003"+
		"\u0006\u0003\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0006"+
		"\u0002\uffff\uffff\u0000\u001b\u001c\u0005\u0017\u0000\u0000\u001c\u001d"+
		"\u0005\u0004\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e\u001f"+
		"\u0005\u0005\u0000\u0000\u001f\'\u0001\u0000\u0000\u0000 !\u0005\u0002"+
		"\u0000\u0000!\"\u0003\u0004\u0002\u0000\"#\u0005\u0003\u0000\u0000#\'"+
		"\u0001\u0000\u0000\u0000$\'\u0005\u0012\u0000\u0000%\'\u0005\u0017\u0000"+
		"\u0000&\u001a\u0001\u0000\u0000\u0000& \u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'-\u0001\u0000\u0000\u0000"+
		"()\n\u0003\u0000\u0000)*\u0005\u0013\u0000\u0000*,\u0003\u0004\u0002\u0004"+
		"+(\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u000004\u0005\u0006\u0000\u000013\u0003\b\u0004\u000021\u0001"+
		"\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000079\u0005\u0007\u0000\u000087\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\b\u0000\u0000;\u0007\u0001"+
		"\u0000\u0000\u0000<B\u0003\f\u0006\u0000=B\u0003\n\u0005\u0000>B\u0003"+
		"\u0002\u0001\u0000?B\u0003\u000e\u0007\u0000@B\u0003\u0010\b\u0000A<\u0001"+
		"\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000"+
		"\u0000CD\u0005\t\u0000\u0000DE\u0005\u0002\u0000\u0000EF\u0003\u0004\u0002"+
		"\u0000FH\u0005\u0003\u0000\u0000GI\u0005\u0007\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JP\u0003"+
		"\u0006\u0003\u0000KM\u0005\n\u0000\u0000LN\u0005\u0007\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OQ\u0003\u0006\u0003\u0000PK\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0005\u0017\u0000\u0000ST\u0005"+
		"\u000b\u0000\u0000TU\u0003\u0004\u0002\u0000UV\u0005\f\u0000\u0000V`\u0001"+
		"\u0000\u0000\u0000WX\u0003\u0004\u0002\u0000XY\u0005\u000b\u0000\u0000"+
		"YZ\u0003\u0004\u0002\u0000Z[\u0005\f\u0000\u0000[`\u0001\u0000\u0000\u0000"+
		"\\]\u0003\u0004\u0002\u0000]^\u0005\f\u0000\u0000^`\u0001\u0000\u0000"+
		"\u0000_R\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000_\\\u0001\u0000"+
		"\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\r\u0000\u0000bc\u0005"+
		"\u0002\u0000\u0000cd\u0003\f\u0006\u0000dg\u0003\f\u0006\u0000eh\u0005"+
		"\u0017\u0000\u0000fh\u0003\u0004\u0002\u0000ge\u0001\u0000\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u000b\u0000"+
		"\u0000jk\u0003\u0004\u0002\u0000ks\u0005\u0003\u0000\u0000lt\u0005\f\u0000"+
		"\u0000mo\u0003\u0006\u0003\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sl\u0001\u0000\u0000\u0000"+
		"sp\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0005\u0011"+
		"\u0000\u0000v\u008a\u0005\u0017\u0000\u0000wx\u0005\u0011\u0000\u0000"+
		"x{\u0005\u0017\u0000\u0000yz\u0005\u000b\u0000\u0000z|\u0003\u0004\u0002"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0085\u0001"+
		"\u0000\u0000\u0000}~\u0005\u000e\u0000\u0000~\u0081\u0005\u0017\u0000"+
		"\u0000\u007f\u0080\u0005\u000b\u0000\u0000\u0080\u0082\u0003\u0004\u0002"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0005\f\u0000\u0000\u0089"+
		"u\u0001\u0000\u0000\u0000\u0089w\u0001\u0000\u0000\u0000\u008a\u0011\u0001"+
		"\u0000\u0000\u0000\u0010&-48AHMP_gps{\u0081\u0085\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}