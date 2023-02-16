// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class single_op_exprParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, WS=43, Type=44, INT=45, STRING=46, 
		LINE_COMMENT=47, COMMENT=48, ID=49, NEWLINE=50;
	public static final int
		RULE_debug = 0, RULE_single_op_expr = 1, RULE_expr = 2, RULE_double_op_expr = 3, 
		RULE_object = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"debug", "single_op_expr", "expr", "double_op_expr", "object"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'~'", "'sizeof'", 
			"'['", "']'", "'('", "')'", "'.'", "'->'", "'/'", "'%'", "'+'", "'<<'", 
			"'>>'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", "'^'", "'|'", "'&&'", 
			"'||'", "'?'", "';'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "Type", "INT", "STRING", 
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

	public single_op_exprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DebugContext extends ParserRuleContext {
		public List<Single_op_exprContext> single_op_expr() {
			return getRuleContexts(Single_op_exprContext.class);
		}
		public Single_op_exprContext single_op_expr(int i) {
			return getRuleContext(Single_op_exprContext.class,i);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).exitDebug(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof single_op_exprVisitor ) return ((single_op_exprVisitor<? extends T>)visitor).visitDebug(this);
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
				single_op_expr();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 580542139466238L) != 0 );
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
		public TerminalNode Type() { return getToken(single_op_exprParser.Type, 0); }
		public Single_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_op_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).enterSingle_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).exitSingle_op_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof single_op_exprVisitor ) return ((single_op_exprVisitor<? extends T>)visitor).visitSingle_op_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_op_exprContext single_op_expr() throws RecognitionException {
		Single_op_exprContext _localctx = new Single_op_exprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_op_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(15);
				match(T__0);
				setState(16);
				expr();
				}
				break;
			case 2:
				{
				{
				setState(17);
				match(Type);
				}
				setState(18);
				expr();
				}
				break;
			case 3:
				{
				setState(19);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(20);
				object();
				}
				break;
			case 4:
				{
				setState(21);
				object();
				setState(22);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
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
				setState(24);
				match(T__3);
				setState(25);
				object();
				}
				break;
			case 6:
				{
				setState(26);
				match(T__4);
				setState(27);
				object();
				}
				break;
			case 7:
				{
				setState(28);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0) ) {
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
		public TerminalNode ID() { return getToken(single_op_exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public Single_op_exprContext single_op_expr() {
			return getRuleContext(Single_op_exprContext.class,0);
		}
		public TerminalNode INT() { return getToken(single_op_exprParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof single_op_exprVisitor ) return ((single_op_exprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(ID);
				setState(33);
				match(T__8);
				setState(34);
				expr();
				setState(35);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__10);
				setState(38);
				expr();
				setState(39);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				object();
				setState(42);
				match(T__12);
				setState(43);
				object();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				object();
				setState(46);
				match(T__13);
				setState(47);
				object();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				single_op_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(INT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
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
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).enterDouble_op_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).exitDouble_op_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof single_op_exprVisitor ) return ((single_op_exprVisitor<? extends T>)visitor).visitDouble_op_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_op_exprContext double_op_expr() throws RecognitionException {
		Double_op_exprContext _localctx = new Double_op_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_double_op_expr);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				expr();
				setState(55);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 98320L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				expr();
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				object();
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				expr();
				setState(67);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(68);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				expr();
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(72);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				expr();
				setState(75);
				match(T__4);
				setState(76);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				expr();
				setState(79);
				match(T__25);
				setState(80);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				expr();
				setState(83);
				match(T__26);
				setState(84);
				expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				expr();
				setState(87);
				match(T__27);
				setState(88);
				expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				expr();
				setState(91);
				match(T__28);
				setState(92);
				expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				expr();
				setState(95);
				match(T__29);
				setState(96);
				expr();
				setState(97);
				match(T__30);
				setState(98);
				expr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(100);
				object();
				setState(101);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8791798054912L) != 0) ) {
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
		public TerminalNode ID() { return getToken(single_op_exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof single_op_exprListener ) ((single_op_exprListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof single_op_exprVisitor ) return ((single_op_exprVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(T__8);
			setState(108);
			expr();
			setState(109);
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

	public static final String _serializedATN =
		"\u0004\u00012p\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\b\u0001\u0000\u0002\u0003\u0001\u0000"+
		"\u0005\b\u0002\u0000\u0004\u0004\u000f\u0010\u0002\u0000\u0001\u0001\u0011"+
		"\u0011\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0017\u0001\u0000\u0018"+
		"\u0019\u0001\u0000 *\u0082\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u001e"+
		"\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006h\u0001\u0000"+
		"\u0000\u0000\bj\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b"+
		"\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0005\u0001\u0000\u0000\u0010\u001f\u0003\u0004\u0002"+
		"\u0000\u0011\u0012\u0005,\u0000\u0000\u0012\u001f\u0003\u0004\u0002\u0000"+
		"\u0013\u0014\u0007\u0000\u0000\u0000\u0014\u001f\u0003\b\u0004\u0000\u0015"+
		"\u0016\u0003\b\u0004\u0000\u0016\u0017\u0007\u0000\u0000\u0000\u0017\u001f"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0004\u0000\u0000\u0019\u001f"+
		"\u0003\b\u0004\u0000\u001a\u001b\u0005\u0005\u0000\u0000\u001b\u001f\u0003"+
		"\b\u0004\u0000\u001c\u001d\u0007\u0001\u0000\u0000\u001d\u001f\u0003\u0004"+
		"\u0002\u0000\u001e\u000f\u0001\u0000\u0000\u0000\u001e\u0011\u0001\u0000"+
		"\u0000\u0000\u001e\u0013\u0001\u0000\u0000\u0000\u001e\u0015\u0001\u0000"+
		"\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001e\u001a\u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\u0003\u0001\u0000"+
		"\u0000\u0000 !\u00051\u0000\u0000!\"\u0005\t\u0000\u0000\"#\u0003\u0004"+
		"\u0002\u0000#$\u0005\n\u0000\u0000$5\u0001\u0000\u0000\u0000%&\u0005\u000b"+
		"\u0000\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005\f\u0000\u0000(5\u0001"+
		"\u0000\u0000\u0000)*\u0003\b\u0004\u0000*+\u0005\r\u0000\u0000+,\u0003"+
		"\b\u0004\u0000,5\u0001\u0000\u0000\u0000-.\u0003\b\u0004\u0000./\u0005"+
		"\u000e\u0000\u0000/0\u0003\b\u0004\u000005\u0001\u0000\u0000\u000015\u0003"+
		"\u0002\u0001\u000025\u0005-\u0000\u000035\u00051\u0000\u00004 \u0001\u0000"+
		"\u0000\u00004%\u0001\u0000\u0000\u00004)\u0001\u0000\u0000\u00004-\u0001"+
		"\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"43\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000067\u0003\u0004"+
		"\u0002\u000078\u0007\u0002\u0000\u000089\u0003\u0004\u0002\u00009i\u0001"+
		"\u0000\u0000\u0000:;\u0003\u0004\u0002\u0000;<\u0007\u0003\u0000\u0000"+
		"<=\u0003\u0004\u0002\u0000=i\u0001\u0000\u0000\u0000>?\u0003\b\u0004\u0000"+
		"?@\u0007\u0004\u0000\u0000@A\u0003\u0004\u0002\u0000Ai\u0001\u0000\u0000"+
		"\u0000BC\u0003\u0004\u0002\u0000CD\u0007\u0005\u0000\u0000DE\u0003\u0004"+
		"\u0002\u0000Ei\u0001\u0000\u0000\u0000FG\u0003\u0004\u0002\u0000GH\u0007"+
		"\u0006\u0000\u0000HI\u0003\u0004\u0002\u0000Ii\u0001\u0000\u0000\u0000"+
		"JK\u0003\u0004\u0002\u0000KL\u0005\u0005\u0000\u0000LM\u0003\u0004\u0002"+
		"\u0000Mi\u0001\u0000\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0005\u001a"+
		"\u0000\u0000PQ\u0003\u0004\u0002\u0000Qi\u0001\u0000\u0000\u0000RS\u0003"+
		"\u0004\u0002\u0000ST\u0005\u001b\u0000\u0000TU\u0003\u0004\u0002\u0000"+
		"Ui\u0001\u0000\u0000\u0000VW\u0003\u0004\u0002\u0000WX\u0005\u001c\u0000"+
		"\u0000XY\u0003\u0004\u0002\u0000Yi\u0001\u0000\u0000\u0000Z[\u0003\u0004"+
		"\u0002\u0000[\\\u0005\u001d\u0000\u0000\\]\u0003\u0004\u0002\u0000]i\u0001"+
		"\u0000\u0000\u0000^_\u0003\u0004\u0002\u0000_`\u0005\u001e\u0000\u0000"+
		"`a\u0003\u0004\u0002\u0000ab\u0005\u001f\u0000\u0000bc\u0003\u0004\u0002"+
		"\u0000ci\u0001\u0000\u0000\u0000de\u0003\b\u0004\u0000ef\u0007\u0007\u0000"+
		"\u0000fg\u0003\u0004\u0002\u0000gi\u0001\u0000\u0000\u0000h6\u0001\u0000"+
		"\u0000\u0000h:\u0001\u0000\u0000\u0000h>\u0001\u0000\u0000\u0000hB\u0001"+
		"\u0000\u0000\u0000hF\u0001\u0000\u0000\u0000hJ\u0001\u0000\u0000\u0000"+
		"hN\u0001\u0000\u0000\u0000hR\u0001\u0000\u0000\u0000hV\u0001\u0000\u0000"+
		"\u0000hZ\u0001\u0000\u0000\u0000h^\u0001\u0000\u0000\u0000hd\u0001\u0000"+
		"\u0000\u0000i\u0007\u0001\u0000\u0000\u0000jk\u00051\u0000\u0000kl\u0005"+
		"\t\u0000\u0000lm\u0003\u0004\u0002\u0000mn\u0005\n\u0000\u0000n\t\u0001"+
		"\u0000\u0000\u0000\u0004\r\u001e4h";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}