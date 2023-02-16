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
		T__52=53, WS=54, FOR=55, Type=56, INT=57, STRING=58, LINE_COMMENT=59, 
		COMMENT=60, ID=61, NEWLINE=62;
	public static final int
		RULE_debug = 0, RULE_file = 1, RULE_preprocess = 2, RULE_expr = 3, RULE_func = 4, 
		RULE_args = 5, RULE_arg = 6, RULE_block = 7, RULE_statement = 8, RULE_if_stmt = 9, 
		RULE_while_stmt = 10, RULE_assign_stmt = 11, RULE_call = 12, RULE_callstmt = 13, 
		RULE_for_first_expr = 14, RULE_for_third_expr = 15, RULE_for_stmt = 16, 
		RULE_vardecl = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "file", "preprocess", "expr", "func", "args", "arg", "block", 
			"statement", "if_stmt", "while_stmt", "assign_stmt", "call", "callstmt", 
			"for_first_expr", "for_third_expr", "for_stmt", "vardecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'include'", "'<'", "'.h'", "'>'", "'define'", "'['", "']'", 
			"'('", "')'", "'.'", "'->'", "'-'", "'++'", "'--'", "'*'", "'&'", "'!'", 
			"'~'", "'sizeof'", "'/'", "'%'", "'+'", "'<<'", "'>>'", "'<='", "'>='", 
			"'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "';'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "','", 
			"'\\n'", "'{'", "'}'", "'='", "'if'", "'else'", "'while'", null, "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "FOR", "Type", "INT", "STRING", 
			"LINE_COMMENT", "COMMENT", "ID", "NEWLINE"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitDebug(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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
		public List<PreprocessContext> preprocess() {
			return getRuleContexts(PreprocessContext.class);
		}
		public PreprocessContext preprocess(int i) {
			return getRuleContext(PreprocessContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				preprocess();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==NEWLINE );
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					vardecl();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				func();
				}
				}
				setState(52); 
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
	public static class PreprocessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(fileParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitPreprocess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreprocessContext preprocess() throws RecognitionException {
		PreprocessContext _localctx = new PreprocessContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocess);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(54);
				match(T__0);
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					{
					setState(55);
					match(T__1);
					setState(56);
					match(T__2);
					setState(57);
					match(ID);
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(58);
						match(T__3);
						}
					}

					setState(61);
					match(T__4);
					}
					}
					break;
				case T__5:
					{
					{
					setState(62);
					match(T__5);
					setState(63);
					match(ID);
					setState(64);
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
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(NEWLINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(71);
				match(ID);
				setState(72);
				match(T__6);
				setState(73);
				expr(0);
				setState(74);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(76);
				match(T__8);
				setState(77);
				expr(0);
				setState(78);
				match(T__9);
				}
				break;
			case 3:
				{
				setState(80);
				match(T__12);
				setState(81);
				expr(22);
				}
				break;
			case 4:
				{
				{
				setState(82);
				match(Type);
				}
				setState(83);
				expr(21);
				}
				break;
			case 5:
				{
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				expr(20);
				}
				break;
			case 6:
				{
				setState(86);
				match(T__15);
				setState(87);
				expr(18);
				}
				break;
			case 7:
				{
				setState(88);
				match(T__16);
				setState(89);
				expr(17);
				}
				break;
			case 8:
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				expr(16);
				}
				break;
			case 9:
				{
				setState(92);
				match(INT);
				}
				break;
			case 10:
				{
				setState(93);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(97);
						match(T__10);
						setState(98);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(100);
						match(T__11);
						setState(101);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(103);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 6356992L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(112);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 201326632L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(118);
						match(T__16);
						setState(119);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(121);
						match(T__29);
						setState(122);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(124);
						match(T__30);
						setState(125);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						match(T__31);
						setState(128);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						match(T__32);
						setState(131);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						match(T__33);
						setState(134);
						expr(0);
						setState(135);
						match(T__34);
						setState(136);
						expr(5);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(139);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 70300024700928L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expr(4);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(142);
						match(T__45);
						}
						setState(143);
						expr(4);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
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
				setState(150);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(151);
			match(Type);
			setState(152);
			match(ID);
			}
			{
			setState(154);
			match(T__8);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(155);
				args();
				}
			}

			setState(158);
			match(T__9);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(160);
				match(T__46);
				}
			}

			{
			setState(163);
			match(T__47);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2569444324905312768L) != 0) {
				{
				{
				setState(164);
				statement();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__48);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			arg();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(173);
				match(T__45);
				setState(174);
				arg();
				}
				}
				setState(179);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Type);
			setState(181);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(182);
				match(T__49);
				setState(183);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__47);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2569444324905312768L) != 0) {
				{
				{
				setState(187);
				statement();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__48);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				callstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(201);
				expr(0);
				setState(202);
				match(T__34);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(T__46);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__50);
			{
			setState(208);
			match(T__8);
			setState(209);
			expr(0);
			setState(210);
			match(T__9);
			}
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(212);
						match(T__46);
						}
						break;
					}
					setState(217);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__47:
						{
						setState(215);
						block();
						}
						break;
					case T__8:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__46:
					case T__50:
					case T__52:
					case FOR:
					case Type:
					case INT:
					case ID:
						{
						setState(216);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__46) {
						{
						setState(221);
						match(T__46);
						}
					}

					{
					setState(224);
					match(T__51);
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(225);
						match(T__46);
						}
						break;
					}
					setState(230);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__47:
						{
						setState(228);
						block();
						}
						break;
					case T__8:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__46:
					case T__50:
					case T__52:
					case FOR:
					case Type:
					case INT:
					case ID:
						{
						setState(229);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__52);
			{
			setState(237);
			match(T__8);
			setState(238);
			expr(0);
			setState(239);
			match(T__9);
			}
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				{
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(241);
					match(T__46);
					}
					break;
				}
				}
				setState(247);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__46:
				case T__50:
				case T__52:
				case FOR:
				case Type:
				case INT:
				case ID:
					{
					setState(244);
					statement();
					}
					break;
				case T__47:
					{
					setState(245);
					block();
					}
					break;
				case T__34:
					{
					setState(246);
					match(T__34);
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
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
		public List<TerminalNode> ID() { return getTokens(fileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fileParser.ID, i);
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(251);
				expr(0);
				setState(252);
				match(T__49);
				setState(253);
				expr(0);
				}
				break;
			case 2:
				{
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Type) {
					{
					setState(255);
					match(Type);
					}
				}

				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					{
					setState(258);
					match(ID);
					setState(259);
					match(T__49);
					setState(260);
					call();
					}
					}
					break;
				case 2:
					{
					{
					setState(261);
					match(ID);
					setState(262);
					match(T__49);
					setState(263);
					expr(0);
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45) {
						{
						{
						setState(264);
						match(T__45);
						setState(265);
						match(ID);
						setState(266);
						match(T__49);
						setState(267);
						expr(0);
						}
						}
						setState(272);
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
			setState(277);
			match(T__34);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
			setState(280);
			match(T__8);
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case Type:
			case INT:
			case ID:
				{
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
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
				while (_la==T__45) {
					{
					{
					setState(285);
					match(T__45);
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
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
			case T__9:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(298);
			match(T__9);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitCallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			call();
			setState(301);
			match(T__34);
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
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<For_first_exprContext> for_first_expr() {
			return getRuleContexts(For_first_exprContext.class);
		}
		public For_first_exprContext for_first_expr(int i) {
			return getRuleContext(For_first_exprContext.class,i);
		}
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public For_first_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_first_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFor_first_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFor_first_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitFor_first_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_first_exprContext for_first_expr() throws RecognitionException {
		For_first_exprContext _localctx = new For_first_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_first_expr);
		try {
			int _alt;
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case Type:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(303);
					match(Type);
					}
					break;
				}
				{
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					{
					setState(306);
					match(ID);
					setState(307);
					match(T__49);
					setState(308);
					expr(0);
					}
					}
					break;
				case 2:
					{
					setState(309);
					expr(0);
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						match(T__45);
						setState(313);
						for_first_expr();
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				}
				break;
			case T__34:
			case T__45:
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
		public TerminalNode ID() { return getToken(fileParser.ID, 0); }
		public For_third_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_third_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFor_third_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFor_third_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitFor_third_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_third_exprContext for_third_expr() throws RecognitionException {
		For_third_exprContext _localctx = new For_third_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_third_expr);
		try {
			int _alt;
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case Type:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					{
					setState(322);
					match(ID);
					setState(323);
					match(T__49);
					setState(324);
					expr(0);
					}
					}
					break;
				case 2:
					{
					{
					setState(325);
					expr(0);
					setState(326);
					match(T__49);
					setState(327);
					expr(0);
					}
					}
					break;
				case 3:
					{
					setState(329);
					expr(0);
					}
					break;
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						match(T__45);
						setState(333);
						for_third_expr();
						}
						} 
					}
					setState(338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			case T__9:
			case T__45:
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
		public TerminalNode FOR() { return getToken(fileParser.FOR, 0); }
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
			if ( listener instanceof fileListener ) ((fileListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fileListener ) ((fileListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(FOR);
			{
			setState(343);
			match(T__8);
			setState(344);
			for_first_expr();
			setState(345);
			match(T__34);
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case Type:
			case INT:
			case ID:
				{
				setState(346);
				expr(0);
				}
				break;
			case T__34:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350);
			match(T__34);
			setState(351);
			for_third_expr();
			setState(352);
			match(T__9);
			}
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(354);
				match(T__34);
				}
				break;
			case 2:
				{
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__46) {
						{
						setState(355);
						match(T__46);
						}
					}

					setState(358);
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
		public TerminalNode Type() { return getToken(fileParser.Type, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fileVisitor ) return ((fileVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(364);
				match(Type);
				{
				setState(365);
				match(ID);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45) {
					{
					{
					setState(366);
					match(T__45);
					setState(367);
					match(ID);
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(373);
				match(Type);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2522015791329567232L) != 0) {
					{
					{
					setState(374);
					expr(0);
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(382);
			match(T__34);
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
		"\u0004\u0001>\u0181\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001(\b\u0001\u000b\u0001\f\u0001)\u0001\u0001\u0005"+
		"\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0004\u00013\b\u0001"+
		"\u000b\u0001\f\u00014\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003_\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0093\b\u0003\n"+
		"\u0003\f\u0003\u0096\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u009d\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00a2\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a6"+
		"\b\u0004\n\u0004\f\u0004\u00a9\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00b0\b\u0005\n\u0005\f\u0005\u00b3"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b9"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00bd\b\u0007\n\u0007\f\u0007"+
		"\u00c0\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ce\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d6\b\t\u0001\t\u0001"+
		"\t\u0003\t\u00da\b\t\u0003\t\u00dc\b\t\u0001\t\u0003\t\u00df\b\t\u0001"+
		"\t\u0001\t\u0003\t\u00e3\b\t\u0001\t\u0001\t\u0003\t\u00e7\b\t\u0003\t"+
		"\u00e9\b\t\u0003\t\u00eb\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00f3\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f8\b\n\u0003\n"+
		"\u00fa\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0101\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u010d\b\u000b\n\u000b\f\u000b\u0110\t\u000b\u0003\u000b\u0112"+
		"\b\u000b\u0003\u000b\u0114\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u011c\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0121"+
		"\b\f\u0005\f\u0123\b\f\n\f\f\f\u0126\t\f\u0001\f\u0003\f\u0129\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u0131\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0137\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u013b\b\u000e\n\u000e\f\u000e\u013e"+
		"\t\u000e\u0001\u000e\u0003\u000e\u0141\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u014b\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u014f\b"+
		"\u000f\n\u000f\f\u000f\u0152\t\u000f\u0001\u000f\u0003\u000f\u0155\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u015d\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0165\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0169\b\u0010\u0003\u0010\u016b\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0171\b\u0011\n\u0011\f\u0011"+
		"\u0174\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0178\b\u0011\n\u0011"+
		"\f\u0011\u017b\t\u0011\u0003\u0011\u017d\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0000\u0001\u0006\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\b\u0001\u0000"+
		"\u000e\u000f\u0001\u0000\u0011\u0014\u0002\u0000\u0010\u0010\u0015\u0016"+
		"\u0002\u0000\r\r\u0017\u0017\u0001\u0000\u0018\u0019\u0003\u0000\u0003"+
		"\u0003\u0005\u0005\u001a\u001b\u0001\u0000\u001c\u001d\u0001\u0000$-\u01be"+
		"\u0000$\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004"+
		"D\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\b\u0097\u0001"+
		"\u0000\u0000\u0000\n\u00ac\u0001\u0000\u0000\u0000\f\u00b4\u0001\u0000"+
		"\u0000\u0000\u000e\u00ba\u0001\u0000\u0000\u0000\u0010\u00cd\u0001\u0000"+
		"\u0000\u0000\u0012\u00cf\u0001\u0000\u0000\u0000\u0014\u00ec\u0001\u0000"+
		"\u0000\u0000\u0016\u0113\u0001\u0000\u0000\u0000\u0018\u0117\u0001\u0000"+
		"\u0000\u0000\u001a\u012c\u0001\u0000\u0000\u0000\u001c\u0140\u0001\u0000"+
		"\u0000\u0000\u001e\u0154\u0001\u0000\u0000\u0000 \u0156\u0001\u0000\u0000"+
		"\u0000\"\u017c\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*.\u0001\u0000\u0000\u0000+-\u0003\"\u0011\u0000,+\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"13\u0003\b\u0004\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0003\u0001\u0000"+
		"\u0000\u00006A\u0005\u0001\u0000\u000078\u0005\u0002\u0000\u000089\u0005"+
		"\u0003\u0000\u00009;\u0005=\u0000\u0000:<\u0005\u0004\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=B\u0005\u0005\u0000\u0000>?\u0005\u0006\u0000\u0000?@\u0005=\u0000\u0000"+
		"@B\u0003\u0006\u0003\u0000A7\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CE\u0005>\u0000\u0000D6\u0001\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0006"+
		"\u0003\uffff\uffff\u0000GH\u0005=\u0000\u0000HI\u0005\u0007\u0000\u0000"+
		"IJ\u0003\u0006\u0003\u0000JK\u0005\b\u0000\u0000K_\u0001\u0000\u0000\u0000"+
		"LM\u0005\t\u0000\u0000MN\u0003\u0006\u0003\u0000NO\u0005\n\u0000\u0000"+
		"O_\u0001\u0000\u0000\u0000PQ\u0005\r\u0000\u0000Q_\u0003\u0006\u0003\u0016"+
		"RS\u00058\u0000\u0000S_\u0003\u0006\u0003\u0015TU\u0007\u0000\u0000\u0000"+
		"U_\u0003\u0006\u0003\u0014VW\u0005\u0010\u0000\u0000W_\u0003\u0006\u0003"+
		"\u0012XY\u0005\u0011\u0000\u0000Y_\u0003\u0006\u0003\u0011Z[\u0007\u0001"+
		"\u0000\u0000[_\u0003\u0006\u0003\u0010\\_\u00059\u0000\u0000]_\u0005="+
		"\u0000\u0000^F\u0001\u0000\u0000\u0000^L\u0001\u0000\u0000\u0000^P\u0001"+
		"\u0000\u0000\u0000^R\u0001\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000"+
		"^V\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0094\u0001"+
		"\u0000\u0000\u0000`a\n\u0018\u0000\u0000ab\u0005\u000b\u0000\u0000b\u0093"+
		"\u0003\u0006\u0003\u0019cd\n\u0017\u0000\u0000de\u0005\f\u0000\u0000e"+
		"\u0093\u0003\u0006\u0003\u0018fg\n\u000f\u0000\u0000gh\u0007\u0002\u0000"+
		"\u0000h\u0093\u0003\u0006\u0003\u0010ij\n\u000e\u0000\u0000jk\u0007\u0003"+
		"\u0000\u0000k\u0093\u0003\u0006\u0003\u000flm\n\r\u0000\u0000mn\u0007"+
		"\u0004\u0000\u0000n\u0093\u0003\u0006\u0003\u000eop\n\f\u0000\u0000pq"+
		"\u0007\u0005\u0000\u0000q\u0093\u0003\u0006\u0003\rrs\n\u000b\u0000\u0000"+
		"st\u0007\u0006\u0000\u0000t\u0093\u0003\u0006\u0003\fuv\n\n\u0000\u0000"+
		"vw\u0005\u0011\u0000\u0000w\u0093\u0003\u0006\u0003\u000bxy\n\t\u0000"+
		"\u0000yz\u0005\u001e\u0000\u0000z\u0093\u0003\u0006\u0003\n{|\n\b\u0000"+
		"\u0000|}\u0005\u001f\u0000\u0000}\u0093\u0003\u0006\u0003\t~\u007f\n\u0007"+
		"\u0000\u0000\u007f\u0080\u0005 \u0000\u0000\u0080\u0093\u0003\u0006\u0003"+
		"\b\u0081\u0082\n\u0006\u0000\u0000\u0082\u0083\u0005!\u0000\u0000\u0083"+
		"\u0093\u0003\u0006\u0003\u0007\u0084\u0085\n\u0005\u0000\u0000\u0085\u0086"+
		"\u0005\"\u0000\u0000\u0086\u0087\u0003\u0006\u0003\u0000\u0087\u0088\u0005"+
		"#\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0005\u0089\u0093\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\n\u0004\u0000\u0000\u008b\u008c\u0007\u0007\u0000"+
		"\u0000\u008c\u0093\u0003\u0006\u0003\u0004\u008d\u008e\n\u0003\u0000\u0000"+
		"\u008e\u008f\u0005.\u0000\u0000\u008f\u0093\u0003\u0006\u0003\u0004\u0090"+
		"\u0091\n\u0013\u0000\u0000\u0091\u0093\u0007\u0000\u0000\u0000\u0092`"+
		"\u0001\u0000\u0000\u0000\u0092c\u0001\u0000\u0000\u0000\u0092f\u0001\u0000"+
		"\u0000\u0000\u0092i\u0001\u0000\u0000\u0000\u0092l\u0001\u0000\u0000\u0000"+
		"\u0092o\u0001\u0000\u0000\u0000\u0092r\u0001\u0000\u0000\u0000\u0092u"+
		"\u0001\u0000\u0000\u0000\u0092x\u0001\u0000\u0000\u0000\u0092{\u0001\u0000"+
		"\u0000\u0000\u0092~\u0001\u0000\u0000\u0000\u0092\u0081\u0001\u0000\u0000"+
		"\u0000\u0092\u0084\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000\u0000"+
		"\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0007\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u00058\u0000\u0000"+
		"\u0098\u0099\u0005=\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0005\t\u0000\u0000\u009b\u009d\u0003\n\u0005\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0005/\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a7\u00050\u0000\u0000\u00a4\u00a6\u0003\u0010\b"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u00051\u0000\u0000\u00ab\t\u0001\u0000\u0000\u0000"+
		"\u00ac\u00b1\u0003\f\u0006\u0000\u00ad\u00ae\u0005.\u0000\u0000\u00ae"+
		"\u00b0\u0003\f\u0006\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u000b\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u00058\u0000\u0000\u00b5\u00b8\u0005"+
		"=\u0000\u0000\u00b6\u00b7\u00052\u0000\u0000\u00b7\u00b9\u0003\u0006\u0003"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba\u00be\u00050\u0000\u0000"+
		"\u00bb\u00bd\u0003\u0010\b\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u00051\u0000\u0000\u00c2\u000f"+
		"\u0001\u0000\u0000\u0000\u00c3\u00ce\u0003\u0016\u000b\u0000\u00c4\u00ce"+
		"\u0003\u0012\t\u0000\u00c5\u00ce\u0003\u0014\n\u0000\u00c6\u00ce\u0003"+
		" \u0010\u0000\u00c7\u00ce\u0003\"\u0011\u0000\u00c8\u00ce\u0003\u001a"+
		"\r\u0000\u00c9\u00ca\u0003\u0006\u0003\u0000\u00ca\u00cb\u0005#\u0000"+
		"\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005/\u0000\u0000"+
		"\u00cd\u00c3\u0001\u0000\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u0011\u0001\u0000\u0000\u0000\u00cf\u00d0\u00053\u0000\u0000\u00d0"+
		"\u00d1\u0005\t\u0000\u0000\u00d1\u00d2\u0003\u0006\u0003\u0000\u00d2\u00d3"+
		"\u0005\n\u0000\u0000\u00d3\u00ea\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005"+
		"/\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00da\u0003\u000e"+
		"\u0007\u0000\u00d8\u00da\u0003\u0010\b\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00e8\u0001\u0000\u0000\u0000\u00dd\u00df\u0005/\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u00054\u0000\u0000\u00e1"+
		"\u00e3\u0005/\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0003\u000e\u0007\u0000\u00e5\u00e7\u0003\u0010\b\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e8\u00de\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00db\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u0013\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u00055\u0000\u0000\u00ed\u00ee\u0005\t"+
		"\u0000\u0000\u00ee\u00ef\u0003\u0006\u0003\u0000\u00ef\u00f0\u0005\n\u0000"+
		"\u0000\u00f0\u00f9\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005/\u0000\u0000"+
		"\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f7\u0001\u0000\u0000\u0000\u00f4\u00f8\u0003\u0010\b\u0000\u00f5"+
		"\u00f8\u0003\u000e\u0007\u0000\u00f6\u00f8\u0005#\u0000\u0000\u00f7\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u0015"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003\u0006\u0003\u0000\u00fc\u00fd"+
		"\u00052\u0000\u0000\u00fd\u00fe\u0003\u0006\u0003\u0000\u00fe\u0114\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u00058\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0111\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005=\u0000\u0000\u0103\u0104\u00052\u0000\u0000"+
		"\u0104\u0112\u0003\u0018\f\u0000\u0105\u0106\u0005=\u0000\u0000\u0106"+
		"\u0107\u00052\u0000\u0000\u0107\u010e\u0003\u0006\u0003\u0000\u0108\u0109"+
		"\u0005.\u0000\u0000\u0109\u010a\u0005=\u0000\u0000\u010a\u010b\u00052"+
		"\u0000\u0000\u010b\u010d\u0003\u0006\u0003\u0000\u010c\u0108\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0102\u0001\u0000"+
		"\u0000\u0000\u0111\u0105\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000"+
		"\u0000\u0000\u0113\u00fb\u0001\u0000\u0000\u0000\u0113\u0100\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0005#\u0000"+
		"\u0000\u0116\u0017\u0001\u0000\u0000\u0000\u0117\u0118\u0005=\u0000\u0000"+
		"\u0118\u0128\u0005\t\u0000\u0000\u0119\u011c\u0005=\u0000\u0000\u011a"+
		"\u011c\u0003\u0006\u0003\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u0124\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0005.\u0000\u0000\u011e\u0121\u0005=\u0000\u0000\u011f\u0121\u0003"+
		"\u0006\u0003\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u011d\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0129\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0001"+
		"\u0000\u0000\u0000\u0128\u011b\u0001\u0000\u0000\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0005"+
		"\n\u0000\u0000\u012b\u0019\u0001\u0000\u0000\u0000\u012c\u012d\u0003\u0018"+
		"\f\u0000\u012d\u012e\u0005#\u0000\u0000\u012e\u001b\u0001\u0000\u0000"+
		"\u0000\u012f\u0131\u00058\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0136\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005=\u0000\u0000\u0133\u0134\u00052\u0000\u0000\u0134\u0137"+
		"\u0003\u0006\u0003\u0000\u0135\u0137\u0003\u0006\u0003\u0000\u0136\u0132"+
		"\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013c"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0005.\u0000\u0000\u0139\u013b\u0003"+
		"\u001c\u000e\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013e\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u0141\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u0130\u0001"+
		"\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u001d\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0005=\u0000\u0000\u0143\u0144\u00052\u0000"+
		"\u0000\u0144\u014b\u0003\u0006\u0003\u0000\u0145\u0146\u0003\u0006\u0003"+
		"\u0000\u0146\u0147\u00052\u0000\u0000\u0147\u0148\u0003\u0006\u0003\u0000"+
		"\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u014b\u0003\u0006\u0003\u0000"+
		"\u014a\u0142\u0001\u0000\u0000\u0000\u014a\u0145\u0001\u0000\u0000\u0000"+
		"\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u0150\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005.\u0000\u0000\u014d\u014f\u0003\u001e\u000f\u0000\u014e"+
		"\u014c\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"\u0155\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0001\u0000\u0000\u0000\u0154\u014a\u0001\u0000\u0000\u0000\u0154"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u001f\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u00057\u0000\u0000\u0157\u0158\u0005\t\u0000\u0000\u0158\u0159"+
		"\u0003\u001c\u000e\u0000\u0159\u015c\u0005#\u0000\u0000\u015a\u015d\u0003"+
		"\u0006\u0003\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005#\u0000\u0000\u015f\u0160\u0003\u001e"+
		"\u000f\u0000\u0160\u0161\u0005\n\u0000\u0000\u0161\u016a\u0001\u0000\u0000"+
		"\u0000\u0162\u016b\u0005#\u0000\u0000\u0163\u0165\u0005/\u0000\u0000\u0164"+
		"\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0169\u0003\u000e\u0007\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a"+
		"\u0162\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b!\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u00058\u0000\u0000\u016d\u0172\u0005=\u0000\u0000\u016e\u016f\u0005."+
		"\u0000\u0000\u016f\u0171\u0005=\u0000\u0000\u0170\u016e\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u017d\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0179\u00058\u0000\u0000"+
		"\u0176\u0178\u0003\u0006\u0003\u0000\u0177\u0176\u0001\u0000\u0000\u0000"+
		"\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u016c\u0001\u0000\u0000\u0000"+
		"\u017c\u0175\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0005#\u0000\u0000\u017f#\u0001\u0000\u0000\u00001).4;AD"+
		"^\u0092\u0094\u009c\u00a1\u00a7\u00b1\u00b8\u00be\u00cd\u00d5\u00d9\u00db"+
		"\u00de\u00e2\u00e6\u00e8\u00ea\u00f2\u00f7\u00f9\u0100\u010e\u0111\u0113"+
		"\u011b\u0120\u0124\u0128\u0130\u0136\u013c\u0140\u014a\u0150\u0154\u015c"+
		"\u0164\u0168\u016a\u0172\u0179\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}