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
		SINGLELINE_COMMENT=1, MULTILINE_COMMENT=2, WHITESPACES=3, STATEMENT=4, 
		NYA=5, SEMICOLON=6, LEFT_PARE=7, RIGHT_PARE=8;
	public static final int
		COMMENTS_CHANNEL=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS_CHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLELINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACES", "STATEMENT", 
			"NYA", "SEMICOLON", "LEFT_PARE", "RIGHT_PARE", "InputCharacter", "NewLine", 
			"Whitespace", "UnicodeClassZS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'nya'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLELINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACES", "STATEMENT", 
			"NYA", "SEMICOLON", "LEFT_PARE", "RIGHT_PARE"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\3\3\3\7\3\64\n\3\f\3"+
		"\16\3\67\13\3\3\3\3\3\3\4\3\4\6\4=\n\4\r\4\16\4>\3\4\3\4\3\5\5\5D\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\5\13W\n\13\3\f\3\f\5\f[\n\f\3\r\3\r\3,\2\16\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\2\25\2\27\2\31\2\3\2\5\6\2\f\f\17\17\u0087\u0087\u202a\u202b"+
		"\4\2\13\13\r\16\13\2\"\"\u00a2\u00a2\u1682\u1682\u1810\u1810\u2002\u2008"+
		"\u200a\u200c\u2031\u2031\u2061\u2061\u3002\u3002\2a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\3\33\3\2\2\2\5&\3\2\2\2\7<\3\2\2\2\tC\3\2\2\2\13G\3\2\2\2"+
		"\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25V\3\2\2\2\27Z\3\2\2"+
		"\2\31\\\3\2\2\2\33\34\7\61\2\2\34\35\7\61\2\2\35!\3\2\2\2\36 \5\23\n\2"+
		"\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$"+
		"%\b\2\2\2%\4\3\2\2\2&\'\7\61\2\2\'(\7,\2\2(,\3\2\2\2)+\13\2\2\2*)\3\2"+
		"\2\2+.\3\2\2\2,-\3\2\2\2,*\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7,\2\2\60\61"+
		"\7\61\2\2\61\65\3\2\2\2\62\64\5\23\n\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\b\3\2\29\6\3\2\2"+
		"\2:=\5\27\f\2;=\5\25\13\2<:\3\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?@\3\2\2\2@A\b\4\3\2A\b\3\2\2\2BD\5\13\6\2CB\3\2\2\2CD\3\2\2\2D"+
		"E\3\2\2\2EF\5\r\7\2F\n\3\2\2\2GH\7p\2\2HI\7{\2\2IJ\7c\2\2J\f\3\2\2\2K"+
		"L\7=\2\2L\16\3\2\2\2MN\7*\2\2N\20\3\2\2\2OP\7+\2\2P\22\3\2\2\2QR\n\2\2"+
		"\2R\24\3\2\2\2ST\7\17\2\2TW\7\f\2\2UW\t\2\2\2VS\3\2\2\2VU\3\2\2\2W\26"+
		"\3\2\2\2X[\5\31\r\2Y[\t\3\2\2ZX\3\2\2\2ZY\3\2\2\2[\30\3\2\2\2\\]\t\4\2"+
		"\2]\32\3\2\2\2\13\2!,\65<>CVZ\4\2\4\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}