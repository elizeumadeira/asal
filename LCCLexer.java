// $ANTLR 3.5.2 LCC.g 2022-03-04 20:52:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LCCLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMENTARIO=4;
	public static final int EOL=5;
	public static final int ESPACO_BRANCO=6;
	public static final int FUNCAO=7;
	public static final int ID=8;
	public static final int NUMERO=9;
	public static final int TEXTO=10;
	public static final int T_ABRECHAVE=11;
	public static final int T_ABRECOLCHETE=12;
	public static final int T_ABREPARENTESES=13;
	public static final int T_ATRIBUICAO=14;
	public static final int T_BREAK=15;
	public static final int T_DEF=16;
	public static final int T_DIFERENTE=17;
	public static final int T_DIVISAO=18;
	public static final int T_ELSE=19;
	public static final int T_FECHACHAVE=20;
	public static final int T_FECHACOLCHETE=21;
	public static final int T_FECHAPARENTESES=22;
	public static final int T_FLOAT=23;
	public static final int T_FOR=24;
	public static final int T_IF=25;
	public static final int T_IGUAL=26;
	public static final int T_INT=27;
	public static final int T_MAIOR=28;
	public static final int T_MAIOROUIGUAL=29;
	public static final int T_MENOR=30;
	public static final int T_MENOROUIGUAL=31;
	public static final int T_MULTIPLICACAO=32;
	public static final int T_NEW=33;
	public static final int T_NULL=34;
	public static final int T_READ=35;
	public static final int T_RETURN=36;
	public static final int T_SOMA=37;
	public static final int T_STRING=38;
	public static final int T_SUBTRACAO=39;
	public static final int T_VIRGULA=40;
	public static final int T_WRITE=41;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LCCLexer() {} 
	public LCCLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LCCLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "LCC.g"; }

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:2:5: ( ';' )
			// LCC.g:2:7: ';'
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
			// LCC.g:3:13: ( '{' )
			// LCC.g:3:15: '{'
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
			// LCC.g:4:16: ( '[' )
			// LCC.g:4:18: '['
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
			// LCC.g:5:18: ( '(' )
			// LCC.g:5:20: '('
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
			// LCC.g:6:14: ( '=' )
			// LCC.g:6:16: '='
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
			// LCC.g:7:9: ( 'break' )
			// LCC.g:7:11: 'break'
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

	// $ANTLR start "T_DEF"
	public final void mT_DEF() throws RecognitionException {
		try {
			int _type = T_DEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:8:7: ( 'def' )
			// LCC.g:8:9: 'def'
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
			// LCC.g:9:13: ( '!=' )
			// LCC.g:9:15: '!='
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
			// LCC.g:10:11: ( '/' )
			// LCC.g:10:13: '/'
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

	// $ANTLR start "T_ELSE"
	public final void mT_ELSE() throws RecognitionException {
		try {
			int _type = T_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:11:8: ( 'else' )
			// LCC.g:11:10: 'else'
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

	// $ANTLR start "T_FECHACHAVE"
	public final void mT_FECHACHAVE() throws RecognitionException {
		try {
			int _type = T_FECHACHAVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:12:14: ( '}' )
			// LCC.g:12:16: '}'
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
			// LCC.g:13:17: ( ']' )
			// LCC.g:13:19: ']'
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
			// LCC.g:14:19: ( ')' )
			// LCC.g:14:21: ')'
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

	// $ANTLR start "T_FLOAT"
	public final void mT_FLOAT() throws RecognitionException {
		try {
			int _type = T_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:15:9: ( 'float' )
			// LCC.g:15:11: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_FLOAT"

	// $ANTLR start "T_FOR"
	public final void mT_FOR() throws RecognitionException {
		try {
			int _type = T_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:16:7: ( 'for' )
			// LCC.g:16:9: 'for'
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
			// LCC.g:17:6: ( 'if' )
			// LCC.g:17:8: 'if'
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

	// $ANTLR start "T_IGUAL"
	public final void mT_IGUAL() throws RecognitionException {
		try {
			int _type = T_IGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:18:9: ( '==' )
			// LCC.g:18:11: '=='
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
	// $ANTLR end "T_IGUAL"

	// $ANTLR start "T_INT"
	public final void mT_INT() throws RecognitionException {
		try {
			int _type = T_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:19:7: ( 'int' )
			// LCC.g:19:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_INT"

	// $ANTLR start "T_MAIOR"
	public final void mT_MAIOR() throws RecognitionException {
		try {
			int _type = T_MAIOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:20:9: ( '>' )
			// LCC.g:20:11: '>'
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
			// LCC.g:21:16: ( '>=' )
			// LCC.g:21:18: '>='
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
			// LCC.g:22:9: ( '<' )
			// LCC.g:22:11: '<'
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
			// LCC.g:23:16: ( '<=' )
			// LCC.g:23:18: '<='
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
			// LCC.g:24:17: ( '*' )
			// LCC.g:24:19: '*'
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

	// $ANTLR start "T_NEW"
	public final void mT_NEW() throws RecognitionException {
		try {
			int _type = T_NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:25:7: ( 'new' )
			// LCC.g:25:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_NEW"

	// $ANTLR start "T_NULL"
	public final void mT_NULL() throws RecognitionException {
		try {
			int _type = T_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:26:8: ( 'null' )
			// LCC.g:26:10: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_NULL"

	// $ANTLR start "T_READ"
	public final void mT_READ() throws RecognitionException {
		try {
			int _type = T_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:27:8: ( 'read' )
			// LCC.g:27:10: 'read'
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
			// LCC.g:28:10: ( 'return' )
			// LCC.g:28:12: 'return'
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
			// LCC.g:29:8: ( '+' )
			// LCC.g:29:10: '+'
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

	// $ANTLR start "T_STRING"
	public final void mT_STRING() throws RecognitionException {
		try {
			int _type = T_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:30:10: ( 'string' )
			// LCC.g:30:12: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_STRING"

	// $ANTLR start "T_SUBTRACAO"
	public final void mT_SUBTRACAO() throws RecognitionException {
		try {
			int _type = T_SUBTRACAO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:31:13: ( '-' )
			// LCC.g:31:15: '-'
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
			// LCC.g:32:11: ( ',' )
			// LCC.g:32:13: ','
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

	// $ANTLR start "T_WRITE"
	public final void mT_WRITE() throws RecognitionException {
		try {
			int _type = T_WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:33:9: ( 'print' )
			// LCC.g:33:11: 'print'
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
	// $ANTLR end "T_WRITE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// LCC.g:396:2: ( 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' )* )
			// LCC.g:396:4: 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// LCC.g:396:15: ( 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// LCC.g:
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
					break loop1;
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
			// LCC.g:400:2: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' )+ )
			// LCC.g:400:4: ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' )+
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// LCC.g:400:17: ( 'a' .. 'z' | '0' .. '9' | '_' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// LCC.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// LCC.g:404:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' | '_' | '-' )* '\"' )
			// LCC.g:404:4: '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' | '_' | '-' )* '\"'
			{
			match('\"'); 
			// LCC.g:404:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ' ' | '!' | '_' | '-' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= ' ' && LA3_0 <= '!')||LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// LCC.g:
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
					break loop3;
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
			// LCC.g:408:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// LCC.g:408:4: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// LCC.g:408:4: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// LCC.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			// LCC.g:408:18: ( '.' ( '0' .. '9' )+ )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='.') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// LCC.g:408:20: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// LCC.g:408:24: ( '0' .. '9' )+
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
							// LCC.g:
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
			// LCC.g:412:2: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
			// LCC.g:412:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			{
			// LCC.g:412:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// LCC.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
			// LCC.g:416:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// LCC.g:416:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// LCC.g:416:12: (~ ( '\\n' | '\\r' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// LCC.g:
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
					break loop8;
				}
			}

			// LCC.g:416:26: ( '\\r' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\r') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// LCC.g:416:26: '\\r'
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
		// LCC.g:1:8: ( EOL | T_ABRECHAVE | T_ABRECOLCHETE | T_ABREPARENTESES | T_ATRIBUICAO | T_BREAK | T_DEF | T_DIFERENTE | T_DIVISAO | T_ELSE | T_FECHACHAVE | T_FECHACOLCHETE | T_FECHAPARENTESES | T_FLOAT | T_FOR | T_IF | T_IGUAL | T_INT | T_MAIOR | T_MAIOROUIGUAL | T_MENOR | T_MENOROUIGUAL | T_MULTIPLICACAO | T_NEW | T_NULL | T_READ | T_RETURN | T_SOMA | T_STRING | T_SUBTRACAO | T_VIRGULA | T_WRITE | ID | FUNCAO | TEXTO | NUMERO | ESPACO_BRANCO | COMENTARIO )
		int alt10=38;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// LCC.g:1:10: EOL
				{
				mEOL(); 

				}
				break;
			case 2 :
				// LCC.g:1:14: T_ABRECHAVE
				{
				mT_ABRECHAVE(); 

				}
				break;
			case 3 :
				// LCC.g:1:26: T_ABRECOLCHETE
				{
				mT_ABRECOLCHETE(); 

				}
				break;
			case 4 :
				// LCC.g:1:41: T_ABREPARENTESES
				{
				mT_ABREPARENTESES(); 

				}
				break;
			case 5 :
				// LCC.g:1:58: T_ATRIBUICAO
				{
				mT_ATRIBUICAO(); 

				}
				break;
			case 6 :
				// LCC.g:1:71: T_BREAK
				{
				mT_BREAK(); 

				}
				break;
			case 7 :
				// LCC.g:1:79: T_DEF
				{
				mT_DEF(); 

				}
				break;
			case 8 :
				// LCC.g:1:85: T_DIFERENTE
				{
				mT_DIFERENTE(); 

				}
				break;
			case 9 :
				// LCC.g:1:97: T_DIVISAO
				{
				mT_DIVISAO(); 

				}
				break;
			case 10 :
				// LCC.g:1:107: T_ELSE
				{
				mT_ELSE(); 

				}
				break;
			case 11 :
				// LCC.g:1:114: T_FECHACHAVE
				{
				mT_FECHACHAVE(); 

				}
				break;
			case 12 :
				// LCC.g:1:127: T_FECHACOLCHETE
				{
				mT_FECHACOLCHETE(); 

				}
				break;
			case 13 :
				// LCC.g:1:143: T_FECHAPARENTESES
				{
				mT_FECHAPARENTESES(); 

				}
				break;
			case 14 :
				// LCC.g:1:161: T_FLOAT
				{
				mT_FLOAT(); 

				}
				break;
			case 15 :
				// LCC.g:1:169: T_FOR
				{
				mT_FOR(); 

				}
				break;
			case 16 :
				// LCC.g:1:175: T_IF
				{
				mT_IF(); 

				}
				break;
			case 17 :
				// LCC.g:1:180: T_IGUAL
				{
				mT_IGUAL(); 

				}
				break;
			case 18 :
				// LCC.g:1:188: T_INT
				{
				mT_INT(); 

				}
				break;
			case 19 :
				// LCC.g:1:194: T_MAIOR
				{
				mT_MAIOR(); 

				}
				break;
			case 20 :
				// LCC.g:1:202: T_MAIOROUIGUAL
				{
				mT_MAIOROUIGUAL(); 

				}
				break;
			case 21 :
				// LCC.g:1:217: T_MENOR
				{
				mT_MENOR(); 

				}
				break;
			case 22 :
				// LCC.g:1:225: T_MENOROUIGUAL
				{
				mT_MENOROUIGUAL(); 

				}
				break;
			case 23 :
				// LCC.g:1:240: T_MULTIPLICACAO
				{
				mT_MULTIPLICACAO(); 

				}
				break;
			case 24 :
				// LCC.g:1:256: T_NEW
				{
				mT_NEW(); 

				}
				break;
			case 25 :
				// LCC.g:1:262: T_NULL
				{
				mT_NULL(); 

				}
				break;
			case 26 :
				// LCC.g:1:269: T_READ
				{
				mT_READ(); 

				}
				break;
			case 27 :
				// LCC.g:1:276: T_RETURN
				{
				mT_RETURN(); 

				}
				break;
			case 28 :
				// LCC.g:1:285: T_SOMA
				{
				mT_SOMA(); 

				}
				break;
			case 29 :
				// LCC.g:1:292: T_STRING
				{
				mT_STRING(); 

				}
				break;
			case 30 :
				// LCC.g:1:301: T_SUBTRACAO
				{
				mT_SUBTRACAO(); 

				}
				break;
			case 31 :
				// LCC.g:1:313: T_VIRGULA
				{
				mT_VIRGULA(); 

				}
				break;
			case 32 :
				// LCC.g:1:323: T_WRITE
				{
				mT_WRITE(); 

				}
				break;
			case 33 :
				// LCC.g:1:331: ID
				{
				mID(); 

				}
				break;
			case 34 :
				// LCC.g:1:334: FUNCAO
				{
				mFUNCAO(); 

				}
				break;
			case 35 :
				// LCC.g:1:341: TEXTO
				{
				mTEXTO(); 

				}
				break;
			case 36 :
				// LCC.g:1:347: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 37 :
				// LCC.g:1:354: ESPACO_BRANCO
				{
				mESPACO_BRANCO(); 

				}
				break;
			case 38 :
				// LCC.g:1:368: COMENTARIO
				{
				mCOMENTARIO(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\5\uffff\1\40\3\uffff\1\44\6\uffff\1\53\1\55\17\uffff\2\33\2\uffff\3\33"+
		"\1\70\1\33\4\uffff\6\33\1\101\2\33\1\104\1\uffff\1\105\1\106\6\33\1\uffff"+
		"\1\115\1\33\3\uffff\1\117\1\120\3\33\1\124\1\uffff\1\125\2\uffff\2\33"+
		"\1\130\2\uffff\1\131\1\132\3\uffff";
	static final String DFA10_eofS =
		"\133\uffff";
	static final String DFA10_minS =
		"\1\11\4\uffff\1\75\2\60\1\uffff\1\57\1\60\3\uffff\2\60\2\75\1\uffff\2"+
		"\60\1\uffff\1\60\2\uffff\1\60\7\uffff\1\145\1\146\2\uffff\1\163\1\157"+
		"\1\162\1\60\1\164\4\uffff\1\167\1\154\1\141\1\162\1\151\1\141\1\60\1\145"+
		"\1\141\1\60\1\uffff\2\60\1\154\1\144\1\165\1\151\1\156\1\153\1\uffff\1"+
		"\60\1\164\3\uffff\2\60\1\162\1\156\1\164\1\60\1\uffff\1\60\2\uffff\1\156"+
		"\1\147\1\60\2\uffff\2\60\3\uffff";
	static final String DFA10_maxS =
		"\1\175\4\uffff\1\75\2\172\1\uffff\1\57\1\172\3\uffff\2\172\2\75\1\uffff"+
		"\2\172\1\uffff\1\172\2\uffff\1\172\7\uffff\1\145\1\146\2\uffff\1\163\1"+
		"\157\1\162\1\172\1\164\4\uffff\1\167\1\154\1\164\1\162\1\151\1\141\1\172"+
		"\1\145\1\141\1\172\1\uffff\2\172\1\154\1\144\1\165\1\151\1\156\1\153\1"+
		"\uffff\1\172\1\164\3\uffff\2\172\1\162\1\156\1\164\1\172\1\uffff\1\172"+
		"\2\uffff\1\156\1\147\1\172\2\uffff\2\172\3\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\10\2\uffff\1\13\1\14\1\15\4\uffff\1"+
		"\27\2\uffff\1\34\1\uffff\1\36\1\37\1\uffff\1\41\1\42\1\43\1\44\1\45\1"+
		"\21\1\5\2\uffff\1\46\1\11\5\uffff\1\24\1\23\1\26\1\25\12\uffff\1\20\10"+
		"\uffff\1\7\2\uffff\1\17\1\22\1\30\6\uffff\1\12\1\uffff\1\31\1\32\3\uffff"+
		"\1\6\1\16\2\uffff\1\40\1\33\1\35";
	static final String DFA10_specialS =
		"\133\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\10\1\34\5\uffff\1\4\1\15\1\22\1\25"+
			"\1\30\1\27\1\uffff\1\11\12\35\1\uffff\1\1\1\21\1\5\1\20\2\uffff\32\32"+
			"\1\3\1\uffff\1\14\3\uffff\1\33\1\6\1\33\1\7\1\12\1\16\2\33\1\17\4\33"+
			"\1\23\1\33\1\31\1\33\1\24\1\26\7\33\1\2\1\uffff\1\13",
			"",
			"",
			"",
			"",
			"\1\37",
			"\12\33\45\uffff\1\33\1\uffff\21\33\1\41\10\33",
			"\12\33\45\uffff\1\33\1\uffff\4\33\1\42\25\33",
			"",
			"\1\43",
			"\12\33\45\uffff\1\33\1\uffff\13\33\1\45\16\33",
			"",
			"",
			"",
			"\12\33\45\uffff\1\33\1\uffff\13\33\1\46\2\33\1\47\13\33",
			"\12\33\45\uffff\1\33\1\uffff\5\33\1\50\7\33\1\51\14\33",
			"\1\52",
			"\1\54",
			"",
			"\12\33\45\uffff\1\33\1\uffff\4\33\1\56\17\33\1\57\5\33",
			"\12\33\45\uffff\1\33\1\uffff\4\33\1\60\25\33",
			"",
			"\12\33\45\uffff\1\33\1\uffff\23\33\1\61\6\33",
			"",
			"",
			"\12\33\45\uffff\1\33\1\uffff\21\33\1\62\10\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
			"\1\64",
			"",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\1\71",
			"",
			"",
			"",
			"",
			"\1\72",
			"\1\73",
			"\1\74\22\uffff\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\1\102",
			"\1\103",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\1\116",
			"",
			"",
			"",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\1\121",
			"\1\122",
			"\1\123",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"\1\126",
			"\1\127",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"\12\33\45\uffff\1\33\1\uffff\32\33",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EOL | T_ABRECHAVE | T_ABRECOLCHETE | T_ABREPARENTESES | T_ATRIBUICAO | T_BREAK | T_DEF | T_DIFERENTE | T_DIVISAO | T_ELSE | T_FECHACHAVE | T_FECHACOLCHETE | T_FECHAPARENTESES | T_FLOAT | T_FOR | T_IF | T_IGUAL | T_INT | T_MAIOR | T_MAIOROUIGUAL | T_MENOR | T_MENOROUIGUAL | T_MULTIPLICACAO | T_NEW | T_NULL | T_READ | T_RETURN | T_SOMA | T_STRING | T_SUBTRACAO | T_VIRGULA | T_WRITE | ID | FUNCAO | TEXTO | NUMERO | ESPACO_BRANCO | COMENTARIO );";
		}
	}

}
