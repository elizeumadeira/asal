// $ANTLR 3.5.2 LCC.g 2022-03-06 18:42:48

	import java.util.Set;
	import java.util.HashSet;
	import java.io.PrintWriter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class LCCParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMENTARIO", "EOL", "ESPACO_BRANCO", 
		"FUNCAO", "ID", "NUMERO", "TEXTO", "T_ABRECHAVE", "T_ABRECOLCHETE", "T_ABREPARENTESES", 
		"T_ATRIBUICAO", "T_BREAK", "T_DEF", "T_DIFERENTE", "T_DIVISAO", "T_ELSE", 
		"T_FECHACHAVE", "T_FECHACOLCHETE", "T_FECHAPARENTESES", "T_FLOAT", "T_FOR", 
		"T_IF", "T_IGUAL", "T_INT", "T_MAIOR", "T_MAIOROUIGUAL", "T_MENOR", "T_MENOROUIGUAL", 
		"T_MULTIPLICACAO", "T_NEW", "T_NULL", "T_READ", "T_RETURN", "T_SOMA", 
		"T_STRING", "T_SUBTRACAO", "T_VIRGULA", "T_WRITE"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LCCParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LCCParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LCCParser.tokenNames; }
	@Override public String getGrammarFileName() { return "LCC.g"; }


		java.util.HashMap<String, String> mapaVar = new java.util.HashMap<String, String>();;
	        java.util.HashMap<String, String> mapaFuncaoVar = new java.util.HashMap<String, String>();;
	        String ultTipo = "";
	        String ultFuncao = "";

		java.util.HashMap<String, LinguagemToken> mapa = new java.util.HashMap<String, LinguagemToken>();
		
		public void adicionaToken(Token token){
	                LinguagemToken tempToken = new LinguagemToken(ultFuncao, token.getText(), ultTipo);
	                if(mapa.get(tempToken.toString()) == null){
	                        mapa.put(tempToken.toString(), tempToken);
	                        System.out.println("Token "+ token.getText() + " adicionado: " + token.toString() + " / Tipo: "+ ultTipo + " / Funcao: " + ultFuncao);
	                        ultTipo = "";
	                } else{
	                        throw new RuntimeException("ID '"+token.getText()+"' ja foi declarado. Erro em " + token.getLine()+":");
	                } 
	        } 
	        
	        public void verificaToken(Token token){
	                // if(mapaVar.get(token.getText()) == null){
	                //         throw new RuntimeException("ID '"+token.getText()+"' nao declarado em "+ token.getLine()+":"+ token.getColumn());
	                // } 
	                LinguagemToken tempToken = new LinguagemToken(ultFuncao, token.getText(), ultTipo);

	                // System.out.println("TempToken: " + tempToken.toString());
	                // escreveMapa();
					// System.out.println(tempToken.toString() + " " + token.getText());
	                if(mapa.get(tempToken.toString()) == null){
	                        throw new RuntimeException("ID '"+token.getText()+"' nao declarado em "+ token.getLine() + " / Funcao: " + ultFuncao);
	                } 
	        } 

	        public void adicionaFuncao(Token token){
					System.out.println("Funcao "+token.getText());
	                
					if(mapaFuncaoVar.get(token.getText()) == null){
	                        mapaFuncaoVar.put(token.getText(), token.getText());
	                        setUltFuncao(token.getText());
	                } else{
	                        throw new RuntimeException("Funcao '"+token.getText()+"' ja foi declarado. Erro em "+ token.getLine());
	                } 
	        } 

	        public void verificaFuncao(Token token){
	                if(mapaFuncaoVar.get(token.getText()) == null){
	                        throw new RuntimeException("Funcao '"+token.getText()+"' nao declarado em "+ token.getLine());
	                } 
	        } 

	        public void setUltTipo(String tipo){
	                ultTipo = tipo;
	        } 

	        public void setUltFuncao(String funcao){
	                ultFuncao = funcao;
	        } 

	        public void escreveMapa(){
	                System.out.println("Mapa de tokens\n");
	                for (java.util.Map.Entry<String,LinguagemToken> entry : mapa.entrySet()){
	                        System.out.println(entry.toString());
	                } 
	        } 

			public String getLinhaTabela(String linha, String token, String tipo, String funcao, String valor){
				int length = 15;
				String celula = new String(new char[length]).replace('\0', ' ');
				String separador = " | ";
				// String space10 = new String(new char[length]).replace('\0', ' ');

				return 
					(linha + celula).substring(0, length) + separador +
					(token + celula).substring(0, length) + separador +
					(tipo + celula).substring(0, length) + separador +
					(funcao + celula).substring(0, length) + separador +
					(valor + celula).substring(0, length) + separador
					;
			} 
		
	    public static void main(String[] args) throws Exception {
	        LCCLexer lex = new LCCLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	 
	        LCCParser parser = new LCCParser(tokens);
	 
	        try {
	            parser.program();

				System.out.println("tokens.size " + tokens.size());
				String ultTipo = "";
				String ultFuncao = "";
				String linha = parser.getLinhaTabela(
					"LINHA",
					"TOKEN",
					"TIPO",
					"FUNCAO",
					"VALOR"
				);

				// System.out.println(linha);
				PrintWriter writer;
				writer = new PrintWriter("Tabela de tokens " + args[0] + ".txt", "UTF-8");
				writer.println(linha);
				for (int i = 0; i < tokens.size(); i++) {
					Token token = tokens.get(i);
					if (token.getChannel() == parser.HIDDEN) {
						continue;
					} 

					if (token.getChannel() == parser.HIDDEN) {
						continue;
					} 
					
					if (token.getType() == -1 ) {
						continue;
					} 

					if (parser.tokenNames[token.getType()].equals("FUNCAO")) {
						ultFuncao = token.getText();
					} 

					// if (parser.tokenNames[token.getType()].equals("TIPOS")) {
					if (
						token.getText().equals("int") ||
						token.getText().equals("string") ||
						token.getText().equals("float")
					) {
						ultTipo = token.getText();
					} 

					// LinguagemToken tempToken = new LinguagemToken(ultFuncao, token.getText(), ultTipo);

					linha = parser.getLinhaTabela(
						token.getLine() + " ",
						parser.tokenNames[token.getType()],
						( parser.tokenNames[token.getType()].equals("ID") ?  ultTipo : "--"),
						( parser.tokenNames[token.getType()].equals("ID") ?  ultFuncao : "--"),
						token.getText()
					);
					writer.println(linha);
					// System.out.println(linha);
				} 
				writer.close();

	        } catch (RecognitionException e)  {
	            e.printStackTrace();
	        } catch (Exception e)  {
	            e.printStackTrace();
	        } 
	    } 



	// $ANTLR start "program"
	// LCC.g:265:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		try {
			// LCC.g:265:9: ( ( statement | funclist ) )
			// LCC.g:266:2: ( statement | funclist )
			{
			// LCC.g:266:2: ( statement | funclist )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==EOL||LA1_0==ID||LA1_0==T_ABRECHAVE||LA1_0==T_BREAK||(LA1_0 >= T_FLOAT && LA1_0 <= T_IF)||LA1_0==T_INT||(LA1_0 >= T_READ && LA1_0 <= T_RETURN)||LA1_0==T_STRING||LA1_0==T_WRITE) ) {
				alt1=1;
			}
			else if ( (LA1_0==T_DEF) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// LCC.g:266:4: statement
					{
					pushFollow(FOLLOW_statement_in_program627);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:266:16: funclist
					{
					pushFollow(FOLLOW_funclist_in_program631);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "funclist"
	// LCC.g:269:1: funclist : funcdef funclist_linha ;
	public final void funclist() throws RecognitionException {
		try {
			// LCC.g:269:10: ( funcdef funclist_linha )
			// LCC.g:269:12: funcdef funclist_linha
			{
			pushFollow(FOLLOW_funcdef_in_funclist643);
			funcdef();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_funclist_linha_in_funclist645);
			funclist_linha();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funclist"



	// $ANTLR start "funclist_linha"
	// LCC.g:272:1: funclist_linha : ( funclist |);
	public final void funclist_linha() throws RecognitionException {
		try {
			// LCC.g:273:2: ( funclist |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==T_DEF) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// LCC.g:273:4: funclist
					{
					pushFollow(FOLLOW_funclist_in_funclist_linha656);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:275:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funclist_linha"



	// $ANTLR start "funcdef"
	// LCC.g:277:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		try {
			// LCC.g:278:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			// LCC.g:278:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef673); if (state.failed) return;
			if ( state.backtracking==0 ) {adicionaFuncao(input.LT(1));}
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef677); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef679); if (state.failed) return;
			pushFollow(FOLLOW_paramlist_in_funcdef681);
			paramlist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef683); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef688); if (state.failed) return;
			pushFollow(FOLLOW_statelist_in_funcdef695);
			statelist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef699); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funcdef"



	// $ANTLR start "paramlist"
	// LCC.g:285:1: paramlist : ( ( T_INT | T_FLOAT | T_STRING ) ID paramlist_linha )? ;
	public final void paramlist() throws RecognitionException {
		try {
			// LCC.g:286:2: ( ( ( T_INT | T_FLOAT | T_STRING ) ID paramlist_linha )? )
			// LCC.g:286:4: ( ( T_INT | T_FLOAT | T_STRING ) ID paramlist_linha )?
			{
			// LCC.g:286:4: ( ( T_INT | T_FLOAT | T_STRING ) ID paramlist_linha )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==T_FLOAT||LA3_0==T_INT||LA3_0==T_STRING) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// LCC.g:286:6: ( T_INT | T_FLOAT | T_STRING ) ID paramlist_linha
					{
					if ( input.LA(1)==T_FLOAT||input.LA(1)==T_INT||input.LA(1)==T_STRING ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if ( state.backtracking==0 ) {adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist730); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_linha_in_paramlist732);
					paramlist_linha();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlist"



	// $ANTLR start "paramlist_linha"
	// LCC.g:289:1: paramlist_linha : ( T_VIRGULA paramlist |);
	public final void paramlist_linha() throws RecognitionException {
		try {
			// LCC.g:290:2: ( T_VIRGULA paramlist |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==T_VIRGULA) ) {
				alt4=1;
			}
			else if ( (LA4_0==EOF||LA4_0==T_FECHAPARENTESES) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// LCC.g:290:4: T_VIRGULA paramlist
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist_linha746); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_in_paramlist_linha748);
					paramlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:292:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlist_linha"



	// $ANTLR start "statelist"
	// LCC.g:294:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		try {
			// LCC.g:294:11: ( statement ( statelist )? )
			// LCC.g:294:13: statement ( statelist )?
			{
			pushFollow(FOLLOW_statement_in_statelist765);
			statement();
			state._fsp--;
			if (state.failed) return;
			// LCC.g:294:23: ( statelist )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EOL||LA5_0==ID||LA5_0==T_ABRECHAVE||LA5_0==T_BREAK||(LA5_0 >= T_FLOAT && LA5_0 <= T_IF)||LA5_0==T_INT||(LA5_0 >= T_READ && LA5_0 <= T_RETURN)||LA5_0==T_STRING||LA5_0==T_WRITE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// LCC.g:294:24: statelist
					{
					pushFollow(FOLLOW_statelist_in_statelist768);
					statelist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "statement"
	// LCC.g:297:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL );
	public final void statement() throws RecognitionException {
		try {
			// LCC.g:297:10: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			int alt6=10;
			switch ( input.LA(1) ) {
			case T_FLOAT:
			case T_INT:
			case T_STRING:
				{
				alt6=1;
				}
				break;
			case ID:
				{
				alt6=2;
				}
				break;
			case T_WRITE:
				{
				alt6=3;
				}
				break;
			case T_READ:
				{
				alt6=4;
				}
				break;
			case T_RETURN:
				{
				alt6=5;
				}
				break;
			case T_IF:
				{
				alt6=6;
				}
				break;
			case T_FOR:
				{
				alt6=7;
				}
				break;
			case T_ABRECHAVE:
				{
				alt6=8;
				}
				break;
			case T_BREAK:
				{
				alt6=9;
				}
				break;
			case EOL:
				{
				alt6=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// LCC.g:298:3: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement781);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement783); if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:299:3: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement789);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement791); if (state.failed) return;
					}
					break;
				case 3 :
					// LCC.g:300:3: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement797);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement799); if (state.failed) return;
					}
					break;
				case 4 :
					// LCC.g:301:3: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement806);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement808); if (state.failed) return;
					}
					break;
				case 5 :
					// LCC.g:302:3: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement813);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement815); if (state.failed) return;
					}
					break;
				case 6 :
					// LCC.g:303:3: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement821);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// LCC.g:304:3: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement827);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// LCC.g:305:3: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement833); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement835);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement837); if (state.failed) return;
					}
					break;
				case 9 :
					// LCC.g:306:3: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement843); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement845); if (state.failed) return;
					}
					break;
				case 10 :
					// LCC.g:307:3: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement851); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// LCC.g:310:1: vardecl : ( T_INT | T_FLOAT | T_STRING ) ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		try {
			// LCC.g:311:2: ( ( T_INT | T_FLOAT | T_STRING ) ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// LCC.g:312:3: ( T_INT | T_FLOAT | T_STRING ) ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) {setUltTipo(input.LT(1).getText());}
			if ( input.LA(1)==T_FLOAT||input.LA(1)==T_INT||input.LA(1)==T_STRING ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) {adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl888); if (state.failed) return;
			// LCC.g:313:36: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// LCC.g:313:37: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl891); if (state.failed) return;
					// LCC.g:313:52: ( ID | NUMERO )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ID) ) {
						alt7=1;
					}
					else if ( (LA7_0==NUMERO) ) {
						alt7=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// LCC.g:313:54: ID
							{
							if ( state.backtracking==0 ) {verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl897); if (state.failed) return;
							}
							break;
						case 2 :
							// LCC.g:313:89: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl901); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl905); if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// LCC.g:316:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		try {
			// LCC.g:317:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			// LCC.g:317:4: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) {verificaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_lvalue920); if (state.failed) return;
			// LCC.g:318:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// LCC.g:318:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue926); if (state.failed) return;
					// LCC.g:318:20: ( numexpression )
					// LCC.g:318:22: numexpression
					{
					pushFollow(FOLLOW_numexpression_in_lvalue930);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue934); if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// LCC.g:321:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		try {
			// LCC.g:322:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			// LCC.g:323:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			pushFollow(FOLLOW_lvalue_in_atribstat949);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat953); if (state.failed) return;
			// LCC.g:325:2: ( expression | allocexpression | funccall | TEXTO )
			int alt10=4;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt10=1;
				}
				break;
			case T_NEW:
				{
				alt10=2;
				}
				break;
			case FUNCAO:
				{
				alt10=3;
				}
				break;
			case TEXTO:
				{
				alt10=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// LCC.g:325:4: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat959);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:325:17: allocexpression
					{
					pushFollow(FOLLOW_allocexpression_in_atribstat963);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// LCC.g:325:35: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat967);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// LCC.g:325:46: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat971); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// LCC.g:328:1: allocexpression : T_NEW ( T_INT | T_FLOAT | T_STRING ) ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		try {
			// LCC.g:328:17: ( T_NEW ( T_INT | T_FLOAT | T_STRING ) ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			// LCC.g:328:19: T_NEW ( T_INT | T_FLOAT | T_STRING ) ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression983); if (state.failed) return;
			if ( input.LA(1)==T_FLOAT||input.LA(1)==T_INT||input.LA(1)==T_STRING ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// LCC.g:328:57: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==T_ABRECOLCHETE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// LCC.g:328:58: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression1001); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_allocexpression1003);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression1005); if (state.failed) return;
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// LCC.g:331:1: funccall : FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		try {
			// LCC.g:332:2: ( FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES )
			// LCC.g:332:4: FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall1018); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall1029); if (state.failed) return;
			pushFollow(FOLLOW_paramlistcall_in_funccall1048);
			paramlistcall();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1058); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// LCC.g:338:1: paramlistcall : ( TEXTO paramlistcall_linha | expression paramlistcall_linha |);
	public final void paramlistcall() throws RecognitionException {
		try {
			// LCC.g:339:2: ( TEXTO paramlistcall_linha | expression paramlistcall_linha |)
			int alt12=3;
			switch ( input.LA(1) ) {
			case TEXTO:
				{
				alt12=1;
				}
				break;
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt12=2;
				}
				break;
			case EOF:
			case T_FECHAPARENTESES:
				{
				alt12=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// LCC.g:339:4: TEXTO paramlistcall_linha
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1069); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall1071);
					paramlistcall_linha();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:340:4: expression paramlistcall_linha
					{
					pushFollow(FOLLOW_expression_in_paramlistcall1077);
					expression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall1079);
					paramlistcall_linha();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// LCC.g:342:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "paramlistcall_linha"
	// LCC.g:344:1: paramlistcall_linha : ( T_VIRGULA paramlistcall |);
	public final void paramlistcall_linha() throws RecognitionException {
		try {
			// LCC.g:345:2: ( T_VIRGULA paramlistcall |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==T_VIRGULA) ) {
				alt13=1;
			}
			else if ( (LA13_0==EOF||LA13_0==T_FECHAPARENTESES) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// LCC.g:346:2: T_VIRGULA paramlistcall
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall_linha1097); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall_linha1099);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:348:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlistcall_linha"



	// $ANTLR start "printstat"
	// LCC.g:350:1: printstat : T_WRITE ( TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		try {
			// LCC.g:351:2: ( T_WRITE ( TEXTO | expression ) )
			// LCC.g:351:4: T_WRITE ( TEXTO | expression )
			{
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1115); if (state.failed) return;
			// LCC.g:351:12: ( TEXTO | expression )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TEXTO) ) {
				alt14=1;
			}
			else if ( ((LA14_0 >= ID && LA14_0 <= NUMERO)||LA14_0==T_ABREPARENTESES||LA14_0==T_NULL||LA14_0==T_SOMA||LA14_0==T_SUBTRACAO) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// LCC.g:351:14: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1119); if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:351:22: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1123);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// LCC.g:354:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		try {
			// LCC.g:355:2: ( T_READ lvalue )
			// LCC.g:355:4: T_READ lvalue
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1137); if (state.failed) return;
			pushFollow(FOLLOW_lvalue_in_readstat1139);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// LCC.g:358:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		try {
			// LCC.g:359:2: ( T_RETURN ( TEXTO | expression )? )
			// LCC.g:359:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1151); if (state.failed) return;
			// LCC.g:359:13: ( TEXTO | expression )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==TEXTO) ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= ID && LA15_0 <= NUMERO)||LA15_0==T_ABREPARENTESES||LA15_0==T_NULL||LA15_0==T_SOMA||LA15_0==T_SUBTRACAO) ) {
				alt15=2;
			}
			switch (alt15) {
				case 1 :
					// LCC.g:359:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1155); if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:359:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1159);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// LCC.g:362:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha ;
	public final void ifstat() throws RecognitionException {
		try {
			// LCC.g:363:2: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha )
			// LCC.g:363:4: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1175); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1177); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1179);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1181); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifstat1183);
			statement();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_ifstat_linha_in_ifstat1185);
			ifstat_linha();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "ifstat_linha"
	// LCC.g:366:1: ifstat_linha : ( T_ELSE statement |);
	public final void ifstat_linha() throws RecognitionException {
		try {
			// LCC.g:367:2: ( T_ELSE statement |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==T_ELSE) ) {
				int LA16_1 = input.LA(2);
				if ( (synpred34_LCC()) ) {
					alt16=1;
				}
				else if ( (true) ) {
					alt16=2;
				}

			}
			else if ( (LA16_0==EOL||LA16_0==ID||LA16_0==T_ABRECHAVE||LA16_0==T_BREAK||LA16_0==T_FECHACHAVE||(LA16_0 >= T_FLOAT && LA16_0 <= T_IF)||LA16_0==T_INT||(LA16_0 >= T_READ && LA16_0 <= T_RETURN)||LA16_0==T_STRING||LA16_0==T_WRITE) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// LCC.g:367:4: T_ELSE statement
					{
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat_linha1196); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_ifstat_linha1199);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:369:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifstat_linha"



	// $ANTLR start "forstat"
	// LCC.g:371:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement ;
	public final void forstat() throws RecognitionException {
		try {
			// LCC.g:371:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement )
			// LCC.g:371:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1215); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1217); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1219);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1221); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1223);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1225); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1227);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1229); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_forstat1238);
			statement();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// LCC.g:375:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		try {
			// LCC.g:375:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			// LCC.g:375:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			pushFollow(FOLLOW_numexpression_in_expression1250);
			numexpression();
			state._fsp--;
			if (state.failed) return;
			// LCC.g:375:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==T_DIFERENTE||LA17_0==T_IGUAL||(LA17_0 >= T_MAIOR && LA17_0 <= T_MENOROUIGUAL)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// LCC.g:375:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
					{
					if ( input.LA(1)==T_DIFERENTE||input.LA(1)==T_IGUAL||(input.LA(1) >= T_MAIOR && input.LA(1) <= T_MENOROUIGUAL) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numexpression_in_expression1280);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// LCC.g:378:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		try {
			// LCC.g:378:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// LCC.g:378:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_numexpression1292);
			term();
			state._fsp--;
			if (state.failed) return;
			// LCC.g:378:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==T_SOMA||LA18_0==T_SUBTRACAO) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// LCC.g:378:23: ( T_SOMA | T_SUBTRACAO ) term
					{
					if ( input.LA(1)==T_SOMA||input.LA(1)==T_SUBTRACAO ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numexpression1305);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// LCC.g:381:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		try {
			// LCC.g:381:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			// LCC.g:382:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_term1318);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// LCC.g:382:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==T_DIVISAO||LA19_0==T_MULTIPLICACAO) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// LCC.g:382:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
					{
					if ( input.LA(1)==T_DIVISAO||input.LA(1)==T_MULTIPLICACAO ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryexpr_in_term1331);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// LCC.g:385:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		try {
			// LCC.g:385:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			// LCC.g:385:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			// LCC.g:385:14: ( T_SOMA | T_SUBTRACAO )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==T_SOMA||LA20_0==T_SUBTRACAO) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// LCC.g:
					{
					if ( input.LA(1)==T_SOMA||input.LA(1)==T_SUBTRACAO ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_factor_in_unaryexpr1355);
			factor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// LCC.g:388:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		try {
			// LCC.g:388:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			// LCC.g:388:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			// LCC.g:388:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt21=4;
			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt21=1;
				}
				break;
			case ID:
				{
				alt21=2;
				}
				break;
			case T_NULL:
				{
				alt21=3;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt21=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// LCC.g:388:12: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1367); if (state.failed) return;
					}
					break;
				case 2 :
					// LCC.g:388:21: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_factor1371);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// LCC.g:388:30: T_NULL
					{
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1375); if (state.failed) return;
					}
					break;
				case 4 :
					// LCC.g:388:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1379); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_factor1381);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1383); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred34_LCC
	public final void synpred34_LCC_fragment() throws RecognitionException {
		// LCC.g:367:4: ( T_ELSE statement )
		// LCC.g:367:4: T_ELSE statement
		{
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred34_LCC1196); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred34_LCC1199);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred34_LCC

	// Delegated rules

	public final boolean synpred34_LCC() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_LCC_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist643 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_funclist_linha_in_funclist645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_funclist_linha656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef673 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef677 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef679 = new BitSet(new long[]{0x0000004008C00000L});
	public static final BitSet FOLLOW_paramlist_in_funcdef681 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef683 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef688 = new BitSet(new long[]{0x000002580B808920L});
	public static final BitSet FOLLOW_statelist_in_funcdef695 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_paramlist715 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist730 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_paramlist_linha_in_paramlist732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist_linha746 = new BitSet(new long[]{0x0000004008800000L});
	public static final BitSet FOLLOW_paramlist_in_paramlist_linha748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist765 = new BitSet(new long[]{0x000002580B808922L});
	public static final BitSet FOLLOW_statelist_in_statelist768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement781 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement789 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement797 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement806 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement813 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement833 = new BitSet(new long[]{0x000002580B808920L});
	public static final BitSet FOLLOW_statelist_in_statement835 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement843 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_vardecl868 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl888 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl891 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl897 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl901 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl905 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_ID_in_lvalue920 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue926 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue930 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue934 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat949 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat953 = new BitSet(new long[]{0x000000A600002780L});
	public static final BitSet FOLLOW_expression_in_atribstat959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression983 = new BitSet(new long[]{0x0000004008800000L});
	public static final BitSet FOLLOW_set_in_allocexpression985 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression1001 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression1003 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression1005 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall1018 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall1029 = new BitSet(new long[]{0x000000A400402700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall1048 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1069 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1077 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall_linha1097 = new BitSet(new long[]{0x000000A400002700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall_linha1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1115 = new BitSet(new long[]{0x000000A400002700L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1137 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1151 = new BitSet(new long[]{0x000000A400002702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1175 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1177 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_expression_in_ifstat1179 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1181 = new BitSet(new long[]{0x000002580B808920L});
	public static final BitSet FOLLOW_statement_in_ifstat1183 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ifstat_linha_in_ifstat1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat_linha1196 = new BitSet(new long[]{0x000002580B808920L});
	public static final BitSet FOLLOW_statement_in_ifstat_linha1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1215 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1217 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1219 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1221 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_expression_in_forstat1223 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1225 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1227 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1229 = new BitSet(new long[]{0x000002580B808920L});
	public static final BitSet FOLLOW_statement_in_forstat1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1250 = new BitSet(new long[]{0x00000000F4020002L});
	public static final BitSet FOLLOW_set_in_expression1254 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_numexpression_in_expression1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1292 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1295 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_term_in_numexpression1305 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1318 = new BitSet(new long[]{0x0000000100040002L});
	public static final BitSet FOLLOW_set_in_term1322 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1331 = new BitSet(new long[]{0x0000000100040002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1379 = new BitSet(new long[]{0x000000A400002300L});
	public static final BitSet FOLLOW_numexpression_in_factor1381 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred34_LCC1196 = new BitSet(new long[]{0x000002580B808920L});
	public static final BitSet FOLLOW_statement_in_synpred34_LCC1199 = new BitSet(new long[]{0x0000000000000002L});
}
