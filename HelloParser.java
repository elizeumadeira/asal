// $ANTLR 3.5.2 Hello.g 2022-03-01 18:19:51

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
public class HelloParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMENTARIO", "EOL", "ESPACO_BRANCO", 
		"FUNCAO", "ID", "NUMERO", "TEXTO", "TIPOS", "T_ABRECHAVE", "T_ABRECOLCHETE", 
		"T_ABREPARENTESES", "T_ATRIBUICAO", "T_BREAK", "T_DEF", "T_DIFERENTE", 
		"T_DIVISAO", "T_ELSE", "T_FECHACHAVE", "T_FECHACOLCHETE", "T_FECHAPARENTESES", 
		"T_FOR", "T_IF", "T_IGUAL", "T_MAIOR", "T_MAIOROUIGUAL", "T_MENOR", "T_MENOROUIGUAL", 
		"T_MULTIPLICACAO", "T_NEW", "T_NULL", "T_READ", "T_RETURN", "T_SOMA", 
		"T_SUBTRACAO", "T_VIRGULA", "T_WRITE"
	};
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
	public static final int T_DEF=17;
	public static final int T_DIFERENTE=18;
	public static final int T_DIVISAO=19;
	public static final int T_ELSE=20;
	public static final int T_FECHACHAVE=21;
	public static final int T_FECHACOLCHETE=22;
	public static final int T_FECHAPARENTESES=23;
	public static final int T_FOR=24;
	public static final int T_IF=25;
	public static final int T_IGUAL=26;
	public static final int T_MAIOR=27;
	public static final int T_MAIOROUIGUAL=28;
	public static final int T_MENOR=29;
	public static final int T_MENOROUIGUAL=30;
	public static final int T_MULTIPLICACAO=31;
	public static final int T_NEW=32;
	public static final int T_NULL=33;
	public static final int T_READ=34;
	public static final int T_RETURN=35;
	public static final int T_SOMA=36;
	public static final int T_SUBTRACAO=37;
	public static final int T_VIRGULA=38;
	public static final int T_WRITE=39;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HelloParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HelloParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[72+1];


	}

	@Override public String[] getTokenNames() { return HelloParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Hello.g"; }


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
	        HelloLexer lex = new HelloLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	 
	        HelloParser parser = new HelloParser(tokens);
	 
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

					if (parser.tokenNames[token.getType()].equals("TIPOS")) {
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
	// Hello.g:258:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// Hello.g:258:9: ( ( statement | funclist ) )
			// Hello.g:259:2: ( statement | funclist )
			{
			// Hello.g:259:2: ( statement | funclist )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==EOL||LA1_0==ID||(LA1_0 >= TIPOS && LA1_0 <= T_ABRECHAVE)||LA1_0==T_BREAK||(LA1_0 >= T_FOR && LA1_0 <= T_IF)||(LA1_0 >= T_READ && LA1_0 <= T_RETURN)||LA1_0==T_WRITE) ) {
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
					// Hello.g:259:4: statement
					{
					pushFollow(FOLLOW_statement_in_program613);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:259:16: funclist
					{
					pushFollow(FOLLOW_funclist_in_program617);
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
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
	}
	// $ANTLR end "program"



	// $ANTLR start "funcdef"
	// Hello.g:262:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		int funcdef_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// Hello.g:263:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			// Hello.g:263:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef631); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaFuncao(input.LT(1)); }
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef635); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef637); if (state.failed) return;
			pushFollow(FOLLOW_paramlist_in_funcdef639);
			paramlist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef641); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef646); if (state.failed) return;
			pushFollow(FOLLOW_statelist_in_funcdef653);
			statelist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef657); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, funcdef_StartIndex); }

		}
	}
	// $ANTLR end "funcdef"



	// $ANTLR start "funclist"
	// Hello.g:269:1: funclist : ( funcdef funclist | funcdef );
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// Hello.g:269:10: ( funcdef funclist | funcdef )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==T_DEF) ) {
				int LA2_1 = input.LA(2);
				if ( (synpred2_Hello()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Hello.g:269:12: funcdef funclist
					{
					pushFollow(FOLLOW_funcdef_in_funclist668);
					funcdef();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_funclist_in_funclist670);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:269:31: funcdef
					{
					pushFollow(FOLLOW_funcdef_in_funclist674);
					funcdef();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 3, funclist_StartIndex); }

		}
	}
	// $ANTLR end "funclist"



	// $ANTLR start "paramlist"
	// Hello.g:272:1: paramlist : ( TIPOS ID paramlist_linha )? ;
	public final void paramlist() throws RecognitionException {
		int paramlist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// Hello.g:272:11: ( ( TIPOS ID paramlist_linha )? )
			// Hello.g:272:14: ( TIPOS ID paramlist_linha )?
			{
			// Hello.g:272:14: ( TIPOS ID paramlist_linha )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TIPOS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Hello.g:273:5: TIPOS ID paramlist_linha
					{
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist692); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist697); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_linha_in_paramlist699);
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
			if ( state.backtracking>0 ) { memoize(input, 4, paramlist_StartIndex); }

		}
	}
	// $ANTLR end "paramlist"



	// $ANTLR start "paramlist_linha"
	// Hello.g:278:1: paramlist_linha : ( T_VIRGULA paramlist )? ;
	public final void paramlist_linha() throws RecognitionException {
		int paramlist_linha_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// Hello.g:278:16: ( ( T_VIRGULA paramlist )? )
			// Hello.g:278:18: ( T_VIRGULA paramlist )?
			{
			// Hello.g:278:18: ( T_VIRGULA paramlist )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==T_VIRGULA) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Hello.g:278:20: T_VIRGULA paramlist
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist_linha721); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_in_paramlist_linha723);
					paramlist();
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
			if ( state.backtracking>0 ) { memoize(input, 5, paramlist_linha_StartIndex); }

		}
	}
	// $ANTLR end "paramlist_linha"



	// $ANTLR start "statelist"
	// Hello.g:281:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// Hello.g:281:11: ( statement ( statelist )? )
			// Hello.g:281:13: statement ( statelist )?
			{
			pushFollow(FOLLOW_statement_in_statelist736);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:281:23: ( statelist )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EOL||LA5_0==ID||(LA5_0 >= TIPOS && LA5_0 <= T_ABRECHAVE)||LA5_0==T_BREAK||(LA5_0 >= T_FOR && LA5_0 <= T_IF)||(LA5_0 >= T_READ && LA5_0 <= T_RETURN)||LA5_0==T_WRITE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Hello.g:281:24: statelist
					{
					pushFollow(FOLLOW_statelist_in_statelist739);
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
			if ( state.backtracking>0 ) { memoize(input, 6, statelist_StartIndex); }

		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "statement"
	// Hello.g:284:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// Hello.g:285:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			// Hello.g:285:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			// Hello.g:285:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			int alt6=10;
			switch ( input.LA(1) ) {
			case TIPOS:
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
					// Hello.g:285:4: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement752);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement754); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:286:2: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement759);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement761); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:287:2: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement766);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement768); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:288:2: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement774);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement776); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:289:2: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement780);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement782); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:290:2: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement787);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:291:2: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement792);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:292:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement797); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement799);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement801); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:293:2: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement806); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement808); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:294:2: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement813); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 7, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// Hello.g:297:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// Hello.g:298:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:299:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl831); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl838); if (state.failed) return;
			// Hello.g:300:37: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:300:38: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl841); if (state.failed) return;
					// Hello.g:300:53: ( ID | NUMERO )
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
							// Hello.g:300:55: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl847); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:300:91: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl851); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl855); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 8, vardecl_StartIndex); }

		}
	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// Hello.g:303:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// Hello.g:304:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			// Hello.g:304:4: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_lvalue870); if (state.failed) return;
			// Hello.g:305:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Hello.g:305:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue876); if (state.failed) return;
					// Hello.g:305:20: ( numexpression )
					// Hello.g:305:22: numexpression
					{
					pushFollow(FOLLOW_numexpression_in_lvalue880);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue884); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 9, lvalue_StartIndex); }

		}
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// Hello.g:308:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// Hello.g:309:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			// Hello.g:310:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			pushFollow(FOLLOW_lvalue_in_atribstat899);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat905); if (state.failed) return;
			// Hello.g:312:2: ( expression | allocexpression | funccall | TEXTO )
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
					// Hello.g:312:4: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat911);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:312:17: allocexpression
					{
					pushFollow(FOLLOW_allocexpression_in_atribstat915);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:312:35: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat919);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:312:46: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat923); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 10, atribstat_StartIndex); }

		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// Hello.g:315:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		int allocexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// Hello.g:315:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			// Hello.g:315:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression935); if (state.failed) return;
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression937); if (state.failed) return;
			// Hello.g:315:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
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
					// Hello.g:315:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression940); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_allocexpression942);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression944); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 11, allocexpression_StartIndex); }

		}
	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// Hello.g:318:1: funccall : FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// Hello.g:319:2: ( FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES )
			// Hello.g:319:4: FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall957); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall968); if (state.failed) return;
			// Hello.g:321:17: ( paramlistcall )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==T_FECHAPARENTESES) ) {
				int LA12_1 = input.LA(2);
				if ( (synpred22_Hello()) ) {
					alt12=1;
				}
			}
			else if ( ((LA12_0 >= ID && LA12_0 <= TEXTO)||LA12_0==T_ABREPARENTESES||LA12_0==T_NULL||(LA12_0 >= T_SOMA && LA12_0 <= T_SUBTRACAO)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Hello.g:321:19: paramlistcall
					{
					pushFollow(FOLLOW_paramlistcall_in_funccall989);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1002); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, funccall_StartIndex); }

		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// Hello.g:325:1: paramlistcall : ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? ;
	public final void paramlistcall() throws RecognitionException {
		int paramlistcall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// Hello.g:326:2: ( ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? )
			// Hello.g:326:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			{
			// Hello.g:326:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= ID && LA15_0 <= TEXTO)||LA15_0==T_ABREPARENTESES||LA15_0==T_NULL||(LA15_0 >= T_SOMA && LA15_0 <= T_SUBTRACAO)) ) {
				int LA15_1 = input.LA(2);
				if ( (synpred25_Hello()) ) {
					alt15=1;
				}
				else if ( (synpred28_Hello()) ) {
					alt15=2;
				}
			}
			switch (alt15) {
				case 1 :
					// Hello.g:326:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
					{
					// Hello.g:326:8: ( ID | TEXTO | expression )
					int alt13=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						int LA13_1 = input.LA(2);
						if ( (synpred23_Hello()) ) {
							alt13=1;
						}
						else if ( (true) ) {
							alt13=3;
						}

						}
						break;
					case TEXTO:
						{
						alt13=2;
						}
						break;
					case NUMERO:
					case T_ABREPARENTESES:
					case T_NULL:
					case T_SOMA:
					case T_SUBTRACAO:
						{
						alt13=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// Hello.g:326:9: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_paramlistcall1020); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:326:45: TEXTO
							{
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1024); if (state.failed) return;
							}
							break;
						case 3 :
							// Hello.g:326:53: expression
							{
							pushFollow(FOLLOW_expression_in_paramlistcall1028);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall1031); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall1033);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:326:91: ( ID | TEXTO | expression )
					{
					// Hello.g:326:91: ( ID | TEXTO | expression )
					int alt14=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						int LA14_1 = input.LA(2);
						if ( (synpred26_Hello()) ) {
							alt14=1;
						}
						else if ( (true) ) {
							alt14=3;
						}

						}
						break;
					case TEXTO:
						{
						alt14=2;
						}
						break;
					case NUMERO:
					case T_ABREPARENTESES:
					case T_NULL:
					case T_SOMA:
					case T_SUBTRACAO:
						{
						alt14=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}
					switch (alt14) {
						case 1 :
							// Hello.g:326:92: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_paramlistcall1040); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:326:128: TEXTO
							{
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1044); if (state.failed) return;
							}
							break;
						case 3 :
							// Hello.g:326:136: expression
							{
							pushFollow(FOLLOW_expression_in_paramlistcall1048);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

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
			if ( state.backtracking>0 ) { memoize(input, 13, paramlistcall_StartIndex); }

		}
	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "printstat"
	// Hello.g:329:1: printstat : T_WRITE ( lvalue | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// Hello.g:330:2: ( T_WRITE ( lvalue | TEXTO | expression ) )
			// Hello.g:330:4: T_WRITE ( lvalue | TEXTO | expression )
			{
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1063); if (state.failed) return;
			// Hello.g:330:12: ( lvalue | TEXTO | expression )
			int alt16=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA16_1 = input.LA(2);
				if ( (synpred29_Hello()) ) {
					alt16=1;
				}
				else if ( (true) ) {
					alt16=3;
				}

				}
				break;
			case TEXTO:
				{
				alt16=2;
				}
				break;
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt16=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// Hello.g:330:14: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_printstat1067);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:330:23: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1071); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:330:31: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1075);
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
			if ( state.backtracking>0 ) { memoize(input, 14, printstat_StartIndex); }

		}
	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// Hello.g:333:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// Hello.g:334:2: ( T_READ lvalue )
			// Hello.g:334:4: T_READ lvalue
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1089); if (state.failed) return;
			pushFollow(FOLLOW_lvalue_in_readstat1091);
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
			if ( state.backtracking>0 ) { memoize(input, 15, readstat_StartIndex); }

		}
	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// Hello.g:337:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// Hello.g:338:2: ( T_RETURN ( TEXTO | expression )? )
			// Hello.g:338:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1103); if (state.failed) return;
			// Hello.g:338:13: ( TEXTO | expression )?
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TEXTO) ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= ID && LA17_0 <= NUMERO)||LA17_0==T_ABREPARENTESES||LA17_0==T_NULL||(LA17_0 >= T_SOMA && LA17_0 <= T_SUBTRACAO)) ) {
				alt17=2;
			}
			switch (alt17) {
				case 1 :
					// Hello.g:338:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1107); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:338:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1111);
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
			if ( state.backtracking>0 ) { memoize(input, 16, returnstat_StartIndex); }

		}
	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// Hello.g:341:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )? ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// Hello.g:341:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )? )
			// Hello.g:341:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )?
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1125); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1128); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1130);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1132); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifstat1134);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:342:4: ( T_ELSE statement )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==T_ELSE) ) {
				int LA18_1 = input.LA(2);
				if ( (synpred33_Hello()) ) {
					alt18=1;
				}
			}
			switch (alt18) {
				case 1 :
					// Hello.g:342:6: T_ELSE statement
					{
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1141); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_ifstat1144);
					statement();
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
			if ( state.backtracking>0 ) { memoize(input, 17, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// Hello.g:345:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// Hello.g:345:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			// Hello.g:345:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1158); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1160); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1162);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1164); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1166);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1168); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1170);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1172); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1184); if (state.failed) return;
			// Hello.g:346:22: ( statement )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==EOL||LA19_0==ID||(LA19_0 >= TIPOS && LA19_0 <= T_ABRECHAVE)||LA19_0==T_BREAK||(LA19_0 >= T_FOR && LA19_0 <= T_IF)||(LA19_0 >= T_READ && LA19_0 <= T_RETURN)||LA19_0==T_WRITE) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Hello.g:346:23: statement
					{
					pushFollow(FOLLOW_statement_in_forstat1187);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1191); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, forstat_StartIndex); }

		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// Hello.g:349:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// Hello.g:349:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			// Hello.g:349:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			pushFollow(FOLLOW_numexpression_in_expression1203);
			numexpression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:349:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==T_DIFERENTE||(LA20_0 >= T_IGUAL && LA20_0 <= T_MENOROUIGUAL)) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Hello.g:349:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
					{
					if ( input.LA(1)==T_DIFERENTE||(input.LA(1) >= T_IGUAL && input.LA(1) <= T_MENOROUIGUAL) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numexpression_in_expression1233);
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
			if ( state.backtracking>0 ) { memoize(input, 19, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// Hello.g:352:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		int numexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// Hello.g:352:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// Hello.g:352:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_numexpression1245);
			term();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:352:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= T_SOMA && LA21_0 <= T_SUBTRACAO)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Hello.g:352:23: ( T_SOMA | T_SUBTRACAO ) term
					{
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numexpression1258);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
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
			if ( state.backtracking>0 ) { memoize(input, 20, numexpression_StartIndex); }

		}
	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// Hello.g:355:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// Hello.g:355:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			// Hello.g:356:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_term1271);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:356:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==T_DIVISAO||LA22_0==T_MULTIPLICACAO) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Hello.g:356:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
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
					pushFollow(FOLLOW_unaryexpr_in_term1284);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
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
			if ( state.backtracking>0 ) { memoize(input, 21, term_StartIndex); }

		}
	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// Hello.g:359:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// Hello.g:359:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			// Hello.g:359:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			// Hello.g:359:14: ( T_SOMA | T_SUBTRACAO )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= T_SOMA && LA23_0 <= T_SUBTRACAO)) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Hello.g:
					{
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
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

			pushFollow(FOLLOW_factor_in_unaryexpr1308);
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
			if ( state.backtracking>0 ) { memoize(input, 22, unaryexpr_StartIndex); }

		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// Hello.g:362:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// Hello.g:362:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			// Hello.g:362:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			// Hello.g:362:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt24=4;
			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt24=1;
				}
				break;
			case ID:
				{
				alt24=2;
				}
				break;
			case T_NULL:
				{
				alt24=3;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt24=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// Hello.g:362:12: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1320); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:362:21: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_factor1324);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:362:30: T_NULL
					{
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1328); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:362:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1332); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_factor1334);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1336); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 23, factor_StartIndex); }

		}
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred2_Hello
	public final void synpred2_Hello_fragment() throws RecognitionException {
		// Hello.g:269:12: ( funcdef funclist )
		// Hello.g:269:12: funcdef funclist
		{
		pushFollow(FOLLOW_funcdef_in_synpred2_Hello668);
		funcdef();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_funclist_in_synpred2_Hello670);
		funclist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Hello

	// $ANTLR start synpred22_Hello
	public final void synpred22_Hello_fragment() throws RecognitionException {
		// Hello.g:321:19: ( paramlistcall )
		// Hello.g:321:19: paramlistcall
		{
		pushFollow(FOLLOW_paramlistcall_in_synpred22_Hello989);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_Hello

	// $ANTLR start synpred23_Hello
	public final void synpred23_Hello_fragment() throws RecognitionException {
		// Hello.g:326:9: ( ID )
		// Hello.g:326:9: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred23_Hello1020); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Hello

	// $ANTLR start synpred25_Hello
	public final void synpred25_Hello_fragment() throws RecognitionException {
		// Hello.g:326:8: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall )
		// Hello.g:326:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
		{
		// Hello.g:326:8: ( ID | TEXTO | expression )
		int alt25=3;
		switch ( input.LA(1) ) {
		case ID:
			{
			int LA25_1 = input.LA(2);
			if ( (synpred23_Hello()) ) {
				alt25=1;
			}
			else if ( (true) ) {
				alt25=3;
			}

			}
			break;
		case TEXTO:
			{
			alt25=2;
			}
			break;
		case NUMERO:
		case T_ABREPARENTESES:
		case T_NULL:
		case T_SOMA:
		case T_SUBTRACAO:
			{
			alt25=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 25, 0, input);
			throw nvae;
		}
		switch (alt25) {
			case 1 :
				// Hello.g:326:9: ID
				{
				match(input,ID,FOLLOW_ID_in_synpred25_Hello1020); if (state.failed) return;
				}
				break;
			case 2 :
				// Hello.g:326:45: TEXTO
				{
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred25_Hello1024); if (state.failed) return;
				}
				break;
			case 3 :
				// Hello.g:326:53: expression
				{
				pushFollow(FOLLOW_expression_in_synpred25_Hello1028);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_synpred25_Hello1031); if (state.failed) return;
		pushFollow(FOLLOW_paramlistcall_in_synpred25_Hello1033);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred25_Hello

	// $ANTLR start synpred26_Hello
	public final void synpred26_Hello_fragment() throws RecognitionException {
		// Hello.g:326:92: ( ID )
		// Hello.g:326:92: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred26_Hello1040); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Hello

	// $ANTLR start synpred28_Hello
	public final void synpred28_Hello_fragment() throws RecognitionException {
		// Hello.g:326:91: ( ( ID | TEXTO | expression ) )
		// Hello.g:326:91: ( ID | TEXTO | expression )
		{
		// Hello.g:326:91: ( ID | TEXTO | expression )
		int alt26=3;
		switch ( input.LA(1) ) {
		case ID:
			{
			int LA26_1 = input.LA(2);
			if ( (synpred26_Hello()) ) {
				alt26=1;
			}
			else if ( (true) ) {
				alt26=3;
			}

			}
			break;
		case TEXTO:
			{
			alt26=2;
			}
			break;
		case NUMERO:
		case T_ABREPARENTESES:
		case T_NULL:
		case T_SOMA:
		case T_SUBTRACAO:
			{
			alt26=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 26, 0, input);
			throw nvae;
		}
		switch (alt26) {
			case 1 :
				// Hello.g:326:92: ID
				{
				match(input,ID,FOLLOW_ID_in_synpred28_Hello1040); if (state.failed) return;
				}
				break;
			case 2 :
				// Hello.g:326:128: TEXTO
				{
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred28_Hello1044); if (state.failed) return;
				}
				break;
			case 3 :
				// Hello.g:326:136: expression
				{
				pushFollow(FOLLOW_expression_in_synpred28_Hello1048);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred28_Hello

	// $ANTLR start synpred29_Hello
	public final void synpred29_Hello_fragment() throws RecognitionException {
		// Hello.g:330:14: ( lvalue )
		// Hello.g:330:14: lvalue
		{
		pushFollow(FOLLOW_lvalue_in_synpred29_Hello1067);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_Hello

	// $ANTLR start synpred33_Hello
	public final void synpred33_Hello_fragment() throws RecognitionException {
		// Hello.g:342:6: ( T_ELSE statement )
		// Hello.g:342:6: T_ELSE statement
		{
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred33_Hello1141); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred33_Hello1144);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred33_Hello

	// Delegated rules

	public final boolean synpred25_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred28_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred28_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef631 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef635 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef637 = new BitSet(new long[]{0x0000000000800800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef639 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef641 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef646 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_funcdef653 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist668 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_funclist670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist692 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist697 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlist_linha_in_paramlist699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist_linha721 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist_linha723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist736 = new BitSet(new long[]{0x0000008C03011922L});
	public static final BitSet FOLLOW_statelist_in_statelist739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement752 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement759 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement766 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement774 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement780 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement797 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_statement799 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement806 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl831 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl838 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl841 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl847 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl851 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl855 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue870 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue876 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue880 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue884 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat899 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat905 = new BitSet(new long[]{0x0000003300004780L});
	public static final BitSet FOLLOW_expression_in_atribstat911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression935 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression937 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression940 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression942 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression944 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall957 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall968 = new BitSet(new long[]{0x0000003200804700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall989 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1020 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1024 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1028 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall1031 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1063 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_lvalue_in_printstat1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1089 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1103 = new BitSet(new long[]{0x0000003200004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1125 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1128 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1130 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1132 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1134 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1141 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1158 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1160 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1162 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1164 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_forstat1166 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1168 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1170 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1172 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1184 = new BitSet(new long[]{0x0000008C03211920L});
	public static final BitSet FOLLOW_statement_in_forstat1187 = new BitSet(new long[]{0x0000008C03211920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1203 = new BitSet(new long[]{0x000000007C040002L});
	public static final BitSet FOLLOW_set_in_expression1207 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1245 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1248 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_term_in_numexpression1258 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1271 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_set_in_term1275 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1284 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1332 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1334 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_synpred2_Hello668 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_synpred2_Hello670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred22_Hello989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred23_Hello1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred25_Hello1020 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_TEXTO_in_synpred25_Hello1024 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_synpred25_Hello1028 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_synpred25_Hello1031 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred25_Hello1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred26_Hello1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred28_Hello1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_synpred28_Hello1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred28_Hello1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred29_Hello1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred33_Hello1141 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_synpred33_Hello1144 = new BitSet(new long[]{0x0000000000000002L});
}
