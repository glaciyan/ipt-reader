// Generated from ./src/IPT.g4 by ANTLR 4.13.1
package cc.glaciyan.ipt;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IPTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARNAME=1, STRING=2, NUMBER=3, EQ=4, COMMA=5, SQUIGGLY_OPEN=6, SQUIGGLY_CLOSE=7, 
		WS=8;
	public static final int
		RULE_start = 0, RULE_named = 1, RULE_value = 2, RULE_list = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "named", "value", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARNAME", "STRING", "NUMBER", "EQ", "COMMA", "SQUIGGLY_OPEN", 
			"SQUIGGLY_CLOSE", "WS"
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
	public String getGrammarFileName() { return "IPT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IPTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IPTParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPTVisitor ) return ((IPTVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			value();
			setState(9);
			match(EOF);
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
	public static class NamedContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(IPTParser.VARNAME, 0); }
		public TerminalNode EQ() { return getToken(IPTParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NamedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).enterNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).exitNamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPTVisitor ) return ((IPTVisitor<? extends T>)visitor).visitNamed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedContext named() throws RecognitionException {
		NamedContext _localctx = new NamedContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(VARNAME);
			setState(12);
			match(EQ);
			setState(13);
			value();
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
	public static class ValueContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(IPTParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(IPTParser.NUMBER, 0); }
		public NamedContext named() {
			return getRuleContext(NamedContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPTVisitor ) return ((IPTVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUIGGLY_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				list();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(NUMBER);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(18);
				named();
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode SQUIGGLY_OPEN() { return getToken(IPTParser.SQUIGGLY_OPEN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SQUIGGLY_CLOSE() { return getToken(IPTParser.SQUIGGLY_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IPTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IPTParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPTListener ) ((IPTListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPTVisitor ) return ((IPTVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(SQUIGGLY_OPEN);
			setState(22);
			value();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(23);
				match(COMMA);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 78L) != 0)) {
					{
					setState(24);
					value();
					}
				}

				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(SQUIGGLY_CLOSE);
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
		"\u0004\u0001\b#\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0014\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u001a\b\u0003\u0005\u0003\u001c"+
		"\b\u0003\n\u0003\f\u0003\u001f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000#\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000\u0000\u0004\u0013\u0001"+
		"\u0000\u0000\u0000\u0006\u0015\u0001\u0000\u0000\u0000\b\t\u0003\u0004"+
		"\u0002\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0005\u0001\u0000\u0000\f\r\u0005\u0004\u0000\u0000\r\u000e\u0003"+
		"\u0004\u0002\u0000\u000e\u0003\u0001\u0000\u0000\u0000\u000f\u0014\u0003"+
		"\u0006\u0003\u0000\u0010\u0014\u0005\u0002\u0000\u0000\u0011\u0014\u0005"+
		"\u0003\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u000f\u0001"+
		"\u0000\u0000\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0005\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u001d\u0003"+
		"\u0004\u0002\u0000\u0017\u0019\u0005\u0005\u0000\u0000\u0018\u001a\u0003"+
		"\u0004\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0017\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0007\u0000\u0000"+
		"!\u0007\u0001\u0000\u0000\u0000\u0003\u0013\u0019\u001d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}