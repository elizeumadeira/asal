// $ANTLR 3.5.2 Hello.g 2022-03-01 15:56:13

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
		"T_MENOR", "T_MENOROUIGUAL", "T_MULTIPLICACAO", "T_NEW", "T_NULL", "T_READ", 
		"T_RETURN", "T_SOMA", "T_SUBTRACAO", "T_VIRGULA", "T_WRITE"
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
	public static final int T_NULL=34;
	public static final int T_READ=35;
	public static final int T_RETURN=36;
	public static final int T_SOMA=37;
	public static final int T_SUBTRACAO=38;
	public static final int T_VIRGULA=39;
	public static final int T_WRITE=40;

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
		this.state.ruleMemo = new HashMap[71+1];


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
	// Hello.g:261:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// Hello.g:261:9: ( ( statement | funclist ) )
			// Hello.g:262:2: ( statement | funclist )
			{
			// Hello.g:262:2: ( statement | funclist )
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
					// Hello.g:262:4: statement
					{
					pushFollow(FOLLOW_statement_in_program627);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:262:16: funclist
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
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
	}
	// $ANTLR end "program"



	// $ANTLR start "funcdef"
	// Hello.g:265:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		int funcdef_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// Hello.g:266:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			// Hello.g:266:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef645); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaFuncao(input.LT(1)); }
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef649); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef651); if (state.failed) return;
			pushFollow(FOLLOW_paramlist_in_funcdef653);
			paramlist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef655); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef660); if (state.failed) return;
			pushFollow(FOLLOW_statelist_in_funcdef667);
			statelist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef671); if (state.failed) return;
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
	// Hello.g:272:1: funclist : ( funcdef funclist | funcdef );
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// Hello.g:272:10: ( funcdef funclist | funcdef )
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
					// Hello.g:272:12: funcdef funclist
					{
					pushFollow(FOLLOW_funcdef_in_funclist682);
					funcdef();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_funclist_in_funclist684);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:272:31: funcdef
					{
					pushFollow(FOLLOW_funcdef_in_funclist688);
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
	// Hello.g:275:1: paramlist : ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )? ;
	public final void paramlist() throws RecognitionException {
		int paramlist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// Hello.g:275:11: ( ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )? )
			// Hello.g:275:14: ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )?
			{
			// Hello.g:275:14: ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )?
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
					// Hello.g:275:16: TIPOS ID T_VIRGULA paramlist
					{
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist701); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist706); if (state.failed) return;
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist708); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_in_paramlist710);
					paramlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:275:79: TIPOS ID
					{
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist714); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist719); if (state.failed) return;
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
	// Hello.g:278:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// Hello.g:278:11: ( statement ( statelist )? )
			// Hello.g:278:13: statement ( statelist )?
			{
			pushFollow(FOLLOW_statement_in_statelist731);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:278:23: ( statelist )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EOL||LA4_0==ID||(LA4_0 >= TIPOS && LA4_0 <= T_ABRECHAVE)||LA4_0==T_BREAK||(LA4_0 >= T_FOR && LA4_0 <= T_IF)||(LA4_0 >= T_READ && LA4_0 <= T_RETURN)||LA4_0==T_WRITE) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Hello.g:278:24: statelist
					{
					pushFollow(FOLLOW_statelist_in_statelist734);
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
	// Hello.g:281:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// Hello.g:282:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			// Hello.g:282:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			// Hello.g:282:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
					// Hello.g:282:4: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement747);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement749); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:283:2: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement754);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement756); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:284:2: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement761);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement763); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:285:2: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement769);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement771); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:286:2: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement775);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement777); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:287:2: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement782);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:288:2: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement787);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:289:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement792); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement794);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement796); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:290:2: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement801); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement803); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:291:2: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement808); if (state.failed) return;
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
	// Hello.g:294:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// Hello.g:295:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:296:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl826); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl833); if (state.failed) return;
			// Hello.g:297:37: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==T_ABRECOLCHETE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Hello.g:297:38: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl836); if (state.failed) return;
					// Hello.g:297:53: ( ID | NUMERO )
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
							// Hello.g:297:55: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl842); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:297:91: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl846); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl850); if (state.failed) return;
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
	// Hello.g:300:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// Hello.g:301:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			// Hello.g:301:4: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_lvalue865); if (state.failed) return;
			// Hello.g:302:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:302:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue871); if (state.failed) return;
					// Hello.g:302:20: ( numexpression )
					// Hello.g:302:22: numexpression
					{
					pushFollow(FOLLOW_numexpression_in_lvalue875);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue879); if (state.failed) return;
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
	// Hello.g:305:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// Hello.g:306:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			// Hello.g:307:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			pushFollow(FOLLOW_lvalue_in_atribstat894);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat900); if (state.failed) return;
			// Hello.g:309:2: ( expression | allocexpression | funccall | TEXTO )
			int alt9=4;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
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
					// Hello.g:309:4: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat906);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:309:17: allocexpression
					{
					pushFollow(FOLLOW_allocexpression_in_atribstat910);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:309:35: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat914);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:309:46: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat918); if (state.failed) return;
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
	// Hello.g:312:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		int allocexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// Hello.g:312:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			// Hello.g:312:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression930); if (state.failed) return;
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression932); if (state.failed) return;
			// Hello.g:312:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
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
					// Hello.g:312:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression935); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_allocexpression937);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression939); if (state.failed) return;
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
	// Hello.g:315:1: funccall : FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// Hello.g:316:2: ( FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES )
			// Hello.g:316:4: FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall952); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall963); if (state.failed) return;
			// Hello.g:318:17: ( paramlistcall )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==T_FECHAPARENTESES) ) {
				int LA11_1 = input.LA(2);
				if ( (synpred22_Hello()) ) {
					alt11=1;
				}
			}
			else if ( ((LA11_0 >= ID && LA11_0 <= TEXTO)||LA11_0==T_ABREPARENTESES||LA11_0==T_NULL||(LA11_0 >= T_SOMA && LA11_0 <= T_SUBTRACAO)) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Hello.g:318:19: paramlistcall
					{
					pushFollow(FOLLOW_paramlistcall_in_funccall984);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall997); if (state.failed) return;
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
	// Hello.g:322:1: paramlistcall : ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? ;
	public final void paramlistcall() throws RecognitionException {
		int paramlistcall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// Hello.g:323:2: ( ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? )
			// Hello.g:323:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			{
			// Hello.g:323:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			int alt14=3;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ID && LA14_0 <= TEXTO)||LA14_0==T_ABREPARENTESES||LA14_0==T_NULL||(LA14_0 >= T_SOMA && LA14_0 <= T_SUBTRACAO)) ) {
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
					// Hello.g:323:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
					{
					// Hello.g:323:8: ( ID | TEXTO | expression )
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
					case T_NULL:
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
							// Hello.g:323:9: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_paramlistcall1015); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:323:45: TEXTO
							{
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1019); if (state.failed) return;
							}
							break;
						case 3 :
							// Hello.g:323:53: expression
							{
							pushFollow(FOLLOW_expression_in_paramlistcall1023);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall1026); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall1028);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:323:91: ( ID | TEXTO | expression )
					{
					// Hello.g:323:91: ( ID | TEXTO | expression )
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
							// Hello.g:323:92: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_paramlistcall1035); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:323:128: TEXTO
							{
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1039); if (state.failed) return;
							}
							break;
						case 3 :
							// Hello.g:323:136: expression
							{
							pushFollow(FOLLOW_expression_in_paramlistcall1043);
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
	// Hello.g:326:1: printstat : T_WRITE ( lvalue | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// Hello.g:327:2: ( T_WRITE ( lvalue | TEXTO | expression ) )
			// Hello.g:327:4: T_WRITE ( lvalue | TEXTO | expression )
			{
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1058); if (state.failed) return;
			// Hello.g:327:12: ( lvalue | TEXTO | expression )
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
			case T_NULL:
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
					// Hello.g:327:14: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_printstat1062);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:327:23: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1066); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:327:31: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1070);
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
	// Hello.g:330:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// Hello.g:331:2: ( T_READ lvalue )
			// Hello.g:331:4: T_READ lvalue
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1084); if (state.failed) return;
			pushFollow(FOLLOW_lvalue_in_readstat1086);
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
	// Hello.g:334:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// Hello.g:335:2: ( T_RETURN ( TEXTO | expression )? )
			// Hello.g:335:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1098); if (state.failed) return;
			// Hello.g:335:13: ( TEXTO | expression )?
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==TEXTO) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= ID && LA16_0 <= NUMERO)||LA16_0==T_ABREPARENTESES||LA16_0==T_NULL||(LA16_0 >= T_SOMA && LA16_0 <= T_SUBTRACAO)) ) {
				alt16=2;
			}
			switch (alt16) {
				case 1 :
					// Hello.g:335:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1102); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:335:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1106);
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
	// Hello.g:342:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )? ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// Hello.g:342:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )? )
			// Hello.g:342:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )?
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1124); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1127); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1129);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1131); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifstat1133);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:344:4: ( T_ELSE statement )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==T_ELSE) ) {
				int LA17_1 = input.LA(2);
				if ( (synpred33_Hello()) ) {
					alt17=1;
				}
			}
			switch (alt17) {
				case 1 :
					// Hello.g:344:7: T_ELSE statement
					{
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1145); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_ifstat1148);
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
			if ( state.backtracking>0 ) { memoize(input, 16, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// Hello.g:350:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// Hello.g:350:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			// Hello.g:350:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1165); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1167); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1169);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1171); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1173);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1175); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1177);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1179); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1191); if (state.failed) return;
			// Hello.g:351:22: ( statement )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==EOL||LA18_0==ID||(LA18_0 >= TIPOS && LA18_0 <= T_ABRECHAVE)||LA18_0==T_BREAK||(LA18_0 >= T_FOR && LA18_0 <= T_IF)||(LA18_0 >= T_READ && LA18_0 <= T_RETURN)||LA18_0==T_WRITE) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Hello.g:351:23: statement
					{
					pushFollow(FOLLOW_statement_in_forstat1194);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1198); if (state.failed) return;
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
	// Hello.g:354:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// Hello.g:354:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			// Hello.g:354:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			pushFollow(FOLLOW_numexpression_in_expression1210);
			numexpression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:354:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==T_DIFERENTE||(LA19_0 >= T_IGUAL && LA19_0 <= T_MENOROUIGUAL)) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Hello.g:354:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
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
					pushFollow(FOLLOW_numexpression_in_expression1240);
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
	// Hello.g:357:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		int numexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// Hello.g:357:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// Hello.g:357:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_numexpression1252);
			term();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:357:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= T_SOMA && LA20_0 <= T_SUBTRACAO)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// Hello.g:357:23: ( T_SOMA | T_SUBTRACAO ) term
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
					pushFollow(FOLLOW_term_in_numexpression1265);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop20;
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
	// Hello.g:360:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// Hello.g:360:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			// Hello.g:361:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_term1278);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:361:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==T_DIVISAO||LA21_0==T_MULTIPLICACAO) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Hello.g:361:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
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
					pushFollow(FOLLOW_unaryexpr_in_term1291);
					unaryexpr();
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
			if ( state.backtracking>0 ) { memoize(input, 20, term_StartIndex); }

		}
	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// Hello.g:364:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// Hello.g:364:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			// Hello.g:364:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			// Hello.g:364:14: ( T_SOMA | T_SUBTRACAO )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= T_SOMA && LA22_0 <= T_SUBTRACAO)) ) {
				alt22=1;
			}
			switch (alt22) {
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

			pushFollow(FOLLOW_factor_in_unaryexpr1315);
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
	// Hello.g:367:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// Hello.g:367:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			// Hello.g:367:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			// Hello.g:367:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt23=4;
			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt23=1;
				}
				break;
			case ID:
				{
				alt23=2;
				}
				break;
			case T_NULL:
				{
				alt23=3;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt23=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// Hello.g:367:12: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1327); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:367:21: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_factor1331);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:367:30: T_NULL
					{
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1335); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:367:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1339); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_factor1341);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1343); if (state.failed) return;
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
		// Hello.g:272:12: ( funcdef funclist )
		// Hello.g:272:12: funcdef funclist
		{
		pushFollow(FOLLOW_funcdef_in_synpred2_Hello682);
		funcdef();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_funclist_in_synpred2_Hello684);
		funclist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Hello

	// $ANTLR start synpred3_Hello
	public final void synpred3_Hello_fragment() throws RecognitionException {
		// Hello.g:275:16: ( TIPOS ID T_VIRGULA paramlist )
		// Hello.g:275:16: TIPOS ID T_VIRGULA paramlist
		{
		match(input,TIPOS,FOLLOW_TIPOS_in_synpred3_Hello701); if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred3_Hello706); if (state.failed) return;
		match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_synpred3_Hello708); if (state.failed) return;
		pushFollow(FOLLOW_paramlist_in_synpred3_Hello710);
		paramlist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_Hello

	// $ANTLR start synpred4_Hello
	public final void synpred4_Hello_fragment() throws RecognitionException {
		// Hello.g:275:79: ( TIPOS ID )
		// Hello.g:275:79: TIPOS ID
		{
		match(input,TIPOS,FOLLOW_TIPOS_in_synpred4_Hello714); if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred4_Hello719); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_Hello

	// $ANTLR start synpred22_Hello
	public final void synpred22_Hello_fragment() throws RecognitionException {
		// Hello.g:318:19: ( paramlistcall )
		// Hello.g:318:19: paramlistcall
		{
		pushFollow(FOLLOW_paramlistcall_in_synpred22_Hello984);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_Hello

	// $ANTLR start synpred23_Hello
	public final void synpred23_Hello_fragment() throws RecognitionException {
		// Hello.g:323:9: ( ID )
		// Hello.g:323:9: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred23_Hello1015); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Hello

	// $ANTLR start synpred25_Hello
	public final void synpred25_Hello_fragment() throws RecognitionException {
		// Hello.g:323:8: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall )
		// Hello.g:323:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
		{
		// Hello.g:323:8: ( ID | TEXTO | expression )
		int alt24=3;
		switch ( input.LA(1) ) {
		case ID:
			{
			int LA24_1 = input.LA(2);
			if ( (synpred23_Hello()) ) {
				alt24=1;
			}
			else if ( (true) ) {
				alt24=3;
			}

			}
			break;
		case TEXTO:
			{
			alt24=2;
			}
			break;
		case NUMERO:
		case T_ABREPARENTESES:
		case T_NULL:
		case T_SOMA:
		case T_SUBTRACAO:
			{
			alt24=3;
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
				// Hello.g:323:9: ID
				{
				match(input,ID,FOLLOW_ID_in_synpred25_Hello1015); if (state.failed) return;
				}
				break;
			case 2 :
				// Hello.g:323:45: TEXTO
				{
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred25_Hello1019); if (state.failed) return;
				}
				break;
			case 3 :
				// Hello.g:323:53: expression
				{
				pushFollow(FOLLOW_expression_in_synpred25_Hello1023);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_synpred25_Hello1026); if (state.failed) return;
		pushFollow(FOLLOW_paramlistcall_in_synpred25_Hello1028);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred25_Hello

	// $ANTLR start synpred26_Hello
	public final void synpred26_Hello_fragment() throws RecognitionException {
		// Hello.g:323:92: ( ID )
		// Hello.g:323:92: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred26_Hello1035); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Hello

	// $ANTLR start synpred28_Hello
	public final void synpred28_Hello_fragment() throws RecognitionException {
		// Hello.g:323:91: ( ( ID | TEXTO | expression ) )
		// Hello.g:323:91: ( ID | TEXTO | expression )
		{
		// Hello.g:323:91: ( ID | TEXTO | expression )
		int alt25=3;
		switch ( input.LA(1) ) {
		case ID:
			{
			int LA25_1 = input.LA(2);
			if ( (synpred26_Hello()) ) {
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
				// Hello.g:323:92: ID
				{
				match(input,ID,FOLLOW_ID_in_synpred28_Hello1035); if (state.failed) return;
				}
				break;
			case 2 :
				// Hello.g:323:128: TEXTO
				{
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred28_Hello1039); if (state.failed) return;
				}
				break;
			case 3 :
				// Hello.g:323:136: expression
				{
				pushFollow(FOLLOW_expression_in_synpred28_Hello1043);
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
		// Hello.g:327:14: ( lvalue )
		// Hello.g:327:14: lvalue
		{
		pushFollow(FOLLOW_lvalue_in_synpred29_Hello1062);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_Hello

	// $ANTLR start synpred33_Hello
	public final void synpred33_Hello_fragment() throws RecognitionException {
		// Hello.g:344:7: ( T_ELSE statement )
		// Hello.g:344:7: T_ELSE statement
		{
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred33_Hello1145); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred33_Hello1148);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred33_Hello

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



	public static final BitSet FOLLOW_statement_in_program627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef645 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef649 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef651 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef653 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef655 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef660 = new BitSet(new long[]{0x0000011806011920L});
	public static final BitSet FOLLOW_statelist_in_funcdef667 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist682 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_funclist684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist701 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist706 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist708 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist714 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist731 = new BitSet(new long[]{0x0000011806011922L});
	public static final BitSet FOLLOW_statelist_in_statelist734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement747 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement754 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement761 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement769 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement775 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement792 = new BitSet(new long[]{0x0000011806011920L});
	public static final BitSet FOLLOW_statelist_in_statement794 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement801 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl826 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl833 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl836 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl842 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl846 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl850 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue865 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue871 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue875 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue879 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat894 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat900 = new BitSet(new long[]{0x0000006600004780L});
	public static final BitSet FOLLOW_expression_in_atribstat906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression930 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression932 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression935 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression937 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression939 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall952 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall963 = new BitSet(new long[]{0x0000006401004700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall984 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1015 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1019 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1023 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall1026 = new BitSet(new long[]{0x0000006400004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1058 = new BitSet(new long[]{0x0000006400004700L});
	public static final BitSet FOLLOW_lvalue_in_printstat1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1084 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1098 = new BitSet(new long[]{0x0000006400004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1124 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1127 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1129 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1131 = new BitSet(new long[]{0x0000011806011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1133 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1145 = new BitSet(new long[]{0x0000011806011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1165 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1167 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1169 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1171 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_expression_in_forstat1173 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1175 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1177 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1179 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1191 = new BitSet(new long[]{0x0000011806411920L});
	public static final BitSet FOLLOW_statement_in_forstat1194 = new BitSet(new long[]{0x0000011806411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1210 = new BitSet(new long[]{0x00000000F8040002L});
	public static final BitSet FOLLOW_set_in_expression1214 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1252 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1255 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_term_in_numexpression1265 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1278 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_set_in_term1282 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1291 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1339 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1341 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_synpred2_Hello682 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_synpred2_Hello684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_synpred3_Hello701 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_synpred3_Hello706 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_synpred3_Hello708 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_synpred3_Hello710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_synpred4_Hello714 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_synpred4_Hello719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred22_Hello984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred23_Hello1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred25_Hello1015 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_TEXTO_in_synpred25_Hello1019 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_expression_in_synpred25_Hello1023 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_synpred25_Hello1026 = new BitSet(new long[]{0x0000006400004700L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred25_Hello1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred26_Hello1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred28_Hello1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_synpred28_Hello1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred28_Hello1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred29_Hello1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred33_Hello1145 = new BitSet(new long[]{0x0000011806011920L});
	public static final BitSet FOLLOW_statement_in_synpred33_Hello1148 = new BitSet(new long[]{0x0000000000000002L});
}
