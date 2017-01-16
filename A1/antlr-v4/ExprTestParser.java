// Generated from ExprTest.g by ANTLR 4.5.2

	import java.util.HashMap;
	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprTestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MUL=6, DIV=7, ADD=8, SUB=9, ENDLINE=10, 
		VAR=11, PRINT=12, STRING=13, INTEGER=14, INT=15, STR=16, ID=17, NL=18, 
		WS=19;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_vardecl = 2, RULE_expr = 3, RULE_idList = 4, 
		RULE_eList = 5;
	public static final String[] ruleNames = {
		"prog", "stat", "vardecl", "expr", "idList", "eList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "':='", "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", 
		null, "'var'", "'print'", "'string'", "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ENDLINE", 
		"VAR", "PRINT", "STRING", "INTEGER", "INT", "STR", "ID", "NL", "WS"
	};
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
	public String getGrammarFileName() { return "ExprTest.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		HashMap<String, Object> memory = new HashMap<>();

		boolean checkMem(String s) {
			if(memory.containsKey(s)) {
				return true;
			} else { return false; }
		}

		void printError() {
			error("SYNTAX ERROR");
		}

		void error(String err) {
			System.err.println(err);
			System.exit(0);
		}

		int eval(int left, int opr, int right) {
			switch(opr) {
				case MUL : return left * right;
				case DIV : 
					if(right == 0) {
						return 0;
					} else { return left / right; }
				case ADD : return left + right;
				case SUB : return left - right;
			}
			printError();
			return 0;
		}

		String eval(String left, int opr, String right) {
			switch(opr) {
				case ADD : return left + right;
			}
			printError();
			return "";
		}

		String eval(String left, int opr, int right) {
			switch(opr) {
				case MUL :
					StringBuilder sb = new StringBuilder();
					if(right == 0) {
						return("");
					} else if(right > 0) {
						for(int i = 0; i < right; i++) {
							sb.append(left);
						} return sb.toString();
					} else { error("ERROR NEGATIVE STRING MULTIPLIER");}
				case DIV : error("ERROR STRING DIVISION");
				case ADD : 
					if(right > 0) {
						if(right < left.length()) {
							return left.substring(right);
						} else { printError(); }
					} else {
						if( (right * -1) < left.length() ) {
							return left.substring(0, left.length() + right);
						} else { printError(); }
					}
				case SUB :
					if(right > 0) {
						if(right < left.length()) {
							return left.substring(0, left.length() - right);
						} else { printError(); }
					} else {
						if( (right * -1) < left.length() ) {
							return left.substring(0, left.length() - right);
						} else { printError(); }
					}
			}
			printError();
			return "";
		}

	public ExprTestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << VAR) | (1L << PRINT) | (1L << INT) | (1L << STR) | (1L << ID) | (1L << NL))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public TerminalNode PRINT() { return getToken(ExprTestParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(ExprTestParser.ENDLINE, 0); }
		public TerminalNode ID() { return getToken(ExprTestParser.ID, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode NL() { return getToken(ExprTestParser.NL, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(PRINT);
				setState(18);
				((StatContext)_localctx).expr = expr(0);
				setState(19);
				match(ENDLINE);
				System.out.println(((StatContext)_localctx).expr.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				((StatContext)_localctx).expr = expr(0);
				setState(23);
				match(ENDLINE);
				System.out.println(((StatContext)_localctx).expr.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				((StatContext)_localctx).ID = match(ID);
				setState(27);
				match(T__0);
				setState(28);
				((StatContext)_localctx).expr = expr(0);
				setState(29);
				match(ENDLINE);

									if(checkMem((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null))) {
										//Object x=null;
										//Object z=((StatContext)_localctx).expr.value;
										//x=memory.get((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null));
										//if ((x instanceof String) && (z instanceof String))
										//{ 
										if( (memory.get((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null)) instanceof String &&    ((StatContext)_localctx).expr.value instanceof String) || (memory.get((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null)) instanceof Integer && ((StatContext)_localctx).expr.value instanceof Integer)) {
											memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).expr.value);
										} else { error("VARIABLE ALREADY DECLARED"); }
									} else { printError(); }
								
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				((StatContext)_localctx).ID = match(ID);
				setState(33);
				match(T__1);
				setState(34);
				((StatContext)_localctx).expr = expr(0);
				setState(35);
				match(ENDLINE);

									if(checkMem((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null))) {
										error("ERROR VARIABLE ALREADY DECLARED");
									} else {
										memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).expr.value);
									}
								
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				vardecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				match(NL);
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

	public static class VardeclContext extends ParserRuleContext {
		public IdListContext vA;
		public EListContext iA;
		public TerminalNode VAR() { return getToken(ExprTestParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(ExprTestParser.STRING, 0); }
		public TerminalNode ENDLINE() { return getToken(ExprTestParser.ENDLINE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ExprTestParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(ExprTestParser.ID, 0); }
		public EListContext eList() {
			return getRuleContext(EListContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardecl);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(VAR);
				setState(44);
				((VardeclContext)_localctx).vA = idList();
				setState(45);
				match(STRING);
				setState(46);
				match(ENDLINE);

									for(String id : ((VardeclContext)_localctx).vA.list) {
										memory.put(id, "\"");
									}	
								
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(VAR);
				setState(50);
				((VardeclContext)_localctx).vA = idList();
				setState(51);
				match(INTEGER);
				setState(52);
				match(ENDLINE);

									for(String id : ((VardeclContext)_localctx).vA.list) {
										memory.put(id, 0);
									}
								
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(VAR);
				setState(56);
				((VardeclContext)_localctx).vA = idList();
				setState(57);
				match(ID);
				setState(58);
				match(T__0);
				setState(59);
				((VardeclContext)_localctx).iA = eList();
				setState(60);
				match(ENDLINE);

									ArrayList<String> v = ((VardeclContext)_localctx).vA.list;
									ArrayList<Object> e = ((VardeclContext)_localctx).iA.list;
									if(v.size() == e.size()) {
										for(int i = 0; i < v.size(); i++) {
											if(e.get(i) instanceof String) {
												memory.put(v.get(i), (String)e.get(i));
											} else if(e.get(i) instanceof Integer) {
												memory.put(v.get(i), (Integer)e.get(i));
											} else { printError(); }
										}
									}
								
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(VAR);
				setState(64);
				((VardeclContext)_localctx).vA = idList();
				setState(65);
				match(STRING);
				setState(66);
				match(ID);
				setState(67);
				match(T__0);
				setState(68);
				((VardeclContext)_localctx).iA = eList();
				setState(69);
				match(ENDLINE);

									ArrayList<String> v = ((VardeclContext)_localctx).vA.list;
									ArrayList<Object> e = ((VardeclContext)_localctx).iA.list;
									if(v.size() == e.size()) {
										for(int i = 0; i < v.size(); i++) {
											if(e.get(i) instanceof String) {
												memory.put(v.get(i), (String) e.get(i));
											} else { printError(); }
										}
									} else { printError(); }
								
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(VAR);
				setState(73);
				((VardeclContext)_localctx).vA = idList();
				setState(74);
				match(INTEGER);
				setState(75);
				match(T__0);
				setState(76);
				((VardeclContext)_localctx).iA = eList();
				setState(77);
				match(ENDLINE);

									ArrayList<String> v = ((VardeclContext)_localctx).vA.list;
									ArrayList<Object> e = ((VardeclContext)_localctx).iA.list;
									if(v.size() == e.size()) {
										for(int i = 0; i < v.size(); i++) {
											if(e.get(i) instanceof Integer) {
												memory.put(v.get(i), (Integer) e.get(i));
											} else { printError(); }
										}
									} else { printError(); }
								
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

	public static class ExprContext extends ParserRuleContext {
		public Object value;
		public ExprContext e;
		public Token INT;
		public Token STR;
		public Token ID;
		public Token op;
		public ExprContext f;
		public TerminalNode INT() { return getToken(ExprTestParser.INT, 0); }
		public TerminalNode STR() { return getToken(ExprTestParser.STR, 0); }
		public TerminalNode ID() { return getToken(ExprTestParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprTestParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprTestParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(ExprTestParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprTestParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).exitExpr(this);
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
			switch (_input.LA(1)) {
			case INT:
				{
				setState(83);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).value =  (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0);
				}
				break;
			case STR:
				{
				setState(85);
				((ExprContext)_localctx).STR = match(STR);
				((ExprContext)_localctx).value =  (((ExprContext)_localctx).STR!=null?((ExprContext)_localctx).STR.getText():null).replaceAll("\"", "");
				}
				break;
			case ID:
				{
				setState(87);
				((ExprContext)_localctx).ID = match(ID);

									String id = (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
									if(checkMem(id)) {
										((ExprContext)_localctx).value =  memory.get(id);
									} else { printError(); }
								
				}
				break;
			case T__2:
				{
				setState(89);
				match(T__2);
				setState(90);
				((ExprContext)_localctx).e = expr(0);
				setState(91);
				match(T__3);
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(97);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(98);
						((ExprContext)_localctx).f = expr(7);

						                     			if (((ExprContext)_localctx).e.value instanceof Integer && ((ExprContext)_localctx).f.value instanceof Integer){
						                         			((ExprContext)_localctx).value =  eval((Integer)((ExprContext)_localctx).e.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), (Integer)((ExprContext)_localctx).f.value);
						                     			} else if (((ExprContext)_localctx).e.value instanceof String && ((ExprContext)_localctx).f.value instanceof Integer){
						                         			((ExprContext)_localctx).value =  eval((String)((ExprContext)_localctx).e.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), (Integer)((ExprContext)_localctx).f.value);
						                     			} else if (((ExprContext)_localctx).e.value instanceof Integer && ((ExprContext)_localctx).f.value instanceof String){
						                         			((ExprContext)_localctx).value =  eval((String)((ExprContext)_localctx).f.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), (Integer)((ExprContext)_localctx).e.value);
						                  			} else { printError(); }
						          				
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(103);
						((ExprContext)_localctx).f = expr(6);

						          					if (((ExprContext)_localctx).e.value instanceof Integer && ((ExprContext)_localctx).f.value instanceof Integer){
						                         			((ExprContext)_localctx).value =  eval((Integer)((ExprContext)_localctx).e.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), (Integer)((ExprContext)_localctx).f.value);
						                     			} else if (((ExprContext)_localctx).e.value instanceof String && ((ExprContext)_localctx).f.value instanceof String){
						                         			((ExprContext)_localctx).value =  eval((String)((ExprContext)_localctx).e.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), (String)((ExprContext)_localctx).f.value);
						                     			} else if (((ExprContext)_localctx).e.value instanceof String && ((ExprContext)_localctx).f.value instanceof Integer){
						                         			((ExprContext)_localctx).value =  eval((String)((ExprContext)_localctx).e.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), (Integer)((ExprContext)_localctx).f.value);
						                     			} else if (((ExprContext)_localctx).e.value instanceof Integer && ((ExprContext)_localctx).f.value instanceof String){
						                         			((ExprContext)_localctx).value =  eval((String)((ExprContext)_localctx).f.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), (Integer)((ExprContext)_localctx).e.value);
						                     			} else { printError(); }
						          				
						}
						break;
					}
					} 
				}
				setState(110);
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

	public static class IdListContext extends ParserRuleContext {
		public ArrayList<String> list;
		public ArrayList<String> ids =  new ArrayList<>();;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(ExprTestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprTestParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((IdListContext)_localctx).ID = match(ID);
			_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(113);
				match(T__4);
				setState(114);
				((IdListContext)_localctx).ID = match(ID);
				_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((IdListContext)_localctx).list =  _localctx.ids;
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

	public static class EListContext extends ParserRuleContext {
		public ArrayList<Object> list;
		public ArrayList<Object> exprs =  new ArrayList<>();;
		public ExprContext e;
		public ExprContext f;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).enterEList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprTestListener ) ((ExprTestListener)listener).exitEList(this);
		}
	}

	public final EListContext eList() throws RecognitionException {
		EListContext _localctx = new EListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((EListContext)_localctx).e = expr(0);
			_localctx.exprs.add(((EListContext)_localctx).e.value);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(125);
				match(T__4);
				setState(126);
				((EListContext)_localctx).f = expr(0);
				_localctx.exprs.add(((EListContext)_localctx).f.value);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((EListContext)_localctx).list =  _localctx.exprs;
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\6\3\6\3\6\3\6\3\6\7\6w\n\6\f\6\16"+
		"\6z\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087"+
		"\13\7\3\7\3\7\3\7\2\3\b\b\2\4\6\b\n\f\2\4\3\2\b\t\3\2\n\13\u0096\2\17"+
		"\3\2\2\2\4+\3\2\2\2\6R\3\2\2\2\b`\3\2\2\2\nq\3\2\2\2\f}\3\2\2\2\16\20"+
		"\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3"+
		"\3\2\2\2\23\24\7\16\2\2\24\25\5\b\5\2\25\26\7\f\2\2\26\27\b\3\1\2\27,"+
		"\3\2\2\2\30\31\5\b\5\2\31\32\7\f\2\2\32\33\b\3\1\2\33,\3\2\2\2\34\35\7"+
		"\23\2\2\35\36\7\3\2\2\36\37\5\b\5\2\37 \7\f\2\2 !\b\3\1\2!,\3\2\2\2\""+
		"#\7\23\2\2#$\7\4\2\2$%\5\b\5\2%&\7\f\2\2&\'\b\3\1\2\',\3\2\2\2(,\5\6\4"+
		"\2),\5\b\5\2*,\7\24\2\2+\23\3\2\2\2+\30\3\2\2\2+\34\3\2\2\2+\"\3\2\2\2"+
		"+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\r\2\2./\5\n\6\2/\60\7\17"+
		"\2\2\60\61\7\f\2\2\61\62\b\4\1\2\62S\3\2\2\2\63\64\7\r\2\2\64\65\5\n\6"+
		"\2\65\66\7\20\2\2\66\67\7\f\2\2\678\b\4\1\28S\3\2\2\29:\7\r\2\2:;\5\n"+
		"\6\2;<\7\23\2\2<=\7\3\2\2=>\5\f\7\2>?\7\f\2\2?@\b\4\1\2@S\3\2\2\2AB\7"+
		"\r\2\2BC\5\n\6\2CD\7\17\2\2DE\7\23\2\2EF\7\3\2\2FG\5\f\7\2GH\7\f\2\2H"+
		"I\b\4\1\2IS\3\2\2\2JK\7\r\2\2KL\5\n\6\2LM\7\20\2\2MN\7\3\2\2NO\5\f\7\2"+
		"OP\7\f\2\2PQ\b\4\1\2QS\3\2\2\2R-\3\2\2\2R\63\3\2\2\2R9\3\2\2\2RA\3\2\2"+
		"\2RJ\3\2\2\2S\7\3\2\2\2TU\b\5\1\2UV\7\21\2\2Va\b\5\1\2WX\7\22\2\2Xa\b"+
		"\5\1\2YZ\7\23\2\2Za\b\5\1\2[\\\7\5\2\2\\]\5\b\5\2]^\7\6\2\2^_\b\5\1\2"+
		"_a\3\2\2\2`T\3\2\2\2`W\3\2\2\2`Y\3\2\2\2`[\3\2\2\2an\3\2\2\2bc\f\b\2\2"+
		"cd\t\2\2\2de\5\b\5\tef\b\5\1\2fm\3\2\2\2gh\f\7\2\2hi\t\3\2\2ij\5\b\5\b"+
		"jk\b\5\1\2km\3\2\2\2lb\3\2\2\2lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"o\t\3\2\2\2pn\3\2\2\2qr\7\23\2\2rx\b\6\1\2st\7\7\2\2tu\7\23\2\2uw\b\6"+
		"\1\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\b\6"+
		"\1\2|\13\3\2\2\2}~\5\b\5\2~\u0085\b\7\1\2\177\u0080\7\7\2\2\u0080\u0081"+
		"\5\b\5\2\u0081\u0082\b\7\1\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\7\1\2\u0089\r\3\2\2\2\n\21+R`l"+
		"nx\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}