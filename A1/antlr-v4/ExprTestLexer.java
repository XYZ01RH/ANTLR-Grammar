// Generated from ExprTest.g by ANTLR 4.5.2

	import java.util.HashMap;
	import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprTestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MUL=6, DIV=7, ADD=8, SUB=9, ENDLINE=10, 
		VAR=11, PRINT=12, STRING=13, INTEGER=14, INT=15, STR=16, ID=17, NL=18, 
		WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "MUL", "DIV", "ADD", "SUB", "ENDLINE", 
		"VAR", "PRINT", "STRING", "INTEGER", "INT", "STR", "ID", "NL", "WS"
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


	public ExprTestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExprTest.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13A\n\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\5\20Y\n\20\3\20\6\20\\\n\20\r\20\16\20]\3\21\3\21\7"+
		"\21b\n\21\f\21\16\21e\13\21\3\21\3\21\3\22\3\22\7\22k\n\22\f\22\16\22"+
		"n\13\22\3\23\5\23q\n\23\3\23\3\23\3\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25\3\2\5\5\2\62;C\\c|\4\2C\\c|\5\2\13\f\17\17\"\"}\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2"+
		"\2\2\r\64\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25@\3\2\2\2\27"+
		"B\3\2\2\2\31F\3\2\2\2\33L\3\2\2\2\35S\3\2\2\2\37X\3\2\2\2!_\3\2\2\2#h"+
		"\3\2\2\2%p\3\2\2\2\'t\3\2\2\2)*\7?\2\2*\4\3\2\2\2+,\7<\2\2,-\7?\2\2-\6"+
		"\3\2\2\2./\7*\2\2/\b\3\2\2\2\60\61\7+\2\2\61\n\3\2\2\2\62\63\7.\2\2\63"+
		"\f\3\2\2\2\64\65\7,\2\2\65\16\3\2\2\2\66\67\7\61\2\2\67\20\3\2\2\289\7"+
		"-\2\29\22\3\2\2\2:;\7/\2\2;\24\3\2\2\2<=\7=\2\2=A\5%\23\2>A\5%\23\2?A"+
		"\7=\2\2@<\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\26\3\2\2\2BC\7x\2\2CD\7c\2\2DE"+
		"\7t\2\2E\30\3\2\2\2FG\7r\2\2GH\7t\2\2HI\7k\2\2IJ\7p\2\2JK\7v\2\2K\32\3"+
		"\2\2\2LM\7u\2\2MN\7v\2\2NO\7t\2\2OP\7k\2\2PQ\7p\2\2QR\7i\2\2R\34\3\2\2"+
		"\2ST\7k\2\2TU\7p\2\2UV\7v\2\2V\36\3\2\2\2WY\7/\2\2XW\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2Z\\\4\62;\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^ \3\2\2"+
		"\2_c\7$\2\2`b\t\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2"+
		"\2ec\3\2\2\2fg\7$\2\2g\"\3\2\2\2hl\t\3\2\2ik\t\2\2\2ji\3\2\2\2kn\3\2\2"+
		"\2lj\3\2\2\2lm\3\2\2\2m$\3\2\2\2nl\3\2\2\2oq\7\17\2\2po\3\2\2\2pq\3\2"+
		"\2\2qr\3\2\2\2rs\7\f\2\2s&\3\2\2\2tu\t\4\2\2uv\b\24\2\2v(\3\2\2\2\t\2"+
		"@X]clp\3\3\24\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}