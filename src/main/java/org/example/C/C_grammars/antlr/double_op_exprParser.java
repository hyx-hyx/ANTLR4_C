// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class double_op_exprParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, Type=43, INT=44, STRING=45, LINE_COMMENT=46, 
		COMMENT=47, ID=48, NEWLINE=49, WS=50;
	public static final int
		RULE_debug = 0, RULE_double_op_expr = 1, RULE_expr = 2, RULE_single_op_expr = 3, 
		RULE_object = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "double_op_expr", "expr", "single_op_expr", "object"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'<='", "'>='", 
			"'>'", "'<'", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'?'", 
			"';'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<<='", "'>>='", 
			"'&='", "'^='", "'|='", "'['", "']'", "'('", "')'", "'.'", "'->'", "'++'", 
			"'--'", "'!'", "'~'", "'sizeof'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Type", "INT", "STRING", "LINE_COMMENT", 
			"COMMENT", "ID", "NEWLINE", "WS"
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

	public double_op_exprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public List<Double_op_exprContext> double_op_expr() {
			return getRuleContexts(Double_op_exprContext.class);
		}
		public Double_op_exprContext double_op_expr(int i) {
			return getRuleContext(Double_op_exprContext.class,i);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).exitDebug(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof double_op_exprVisitor ) return ((double_op_exprVisitor<? extends T>)visitor).visitDebug(this);
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				double_op_expr();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 299084342624256L) != 0 );
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
	public static class Double_op_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Double_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).enterDouble_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).exitDouble_op_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof double_op_exprVisitor ) return ((double_op_exprVisitor<? extends T>)visitor).visitDouble_op_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_op_exprContext double_op_expr() throws RecognitionException {
		Double_op_exprContext _localctx = new Double_op_exprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_double_op_expr);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				expr();
				setState(16);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(17);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				expr();
				setState(20);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(21);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				object();
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(25);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				expr();
				setState(28);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				expr();
				setState(32);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				expr();
				setState(36);
				match(T__13);
				setState(37);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
				expr();
				setState(40);
				match(T__14);
				setState(41);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				expr();
				setState(44);
				match(T__15);
				setState(45);
				expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(47);
				expr();
				setState(48);
				match(T__16);
				setState(49);
				expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(51);
				expr();
				setState(52);
				match(T__17);
				setState(53);
				expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(55);
				expr();
				setState(56);
				match(T__18);
				setState(57);
				expr();
				setState(58);
				match(T__19);
				setState(59);
				expr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(61);
				object();
				setState(62);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4292870144L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				expr();
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(double_op_exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode INT() { return getToken(double_op_exprParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof double_op_exprVisitor ) return ((double_op_exprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(ID);
				setState(68);
				match(T__31);
				setState(69);
				expr();
				setState(70);
				match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__33);
				setState(73);
				expr();
				setState(74);
				match(T__34);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				object();
				setState(77);
				match(T__35);
				setState(78);
				object();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				object();
				setState(81);
				match(T__36);
				setState(82);
				object();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(INT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(ID);
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
	public static class Single_op_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode Type() { return getToken(double_op_exprParser.Type, 0); }
		public Single_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).enterSingle_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).exitSingle_op_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof double_op_exprVisitor ) return ((double_op_exprVisitor<? extends T>)visitor).visitSingle_op_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_op_exprContext single_op_expr() throws RecognitionException {
		Single_op_exprContext _localctx = new Single_op_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(88);
				match(T__4);
				setState(89);
				expr();
				}
				break;
			case 2:
				{
				{
				setState(90);
				match(Type);
				}
				setState(91);
				expr();
				}
				break;
			case 3:
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				object();
				}
				break;
			case 4:
				{
				setState(94);
				object();
				setState(95);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				setState(97);
				match(T__0);
				setState(98);
				object();
				}
				break;
			case 6:
				{
				setState(99);
				match(T__13);
				setState(100);
				object();
				}
				break;
			case 7:
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581410816L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				expr();
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(double_op_exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof double_op_exprListener ) ((double_op_exprListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof double_op_exprVisitor ) return ((double_op_exprVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
			setState(106);
			match(T__31);
			setState(107);
			expr();
			setState(108);
			match(T__32);
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

	public static final String _serializedATN =
		"\u0004\u00012o\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001B\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\b\u0001\u0000\u0001\u0003\u0001\u0000\u0004\u0005"+
		"\u0001\u0000\u0006\u0007\u0001\u0000\b\u000b\u0001\u0000\f\r\u0001\u0000"+
		"\u0015\u001f\u0001\u0000&\'\u0002\u0000\u000e\u000e(*\u0080\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004V\u0001\u0000"+
		"\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000"+
		"\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000"+
		"\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0003\u0004"+
		"\u0002\u0000\u0010\u0011\u0007\u0000\u0000\u0000\u0011\u0012\u0003\u0004"+
		"\u0002\u0000\u0012B\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0004\u0002"+
		"\u0000\u0014\u0015\u0007\u0001\u0000\u0000\u0015\u0016\u0003\u0004\u0002"+
		"\u0000\u0016B\u0001\u0000\u0000\u0000\u0017\u0018\u0003\b\u0004\u0000"+
		"\u0018\u0019\u0007\u0002\u0000\u0000\u0019\u001a\u0003\u0004\u0002\u0000"+
		"\u001aB\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c"+
		"\u001d\u0007\u0003\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e"+
		"B\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 !\u0007\u0004"+
		"\u0000\u0000!\"\u0003\u0004\u0002\u0000\"B\u0001\u0000\u0000\u0000#$\u0003"+
		"\u0004\u0002\u0000$%\u0005\u000e\u0000\u0000%&\u0003\u0004\u0002\u0000"+
		"&B\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005\u000f\u0000"+
		"\u0000)*\u0003\u0004\u0002\u0000*B\u0001\u0000\u0000\u0000+,\u0003\u0004"+
		"\u0002\u0000,-\u0005\u0010\u0000\u0000-.\u0003\u0004\u0002\u0000.B\u0001"+
		"\u0000\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005\u0011\u0000\u0000"+
		"12\u0003\u0004\u0002\u00002B\u0001\u0000\u0000\u000034\u0003\u0004\u0002"+
		"\u000045\u0005\u0012\u0000\u000056\u0003\u0004\u0002\u00006B\u0001\u0000"+
		"\u0000\u000078\u0003\u0004\u0002\u000089\u0005\u0013\u0000\u00009:\u0003"+
		"\u0004\u0002\u0000:;\u0005\u0014\u0000\u0000;<\u0003\u0004\u0002\u0000"+
		"<B\u0001\u0000\u0000\u0000=>\u0003\b\u0004\u0000>?\u0007\u0005\u0000\u0000"+
		"?@\u0003\u0004\u0002\u0000@B\u0001\u0000\u0000\u0000A\u000f\u0001\u0000"+
		"\u0000\u0000A\u0013\u0001\u0000\u0000\u0000A\u0017\u0001\u0000\u0000\u0000"+
		"A\u001b\u0001\u0000\u0000\u0000A\u001f\u0001\u0000\u0000\u0000A#\u0001"+
		"\u0000\u0000\u0000A\'\u0001\u0000\u0000\u0000A+\u0001\u0000\u0000\u0000"+
		"A/\u0001\u0000\u0000\u0000A3\u0001\u0000\u0000\u0000A7\u0001\u0000\u0000"+
		"\u0000A=\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005"+
		"0\u0000\u0000DE\u0005 \u0000\u0000EF\u0003\u0004\u0002\u0000FG\u0005!"+
		"\u0000\u0000GW\u0001\u0000\u0000\u0000HI\u0005\"\u0000\u0000IJ\u0003\u0004"+
		"\u0002\u0000JK\u0005#\u0000\u0000KW\u0001\u0000\u0000\u0000LM\u0003\b"+
		"\u0004\u0000MN\u0005$\u0000\u0000NO\u0003\b\u0004\u0000OW\u0001\u0000"+
		"\u0000\u0000PQ\u0003\b\u0004\u0000QR\u0005%\u0000\u0000RS\u0003\b\u0004"+
		"\u0000SW\u0001\u0000\u0000\u0000TW\u0005,\u0000\u0000UW\u00050\u0000\u0000"+
		"VC\u0001\u0000\u0000\u0000VH\u0001\u0000\u0000\u0000VL\u0001\u0000\u0000"+
		"\u0000VP\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0005\u0005\u0000\u0000"+
		"Yh\u0003\u0004\u0002\u0000Z[\u0005+\u0000\u0000[h\u0003\u0004\u0002\u0000"+
		"\\]\u0007\u0006\u0000\u0000]h\u0003\b\u0004\u0000^_\u0003\b\u0004\u0000"+
		"_`\u0007\u0006\u0000\u0000`h\u0001\u0000\u0000\u0000ab\u0005\u0001\u0000"+
		"\u0000bh\u0003\b\u0004\u0000cd\u0005\u000e\u0000\u0000dh\u0003\b\u0004"+
		"\u0000ef\u0007\u0007\u0000\u0000fh\u0003\u0004\u0002\u0000gX\u0001\u0000"+
		"\u0000\u0000gZ\u0001\u0000\u0000\u0000g\\\u0001\u0000\u0000\u0000g^\u0001"+
		"\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000h\u0007\u0001\u0000\u0000\u0000ij\u00050\u0000"+
		"\u0000jk\u0005 \u0000\u0000kl\u0003\u0004\u0002\u0000lm\u0005!\u0000\u0000"+
		"m\t\u0001\u0000\u0000\u0000\u0004\rAVg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}