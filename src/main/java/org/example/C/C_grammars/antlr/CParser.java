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
public class CParser extends Parser {
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, Type=54, INT=55, STRING=56, LINE_COMMENT=57, COMMENT=58, ID=59, 
		NEWLINE=60, WS=61, FOR=62, WHILE=63, DO=64, INCLUDE=65, SWITCH=66, RETURN=67, 
		IF=68, DEFINE=69;
	public static final int
		RULE_debug = 0, RULE_head = 1, RULE_preprocess = 2, RULE_statement = 3, 
		RULE_vardecl = 4, RULE_while_stmt = 5, RULE_file = 6, RULE_for_stmt = 7, 
		RULE_func = 8, RULE_args = 9, RULE_arg = 10, RULE_expr = 11, RULE_if_stmt = 12, 
		RULE_call = 13, RULE_callstmt = 14, RULE_statements = 15, RULE_block = 16, 
		RULE_type_assign = 17, RULE_expr_assign = 18, RULE_assign_stmt = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "head", "preprocess", "statement", "vardecl", "while_stmt", 
			"file", "for_stmt", "func", "args", "arg", "expr", "if_stmt", "call", 
			"callstmt", "statements", "block", "type_assign", "expr_assign", "assign_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'include'", "'<'", "'.h'", "'>'", "'define'", "'\\n'", 
			"';'", "','", "'while'", "'('", "')'", "'{'", "'}'", "'='", "'['", "']'", 
			"'.'", "'->'", "'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", 
			"'/'", "'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", "'=='", "'!='", 
			"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Type", "INT", "STRING", "LINE_COMMENT", 
			"COMMENT", "ID", "NEWLINE", "WS", "FOR", "WHILE", "DO", "INCLUDE", "SWITCH", 
			"RETURN", "IF", "DEFINE"
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

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDebug(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			file();
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
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(42);
				match(T__0);
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					{
					setState(43);
					match(T__1);
					setState(44);
					match(T__2);
					{
					setState(45);
					match(ID);
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(46);
						match(T__3);
						}
					}

					}
					setState(49);
					match(T__4);
					}
					}
					break;
				case T__5:
					{
					{
					setState(50);
					match(T__5);
					setState(51);
					match(ID);
					setState(52);
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
				setState(55);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterPreprocess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPreprocess(this);
		}
	}

	public final PreprocessContext preprocess() throws RecognitionException {
		PreprocessContext _localctx = new PreprocessContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(58);
					head();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(69);
				expr(0);
				setState(70);
				match(T__7);
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
	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(CParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CParser.ID, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			match(Type);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(75);
				match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(76);
					match(T__8);
					setState(77);
					match(ID);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(83);
				expr(0);
				}
				break;
			}
			}
			setState(86);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__9);
			{
			setState(89);
			match(T__10);
			setState(90);
			expr(0);
			setState(91);
			match(T__11);
			}
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(93);
					match(T__6);
					}
				}

				}
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__51:
				case Type:
				case INT:
				case ID:
				case FOR:
					{
					setState(96);
					statement();
					}
					break;
				case T__12:
					{
					setState(97);
					block();
					}
					break;
				case T__7:
					{
					setState(98);
					match(T__7);
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
	public static class FileContext extends ParserRuleContext {
		public PreprocessContext preprocess() {
			return getRuleContext(PreprocessContext.class,0);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<Type_assignContext> type_assign() {
			return getRuleContexts(Type_assignContext.class);
		}
		public Type_assignContext type_assign(int i) {
			return getRuleContext(Type_assignContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			preprocess();
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(104);
						vardecl();
						}
						break;
					case 2:
						{
						setState(105);
						type_assign();
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(111);
				match(T__6);
				}
			}

			}
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				func();
				}
				}
				setState(117); 
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CParser.FOR, 0); }
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
			if ( listener instanceof CListener ) ((CListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			match(FOR);
			{
			setState(120);
			match(T__10);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(121);
				type_assign();
				}
				break;
			case 2:
				{
				setState(122);
				expr_assign();
				}
				break;
			}
			setState(125);
			match(T__7);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case Type:
			case INT:
			case ID:
				{
				setState(126);
				expr(0);
				}
				break;
			case T__7:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			match(T__7);
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(131);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(132);
				expr(0);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(136);
			match(T__11);
			}
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(138);
				match(T__7);
				}
				break;
			case T__12:
				{
				setState(139);
				block();
				}
				break;
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__51:
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
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(CParser.Type, 0); }
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
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
			if ( listener instanceof CListener ) ((CListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(143);
			match(Type);
			setState(144);
			match(ID);
			}
			{
			setState(146);
			match(T__10);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(147);
				args();
				}
			}

			setState(150);
			match(T__11);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(152);
				match(T__6);
				}
			}

			{
			setState(155);
			match(T__12);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5246693566154017792L) != 0) {
				{
				{
				setState(156);
				statement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__13);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			arg();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(165);
				match(T__8);
				setState(166);
				arg();
				}
				}
				setState(171);
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
		public TerminalNode Type() { return getToken(CParser.Type, 0); }
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(Type);
			setState(173);
			match(ID);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(174);
				match(T__14);
				setState(175);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(CParser.Type, 0); }
		public TerminalNode INT() { return getToken(CParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpr(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(179);
				match(ID);
				setState(180);
				match(T__15);
				setState(181);
				expr(0);
				setState(182);
				match(T__16);
				}
				break;
			case 2:
				{
				setState(184);
				match(T__10);
				setState(185);
				expr(0);
				setState(186);
				match(T__11);
				}
				break;
			case 3:
				{
				setState(188);
				match(T__19);
				setState(189);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(190);
				match(Type);
				}
				setState(191);
				expr(21);
				}
				break;
			case 5:
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				expr(20);
				}
				break;
			case 6:
				{
				setState(194);
				match(T__22);
				setState(195);
				expr(18);
				}
				break;
			case 7:
				{
				setState(196);
				match(T__23);
				setState(197);
				expr(17);
				}
				break;
			case 8:
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				expr(16);
				}
				break;
			case 9:
				{
				setState(200);
				match(INT);
				}
				break;
			case 10:
				{
				setState(201);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(205);
						match(T__17);
						setState(206);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(208);
						match(T__18);
						setState(209);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(211);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 813694976L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(214);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(217);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(220);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 25769803816L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(226);
						match(T__23);
						setState(227);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(229);
						match(T__36);
						setState(230);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(232);
						match(T__37);
						setState(233);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(235);
						match(T__38);
						setState(236);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(238);
						match(T__39);
						setState(239);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(241);
						match(T__40);
						setState(242);
						expr(0);
						setState(243);
						match(T__7);
						setState(244);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(247);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4499201580859392L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(250);
						match(T__8);
						}
						setState(251);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(253);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
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
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__51);
			setState(260);
			match(T__10);
			setState(261);
			expr(0);
			setState(262);
			match(T__11);
			setState(263);
			block();
			setState(264);
			match(T__52);
			setState(265);
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
	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CParser.ID, i);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(T__10);
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case Type:
			case INT:
			case ID:
				{
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(269);
					match(ID);
					}
					break;
				case 2:
					{
					setState(270);
					expr(0);
					}
					break;
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(273);
					match(T__8);
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(274);
						match(ID);
						}
						break;
					case 2:
						{
						setState(275);
						expr(0);
						}
						break;
					}
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__11:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(286);
			match(T__11);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			call();
			setState(289);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5246693566154017792L) != 0) {
				{
				{
				setState(291);
				statement();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(297);
				match(T__6);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			match(T__12);
			setState(301);
			statements();
			setState(302);
			match(T__13);
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
		public TerminalNode Type() { return getToken(CParser.Type, 0); }
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
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
			if ( listener instanceof CListener ) ((CListener)listener).enterType_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitType_assign(this);
		}
	}

	public final Type_assignContext type_assign() throws RecognitionException {
		Type_assignContext _localctx = new Type_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			match(Type);
			}
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(305);
				match(ID);
				}
				break;
			case 2:
				{
				setState(306);
				expr(0);
				}
				break;
			}
			setState(309);
			match(T__14);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(310);
				call();
				}
				break;
			case 2:
				{
				setState(311);
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
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
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
			if ( listener instanceof CListener ) ((CListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(314);
				match(ID);
				}
				break;
			case 2:
				{
				setState(315);
				expr(0);
				}
				break;
			}
			setState(318);
			match(T__14);
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(319);
				call();
				}
				break;
			case 2:
				{
				setState(320);
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
			if ( listener instanceof CListener ) ((CListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(323);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(324);
				type_assign();
				}
				break;
			}
			setState(327);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
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
		"\u0004\u0001E\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0002\u0004\u0002<\b\u0002\u000b\u0002\f\u0002"+
		"=\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004\f\u0004"+
		"R\t\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005"+
		"\u0003\u0005f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"k\b\u0006\n\u0006\f\u0006n\t\u0006\u0001\u0006\u0003\u0006q\b\u0006\u0001"+
		"\u0006\u0004\u0006t\b\u0006\u000b\u0006\f\u0006u\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0087\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u008e\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0095\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u009a"+
		"\b\b\u0001\b\u0001\b\u0005\b\u009e\b\b\n\b\f\b\u00a1\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00b1\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00cb\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00ff\b\u000b\n\u000b\f\u000b\u0102\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0110\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0115\b\r\u0005\r\u0117\b\r\n\r\f\r\u011a\t\r\u0001\r\u0003\r\u011d"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0005"+
		"\u000f\u0125\b\u000f\n\u000f\f\u000f\u0128\t\u000f\u0001\u000f\u0003\u000f"+
		"\u012b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0134\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0139\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u013d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0142\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0146\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0001\u0016\u0014\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\b"+
		"\u0001\u0000\u0015\u0016\u0001\u0000\u0018\u001b\u0002\u0000\u0017\u0017"+
		"\u001c\u001d\u0002\u0000\u0014\u0014\u001e\u001e\u0001\u0000\u001f \u0003"+
		"\u0000\u0003\u0003\u0005\u0005!\"\u0001\u0000#$\u0001\u0000*3\u0178\u0000"+
		"(\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000"+
		"\u0000\nX\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ew\u0001"+
		"\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u00a4\u0001"+
		"\u0000\u0000\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00ca\u0001"+
		"\u0000\u0000\u0000\u0018\u0103\u0001\u0000\u0000\u0000\u001a\u010b\u0001"+
		"\u0000\u0000\u0000\u001c\u0120\u0001\u0000\u0000\u0000\u001e\u0126\u0001"+
		"\u0000\u0000\u0000 \u012c\u0001\u0000\u0000\u0000\"\u0130\u0001\u0000"+
		"\u0000\u0000$\u013c\u0001\u0000\u0000\u0000&\u0145\u0001\u0000\u0000\u0000"+
		"()\u0003\f\u0006\u0000)\u0001\u0001\u0000\u0000\u0000*5\u0005\u0001\u0000"+
		"\u0000+,\u0005\u0002\u0000\u0000,-\u0005\u0003\u0000\u0000-/\u0005;\u0000"+
		"\u0000.0\u0005\u0004\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u000016\u0005\u0005\u0000\u000023\u0005"+
		"\u0006\u0000\u000034\u0005;\u0000\u000046\u0003\u0016\u000b\u00005+\u0001"+
		"\u0000\u0000\u000052\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"79\u0005\u0007\u0000\u00008*\u0001\u0000\u0000\u000087\u0001\u0000\u0000"+
		"\u00009\u0003\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?I\u0003&\u0013"+
		"\u0000@I\u0003\u0018\f\u0000AI\u0003\n\u0005\u0000BI\u0003\u000e\u0007"+
		"\u0000CI\u0003\b\u0004\u0000DI\u0003\u001c\u000e\u0000EF\u0003\u0016\u000b"+
		"\u0000FG\u0005\b\u0000\u0000GI\u0001\u0000\u0000\u0000H?\u0001\u0000\u0000"+
		"\u0000H@\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000HB\u0001\u0000"+
		"\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000HE\u0001"+
		"\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JT\u00056\u0000\u0000"+
		"KP\u0005;\u0000\u0000LM\u0005\t\u0000\u0000MO\u0005;\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QU\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000SU\u0003\u0016\u000b\u0000TK\u0001\u0000\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\b\u0000\u0000W\t\u0001"+
		"\u0000\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0005\u000b\u0000\u0000Z[\u0003"+
		"\u0016\u000b\u0000[\\\u0005\f\u0000\u0000\\e\u0001\u0000\u0000\u0000]"+
		"_\u0005\u0007\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_c\u0001\u0000\u0000\u0000`d\u0003\u0006\u0003\u0000ad\u0003 \u0010"+
		"\u0000bd\u0005\b\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000e^\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000b\u0001\u0000\u0000\u0000"+
		"gl\u0003\u0004\u0002\u0000hk\u0003\b\u0004\u0000ik\u0003\"\u0011\u0000"+
		"jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000oq\u0005\u0007\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rt\u0003\u0010\b\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000"+
		"\u0000wx\u0005>\u0000\u0000x{\u0005\u000b\u0000\u0000y|\u0003\"\u0011"+
		"\u0000z|\u0003$\u0012\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u0080\u0005\b\u0000\u0000~\u0081\u0003"+
		"\u0016\u000b\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0086\u0005\b\u0000\u0000\u0083\u0087\u0003$\u0012"+
		"\u0000\u0084\u0087\u0003\u0016\u000b\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089\u008d\u0001\u0000\u0000\u0000"+
		"\u008a\u008e\u0005\b\u0000\u0000\u008b\u008e\u0003 \u0010\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u000f\u0001\u0000\u0000\u0000\u008f\u0090\u00056\u0000\u0000\u0090\u0091"+
		"\u0005;\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0005"+
		"\u000b\u0000\u0000\u0093\u0095\u0003\u0012\t\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097\u0099\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0005\u0007\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009f\u0005\r\u0000\u0000\u009c\u009e\u0003\u0006\u0003\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u000e\u0000\u0000\u00a3\u0011\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a9\u0003\u0014\n\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6"+
		"\u00a8\u0003\u0014\n\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u00056\u0000\u0000\u00ad\u00b0\u0005"+
		";\u0000\u0000\u00ae\u00af\u0005\u000f\u0000\u0000\u00af\u00b1\u0003\u0016"+
		"\u000b\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b3\u0006\u000b"+
		"\uffff\uffff\u0000\u00b3\u00b4\u0005;\u0000\u0000\u00b4\u00b5\u0005\u0010"+
		"\u0000\u0000\u00b5\u00b6\u0003\u0016\u000b\u0000\u00b6\u00b7\u0005\u0011"+
		"\u0000\u0000\u00b7\u00cb\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u000b"+
		"\u0000\u0000\u00b9\u00ba\u0003\u0016\u000b\u0000\u00ba\u00bb\u0005\f\u0000"+
		"\u0000\u00bb\u00cb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0014\u0000"+
		"\u0000\u00bd\u00cb\u0003\u0016\u000b\u0016\u00be\u00bf\u00056\u0000\u0000"+
		"\u00bf\u00cb\u0003\u0016\u000b\u0015\u00c0\u00c1\u0007\u0000\u0000\u0000"+
		"\u00c1\u00cb\u0003\u0016\u000b\u0014\u00c2\u00c3\u0005\u0017\u0000\u0000"+
		"\u00c3\u00cb\u0003\u0016\u000b\u0012\u00c4\u00c5\u0005\u0018\u0000\u0000"+
		"\u00c5\u00cb\u0003\u0016\u000b\u0011\u00c6\u00c7\u0007\u0001\u0000\u0000"+
		"\u00c7\u00cb\u0003\u0016\u000b\u0010\u00c8\u00cb\u00057\u0000\u0000\u00c9"+
		"\u00cb\u0005;\u0000\u0000\u00ca\u00b2\u0001\u0000\u0000\u0000\u00ca\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00bc\u0001\u0000\u0000\u0000\u00ca\u00be"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c0\u0001\u0000\u0000\u0000\u00ca\u00c2"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c6"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u0100\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\n\u0018\u0000\u0000\u00cd\u00ce\u0005\u0012\u0000\u0000\u00ce\u00ff\u0003"+
		"\u0016\u000b\u0019\u00cf\u00d0\n\u0017\u0000\u0000\u00d0\u00d1\u0005\u0013"+
		"\u0000\u0000\u00d1\u00ff\u0003\u0016\u000b\u0018\u00d2\u00d3\n\u000f\u0000"+
		"\u0000\u00d3\u00d4\u0007\u0002\u0000\u0000\u00d4\u00ff\u0003\u0016\u000b"+
		"\u0010\u00d5\u00d6\n\u000e\u0000\u0000\u00d6\u00d7\u0007\u0003\u0000\u0000"+
		"\u00d7\u00ff\u0003\u0016\u000b\u000f\u00d8\u00d9\n\r\u0000\u0000\u00d9"+
		"\u00da\u0007\u0004\u0000\u0000\u00da\u00ff\u0003\u0016\u000b\u000e\u00db"+
		"\u00dc\n\f\u0000\u0000\u00dc\u00dd\u0007\u0005\u0000\u0000\u00dd\u00ff"+
		"\u0003\u0016\u000b\r\u00de\u00df\n\u000b\u0000\u0000\u00df\u00e0\u0007"+
		"\u0006\u0000\u0000\u00e0\u00ff\u0003\u0016\u000b\f\u00e1\u00e2\n\n\u0000"+
		"\u0000\u00e2\u00e3\u0005\u0018\u0000\u0000\u00e3\u00ff\u0003\u0016\u000b"+
		"\u000b\u00e4\u00e5\n\t\u0000\u0000\u00e5\u00e6\u0005%\u0000\u0000\u00e6"+
		"\u00ff\u0003\u0016\u000b\n\u00e7\u00e8\n\b\u0000\u0000\u00e8\u00e9\u0005"+
		"&\u0000\u0000\u00e9\u00ff\u0003\u0016\u000b\t\u00ea\u00eb\n\u0007\u0000"+
		"\u0000\u00eb\u00ec\u0005\'\u0000\u0000\u00ec\u00ff\u0003\u0016\u000b\b"+
		"\u00ed\u00ee\n\u0006\u0000\u0000\u00ee\u00ef\u0005(\u0000\u0000\u00ef"+
		"\u00ff\u0003\u0016\u000b\u0007\u00f0\u00f1\n\u0005\u0000\u0000\u00f1\u00f2"+
		"\u0005)\u0000\u0000\u00f2\u00f3\u0003\u0016\u000b\u0000\u00f3\u00f4\u0005"+
		"\b\u0000\u0000\u00f4\u00f5\u0003\u0016\u000b\u0005\u00f5\u00ff\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\n\u0004\u0000\u0000\u00f7\u00f8\u0007\u0007\u0000"+
		"\u0000\u00f8\u00ff\u0003\u0016\u000b\u0004\u00f9\u00fa\n\u0003\u0000\u0000"+
		"\u00fa\u00fb\u0005\t\u0000\u0000\u00fb\u00ff\u0003\u0016\u000b\u0004\u00fc"+
		"\u00fd\n\u0013\u0000\u0000\u00fd\u00ff\u0007\u0000\u0000\u0000\u00fe\u00cc"+
		"\u0001\u0000\u0000\u0000\u00fe\u00cf\u0001\u0000\u0000\u0000\u00fe\u00d2"+
		"\u0001\u0000\u0000\u0000\u00fe\u00d5\u0001\u0000\u0000\u0000\u00fe\u00d8"+
		"\u0001\u0000\u0000\u0000\u00fe\u00db\u0001\u0000\u0000\u0000\u00fe\u00de"+
		"\u0001\u0000\u0000\u0000\u00fe\u00e1\u0001\u0000\u0000\u0000\u00fe\u00e4"+
		"\u0001\u0000\u0000\u0000\u00fe\u00e7\u0001\u0000\u0000\u0000\u00fe\u00ea"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ed\u0001\u0000\u0000\u0000\u00fe\u00f0"+
		"\u0001\u0000\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000\u00fe\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0017\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u00054\u0000\u0000\u0104\u0105\u0005"+
		"\u000b\u0000\u0000\u0105\u0106\u0003\u0016\u000b\u0000\u0106\u0107\u0005"+
		"\f\u0000\u0000\u0107\u0108\u0003 \u0010\u0000\u0108\u0109\u00055\u0000"+
		"\u0000\u0109\u010a\u0003 \u0010\u0000\u010a\u0019\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005;\u0000\u0000\u010c\u011c\u0005\u000b\u0000\u0000\u010d"+
		"\u0110\u0005;\u0000\u0000\u010e\u0110\u0003\u0016\u000b\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0118"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0005\t\u0000\u0000\u0112\u0115\u0005"+
		";\u0000\u0000\u0113\u0115\u0003\u0016\u000b\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000"+
		"\u0000\u0000\u0116\u0111\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011d\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u010f\u0001\u0000"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\f\u0000\u0000\u011f\u001b\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0003\u001a\r\u0000\u0121\u0122\u0005\b\u0000\u0000"+
		"\u0122\u001d\u0001\u0000\u0000\u0000\u0123\u0125\u0003\u0006\u0003\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0005\u0007\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u001f\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\r\u0000\u0000\u012d\u012e\u0003\u001e\u000f\u0000\u012e"+
		"\u012f\u0005\u000e\u0000\u0000\u012f!\u0001\u0000\u0000\u0000\u0130\u0133"+
		"\u00056\u0000\u0000\u0131\u0134\u0005;\u0000\u0000\u0132\u0134\u0003\u0016"+
		"\u000b\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0138\u0005\u000f"+
		"\u0000\u0000\u0136\u0139\u0003\u001a\r\u0000\u0137\u0139\u0003\u0016\u000b"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139#\u0001\u0000\u0000\u0000\u013a\u013d\u0005;\u0000\u0000\u013b"+
		"\u013d\u0003\u0016\u000b\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e"+
		"\u0141\u0005\u000f\u0000\u0000\u013f\u0142\u0003\u001a\r\u0000\u0140\u0142"+
		"\u0003\u0016\u000b\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0142%\u0001\u0000\u0000\u0000\u0143\u0146\u0003"+
		"$\u0012\u0000\u0144\u0146\u0003\"\u0011\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005\b\u0000\u0000\u0148\'\u0001\u0000\u0000"+
		"\u0000%/58=HPT^cejlpu{\u0080\u0086\u008d\u0094\u0099\u009f\u00a9\u00b0"+
		"\u00ca\u00fe\u0100\u010f\u0114\u0118\u011c\u0126\u012a\u0133\u0138\u013c"+
		"\u0141\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}