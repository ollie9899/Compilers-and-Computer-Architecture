// Generated from C:/Users/ofp20/OneDrive - University of Sussex/Compiler and Computer Architecture/CWorkTask1/src\CWorkGram.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CWorkGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		While=1, If=2, Do=3, Then=4, Repeat=5, Else=6, Until=7, Assign=8, Eq=9, 
		Less=10, Gtr=11, LessEq=12, GtrEq=13, Plus=14, Times=15, Minus=16, Div=17, 
		And=18, Or=19, Xor=20, IntType=21, BoolType=22, UnitType=23, LParen=24, 
		Comma=25, RParen=26, LBrace=27, Semicolon=28, RBrace=29, Skip=30, WS=31, 
		Idfr=32, IntLit=33;
	public static final int
		RULE_wholeexpr = 0, RULE_prog = 1, RULE_dec = 2, RULE_vardec = 3, RULE_vardecne = 4, 
		RULE_block = 5, RULE_ene = 6, RULE_exp = 7, RULE_args = 8, RULE_argsne = 9, 
		RULE_binop = 10, RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"wholeexpr", "prog", "dec", "vardec", "vardecne", "block", "ene", "exp", 
			"args", "argsne", "binop", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'do'", "'then'", "'repeat'", "'else'", "'until'", 
			"':='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'-'", "'/'", 
			"'&&'", "'||'", "'^^'", "'int'", "'bool'", "'unit'", "'('", "','", "')'", 
			"'{'", "';'", "'}'", "'skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "While", "If", "Do", "Then", "Repeat", "Else", "Until", "Assign", 
			"Eq", "Less", "Gtr", "LessEq", "GtrEq", "Plus", "Times", "Minus", "Div", 
			"And", "Or", "Xor", "IntType", "BoolType", "UnitType", "LParen", "Comma", 
			"RParen", "LBrace", "Semicolon", "RBrace", "Skip", "WS", "Idfr", "IntLit"
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
	public String getGrammarFileName() { return "CWorkGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CWorkGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class WholeexprContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CWorkGramParser.EOF, 0); }
		public WholeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wholeexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterWholeexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitWholeexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitWholeexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WholeexprContext wholeexpr() throws RecognitionException {
		WholeexprContext _localctx = new WholeexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wholeexpr);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case BoolType:
			case UnitType:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				prog(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(EOF);
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

	public static class ProgContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		return prog(0);
	}

	private ProgContext prog(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgContext _localctx = new ProgContext(_ctx, _parentState);
		ProgContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_prog, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(29);
			dec();
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_prog);
					setState(31);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(32);
					dec();
					}
					} 
				}
				setState(37);
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(CWorkGramParser.Idfr, 0); }
		public TerminalNode LParen() { return getToken(CWorkGramParser.LParen, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode RParen() { return getToken(CWorkGramParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			type();
			setState(39);
			match(Idfr);
			setState(40);
			match(LParen);
			setState(41);
			vardec();
			setState(42);
			match(RParen);
			setState(43);
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

	public static class VardecContext extends ParserRuleContext {
		public VardecneContext vardecne() {
			return getRuleContext(VardecneContext.class,0);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardec);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RParen:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IntType:
			case BoolType:
			case UnitType:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				vardecne(0);
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

	public static class VardecneContext extends ParserRuleContext {
		public VardecneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecne; }
	 
		public VardecneContext() { }
		public void copyFrom(VardecneContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VardecneTypeContext extends VardecneContext {
		public VardecneContext vardecne() {
			return getRuleContext(VardecneContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CWorkGramParser.Comma, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(CWorkGramParser.Idfr, 0); }
		public VardecneTypeContext(VardecneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterVardecneType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitVardecneType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitVardecneType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JustTypeContext extends VardecneContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(CWorkGramParser.Idfr, 0); }
		public JustTypeContext(VardecneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterJustType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitJustType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitJustType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecneContext vardecne() throws RecognitionException {
		return vardecne(0);
	}

	private VardecneContext vardecne(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VardecneContext _localctx = new VardecneContext(_ctx, _parentState);
		VardecneContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_vardecne, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JustTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(50);
			type();
			setState(51);
			match(Idfr);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VardecneTypeContext(new VardecneContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_vardecne);
					setState(53);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(54);
					match(Comma);
					setState(55);
					type();
					setState(56);
					match(Idfr);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(CWorkGramParser.LBrace, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(CWorkGramParser.RBrace, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(LBrace);
			setState(64);
			ene();
			setState(65);
			match(RBrace);
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

	public static class EneContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(CWorkGramParser.Semicolon, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitEne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitEne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ene);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				exp();
				setState(69);
				match(Semicolon);
				setState(70);
				ene();
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsgmtContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(CWorkGramParser.Idfr, 0); }
		public TerminalNode Assign() { return getToken(CWorkGramParser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsgmtContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterAsgmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitAsgmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitAsgmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipExpContext extends ExpContext {
		public TerminalNode Skip() { return getToken(CWorkGramParser.Skip, 0); }
		public SkipExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterSkipExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitSkipExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitSkipExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockExpContext extends ExpContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterBlockExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitBlockExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitBlockExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends ExpContext {
		public TerminalNode While() { return getToken(CWorkGramParser.While, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Do() { return getToken(CWorkGramParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdfrExpContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(CWorkGramParser.Idfr, 0); }
		public IdfrExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterIdfrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitIdfrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitIdfrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends ExpContext {
		public TerminalNode If() { return getToken(CWorkGramParser.If, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Then() { return getToken(CWorkGramParser.Then, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(CWorkGramParser.Else, 0); }
		public IfStmtContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatLoopContext extends ExpContext {
		public TerminalNode Repeat() { return getToken(CWorkGramParser.Repeat, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Until() { return getToken(CWorkGramParser.Until, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatLoopContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterRepeatLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitRepeatLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitRepeatLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitExpContext extends ExpContext {
		public TerminalNode IntLit() { return getToken(CWorkGramParser.IntLit, 0); }
		public IntLitExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterIntLitExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitIntLitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitIntLitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOpExprContext extends ExpContext {
		public TerminalNode LParen() { return getToken(CWorkGramParser.LParen, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RParen() { return getToken(CWorkGramParser.RParen, 0); }
		public BinOpExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitBinOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunInvocContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(CWorkGramParser.Idfr, 0); }
		public TerminalNode LParen() { return getToken(CWorkGramParser.LParen, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RParen() { return getToken(CWorkGramParser.RParen, 0); }
		public FunInvocContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterFunInvoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitFunInvoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitFunInvoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exp);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IdfrExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(Idfr);
				}
				break;
			case 2:
				_localctx = new IntLitExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(IntLit);
				}
				break;
			case 3:
				_localctx = new AsgmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(Idfr);
				setState(77);
				match(Assign);
				setState(78);
				exp();
				}
				break;
			case 4:
				_localctx = new BinOpExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(LParen);
				setState(80);
				exp();
				setState(81);
				binop();
				setState(82);
				exp();
				setState(83);
				match(RParen);
				}
				break;
			case 5:
				_localctx = new FunInvocContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(Idfr);
				setState(86);
				match(LParen);
				setState(87);
				args();
				setState(88);
				match(RParen);
				}
				break;
			case 6:
				_localctx = new BlockExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				block();
				}
				break;
			case 7:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(If);
				setState(92);
				exp();
				setState(93);
				match(Then);
				setState(94);
				block();
				setState(95);
				match(Else);
				setState(96);
				block();
				}
				break;
			case 8:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(While);
				setState(99);
				exp();
				setState(100);
				match(Do);
				setState(101);
				block();
				}
				break;
			case 9:
				_localctx = new RepeatLoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(Repeat);
				setState(104);
				block();
				setState(105);
				match(Until);
				setState(106);
				exp();
				}
				break;
			case 10:
				_localctx = new SkipExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				match(Skip);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsneContext argsne() {
			return getRuleContext(ArgsneContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RParen:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case While:
			case If:
			case Repeat:
			case LParen:
			case LBrace:
			case Skip:
			case Idfr:
			case IntLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				argsne(0);
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

	public static class ArgsneContext extends ParserRuleContext {
		public ArgsneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsne; }
	 
		public ArgsneContext() { }
		public void copyFrom(ArgsneContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JustExpContext extends ArgsneContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public JustExpContext(ArgsneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterJustExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitJustExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitJustExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsneExpContext extends ArgsneContext {
		public ArgsneContext argsne() {
			return getRuleContext(ArgsneContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CWorkGramParser.Comma, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArgsneExpContext(ArgsneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterArgsneExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitArgsneExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitArgsneExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsneContext argsne() throws RecognitionException {
		return argsne(0);
	}

	private ArgsneContext argsne(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsneContext _localctx = new ArgsneContext(_ctx, _parentState);
		ArgsneContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_argsne, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JustExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(116);
			exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsneExpContext(new ArgsneContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_argsne);
					setState(118);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(119);
					match(Comma);
					setState(120);
					exp();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(CWorkGramParser.Eq, 0); }
		public TerminalNode Less() { return getToken(CWorkGramParser.Less, 0); }
		public TerminalNode Gtr() { return getToken(CWorkGramParser.Gtr, 0); }
		public TerminalNode LessEq() { return getToken(CWorkGramParser.LessEq, 0); }
		public TerminalNode GtrEq() { return getToken(CWorkGramParser.GtrEq, 0); }
		public TerminalNode Plus() { return getToken(CWorkGramParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CWorkGramParser.Minus, 0); }
		public TerminalNode Times() { return getToken(CWorkGramParser.Times, 0); }
		public TerminalNode Div() { return getToken(CWorkGramParser.Div, 0); }
		public TerminalNode And() { return getToken(CWorkGramParser.And, 0); }
		public TerminalNode Or() { return getToken(CWorkGramParser.Or, 0); }
		public TerminalNode Xor() { return getToken(CWorkGramParser.Xor, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Eq) | (1L << Less) | (1L << Gtr) | (1L << LessEq) | (1L << GtrEq) | (1L << Plus) | (1L << Times) | (1L << Minus) | (1L << Div) | (1L << And) | (1L << Or) | (1L << Xor))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IntType() { return getToken(CWorkGramParser.IntType, 0); }
		public TerminalNode BoolType() { return getToken(CWorkGramParser.BoolType, 0); }
		public TerminalNode UnitType() { return getToken(CWorkGramParser.UnitType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWorkGramListener ) ((CWorkGramListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWorkGramVisitor ) return ((CWorkGramVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << UnitType))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return prog_sempred((ProgContext)_localctx, predIndex);
		case 4:
			return vardecne_sempred((VardecneContext)_localctx, predIndex);
		case 9:
			return argsne_sempred((ArgsneContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean prog_sempred(ProgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean vardecne_sempred(VardecneContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argsne_sempred(ArgsneContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0085\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5\62\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\5\nt\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\f\3\f\3\r\3\r\3\r\2"+
		"\5\4\n\24\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\13\26\3\2\27\31\2\u0088"+
		"\2\34\3\2\2\2\4\36\3\2\2\2\6(\3\2\2\2\b\61\3\2\2\2\n\63\3\2\2\2\fA\3\2"+
		"\2\2\16J\3\2\2\2\20o\3\2\2\2\22s\3\2\2\2\24u\3\2\2\2\26\u0080\3\2\2\2"+
		"\30\u0082\3\2\2\2\32\35\5\4\3\2\33\35\7\2\2\3\34\32\3\2\2\2\34\33\3\2"+
		"\2\2\35\3\3\2\2\2\36\37\b\3\1\2\37 \5\6\4\2 %\3\2\2\2!\"\f\3\2\2\"$\5"+
		"\6\4\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2"+
		"()\5\30\r\2)*\7\"\2\2*+\7\32\2\2+,\5\b\5\2,-\7\34\2\2-.\5\f\7\2.\7\3\2"+
		"\2\2/\62\3\2\2\2\60\62\5\n\6\2\61/\3\2\2\2\61\60\3\2\2\2\62\t\3\2\2\2"+
		"\63\64\b\6\1\2\64\65\5\30\r\2\65\66\7\"\2\2\66>\3\2\2\2\678\f\3\2\289"+
		"\7\33\2\29:\5\30\r\2:;\7\"\2\2;=\3\2\2\2<\67\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2AB\7\35\2\2BC\5\16\b\2CD\7\37\2\2D\r"+
		"\3\2\2\2EK\5\20\t\2FG\5\20\t\2GH\7\36\2\2HI\5\16\b\2IK\3\2\2\2JE\3\2\2"+
		"\2JF\3\2\2\2K\17\3\2\2\2Lp\7\"\2\2Mp\7#\2\2NO\7\"\2\2OP\7\n\2\2Pp\5\20"+
		"\t\2QR\7\32\2\2RS\5\20\t\2ST\5\26\f\2TU\5\20\t\2UV\7\34\2\2Vp\3\2\2\2"+
		"WX\7\"\2\2XY\7\32\2\2YZ\5\22\n\2Z[\7\34\2\2[p\3\2\2\2\\p\5\f\7\2]^\7\4"+
		"\2\2^_\5\20\t\2_`\7\6\2\2`a\5\f\7\2ab\7\b\2\2bc\5\f\7\2cp\3\2\2\2de\7"+
		"\3\2\2ef\5\20\t\2fg\7\5\2\2gh\5\f\7\2hp\3\2\2\2ij\7\7\2\2jk\5\f\7\2kl"+
		"\7\t\2\2lm\5\20\t\2mp\3\2\2\2np\7 \2\2oL\3\2\2\2oM\3\2\2\2oN\3\2\2\2o"+
		"Q\3\2\2\2oW\3\2\2\2o\\\3\2\2\2o]\3\2\2\2od\3\2\2\2oi\3\2\2\2on\3\2\2\2"+
		"p\21\3\2\2\2qt\3\2\2\2rt\5\24\13\2sq\3\2\2\2sr\3\2\2\2t\23\3\2\2\2uv\b"+
		"\13\1\2vw\5\20\t\2w}\3\2\2\2xy\f\3\2\2yz\7\33\2\2z|\5\20\t\2{x\3\2\2\2"+
		"|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\25\3\2\2\2\177}\3\2\2\2\u0080\u0081"+
		"\t\2\2\2\u0081\27\3\2\2\2\u0082\u0083\t\3\2\2\u0083\31\3\2\2\2\n\34%\61"+
		">Jos}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}