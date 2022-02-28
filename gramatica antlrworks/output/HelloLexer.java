// $ANTLR 3.5.1 C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g 2022-02-28 16:12:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMENTARIO=4;
	public static final int EOL=5;
	public static final int ESPACO_BRANCO=6;
	public static final int FUNCAO=7;
	public static final int ID=8;
	public static final int NUMERO=9;
	public static final int TEXTO=10;
	public static final int TIPOS=11;
	public static final int T_ABRECHAVE=12;
	public static final int T_ABRECOLCHETE=13;
	public static final int T_ABREPARENTESES=14;
	public static final int T_ATRIBUICAO=15;
	public static final int T_BREAK=16;
	public static final int T_COMPARACAO=17;
	public static final int T_DEF=18;
	public static final int T_DIFERENTE=19;
	public static final int T_DIVISAO=20;
	public static final int T_E=21;
	public static final int T_ELSE=22;
	public static final int T_ELSEIF=23;
	public static final int T_ESCREVA=24;
	public static final int T_FECHACHAVE=25;
	public static final int T_FECHACOLCHETE=26;
	public static final int T_FECHAPARENTESES=27;
	public static final int T_FOR=28;
	public static final int T_IF=29;
	public static final int T_MAIOR=30;
	public static final int T_MAIOROUIGUAL=31;
	public static final int T_MENOR=32;
	public static final int T_MENOROUIGUAL=33;
	public static final int T_MULTIPLICACAO=34;
	public static final int T_OU=35;
	public static final int T_READ=36;
	public static final int T_RETURN=37;
	public static final int T_SOMA=38;
	public static final int T_SUBTRACAO=39;
	public static final int T_VIRGULA=40;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HelloLexer() {} 
	public HelloLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HelloLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g"; }

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:2:5: ( ';' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:2:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOL"

	// $ANTLR start "T_ABRECHAVE"
	public final void mT_ABRECHAVE() throws RecognitionException {
		try {
			int _type = T_ABRECHAVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:3:13: ( '{' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:3:15: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ABRECHAVE"

	// $ANTLR start "T_ABRECOLCHETE"
	public final void mT_ABRECOLCHETE() throws RecognitionException {
		try {
			int _type = T_ABRECOLCHETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:4:16: ( '[' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:4:18: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ABRECOLCHETE"

	// $ANTLR start "T_ABREPARENTESES"
	public final void mT_ABREPARENTESES() throws RecognitionException {
		try {
			int _type = T_ABREPARENTESES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:5:18: ( '(' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:5:20: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ABREPARENTESES"

	// $ANTLR start "T_ATRIBUICAO"
	public final void mT_ATRIBUICAO() throws RecognitionException {
		try {
			int _type = T_ATRIBUICAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:6:14: ( '=' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:6:16: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ATRIBUICAO"

	// $ANTLR start "T_BREAK"
	public final void mT_BREAK() throws RecognitionException {
		try {
			int _type = T_BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:7:9: ( 'break' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:7:11: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_BREAK"

	// $ANTLR start "T_COMPARACAO"
	public final void mT_COMPARACAO() throws RecognitionException {
		try {
			int _type = T_COMPARACAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:8:14: ( '==' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:8:16: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_COMPARACAO"

	// $ANTLR start "T_DEF"
	public final void mT_DEF() throws RecognitionException {
		try {
			int _type = T_DEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:9:7: ( 'def' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:9:9: 'def'
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_DEF"

	// $ANTLR start "T_DIFERENTE"
	public final void mT_DIFERENTE() throws RecognitionException {
		try {
			int _type = T_DIFERENTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:10:13: ( '!=' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:10:15: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_DIFERENTE"

	// $ANTLR start "T_DIVISAO"
	public final void mT_DIVISAO() throws RecognitionException {
		try {
			int _type = T_DIVISAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:11:11: ( '/' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:11:13: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_DIVISAO"

	// $ANTLR start "T_E"
	public final void mT_E() throws RecognitionException {
		try {
			int _type = T_E;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:12:5: ( '&' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:12:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_E"

	// $ANTLR start "T_ELSE"
	public final void mT_ELSE() throws RecognitionException {
		try {
			int _type = T_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:13:8: ( 'else' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:13:10: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ELSE"

	// $ANTLR start "T_ELSEIF"
	public final void mT_ELSEIF() throws RecognitionException {
		try {
			int _type = T_ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:14:10: ( 'elseif' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:14:12: 'elseif'
			{
			match("elseif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ELSEIF"

	// $ANTLR start "T_ESCREVA"
	public final void mT_ESCREVA() throws RecognitionException {
		try {
			int _type = T_ESCREVA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:15:11: ( 'print' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:15:13: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ESCREVA"

	// $ANTLR start "T_FECHACHAVE"
	public final void mT_FECHACHAVE() throws RecognitionException {
		try {
			int _type = T_FECHACHAVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:16:14: ( '}' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:16:16: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_FECHACHAVE"

	// $ANTLR start "T_FECHACOLCHETE"
	public final void mT_FECHACOLCHETE() throws RecognitionException {
		try {
			int _type = T_FECHACOLCHETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:17:17: ( ']' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:17:19: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_FECHACOLCHETE"

	// $ANTLR start "T_FECHAPARENTESES"
	public final void mT_FECHAPARENTESES() throws RecognitionException {
		try {
			int _type = T_FECHAPARENTESES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:18:19: ( ')' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:18:21: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_FECHAPARENTESES"

	// $ANTLR start "T_FOR"
	public final void mT_FOR() throws RecognitionException {
		try {
			int _type = T_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:19:7: ( 'for' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:19:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_FOR"

	// $ANTLR start "T_IF"
	public final void mT_IF() throws RecognitionException {
		try {
			int _type = T_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:20:6: ( 'if' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:20:8: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_IF"

	// $ANTLR start "T_MAIOR"
	public final void mT_MAIOR() throws RecognitionException {
		try {
			int _type = T_MAIOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:21:9: ( '>' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:21:11: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MAIOR"

	// $ANTLR start "T_MAIOROUIGUAL"
	public final void mT_MAIOROUIGUAL() throws RecognitionException {
		try {
			int _type = T_MAIOROUIGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:22:16: ( '>=' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:22:18: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MAIOROUIGUAL"

	// $ANTLR start "T_MENOR"
	public final void mT_MENOR() throws RecognitionException {
		try {
			int _type = T_MENOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:23:9: ( '<' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:23:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MENOR"

	// $ANTLR start "T_MENOROUIGUAL"
	public final void mT_MENOROUIGUAL() throws RecognitionException {
		try {
			int _type = T_MENOROUIGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:24:16: ( '<=' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:24:18: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MENOROUIGUAL"

	// $ANTLR start "T_MULTIPLICACAO"
	public final void mT_MULTIPLICACAO() throws RecognitionException {
		try {
			int _type = T_MULTIPLICACAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:25:17: ( '*' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:25:19: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MULTIPLICACAO"

	// $ANTLR start "T_OU"
	public final void mT_OU() throws RecognitionException {
		try {
			int _type = T_OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:26:6: ( '|' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:26:8: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_OU"

	// $ANTLR start "T_READ"
	public final void mT_READ() throws RecognitionException {
		try {
			int _type = T_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:27:8: ( 'read' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:27:10: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_READ"

	// $ANTLR start "T_RETURN"
	public final void mT_RETURN() throws RecognitionException {
		try {
			int _type = T_RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:28:10: ( 'return' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:28:12: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_RETURN"

	// $ANTLR start "T_SOMA"
	public final void mT_SOMA() throws RecognitionException {
		try {
			int _type = T_SOMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:29:8: ( '+' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:29:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_SOMA"

	// $ANTLR start "T_SUBTRACAO"
	public final void mT_SUBTRACAO() throws RecognitionException {
		try {
			int _type = T_SUBTRACAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:30:13: ( '-' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:30:15: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_SUBTRACAO"

	// $ANTLR start "T_VIRGULA"
	public final void mT_VIRGULA() throws RecognitionException {
		try {
			int _type = T_VIRGULA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:31:11: ( ',' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:31:13: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_VIRGULA"

	// $ANTLR start "TIPOS"
	public final void mTIPOS() throws RecognitionException {
		try {
			int _type = TIPOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:2: ( ( 'int' | 'float' | 'string' ) )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:4: ( 'int' | 'float' | 'string' )
			{
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:4: ( 'int' | 'float' | 'string' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt1=1;
				}
				break;
			case 'f':
				{
				alt1=2;
				}
				break;
			case 's':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:5: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:13: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:23: 'string'
					{
					match("string"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIPOS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:2: ( 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:4: 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:15: ( 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FUNCAO"
	public final void mFUNCAO() throws RecognitionException {
		try {
			int _type = FUNCAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:216:2: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' )+ )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:216:4: ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' )+
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:216:17: ( 'a' .. 'z' | '0' .. '9' | '_' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCAO"

	// $ANTLR start "TEXTO"
	public final void mTEXTO() throws RecognitionException {
		try {
			int _type = TEXTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:220:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' | '_' | '-' )* '\"' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:220:4: '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' | '_' | '-' )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:220:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' | '_' | '-' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ' ' && LA4_0 <= '!')||LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXTO"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:224:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:224:4: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:224:4: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:224:18: ( '.' ( '0' .. '9' )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='.') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:224:20: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:224:24: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "ESPACO_BRANCO"
	public final void mESPACO_BRANCO() throws RecognitionException {
		try {
			int _type = ESPACO_BRANCO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:228:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:228:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:228:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||(LA8_0 >= '\f' && LA8_0 <= '\r')||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESPACO_BRANCO"

	// $ANTLR start "COMENTARIO"
	public final void mCOMENTARIO() throws RecognitionException {
		try {
			int _type = COMENTARIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:232:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:232:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:232:12: (~ ( '\\n' | '\\r' ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:232:26: ( '\\r' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\r') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:232:26: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMENTARIO"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:8: ( EOL | T_ABRECHAVE | T_ABRECOLCHETE | T_ABREPARENTESES | T_ATRIBUICAO | T_BREAK | T_COMPARACAO | T_DEF | T_DIFERENTE | T_DIVISAO | T_E | T_ELSE | T_ELSEIF | T_ESCREVA | T_FECHACHAVE | T_FECHACOLCHETE | T_FECHAPARENTESES | T_FOR | T_IF | T_MAIOR | T_MAIOROUIGUAL | T_MENOR | T_MENOROUIGUAL | T_MULTIPLICACAO | T_OU | T_READ | T_RETURN | T_SOMA | T_SUBTRACAO | T_VIRGULA | TIPOS | ID | FUNCAO | TEXTO | NUMERO | ESPACO_BRANCO | COMENTARIO )
		int alt11=37;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:10: EOL
				{
				mEOL(); 

				}
				break;
			case 2 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:14: T_ABRECHAVE
				{
				mT_ABRECHAVE(); 

				}
				break;
			case 3 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:26: T_ABRECOLCHETE
				{
				mT_ABRECOLCHETE(); 

				}
				break;
			case 4 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:41: T_ABREPARENTESES
				{
				mT_ABREPARENTESES(); 

				}
				break;
			case 5 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:58: T_ATRIBUICAO
				{
				mT_ATRIBUICAO(); 

				}
				break;
			case 6 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:71: T_BREAK
				{
				mT_BREAK(); 

				}
				break;
			case 7 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:79: T_COMPARACAO
				{
				mT_COMPARACAO(); 

				}
				break;
			case 8 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:92: T_DEF
				{
				mT_DEF(); 

				}
				break;
			case 9 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:98: T_DIFERENTE
				{
				mT_DIFERENTE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:110: T_DIVISAO
				{
				mT_DIVISAO(); 

				}
				break;
			case 11 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:120: T_E
				{
				mT_E(); 

				}
				break;
			case 12 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:124: T_ELSE
				{
				mT_ELSE(); 

				}
				break;
			case 13 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:131: T_ELSEIF
				{
				mT_ELSEIF(); 

				}
				break;
			case 14 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:140: T_ESCREVA
				{
				mT_ESCREVA(); 

				}
				break;
			case 15 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:150: T_FECHACHAVE
				{
				mT_FECHACHAVE(); 

				}
				break;
			case 16 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:163: T_FECHACOLCHETE
				{
				mT_FECHACOLCHETE(); 

				}
				break;
			case 17 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:179: T_FECHAPARENTESES
				{
				mT_FECHAPARENTESES(); 

				}
				break;
			case 18 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:197: T_FOR
				{
				mT_FOR(); 

				}
				break;
			case 19 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:203: T_IF
				{
				mT_IF(); 

				}
				break;
			case 20 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:208: T_MAIOR
				{
				mT_MAIOR(); 

				}
				break;
			case 21 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:216: T_MAIOROUIGUAL
				{
				mT_MAIOROUIGUAL(); 

				}
				break;
			case 22 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:231: T_MENOR
				{
				mT_MENOR(); 

				}
				break;
			case 23 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:239: T_MENOROUIGUAL
				{
				mT_MENOROUIGUAL(); 

				}
				break;
			case 24 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:254: T_MULTIPLICACAO
				{
				mT_MULTIPLICACAO(); 

				}
				break;
			case 25 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:270: T_OU
				{
				mT_OU(); 

				}
				break;
			case 26 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:275: T_READ
				{
				mT_READ(); 

				}
				break;
			case 27 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:282: T_RETURN
				{
				mT_RETURN(); 

				}
				break;
			case 28 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:291: T_SOMA
				{
				mT_SOMA(); 

				}
				break;
			case 29 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:298: T_SUBTRACAO
				{
				mT_SUBTRACAO(); 

				}
				break;
			case 30 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:310: T_VIRGULA
				{
				mT_VIRGULA(); 

				}
				break;
			case 31 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:320: TIPOS
				{
				mTIPOS(); 

				}
				break;
			case 32 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:326: ID
				{
				mID(); 

				}
				break;
			case 33 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:329: FUNCAO
				{
				mFUNCAO(); 

				}
				break;
			case 34 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:336: TEXTO
				{
				mTEXTO(); 

				}
				break;
			case 35 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:342: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 36 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:349: ESPACO_BRANCO
				{
				mESPACO_BRANCO(); 

				}
				break;
			case 37 :
				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:1:363: COMENTARIO
				{
				mCOMENTARIO(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\5\uffff\1\41\3\uffff\1\45\10\uffff\1\55\1\57\16\uffff\2\34\2\uffff\4"+
		"\34\1\70\1\34\4\uffff\3\34\1\76\2\34\1\101\1\34\1\uffff\1\103\4\34\1\uffff"+
		"\1\111\1\34\1\uffff\1\34\1\uffff\1\114\2\34\1\117\1\34\1\uffff\1\121\1"+
		"\103\1\uffff\2\34\1\uffff\1\124\1\uffff\1\125\1\103\2\uffff";
	static final String DFA11_eofS =
		"\126\uffff";
	static final String DFA11_minS =
		"\1\11\4\uffff\1\75\2\60\1\uffff\1\57\1\uffff\2\60\3\uffff\2\60\2\75\2"+
		"\uffff\1\60\3\uffff\1\60\7\uffff\1\145\1\146\2\uffff\1\163\1\151\1\162"+
		"\1\157\1\60\1\164\4\uffff\1\141\1\162\1\141\1\60\1\145\1\156\1\60\1\141"+
		"\1\uffff\1\60\1\144\1\165\1\151\1\153\1\uffff\1\60\1\164\1\uffff\1\164"+
		"\1\uffff\1\60\1\162\1\156\1\60\1\146\1\uffff\2\60\1\uffff\1\156\1\147"+
		"\1\uffff\1\60\1\uffff\2\60\2\uffff";
	static final String DFA11_maxS =
		"\1\175\4\uffff\1\75\2\172\1\uffff\1\57\1\uffff\2\172\3\uffff\2\172\2\75"+
		"\2\uffff\1\172\3\uffff\1\172\7\uffff\1\145\1\146\2\uffff\1\163\1\151\1"+
		"\162\1\157\1\172\1\164\4\uffff\1\164\1\162\1\141\1\172\1\145\1\156\1\172"+
		"\1\141\1\uffff\1\172\1\144\1\165\1\151\1\153\1\uffff\1\172\1\164\1\uffff"+
		"\1\164\1\uffff\1\172\1\162\1\156\1\172\1\146\1\uffff\2\172\1\uffff\1\156"+
		"\1\147\1\uffff\1\172\1\uffff\2\172\2\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\11\1\uffff\1\13\2\uffff\1\17\1\20\1"+
		"\21\4\uffff\1\30\1\31\1\uffff\1\34\1\35\1\36\1\uffff\1\40\1\41\1\42\1"+
		"\43\1\44\1\7\1\5\2\uffff\1\45\1\12\6\uffff\1\25\1\24\1\27\1\26\10\uffff"+
		"\1\23\5\uffff\1\10\2\uffff\1\22\1\uffff\1\37\5\uffff\1\14\2\uffff\1\32"+
		"\2\uffff\1\6\1\uffff\1\16\2\uffff\1\15\1\33";
	static final String DFA11_specialS =
		"\126\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\37\1\uffff\2\37\22\uffff\1\37\1\10\1\35\3\uffff\1\12\1\uffff\1\4\1"+
			"\17\1\24\1\27\1\31\1\30\1\uffff\1\11\12\36\1\uffff\1\1\1\23\1\5\1\22"+
			"\2\uffff\32\33\1\3\1\uffff\1\16\3\uffff\1\34\1\6\1\34\1\7\1\13\1\20\2"+
			"\34\1\21\6\34\1\14\1\34\1\26\1\32\7\34\1\2\1\25\1\15",
			"",
			"",
			"",
			"",
			"\1\40",
			"\12\34\45\uffff\1\34\1\uffff\21\34\1\42\10\34",
			"\12\34\45\uffff\1\34\1\uffff\4\34\1\43\25\34",
			"",
			"\1\44",
			"",
			"\12\34\45\uffff\1\34\1\uffff\13\34\1\46\16\34",
			"\12\34\45\uffff\1\34\1\uffff\21\34\1\47\10\34",
			"",
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\13\34\1\51\2\34\1\50\13\34",
			"\12\34\45\uffff\1\34\1\uffff\5\34\1\52\7\34\1\53\14\34",
			"\1\54",
			"\1\56",
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\4\34\1\60\25\34",
			"",
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\23\34\1\61\6\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\71",
			"",
			"",
			"",
			"",
			"\1\72\22\uffff\1\73",
			"\1\74",
			"\1\75",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\77",
			"\1\100",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\102",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"\12\34\45\uffff\1\34\1\uffff\10\34\1\110\21\34",
			"\1\112",
			"",
			"\1\113",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\115",
			"\1\116",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\120",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"",
			"\1\122",
			"\1\123",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EOL | T_ABRECHAVE | T_ABRECOLCHETE | T_ABREPARENTESES | T_ATRIBUICAO | T_BREAK | T_COMPARACAO | T_DEF | T_DIFERENTE | T_DIVISAO | T_E | T_ELSE | T_ELSEIF | T_ESCREVA | T_FECHACHAVE | T_FECHACOLCHETE | T_FECHAPARENTESES | T_FOR | T_IF | T_MAIOR | T_MAIOROUIGUAL | T_MENOR | T_MENOROUIGUAL | T_MULTIPLICACAO | T_OU | T_READ | T_RETURN | T_SOMA | T_SUBTRACAO | T_VIRGULA | TIPOS | ID | FUNCAO | TEXTO | NUMERO | ESPACO_BRANCO | COMENTARIO );";
		}
	}

}
