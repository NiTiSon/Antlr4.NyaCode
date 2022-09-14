// Generated from c:\Users\NiTiSon\source\repos\Antlr4.Ewample\NyaCodeLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NyaCodeLexer extends NyaCodeLexerBase {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLELINE_COMMENT=1, MULTILINE_COMMENT=2, WHITESPACES=3, NYA=4, LEFT_PARE=5, 
		RIGHT_PARE=6;
	public static final int
		COMMENTS_CHANNEL=2, DIRECTIVE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS_CHANNEL", "DIRECTIVE"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLELINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACES", "NYA", "LEFT_PARE", 
			"RIGHT_PARE", "InputCharacter", "NewLine", "Whitespace", "UnicodeClassZS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'nya'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLELINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACES", "NYA", 
			"LEFT_PARE", "RIGHT_PARE"
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


	public NyaCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NyaCodeLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			NYA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NYA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 Nya(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bU\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13"+
		"\3\3\3\3\3\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tN\n\t\3\n\3\n\5\nR\n\n\3\13\3"+
		"\13\3(\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\3\2\5\6\2\f\f"+
		"\17\17\u0087\u0087\u202a\u202b\4\2\13\13\r\16\13\2\"\"\u00a2\u00a2\u1682"+
		"\u1682\u1810\u1810\u2002\u2008\u200a\u200c\u2031\u2031\u2061\u2061\u3002"+
		"\u3002\2W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\3\27\3\2\2\2\5\"\3\2\2\2\78\3\2\2\2\t>\3\2\2\2\13D\3\2\2"+
		"\2\rF\3\2\2\2\17H\3\2\2\2\21M\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27\30\7"+
		"\61\2\2\30\31\7\61\2\2\31\35\3\2\2\2\32\34\5\17\b\2\33\32\3\2\2\2\34\37"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\b\2\2"+
		"\2!\4\3\2\2\2\"#\7\61\2\2#$\7,\2\2$(\3\2\2\2%\'\13\2\2\2&%\3\2\2\2\'*"+
		"\3\2\2\2()\3\2\2\2(&\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7,\2\2,-\7\61\2\2-"+
		"\61\3\2\2\2.\60\5\17\b\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\b\3\2\2\65\6\3\2\2\2\669\5\23\n"+
		"\2\679\5\21\t\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2"+
		";<\3\2\2\2<=\b\4\3\2=\b\3\2\2\2>?\7p\2\2?@\7{\2\2@A\7c\2\2AB\3\2\2\2B"+
		"C\b\5\4\2C\n\3\2\2\2DE\7*\2\2E\f\3\2\2\2FG\7+\2\2G\16\3\2\2\2HI\n\2\2"+
		"\2I\20\3\2\2\2JK\7\17\2\2KN\7\f\2\2LN\t\2\2\2MJ\3\2\2\2ML\3\2\2\2N\22"+
		"\3\2\2\2OR\5\25\13\2PR\t\3\2\2QO\3\2\2\2QP\3\2\2\2R\24\3\2\2\2ST\t\4\2"+
		"\2T\26\3\2\2\2\n\2\35(\618:MQ\5\2\4\2\2\3\2\3\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}