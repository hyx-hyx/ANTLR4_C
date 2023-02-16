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
public class fileParser extends Parser {
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
		T__52=53, WS=54, Type=55, INT=56, STRING=57, LINE_COMMENT=58, COMMENT=59, 
		ID=60, NEWLINE=61, FOR=62, WHILE=63, DO=64, INCLUDE=65, SWITCH=66, RETURN=67, 
		IF=68, DEFINE=69;
	public static final int
		RULE_debug = 0, RULE_file = 1, RULE_func = 2, RULE_args = 3, RULE_arg = 4, 
		RULE_statements = 5, RULE_block = 6, RULE_expr = 7, RULE_statement = 8, 
		RULE_if_stmt = 9, RULE_while_stmt = 10, RULE_type_assign = 11, RULE_expr_assign = 12, 
		RULE_assign_stmt = 13, RULE_call = 14, RULE_callstmt = 15, RULE_for_stmt = 16, 
		RULE_vardecl = 17, RULE_head = 18, RULE_preprocess = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "file", "func", "args", "arg", "statements", "block", "expr", 
			"statement", "if_stmt", "while_stmt", "type_assign", "expr_assign", "assign_stmt", 
			"call", "callstmt", "for_stmt", "vardecl", "head", "preprocess"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'('", "')'", "'{'", "'}'", "','", "'='", "'['", "']'", 
			"'.'", "'->'", "'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", 
			"'/'", "'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", 
			"'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "';'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'if'", "'else'", 
			"'while'", "'#'", "'include'", "'.h'", "'define'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "Type", "INT", "STRING", "LINE_COMMENT", 
			"COMMENT", "ID", "NEWLINE", "FOR", "WHILE", "DO", "INCLUDE", "SWITCH", 
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

