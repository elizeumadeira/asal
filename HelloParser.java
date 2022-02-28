// $ANTLR 3.5.2 Hello.g 2022-02-28 20:28:41

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
		"T_DIVISAO", "T_ELSE", "T_ELSEIF", "T_FECHACHAVE", "T_FECHACOLCHETE", 
		"T_FECHAPARENTESES", "T_FOR", "T_IF", "T_IGUAL", "T_MAIOR", "T_MAIOROUIGUAL", 
		"T_MENOR", "T_MENOROUIGUAL", "T_MULTIPLICACAO", "T_NEW", "T_READ", "T_RETURN", 
		"T_SOMA", "T_SUBTRACAO", "T_VIRGULA", "T_WRITE"
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
	public static final int T_ELSEIF=21;
	public static final int T_FECHACHAVE=22;
	public static final int T_FECHACOLCHETE=23;
	public static final int T_FECHAPARENTESES=24;
	public static final int T_FOR=25;
	public static final int T_IF=26;
	public static final int T_IGUAL=27;
	public static final int T_MAIOR=28;
	public static final int T_MAIOROUIGUAL=29;
	public static final int T_MENOR=30;
	public static final int T_MENOROUIGUAL=31;
	public static final int T_MULTIPLICACAO=32;
	public static final int T_NEW=33;
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
		this.state.ruleMemo = new HashMap[74+1];


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
	        }
	    }



	// $ANTLR start "program"
	// Hello.g:255:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// Hello.g:255:9: ( ( statement | funclist ) )
			// Hello.g:256:2: ( statement | funclist )
			{
			// Hello.g:256:2: ( statement | funclist )
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
					// Hello.g:256:4: statement
					{
					pushFollow(FOLLOW_statement_in_program615);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:256:16: funclist
					{
					pushFollow(FOLLOW_funclist_in_program619);
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
	// Hello.g:259:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		int funcdef_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// Hello.g:260:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			// Hello.g:260:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef632); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaFuncao(input.LT(1)); }
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef636); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef638); if (state.failed) return;
			pushFollow(FOLLOW_paramlist_in_funcdef640);
			paramlist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef642); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef647); if (state.failed) return;
			pushFollow(FOLLOW_statelist_in_funcdef654);
			statelist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef658); if (state.failed) return;
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
	// Hello.g:266:1: funclist : ( funcdef funclist | funcdef );
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// Hello.g:267:2: ( funcdef funclist | funcdef )
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
					// Hello.g:268:2: funcdef funclist
					{
					pushFollow(FOLLOW_funcdef_in_funclist671);
					funcdef();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_funclist_in_funclist673);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:268:21: funcdef
					{
					pushFollow(FOLLOW_funcdef_in_funclist677);
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
	// Hello.g:283:1: paramlist : ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )? ;
	public final void paramlist() throws RecognitionException {
		int paramlist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// Hello.g:283:11: ( ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )? )
			// Hello.g:283:14: ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )?
			{
			// Hello.g:283:14: ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )?
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TIPOS) ) {
				int LA3_1 = input.LA(2);
				if ( (synpred3_Hello()) ) {
					alt3=1;
				}
				else if ( (synpred4_Hello()) ) {
					alt3=2;
				}
			}
			switch (alt3) {
				case 1 :
					// Hello.g:283:16: TIPOS ID T_VIRGULA paramlist
					{
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist792); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist797); if (state.failed) return;
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist799); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_in_paramlist801);
					paramlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:283:79: TIPOS ID
					{
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist805); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist810); if (state.failed) return;
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



	// $ANTLR start "statelist"
	// Hello.g:286:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// Hello.g:286:11: ( statement ( statelist )? )
			// Hello.g:286:13: statement ( statelist )?
			{
			pushFollow(FOLLOW_statement_in_statelist822);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:286:23: ( statelist )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EOL||LA4_0==ID||(LA4_0 >= TIPOS && LA4_0 <= T_ABRECHAVE)||LA4_0==T_BREAK||(LA4_0 >= T_FOR && LA4_0 <= T_IF)||(LA4_0 >= T_READ && LA4_0 <= T_RETURN)||LA4_0==T_WRITE) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Hello.g:286:24: statelist
					{
					pushFollow(FOLLOW_statelist_in_statelist825);
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
			if ( state.backtracking>0 ) { memoize(input, 5, statelist_StartIndex); }

		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "statement"
	// Hello.g:289:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// Hello.g:290:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			// Hello.g:290:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			// Hello.g:290:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			int alt5=10;
			switch ( input.LA(1) ) {
			case TIPOS:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case T_WRITE:
				{
				alt5=3;
				}
				break;
			case T_READ:
				{
				alt5=4;
				}
				break;
			case T_RETURN:
				{
				alt5=5;
				}
				break;
			case T_IF:
				{
				alt5=6;
				}
				break;
			case T_FOR:
				{
				alt5=7;
				}
				break;
			case T_ABRECHAVE:
				{
				alt5=8;
				}
				break;
			case T_BREAK:
				{
				alt5=9;
				}
				break;
			case EOL:
				{
				alt5=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Hello.g:290:4: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement838);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement840); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:291:2: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement845);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement847); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:292:2: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement852);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement854); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:293:2: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement860);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement862); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:294:2: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement866);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement868); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:295:2: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement873);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:296:2: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement878);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:297:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement883); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement885);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement887); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:298:2: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement892); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement894); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:299:2: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement899); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 6, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// Hello.g:302:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// Hello.g:303:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:304:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl917); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl924); if (state.failed) return;
			// Hello.g:305:37: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==T_ABRECOLCHETE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Hello.g:305:38: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl927); if (state.failed) return;
					// Hello.g:305:53: ( ID | NUMERO )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ID) ) {
						alt6=1;
					}
					else if ( (LA6_0==NUMERO) ) {
						alt6=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// Hello.g:305:55: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl933); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:305:91: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl937); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl941); if (state.failed) return;
					}
					break;

				default :
					break loop7;
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
			if ( state.backtracking>0 ) { memoize(input, 7, vardecl_StartIndex); }

		}
	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// Hello.g:308:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// Hello.g:309:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			// Hello.g:309:4: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_lvalue956); if (state.failed) return;
			// Hello.g:310:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:310:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue962); if (state.failed) return;
					// Hello.g:310:20: ( numexpression )
					// Hello.g:310:22: numexpression
					{
					pushFollow(FOLLOW_numexpression_in_lvalue966);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue970); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 8, lvalue_StartIndex); }

		}
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// Hello.g:313:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// Hello.g:314:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			// Hello.g:315:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			pushFollow(FOLLOW_lvalue_in_atribstat985);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat991); if (state.failed) return;
			// Hello.g:317:2: ( expression | allocexpression | funccall | TEXTO )
			int alt9=4;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt9=1;
				}
				break;
			case T_NEW:
				{
				alt9=2;
				}
				break;
			case FUNCAO:
				{
				alt9=3;
				}
				break;
			case TEXTO:
				{
				alt9=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// Hello.g:317:4: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat997);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:317:17: allocexpression
					{
					pushFollow(FOLLOW_allocexpression_in_atribstat1001);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:317:35: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat1005);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:317:46: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat1009); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 9, atribstat_StartIndex); }

		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// Hello.g:320:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		int allocexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// Hello.g:320:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			// Hello.g:320:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression1021); if (state.failed) return;
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression1023); if (state.failed) return;
			// Hello.g:320:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==T_ABRECOLCHETE) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Hello.g:320:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression1026); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_allocexpression1028);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression1030); if (state.failed) return;
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, allocexpression_StartIndex); }

		}
	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// Hello.g:323:1: funccall : FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// Hello.g:324:2: ( FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES )
			// Hello.g:324:4: FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall1043); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall1054); if (state.failed) return;
			// Hello.g:326:17: ( paramlistcall )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==T_FECHAPARENTESES) ) {
				int LA11_1 = input.LA(2);
				if ( (synpred22_Hello()) ) {
					alt11=1;
				}
			}
			else if ( ((LA11_0 >= ID && LA11_0 <= TEXTO)||LA11_0==T_ABREPARENTESES||(LA11_0 >= T_SOMA && LA11_0 <= T_SUBTRACAO)) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Hello.g:326:19: paramlistcall
					{
					pushFollow(FOLLOW_paramlistcall_in_funccall1075);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1088); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, funccall_StartIndex); }

		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// Hello.g:330:1: paramlistcall : ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? ;
	public final void paramlistcall() throws RecognitionException {
		int paramlistcall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// Hello.g:331:2: ( ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? )
			// Hello.g:331:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			{
			// Hello.g:331:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			int alt14=3;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ID && LA14_0 <= TEXTO)||LA14_0==T_ABREPARENTESES||(LA14_0 >= T_SOMA && LA14_0 <= T_SUBTRACAO)) ) {
				int LA14_1 = input.LA(2);
				if ( (synpred25_Hello()) ) {
					alt14=1;
				}
				else if ( (synpred28_Hello()) ) {
					alt14=2;
				}
			}
			switch (alt14) {
				case 1 :
					// Hello.g:331:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
					{
					// Hello.g:331:8: ( ID | TEXTO | expression )
					int alt12=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						int LA12_1 = input.LA(2);
						if ( (synpred23_Hello()) ) {
							alt12=1;
						}
						else if ( (true) ) {
							alt12=3;
						}

						}
						break;
					case TEXTO:
						{
						alt12=2;
						}
						break;
					case NUMERO:
					case T_ABREPARENTESES:
					case T_SOMA:
					case T_SUBTRACAO:
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
							// Hello.g:331:9: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_paramlistcall1106); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:331:45: TEXTO
							{
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1110); if (state.failed) return;
							}
							break;
						case 3 :
							// Hello.g:331:53: expression
							{
							pushFollow(FOLLOW_expression_in_paramlistcall1114);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall1117); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall1119);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:331:91: ( ID | TEXTO | expression )
					{
					// Hello.g:331:91: ( ID | TEXTO | expression )
					int alt13=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						int LA13_1 = input.LA(2);
						if ( (synpred26_Hello()) ) {
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
							// Hello.g:331:92: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_paramlistcall1126); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:331:128: TEXTO
							{
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1130); if (state.failed) return;
							}
							break;
						case 3 :
							// Hello.g:331:136: expression
							{
							pushFollow(FOLLOW_expression_in_paramlistcall1134);
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
			if ( state.backtracking>0 ) { memoize(input, 12, paramlistcall_StartIndex); }

		}
	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "printstat"
	// Hello.g:334:1: printstat : T_WRITE ( lvalue | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// Hello.g:335:2: ( T_WRITE ( lvalue | TEXTO | expression ) )
			// Hello.g:335:4: T_WRITE ( lvalue | TEXTO | expression )
			{
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1149); if (state.failed) return;
			// Hello.g:335:12: ( lvalue | TEXTO | expression )
			int alt15=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA15_1 = input.LA(2);
				if ( (synpred29_Hello()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=3;
				}

				}
				break;
			case TEXTO:
				{
				alt15=2;
				}
				break;
			case NUMERO:
			case T_ABREPARENTESES:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt15=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// Hello.g:335:14: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_printstat1153);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:335:23: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1157); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:335:31: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1161);
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
			if ( state.backtracking>0 ) { memoize(input, 13, printstat_StartIndex); }

		}
	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// Hello.g:338:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// Hello.g:339:2: ( T_READ lvalue )
			// Hello.g:339:4: T_READ lvalue
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1175); if (state.failed) return;
			pushFollow(FOLLOW_lvalue_in_readstat1177);
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
			if ( state.backtracking>0 ) { memoize(input, 14, readstat_StartIndex); }

		}
	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// Hello.g:342:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// Hello.g:343:2: ( T_RETURN ( TEXTO | expression )? )
			// Hello.g:343:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1189); if (state.failed) return;
			// Hello.g:343:13: ( TEXTO | expression )?
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==TEXTO) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= ID && LA16_0 <= NUMERO)||LA16_0==T_ABREPARENTESES||(LA16_0 >= T_SOMA && LA16_0 <= T_SUBTRACAO)) ) {
				alt16=2;
			}
			switch (alt16) {
				case 1 :
					// Hello.g:343:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1193); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:343:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1197);
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
			if ( state.backtracking>0 ) { memoize(input, 15, returnstat_StartIndex); }

		}
	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// Hello.g:346:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// Hello.g:346:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE )
			// Hello.g:346:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1211); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1214); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1216);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1218); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1224); if (state.failed) return;
			// Hello.g:347:16: ( statement )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==EOL||LA17_0==ID||(LA17_0 >= TIPOS && LA17_0 <= T_ABRECHAVE)||LA17_0==T_BREAK||(LA17_0 >= T_FOR && LA17_0 <= T_IF)||(LA17_0 >= T_READ && LA17_0 <= T_RETURN)||LA17_0==T_WRITE) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Hello.g:347:17: statement
					{
					pushFollow(FOLLOW_statement_in_ifstat1227);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop17;
				}
			}

			// Hello.g:348:4: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==T_FECHACHAVE) ) {
					int LA19_1 = input.LA(2);
					if ( (synpred35_Hello()) ) {
						alt19=1;
					}

				}

				switch (alt19) {
				case 1 :
					// Hello.g:348:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
					{
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1236); if (state.failed) return;
					match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_ifstat1238); if (state.failed) return;
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1240); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_ifstat1242);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1244); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1246); if (state.failed) return;
					// Hello.g:348:86: ( statement )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==EOL||LA18_0==ID||(LA18_0 >= TIPOS && LA18_0 <= T_ABRECHAVE)||LA18_0==T_BREAK||(LA18_0 >= T_FOR && LA18_0 <= T_IF)||(LA18_0 >= T_READ && LA18_0 <= T_RETURN)||LA18_0==T_WRITE) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// Hello.g:348:87: statement
							{
							pushFollow(FOLLOW_statement_in_ifstat1249);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

				default :
					break loop19;
				}
			}

			// Hello.g:349:4: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==T_FECHACHAVE) ) {
				int LA21_1 = input.LA(2);
				if ( (synpred37_Hello()) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// Hello.g:349:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
					{
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1261); if (state.failed) return;
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1263); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1265); if (state.failed) return;
					// Hello.g:349:38: ( statement )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==EOL||LA20_0==ID||(LA20_0 >= TIPOS && LA20_0 <= T_ABRECHAVE)||LA20_0==T_BREAK||(LA20_0 >= T_FOR && LA20_0 <= T_IF)||(LA20_0 >= T_READ && LA20_0 <= T_RETURN)||LA20_0==T_WRITE) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// Hello.g:349:39: statement
							{
							pushFollow(FOLLOW_statement_in_ifstat1268);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop20;
						}
					}

					}
					break;

			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1278); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// Hello.g:353:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// Hello.g:353:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			// Hello.g:353:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1289); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1291); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1293);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1295); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1297);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1299); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1301);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1303); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1315); if (state.failed) return;
			// Hello.g:354:22: ( statement )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==EOL||LA22_0==ID||(LA22_0 >= TIPOS && LA22_0 <= T_ABRECHAVE)||LA22_0==T_BREAK||(LA22_0 >= T_FOR && LA22_0 <= T_IF)||(LA22_0 >= T_READ && LA22_0 <= T_RETURN)||LA22_0==T_WRITE) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Hello.g:354:23: statement
					{
					pushFollow(FOLLOW_statement_in_forstat1318);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1322); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, forstat_StartIndex); }

		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// Hello.g:360:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// Hello.g:360:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			// Hello.g:360:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			pushFollow(FOLLOW_numexpression_in_expression1338);
			numexpression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:360:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==T_DIFERENTE||(LA23_0 >= T_IGUAL && LA23_0 <= T_MENOROUIGUAL)) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Hello.g:360:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
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
					pushFollow(FOLLOW_numexpression_in_expression1368);
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
			if ( state.backtracking>0 ) { memoize(input, 18, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// Hello.g:363:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		int numexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// Hello.g:363:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// Hello.g:363:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_numexpression1380);
			term();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:363:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= T_SOMA && LA24_0 <= T_SUBTRACAO)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// Hello.g:363:23: ( T_SOMA | T_SUBTRACAO ) term
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
					pushFollow(FOLLOW_term_in_numexpression1393);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
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
			if ( state.backtracking>0 ) { memoize(input, 19, numexpression_StartIndex); }

		}
	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// Hello.g:366:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// Hello.g:366:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			// Hello.g:367:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_term1407);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:367:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==T_DIVISAO||LA25_0==T_MULTIPLICACAO) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// Hello.g:367:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
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
					pushFollow(FOLLOW_unaryexpr_in_term1420);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop25;
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
			if ( state.backtracking>0 ) { memoize(input, 20, term_StartIndex); }

		}
	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// Hello.g:370:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// Hello.g:370:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			// Hello.g:370:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			// Hello.g:370:14: ( T_SOMA | T_SUBTRACAO )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= T_SOMA && LA26_0 <= T_SUBTRACAO)) ) {
				alt26=1;
			}
			switch (alt26) {
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

			pushFollow(FOLLOW_factor_in_unaryexpr1444);
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
			if ( state.backtracking>0 ) { memoize(input, 21, unaryexpr_StartIndex); }

		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// Hello.g:373:1: factor : ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// Hello.g:373:8: ( ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			// Hello.g:373:10: ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			// Hello.g:373:10: ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt27=3;
			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt27=1;
				}
				break;
			case ID:
				{
				alt27=2;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt27=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// Hello.g:373:12: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1456); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:373:21: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_factor1460);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:373:30: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1464); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_factor1466);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1468); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 22, factor_StartIndex); }

		}
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred2_Hello
	public final void synpred2_Hello_fragment() throws RecognitionException {
		// Hello.g:268:2: ( funcdef funclist )
		// Hello.g:268:2: funcdef funclist
		{
		pushFollow(FOLLOW_funcdef_in_synpred2_Hello671);
		funcdef();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_funclist_in_synpred2_Hello673);
		funclist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Hello

	// $ANTLR start synpred3_Hello
	public final void synpred3_Hello_fragment() throws RecognitionException {
		// Hello.g:283:16: ( TIPOS ID T_VIRGULA paramlist )
		// Hello.g:283:16: TIPOS ID T_VIRGULA paramlist
		{
		match(input,TIPOS,FOLLOW_TIPOS_in_synpred3_Hello792); if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred3_Hello797); if (state.failed) return;
		match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_synpred3_Hello799); if (state.failed) return;
		pushFollow(FOLLOW_paramlist_in_synpred3_Hello801);
		paramlist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_Hello

	// $ANTLR start synpred4_Hello
	public final void synpred4_Hello_fragment() throws RecognitionException {
		// Hello.g:283:79: ( TIPOS ID )
		// Hello.g:283:79: TIPOS ID
		{
		match(input,TIPOS,FOLLOW_TIPOS_in_synpred4_Hello805); if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred4_Hello810); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_Hello

	// $ANTLR start synpred22_Hello
	public final void synpred22_Hello_fragment() throws RecognitionException {
		// Hello.g:326:19: ( paramlistcall )
		// Hello.g:326:19: paramlistcall
		{
		pushFollow(FOLLOW_paramlistcall_in_synpred22_Hello1075);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_Hello

	// $ANTLR start synpred23_Hello
	public final void synpred23_Hello_fragment() throws RecognitionException {
		// Hello.g:331:9: ( ID )
		// Hello.g:331:9: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred23_Hello1106); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Hello

	// $ANTLR start synpred25_Hello
	public final void synpred25_Hello_fragment() throws RecognitionException {
		// Hello.g:331:8: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall )
		// Hello.g:331:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
		{
		// Hello.g:331:8: ( ID | TEXTO | expression )
		int alt28=3;
		switch ( input.LA(1) ) {
		case ID:
			{
			int LA28_1 = input.LA(2);
			if ( (synpred23_Hello()) ) {
				alt28=1;
			}
			else if ( (true) ) {
				alt28=3;
			}

			}
			break;
		case TEXTO:
			{
			alt28=2;
			}
			break;
		case NUMERO:
		case T_ABREPARENTESES:
		case T_SOMA:
		case T_SUBTRACAO:
			{
			alt28=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 28, 0, input);
			throw nvae;
		}
		switch (alt28) {
			case 1 :
				// Hello.g:331:9: ID
				{
				match(input,ID,FOLLOW_ID_in_synpred25_Hello1106); if (state.failed) return;
				}
				break;
			case 2 :
				// Hello.g:331:45: TEXTO
				{
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred25_Hello1110); if (state.failed) return;
				}
				break;
			case 3 :
				// Hello.g:331:53: expression
				{
				pushFollow(FOLLOW_expression_in_synpred25_Hello1114);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_synpred25_Hello1117); if (state.failed) return;
		pushFollow(FOLLOW_paramlistcall_in_synpred25_Hello1119);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred25_Hello

	// $ANTLR start synpred26_Hello
	public final void synpred26_Hello_fragment() throws RecognitionException {
		// Hello.g:331:92: ( ID )
		// Hello.g:331:92: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred26_Hello1126); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Hello

	// $ANTLR start synpred28_Hello
	public final void synpred28_Hello_fragment() throws RecognitionException {
		// Hello.g:331:91: ( ( ID | TEXTO | expression ) )
		// Hello.g:331:91: ( ID | TEXTO | expression )
		{
		// Hello.g:331:91: ( ID | TEXTO | expression )
		int alt29=3;
		switch ( input.LA(1) ) {
		case ID:
			{
			int LA29_1 = input.LA(2);
			if ( (synpred26_Hello()) ) {
				alt29=1;
			}
			else if ( (true) ) {
				alt29=3;
			}

			}
			break;
		case TEXTO:
			{
			alt29=2;
			}
			break;
		case NUMERO:
		case T_ABREPARENTESES:
		case T_SOMA:
		case T_SUBTRACAO:
			{
			alt29=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 29, 0, input);
			throw nvae;
		}
		switch (alt29) {
			case 1 :
				// Hello.g:331:92: ID
				{
				match(input,ID,FOLLOW_ID_in_synpred28_Hello1126); if (state.failed) return;
				}
				break;
			case 2 :
				// Hello.g:331:128: TEXTO
				{
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred28_Hello1130); if (state.failed) return;
				}
				break;
			case 3 :
				// Hello.g:331:136: expression
				{
				pushFollow(FOLLOW_expression_in_synpred28_Hello1134);
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
		// Hello.g:335:14: ( lvalue )
		// Hello.g:335:14: lvalue
		{
		pushFollow(FOLLOW_lvalue_in_synpred29_Hello1153);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_Hello

	// $ANTLR start synpred35_Hello
	public final void synpred35_Hello_fragment() throws RecognitionException {
		// Hello.g:348:6: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )
		// Hello.g:348:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
		{
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred35_Hello1236); if (state.failed) return;
		match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_synpred35_Hello1238); if (state.failed) return;
		match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_synpred35_Hello1240); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred35_Hello1242);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_synpred35_Hello1244); if (state.failed) return;
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred35_Hello1246); if (state.failed) return;
		// Hello.g:348:86: ( statement )*
		loop30:
		while (true) {
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==EOL||LA30_0==ID||(LA30_0 >= TIPOS && LA30_0 <= T_ABRECHAVE)||LA30_0==T_BREAK||(LA30_0 >= T_FOR && LA30_0 <= T_IF)||(LA30_0 >= T_READ && LA30_0 <= T_RETURN)||LA30_0==T_WRITE) ) {
				alt30=1;
			}

			switch (alt30) {
			case 1 :
				// Hello.g:348:87: statement
				{
				pushFollow(FOLLOW_statement_in_synpred35_Hello1249);
				statement();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop30;
			}
		}

		}

	}
	// $ANTLR end synpred35_Hello

	// $ANTLR start synpred37_Hello
	public final void synpred37_Hello_fragment() throws RecognitionException {
		// Hello.g:349:6: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )
		// Hello.g:349:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
		{
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred37_Hello1261); if (state.failed) return;
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred37_Hello1263); if (state.failed) return;
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred37_Hello1265); if (state.failed) return;
		// Hello.g:349:38: ( statement )*
		loop31:
		while (true) {
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EOL||LA31_0==ID||(LA31_0 >= TIPOS && LA31_0 <= T_ABRECHAVE)||LA31_0==T_BREAK||(LA31_0 >= T_FOR && LA31_0 <= T_IF)||(LA31_0 >= T_READ && LA31_0 <= T_RETURN)||LA31_0==T_WRITE) ) {
				alt31=1;
			}

			switch (alt31) {
			case 1 :
				// Hello.g:349:39: statement
				{
				pushFollow(FOLLOW_statement_in_synpred37_Hello1268);
				statement();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop31;
			}
		}

		}

	}
	// $ANTLR end synpred37_Hello

	// Delegated rules

	public final boolean synpred3_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
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
	public final boolean synpred35_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred35_Hello_fragment(); // can never throw exception
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
	public final boolean synpred37_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_Hello_fragment(); // can never throw exception
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
	public final boolean synpred4_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef632 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef636 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef638 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef640 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef642 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef647 = new BitSet(new long[]{0x0000008C06011920L});
	public static final BitSet FOLLOW_statelist_in_funcdef654 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist671 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_funclist673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist792 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist797 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist799 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist805 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist822 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_statelist_in_statelist825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement838 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement845 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement852 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement860 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement866 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement883 = new BitSet(new long[]{0x0000008C06011920L});
	public static final BitSet FOLLOW_statelist_in_statement885 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement892 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl917 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl924 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl927 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl933 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl937 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl941 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue956 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue962 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue966 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue970 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat985 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat991 = new BitSet(new long[]{0x0000003200004780L});
	public static final BitSet FOLLOW_expression_in_atribstat997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression1021 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression1023 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression1026 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression1028 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression1030 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall1043 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall1054 = new BitSet(new long[]{0x0000003001004700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall1075 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1106 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1110 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1114 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall1117 = new BitSet(new long[]{0x0000003000004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1149 = new BitSet(new long[]{0x0000003000004700L});
	public static final BitSet FOLLOW_lvalue_in_printstat1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1175 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1189 = new BitSet(new long[]{0x0000003000004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1211 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1214 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1216 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1218 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1224 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_ifstat1227 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1236 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_ifstat1238 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1240 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1242 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1244 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1246 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_ifstat1249 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1261 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1263 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1265 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_ifstat1268 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1289 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1291 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1293 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1295 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_forstat1297 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1299 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1301 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1303 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1315 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_forstat1318 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1338 = new BitSet(new long[]{0x00000000F8040002L});
	public static final BitSet FOLLOW_set_in_expression1342 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1380 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1383 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_term_in_numexpression1393 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1407 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_set_in_term1411 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1420 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1464 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1466 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_synpred2_Hello671 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_synpred2_Hello673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_synpred3_Hello792 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_synpred3_Hello797 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_synpred3_Hello799 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_synpred3_Hello801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_synpred4_Hello805 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_synpred4_Hello810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred22_Hello1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred23_Hello1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred25_Hello1106 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_TEXTO_in_synpred25_Hello1110 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_synpred25_Hello1114 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_synpred25_Hello1117 = new BitSet(new long[]{0x0000003000004700L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred25_Hello1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred26_Hello1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred28_Hello1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_synpred28_Hello1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred28_Hello1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred29_Hello1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred35_Hello1236 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_synpred35_Hello1238 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_synpred35_Hello1240 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_synpred35_Hello1242 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_synpred35_Hello1244 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred35_Hello1246 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_statement_in_synpred35_Hello1249 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred37_Hello1261 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred37_Hello1263 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred37_Hello1265 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_statement_in_synpred37_Hello1268 = new BitSet(new long[]{0x0000008C06011922L});
}
