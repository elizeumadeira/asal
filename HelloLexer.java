// $ANTLR 3.5.2 Hello.g 2022-02-28 13:08:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloLexer extends Lexer {
	public static final int EOF=-1;
	public static final int EOL=4;
	public static final int FUNCAO=5;
	public static final int ID=6;
	public static final int NUMERO=7;
	public static final int TEXTO=8;
	public static final int TIPOS=9;
	public static final int T_ABRECHAVE=10;
	public static final int T_ABRECOLCHETE=11;
	public static final int T_ABREPARENTESES=12;
	public static final int T_ATRIBUICAO=13;
	public static final int T_BREAK=14;
	public static final int T_COMPARACAO=15;
	public static final int T_DEF=16;
	public static final int T_DIFERENTE=17;
	public static final int T_DIVISAO=18;
	public static final int T_E=19;
	public static final int T_ELSE=20;
	public static final int T_ESCREVA=21;
	public static final int T_FECHACHAVE=22;
	public static final int T_FECHACOLCHETE=23;
	public static final int T_FECHAPARENTESES=24;
	public static final int T_FOR=25;
	public static final int T_IF=26;
	public static final int T_MAIOR=27;
	public static final int T_MAIOROUIGUAL=28;
	public static final int T_MENOR=29;
	public static final int T_MENOROUIGUAL=30;
	public static final int T_MULTIPLICACAO=31;
	public static final int T_OU=32;
	public static final int T_READ=33;
	public static final int T_RETURN=34;
	public static final int T_SOMA=35;
	public static final int T_SUBTRACAO=36;
	public static final int T_VIRGULA=37;
	public static final int WHITESPACE=38;

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
	@Override public String getGrammarFileName() { return "Hello.g"; }

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hello.g:2:5: ( ';' )
			// Hello.g:2:7: ';'
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
			// Hello.g:3:13: ( '{' )
			// Hello.g:3:15: '{'
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
			// Hello.g:4:16: ( '[' )
			// Hello.g:4:18: '['
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
			// Hello.g:5:18: ( '(' )
			// Hello.g:5:20: '('
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
			// Hello.g:6:14: ( '=' )
			// Hello.g:6:16: '='
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
			// Hello.g:7:9: ( 'break' )
			// Hello.g:7:11: 'break'
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
			// Hello.g:8:14: ( '==' )
			// Hello.g:8:16: '=='
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
			// Hello.g:9:7: ( 'def' )
			// Hello.g:9:9: 'def'
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
			// Hello.g:10:13: ( '!=' )
			// Hello.g:10:15: '!='
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
			// Hello.g:11:11: ( '/' )
			// Hello.g:11:13: '/'
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
			// Hello.g:12:5: ( '&' )
			// Hello.g:12:7: '&'
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
			// Hello.g:13:8: ( 'else' )
			// Hello.g:13:10: 'else'
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

	// $ANTLR start "T_ESCREVA"
	public final void mT_ESCREVA() throws RecognitionException {
		try {
			int _type = T_ESCREVA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hello.g:14:11: ( 'print' )
			// Hello.g:14:13: 'print'
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
			// Hello.g:15:14: ( '}' )
			// Hello.g:15:16: '}'
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
			// Hello.g:16:17: ( ']' )
			// Hello.g:16:19: ']'
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
			// Hello.g:17:19: ( ')' )
			// Hello.g:17:21: ')'
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
			// Hello.g:18:7: ( 'for' )
			// Hello.g:18:9: 'for'
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
			// Hello.g:19:6: ( 'if' )
			// Hello.g:19:8: 'if'
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
			// Hello.g:20:9: ( '>' )
			// Hello.g:20:11: '>'
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
			// Hello.g:21:16: ( '>=' )
			// Hello.g:21:18: '>='
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
			// Hello.g:22:9: ( '<' )
			// Hello.g:22:11: '<'
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
			// Hello.g:23:16: ( '<=' )
			// Hello.g:23:18: '<='
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
			// Hello.g:24:17: ( '*' )
			// Hello.g:24:19: '*'
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
			// Hello.g:25:6: ( '|' )
			// Hello.g:25:8: '|'
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
			// Hello.g:26:8: ( 'read' )
			// Hello.g:26:10: 'read'
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
			// Hello.g:27:10: ( 'return' )
			// Hello.g:27:12: 'return'
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
			// Hello.g:28:8: ( '+' )
			// Hello.g:28:10: '+'
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
			// Hello.g:29:13: ( '-' )
			// Hello.g:29:15: '-'
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
			// Hello.g:30:11: ( ',' )
			// Hello.g:30:13: ','
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
			// Hello.g:276:2: ( ( 'int' | 'float' | 'string' ) )
			// Hello.g:276:4: ( 'int' | 'float' | 'string' )
			{
			// Hello.g:276:4: ( 'int' | 'float' | 'string' )
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
					// Hello.g:276:5: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// Hello.g:276:13: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// Hello.g:276:23: 'string'
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
			// Hello.g:280:2: ( 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' )* )
			// Hello.g:280:4: 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// Hello.g:280:15: ( 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Hello.g:
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
			// Hello.g:284:2: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' )+ )
			// Hello.g:284:4: ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' )+
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Hello.g:284:17: ( 'a' .. 'z' | '0' .. '9' | '_' )+
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
					// Hello.g:
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
			// Hello.g:288:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' )? '\"' )
			// Hello.g:288:4: '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' )? '\"'
			{
			match('\"'); 
			// Hello.g:288:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ' ' && LA4_0 <= '!')||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Hello.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

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
			// Hello.g:292:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// Hello.g:292:4: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// Hello.g:292:4: ( '0' .. '9' )+
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
					// Hello.g:
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

			// Hello.g:292:18: ( '.' ( '0' .. '9' )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='.') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Hello.g:292:20: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// Hello.g:292:24: ( '0' .. '9' )+
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
							// Hello.g:
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

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Hello.g:296:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// Hello.g:296:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// Hello.g:296:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
					// Hello.g:
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
	// $ANTLR end "WHITESPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// Hello.g:1:8: ( EOL | T_ABRECHAVE | T_ABRECOLCHETE | T_ABREPARENTESES | T_ATRIBUICAO | T_BREAK | T_COMPARACAO | T_DEF | T_DIFERENTE | T_DIVISAO | T_E | T_ELSE | T_ESCREVA | T_FECHACHAVE | T_FECHACOLCHETE | T_FECHAPARENTESES | T_FOR | T_IF | T_MAIOR | T_MAIOROUIGUAL | T_MENOR | T_MENOROUIGUAL | T_MULTIPLICACAO | T_OU | T_READ | T_RETURN | T_SOMA | T_SUBTRACAO | T_VIRGULA | TIPOS | ID | FUNCAO | TEXTO | NUMERO | WHITESPACE )
		int alt9=35;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// Hello.g:1:10: EOL
				{
				mEOL(); 

				}
				break;
			case 2 :
				// Hello.g:1:14: T_ABRECHAVE
				{
				mT_ABRECHAVE(); 

				}
				break;
			case 3 :
				// Hello.g:1:26: T_ABRECOLCHETE
				{
				mT_ABRECOLCHETE(); 

				}
				break;
			case 4 :
				// Hello.g:1:41: T_ABREPARENTESES
				{
				mT_ABREPARENTESES(); 

				}
				break;
			case 5 :
				// Hello.g:1:58: T_ATRIBUICAO
				{
				mT_ATRIBUICAO(); 

				}
				break;
			case 6 :
				// Hello.g:1:71: T_BREAK
				{
				mT_BREAK(); 

				}
				break;
			case 7 :
				// Hello.g:1:79: T_COMPARACAO
				{
				mT_COMPARACAO(); 

				}
				break;
			case 8 :
				// Hello.g:1:92: T_DEF
				{
				mT_DEF(); 

				}
				break;
			case 9 :
				// Hello.g:1:98: T_DIFERENTE
				{
				mT_DIFERENTE(); 

				}
				break;
			case 10 :
				// Hello.g:1:110: T_DIVISAO
				{
				mT_DIVISAO(); 

				}
				break;
			case 11 :
				// Hello.g:1:120: T_E
				{
				mT_E(); 

				}
				break;
			case 12 :
				// Hello.g:1:124: T_ELSE
				{
				mT_ELSE(); 

				}
				break;
			case 13 :
				// Hello.g:1:131: T_ESCREVA
				{
				mT_ESCREVA(); 

				}
				break;
			case 14 :
				// Hello.g:1:141: T_FECHACHAVE
				{
				mT_FECHACHAVE(); 

				}
				break;
			case 15 :
				// Hello.g:1:154: T_FECHACOLCHETE
				{
				mT_FECHACOLCHETE(); 

				}
				break;
			case 16 :
				// Hello.g:1:170: T_FECHAPARENTESES
				{
				mT_FECHAPARENTESES(); 

				}
				break;
			case 17 :
				// Hello.g:1:188: T_FOR
				{
				mT_FOR(); 

				}
				break;
			case 18 :
				// Hello.g:1:194: T_IF
				{
				mT_IF(); 

				}
				break;
			case 19 :
				// Hello.g:1:199: T_MAIOR
				{
				mT_MAIOR(); 

				}
				break;
			case 20 :
				// Hello.g:1:207: T_MAIOROUIGUAL
				{
				mT_MAIOROUIGUAL(); 

				}
				break;
			case 21 :
				// Hello.g:1:222: T_MENOR
				{
				mT_MENOR(); 

				}
				break;
			case 22 :
				// Hello.g:1:230: T_MENOROUIGUAL
				{
				mT_MENOROUIGUAL(); 

				}
				break;
			case 23 :
				// Hello.g:1:245: T_MULTIPLICACAO
				{
				mT_MULTIPLICACAO(); 

				}
				break;
			case 24 :
				// Hello.g:1:261: T_OU
				{
				mT_OU(); 

				}
				break;
			case 25 :
				// Hello.g:1:266: T_READ
				{
				mT_READ(); 

				}
				break;
			case 26 :
				// Hello.g:1:273: T_RETURN
				{
				mT_RETURN(); 

				}
				break;
			case 27 :
				// Hello.g:1:282: T_SOMA
				{
				mT_SOMA(); 

				}
				break;
			case 28 :
				// Hello.g:1:289: T_SUBTRACAO
				{
				mT_SUBTRACAO(); 

				}
				break;
			case 29 :
				// Hello.g:1:301: T_VIRGULA
				{
				mT_VIRGULA(); 

				}
				break;
			case 30 :
				// Hello.g:1:311: TIPOS
				{
				mTIPOS(); 

				}
				break;
			case 31 :
				// Hello.g:1:317: ID
				{
				mID(); 

				}
				break;
			case 32 :
				// Hello.g:1:320: FUNCAO
				{
				mFUNCAO(); 

				}
				break;
			case 33 :
				// Hello.g:1:327: TEXTO
				{
				mTEXTO(); 

				}
				break;
			case 34 :
				// Hello.g:1:333: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 35 :
				// Hello.g:1:340: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\5\uffff\1\41\14\uffff\1\53\1\55\16\uffff\6\34\1\66\1\34\4\uffff\3\34"+
		"\1\74\2\34\1\77\1\34\1\uffff\1\101\4\34\1\uffff\1\106\1\34\1\uffff\1\34"+
		"\1\uffff\1\111\2\34\1\114\1\uffff\1\115\1\101\1\uffff\2\34\2\uffff\1\120"+
		"\1\101\1\uffff";
	static final String DFA9_eofS =
		"\121\uffff";
	static final String DFA9_minS =
		"\1\11\4\uffff\1\75\2\60\3\uffff\2\60\3\uffff\2\60\2\75\2\uffff\1\60\3"+
		"\uffff\1\60\7\uffff\1\145\1\146\1\163\1\151\1\162\1\157\1\60\1\164\4\uffff"+
		"\1\141\1\162\1\141\1\60\1\145\1\156\1\60\1\141\1\uffff\1\60\1\144\1\165"+
		"\1\151\1\153\1\uffff\1\60\1\164\1\uffff\1\164\1\uffff\1\60\1\162\1\156"+
		"\1\60\1\uffff\2\60\1\uffff\1\156\1\147\2\uffff\2\60\1\uffff";
	static final String DFA9_maxS =
		"\1\175\4\uffff\1\75\2\172\3\uffff\2\172\3\uffff\2\172\2\75\2\uffff\1\172"+
		"\3\uffff\1\172\7\uffff\1\145\1\146\1\163\1\151\1\162\1\157\1\172\1\164"+
		"\4\uffff\1\164\1\162\1\141\1\172\1\145\1\156\1\172\1\141\1\uffff\1\172"+
		"\1\144\1\165\1\151\1\153\1\uffff\1\172\1\164\1\uffff\1\164\1\uffff\1\172"+
		"\1\162\1\156\1\172\1\uffff\2\172\1\uffff\1\156\1\147\2\uffff\2\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\11\1\12\1\13\2\uffff\1\16\1\17\1\20"+
		"\4\uffff\1\27\1\30\1\uffff\1\33\1\34\1\35\1\uffff\1\37\1\40\1\41\1\42"+
		"\1\43\1\7\1\5\10\uffff\1\24\1\23\1\26\1\25\10\uffff\1\22\5\uffff\1\10"+
		"\2\uffff\1\21\1\uffff\1\36\4\uffff\1\14\2\uffff\1\31\2\uffff\1\6\1\15"+
		"\2\uffff\1\32";
	static final String DFA9_specialS =
		"\121\uffff}>";
	static final String[] DFA9_transitionS = {
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
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\13\34\1\44\16\34",
			"\12\34\45\uffff\1\34\1\uffff\21\34\1\45\10\34",
			"",
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\13\34\1\47\2\34\1\46\13\34",
			"\12\34\45\uffff\1\34\1\uffff\5\34\1\50\7\34\1\51\14\34",
			"\1\52",
			"\1\54",
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\4\34\1\56\25\34",
			"",
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\23\34\1\57\6\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\67",
			"",
			"",
			"",
			"",
			"\1\70\22\uffff\1\71",
			"\1\72",
			"\1\73",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\75",
			"\1\76",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\100",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\107",
			"",
			"\1\110",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\1\112",
			"\1\113",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"",
			"\1\116",
			"\1\117",
			"",
			"",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			"\12\34\45\uffff\1\34\1\uffff\32\34",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EOL | T_ABRECHAVE | T_ABRECOLCHETE | T_ABREPARENTESES | T_ATRIBUICAO | T_BREAK | T_COMPARACAO | T_DEF | T_DIFERENTE | T_DIVISAO | T_E | T_ELSE | T_ESCREVA | T_FECHACHAVE | T_FECHACOLCHETE | T_FECHAPARENTESES | T_FOR | T_IF | T_MAIOR | T_MAIOROUIGUAL | T_MENOR | T_MENOROUIGUAL | T_MULTIPLICACAO | T_OU | T_READ | T_RETURN | T_SOMA | T_SUBTRACAO | T_VIRGULA | TIPOS | ID | FUNCAO | TEXTO | NUMERO | WHITESPACE );";
		}
	}

}