	public fileParser(TokenStream input) {
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitDebug(this);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			preprocess();
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(43);
						vardecl();
						}
						break;
					case 2:
						{
						setState(44);
						type_assign();
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(50);
				match(T__0);
				}
			}

			}
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				func();
				}
				}
				setState(56); 
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
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(58);
			match(Type);
			setState(59);
			match(ID);
			}
			{
			setState(61);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(62);
				args();
				}
			}

			setState(65);
			match(T__2);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(67);
				match(T__0);
				}
			}

			{
			setState(70);
			match(T__3);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5873397601533947908L) != 0) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__4);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			arg();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(80);
				match(T__5);
				setState(81);
				arg();
				}
				}
				setState(86);
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
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Type);
			setState(88);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(89);
				match(T__6);
				setState(90);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5873397601533947908L) != 0) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(99);
				match(T__0);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			match(T__3);
			setState(103);
			statements();
			setState(104);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
		public TerminalNode INT() { return getToken(fileParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(107);
				match(ID);
				setState(108);
				match(T__7);
				setState(109);
				expr(0);
				setState(110);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(112);
				match(T__1);
				setState(113);
				expr(0);
				setState(114);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(116);
				match(T__11);
				setState(117);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(118);
				match(Type);
				}
				setState(119);
				expr(21);
				}
				break;
			case 5:
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				expr(20);
				}
				break;
			case 6:
				{
				setState(122);
				match(T__14);
				setState(123);
				expr(18);
				}
				break;
			case 7:
				{
				setState(124);
				match(T__15);
				setState(125);
				expr(17);
				}
				break;
			case 8:
				{
				setState(126);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				expr(16);
				}
				break;
			case 9:
				{
				setState(128);
				match(INT);
				}
				break;
			case 10:
				{
				setState(129);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(133);
						match(T__9);
						setState(134);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(136);
						match(T__10);
						setState(137);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(139);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3178496L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(148);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(151);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(154);
						match(T__15);
						setState(155);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(157);
						match(T__30);
						setState(158);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(160);
						match(T__31);
						setState(161);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(163);
						match(T__32);
						setState(164);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						match(T__33);
						setState(167);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						match(T__34);
						setState(170);
						expr(0);
						setState(171);
						match(T__35);
						setState(172);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 140600049401856L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(178);
						match(T__5);
						}
						setState(179);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(181);
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
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(193);
				expr(0);
				setState(194);
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
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__46);
			setState(199);
			match(T__1);
			setState(200);
			expr(0);
			setState(201);
			match(T__2);
			setState(202);
			block();
			setState(203);
			match(T__47);
			setState(204);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__48);
			{
			setState(207);
			match(T__1);
			setState(208);
			expr(0);
			setState(209);
			match(T__2);
			}
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(211);
					match(T__0);
					}
				}

				}
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
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
				case Type:
				case INT:
				case ID:
				case FOR:
					{
					setState(214);
					statement();
					}
					break;
				case T__3:
					{
					setState(215);
					block();
					}
					break;
				case T__35:
					{
					setState(216);
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
	public static class Type_assignContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterType_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitType_assign(this);
		}
	}

	public final Type_assignContext type_assign() throws RecognitionException {
		Type_assignContext _localctx = new Type_assignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			match(Type);
			}
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(222);
				match(ID);
				}
				break;
			case 2:
				{
				setState(223);
				expr(0);
				}
				break;
			}
			setState(226);
			match(T__6);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(227);
				call();
				}
				break;
			case 2:
				{
				setState(228);
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
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(231);
				match(ID);
				}
				break;
			case 2:
				{
				setState(232);
				expr(0);
				}
				break;
			}
			setState(235);
			match(T__6);
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(236);
				call();
				}
				break;
			case 2:
				{
				setState(237);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(240);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(241);
				type_assign();
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
		public List<TerminalNode> ID() { return getTokens(fileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fileParser.ID, i);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ID);
			setState(247);
			match(T__1);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
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
				{
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
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
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
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
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitCallstmt(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callstmt);
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(fileParser.FOR, 0); }
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270);
			match(FOR);
			{
			setState(271);
			match(T__1);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(272);
				type_assign();
				}
				break;
			case 2:
				{
				setState(273);
				expr_assign();
				}
				break;
			}
			setState(276);
			match(T__35);
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
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
				setState(277);
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
			setState(281);
			match(T__35);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(282);
				expr_assign();
				}
				break;
			case 2:
				{
				setState(283);
				expr(0);
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(287);
			match(T__2);
			}
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				{
				setState(289);
				match(T__35);
				}
				break;
			case T__3:
				{
				setState(290);
				block();
				}
				break;
			case T__0:
			case T__1:
			case T__4:
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
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(fileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fileParser.ID, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(294);
			match(Type);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				{
				setState(295);
				match(ID);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(296);
					match(T__5);
					setState(297);
					match(ID);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(303);
				expr(0);
				}
				break;
			}
			}
			setState(306);
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
	public static class HeadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_head);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(308);
				match(T__49);
				setState(319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__50:
					{
					{
					setState(309);
					match(T__50);
					setState(310);
					match(T__27);
					{
					setState(311);
					match(ID);
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__51) {
						{
						setState(312);
						match(T__51);
						}
					}

					}
					setState(315);
					match(T__26);
					}
					}
					break;
				case T__52:
					{
					{
					setState(316);
					match(T__52);
					setState(317);
					match(ID);
					setState(318);
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
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T__0);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterPreprocess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitPreprocess(this);
		}
	}

	public final PreprocessContext preprocess() throws RecognitionException {
		PreprocessContext _localctx = new PreprocessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_preprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(324);
					head();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
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
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001"+
		"\u0003\u00014\b\u0001\u0001\u0001\u0004\u00017\b\u0001\u000b\u0001\f\u0001"+
		"8\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"@\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003S\b"+
		"\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\\\b\u0004\u0001\u0005\u0005\u0005_\b\u0005\n\u0005"+
		"\f\u0005b\t\u0005\u0001\u0005\u0003\u0005e\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00b7\b\u0007\n\u0007\f\u0007\u00ba\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c5"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d5\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00da\b\n\u0003\n\u00dc\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00e1\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00e6\b\u000b\u0001\f\u0001\f\u0003\f\u00ea\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00ef\b\f\u0001\r\u0001\r\u0003\r\u00f3\b\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fb"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0100\b\u000e"+
		"\u0005\u000e\u0102\b\u000e\n\u000e\f\u000e\u0105\t\u000e\u0001\u000e\u0003"+
		"\u000e\u0108\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0113"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0118\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u011e\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0125\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u012b\b\u0011\n\u0011\f\u0011\u012e\t\u0011\u0001\u0011\u0003\u0011\u0131"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u013a\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0140\b\u0012\u0001\u0012\u0003\u0012\u0143"+
		"\b\u0012\u0001\u0013\u0004\u0013\u0146\b\u0013\u000b\u0013\f\u0013\u0147"+
		"\u0001\u0013\u0000\u0001\u000e\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\b\u0001\u0000"+
		"\r\u000e\u0001\u0000\u0010\u0013\u0002\u0000\u000f\u000f\u0014\u0015\u0002"+
		"\u0000\f\f\u0016\u0016\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001c"+
		"\u0001\u0000\u001d\u001e\u0001\u0000%.\u0178\u0000(\u0001\u0000\u0000"+
		"\u0000\u0002*\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006"+
		"O\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000"+
		"\u0000\ff\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000"+
		"\u0010\u00c4\u0001\u0000\u0000\u0000\u0012\u00c6\u0001\u0000\u0000\u0000"+
		"\u0014\u00ce\u0001\u0000\u0000\u0000\u0016\u00dd\u0001\u0000\u0000\u0000"+
		"\u0018\u00e9\u0001\u0000\u0000\u0000\u001a\u00f2\u0001\u0000\u0000\u0000"+
		"\u001c\u00f6\u0001\u0000\u0000\u0000\u001e\u010b\u0001\u0000\u0000\u0000"+
		" \u010e\u0001\u0000\u0000\u0000\"\u0126\u0001\u0000\u0000\u0000$\u0142"+
		"\u0001\u0000\u0000\u0000&\u0145\u0001\u0000\u0000\u0000()\u0003\u0002"+
		"\u0001\u0000)\u0001\u0001\u0000\u0000\u0000*/\u0003&\u0013\u0000+.\u0003"+
		"\"\u0011\u0000,.\u0003\u0016\u000b\u0000-+\u0001\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000024\u0005\u0001\u0000\u000032\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000046\u0001\u0000\u0000\u000057\u0003\u0004\u0002\u000065\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u00057\u0000"+
		"\u0000;<\u0005<\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0005\u0002\u0000"+
		"\u0000>@\u0003\u0006\u0003\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0003\u0000\u0000BD\u0001"+
		"\u0000\u0000\u0000CE\u0005\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FJ\u0005\u0004\u0000"+
		"\u0000GI\u0003\u0010\b\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0005\u0000\u0000N\u0005"+
		"\u0001\u0000\u0000\u0000OT\u0003\b\u0004\u0000PQ\u0005\u0006\u0000\u0000"+
		"QS\u0003\b\u0004\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0007\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u00057\u0000\u0000X[\u0005<\u0000"+
		"\u0000YZ\u0005\u0007\u0000\u0000Z\\\u0003\u000e\u0007\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000]_"+
		"\u0003\u0010\b\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000ce\u0005\u0001\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0004\u0000\u0000gh\u0003\n\u0005\u0000hi\u0005\u0005\u0000\u0000"+
		"i\r\u0001\u0000\u0000\u0000jk\u0006\u0007\uffff\uffff\u0000kl\u0005<\u0000"+
		"\u0000lm\u0005\b\u0000\u0000mn\u0003\u000e\u0007\u0000no\u0005\t\u0000"+
		"\u0000o\u0083\u0001\u0000\u0000\u0000pq\u0005\u0002\u0000\u0000qr\u0003"+
		"\u000e\u0007\u0000rs\u0005\u0003\u0000\u0000s\u0083\u0001\u0000\u0000"+
		"\u0000tu\u0005\f\u0000\u0000u\u0083\u0003\u000e\u0007\u0016vw\u00057\u0000"+
		"\u0000w\u0083\u0003\u000e\u0007\u0015xy\u0007\u0000\u0000\u0000y\u0083"+
		"\u0003\u000e\u0007\u0014z{\u0005\u000f\u0000\u0000{\u0083\u0003\u000e"+
		"\u0007\u0012|}\u0005\u0010\u0000\u0000}\u0083\u0003\u000e\u0007\u0011"+
		"~\u007f\u0007\u0001\u0000\u0000\u007f\u0083\u0003\u000e\u0007\u0010\u0080"+
		"\u0083\u00058\u0000\u0000\u0081\u0083\u0005<\u0000\u0000\u0082j\u0001"+
		"\u0000\u0000\u0000\u0082p\u0001\u0000\u0000\u0000\u0082t\u0001\u0000\u0000"+
		"\u0000\u0082v\u0001\u0000\u0000\u0000\u0082x\u0001\u0000\u0000\u0000\u0082"+
		"z\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082~\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u00b8\u0001\u0000\u0000\u0000\u0084\u0085\n\u0018"+
		"\u0000\u0000\u0085\u0086\u0005\n\u0000\u0000\u0086\u00b7\u0003\u000e\u0007"+
		"\u0019\u0087\u0088\n\u0017\u0000\u0000\u0088\u0089\u0005\u000b\u0000\u0000"+
		"\u0089\u00b7\u0003\u000e\u0007\u0018\u008a\u008b\n\u000f\u0000\u0000\u008b"+
		"\u008c\u0007\u0002\u0000\u0000\u008c\u00b7\u0003\u000e\u0007\u0010\u008d"+
		"\u008e\n\u000e\u0000\u0000\u008e\u008f\u0007\u0003\u0000\u0000\u008f\u00b7"+
		"\u0003\u000e\u0007\u000f\u0090\u0091\n\r\u0000\u0000\u0091\u0092\u0007"+
		"\u0004\u0000\u0000\u0092\u00b7\u0003\u000e\u0007\u000e\u0093\u0094\n\f"+
		"\u0000\u0000\u0094\u0095\u0007\u0005\u0000\u0000\u0095\u00b7\u0003\u000e"+
		"\u0007\r\u0096\u0097\n\u000b\u0000\u0000\u0097\u0098\u0007\u0006\u0000"+
		"\u0000\u0098\u00b7\u0003\u000e\u0007\f\u0099\u009a\n\n\u0000\u0000\u009a"+
		"\u009b\u0005\u0010\u0000\u0000\u009b\u00b7\u0003\u000e\u0007\u000b\u009c"+
		"\u009d\n\t\u0000\u0000\u009d\u009e\u0005\u001f\u0000\u0000\u009e\u00b7"+
		"\u0003\u000e\u0007\n\u009f\u00a0\n\b\u0000\u0000\u00a0\u00a1\u0005 \u0000"+
		"\u0000\u00a1\u00b7\u0003\u000e\u0007\t\u00a2\u00a3\n\u0007\u0000\u0000"+
		"\u00a3\u00a4\u0005!\u0000\u0000\u00a4\u00b7\u0003\u000e\u0007\b\u00a5"+
		"\u00a6\n\u0006\u0000\u0000\u00a6\u00a7\u0005\"\u0000\u0000\u00a7\u00b7"+
		"\u0003\u000e\u0007\u0007\u00a8\u00a9\n\u0005\u0000\u0000\u00a9\u00aa\u0005"+
		"#\u0000\u0000\u00aa\u00ab\u0003\u000e\u0007\u0000\u00ab\u00ac\u0005$\u0000"+
		"\u0000\u00ac\u00ad\u0003\u000e\u0007\u0005\u00ad\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\n\u0004\u0000\u0000\u00af\u00b0\u0007\u0007\u0000\u0000"+
		"\u00b0\u00b7\u0003\u000e\u0007\u0004\u00b1\u00b2\n\u0003\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b7\u0003\u000e\u0007\u0004\u00b4"+
		"\u00b5\n\u0013\u0000\u0000\u00b5\u00b7\u0007\u0000\u0000\u0000\u00b6\u0084"+
		"\u0001\u0000\u0000\u0000\u00b6\u0087\u0001\u0000\u0000\u0000\u00b6\u008a"+
		"\u0001\u0000\u0000\u0000\u00b6\u008d\u0001\u0000\u0000\u0000\u00b6\u0090"+
		"\u0001\u0000\u0000\u0000\u00b6\u0093\u0001\u0000\u0000\u0000\u00b6\u0096"+
		"\u0001\u0000\u0000\u0000\u00b6\u0099\u0001\u0000\u0000\u0000\u00b6\u009c"+
		"\u0001\u0000\u0000\u0000\u00b6\u009f\u0001\u0000\u0000\u0000\u00b6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00b6\u00a5\u0001\u0000\u0000\u0000\u00b6\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u000f\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00c5\u0003\u001a\r\u0000\u00bc\u00c5\u0003"+
		"\u0012\t\u0000\u00bd\u00c5\u0003\u0014\n\u0000\u00be\u00c5\u0003 \u0010"+
		"\u0000\u00bf\u00c5\u0003\"\u0011\u0000\u00c0\u00c5\u0003\u001e\u000f\u0000"+
		"\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00c3\u0005$\u0000\u0000\u00c3"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c4\u00bb\u0001\u0000\u0000\u0000\u00c4"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000\u00c4"+
		"\u00be\u0001\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5"+
		"\u0011\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005/\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0002\u0000\u0000\u00c8\u00c9\u0003\u000e\u0007\u0000\u00c9\u00ca"+
		"\u0005\u0003\u0000\u0000\u00ca\u00cb\u0003\f\u0006\u0000\u00cb\u00cc\u0005"+
		"0\u0000\u0000\u00cc\u00cd\u0003\f\u0006\u0000\u00cd\u0013\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u00051\u0000\u0000\u00cf\u00d0\u0005\u0002\u0000"+
		"\u0000\u00d0\u00d1\u0003\u000e\u0007\u0000\u00d1\u00d2\u0005\u0003\u0000"+
		"\u0000\u00d2\u00db\u0001\u0000\u0000\u0000\u00d3\u00d5\u0005\u0001\u0000"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d9\u0001\u0000\u0000\u0000\u00d6\u00da\u0003\u0010\b\u0000"+
		"\u00d7\u00da\u0003\f\u0006\u0000\u00d8\u00da\u0005$\u0000\u0000\u00d9"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db"+
		"\u00d4\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u0015\u0001\u0000\u0000\u0000\u00dd\u00e0\u00057\u0000\u0000\u00de\u00e1"+
		"\u0005<\u0000\u0000\u00df\u00e1\u0003\u000e\u0007\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e5\u0005\u0007\u0000\u0000\u00e3\u00e6\u0003"+
		"\u001c\u000e\u0000\u00e4\u00e6\u0003\u000e\u0007\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u0017\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ea\u0005<\u0000\u0000\u00e8\u00ea\u0003\u000e"+
		"\u0007\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0005\u0007"+
		"\u0000\u0000\u00ec\u00ef\u0003\u001c\u000e\u0000\u00ed\u00ef\u0003\u000e"+
		"\u0007\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef\u0019\u0001\u0000\u0000\u0000\u00f0\u00f3\u0003\u0018"+
		"\f\u0000\u00f1\u00f3\u0003\u0016\u000b\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005$\u0000\u0000\u00f5\u001b\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005<\u0000\u0000\u00f7\u0107\u0005\u0002\u0000\u0000\u00f8"+
		"\u00fb\u0005<\u0000\u0000\u00f9\u00fb\u0003\u000e\u0007\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u0103"+
		"\u0001\u0000\u0000\u0000\u00fc\u00ff\u0005\u0006\u0000\u0000\u00fd\u0100"+
		"\u0005<\u0000\u0000\u00fe\u0100\u0003\u000e\u0007\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0108\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u00fa\u0001"+
		"\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005\u0003\u0000\u0000\u010a\u001d\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0003\u001c\u000e\u0000\u010c\u010d\u0005"+
		"$\u0000\u0000\u010d\u001f\u0001\u0000\u0000\u0000\u010e\u010f\u0005>\u0000"+
		"\u0000\u010f\u0112\u0005\u0002\u0000\u0000\u0110\u0113\u0003\u0016\u000b"+
		"\u0000\u0111\u0113\u0003\u0018\f\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0005$\u0000\u0000\u0115\u0118\u0003\u000e\u0007\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u011d\u0005$\u0000\u0000\u011a\u011e\u0003\u0018\f\u0000\u011b\u011e"+
		"\u0003\u000e\u0007\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011a"+
		"\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0005\u0003\u0000\u0000\u0120\u0124\u0001\u0000\u0000\u0000\u0121\u0125"+
		"\u0005$\u0000\u0000\u0122\u0125\u0003\f\u0006\u0000\u0123\u0125\u0001"+
		"\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125!\u0001\u0000"+
		"\u0000\u0000\u0126\u0130\u00057\u0000\u0000\u0127\u012c\u0005<\u0000\u0000"+
		"\u0128\u0129\u0005\u0006\u0000\u0000\u0129\u012b\u0005<\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c"+
		"\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\u0131\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0003\u000e\u0007\u0000\u0130\u0127\u0001\u0000\u0000\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0005$\u0000\u0000\u0133#\u0001\u0000\u0000\u0000\u0134\u013f\u0005"+
		"2\u0000\u0000\u0135\u0136\u00053\u0000\u0000\u0136\u0137\u0005\u001c\u0000"+
		"\u0000\u0137\u0139\u0005<\u0000\u0000\u0138\u013a\u00054\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u0140\u0005\u001b\u0000\u0000\u013c"+
		"\u013d\u00055\u0000\u0000\u013d\u013e\u0005<\u0000\u0000\u013e\u0140\u0003"+
		"\u000e\u0007\u0000\u013f\u0135\u0001\u0000\u0000\u0000\u013f\u013c\u0001"+
		"\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u0143\u0005"+
		"\u0001\u0000\u0000\u0142\u0134\u0001\u0000\u0000\u0000\u0142\u0141\u0001"+
		"\u0000\u0000\u0000\u0143%\u0001\u0000\u0000\u0000\u0144\u0146\u0003$\u0012"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\'\u0001\u0000\u0000\u0000%-/38?DJT[`d\u0082\u00b6\u00b8\u00c4"+
		"\u00d4\u00d9\u00db\u00e0\u00e5\u00e9\u00ee\u00f2\u00fa\u00ff\u0103\u0107"+
		"\u0112\u0117\u011d\u0124\u012c\u0130\u0139\u013f\u0142\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}