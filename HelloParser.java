// $ANTLR 3.5.2 Hello.g 2022-02-28 19:42:45

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
		this.state.ruleMemo = new HashMap[73+1];


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
			else if ( (LA1_0==EOF||LA1_0==T_DEF) ) {
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



	// $ANTLR start "funclist"
	// Hello.g:259:1: funclist : ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* ;
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// Hello.g:260:2: ( ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* )
			// Hello.g:261:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			{
			// Hello.g:261:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==T_DEF) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Hello.g:262:17: T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE
					{
					match(input,T_DEF,FOLLOW_T_DEF_in_funclist652); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaFuncao(input.LT(1)); }
					match(input,FUNCAO,FOLLOW_FUNCAO_in_funclist656); if (state.failed) return;
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funclist683); if (state.failed) return;
					// Hello.g:264:33: ( TIPOS ID ( T_VIRGULA TIPOS ID )* )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==TIPOS) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Hello.g:265:41: TIPOS ID ( T_VIRGULA TIPOS ID )*
							{
							if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
							match(input,TIPOS,FOLLOW_TIPOS_in_funclist763); if (state.failed) return;
							if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_funclist768); if (state.failed) return;
							// Hello.g:266:41: ( T_VIRGULA TIPOS ID )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==T_VIRGULA) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// Hello.g:266:42: T_VIRGULA TIPOS ID
									{
									match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funclist811); if (state.failed) return;
									if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
									match(input,TIPOS,FOLLOW_TIPOS_in_funclist816); if (state.failed) return;
									if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
									match(input,ID,FOLLOW_ID_in_funclist821); if (state.failed) return;
									}
									break;

								default :
									break loop2;
								}
							}

							}
							break;

					}

					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funclist886); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funclist912); if (state.failed) return;
					// Hello.g:270:33: ( statement )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==EOL||LA4_0==ID||(LA4_0 >= TIPOS && LA4_0 <= T_ABRECHAVE)||LA4_0==T_BREAK||(LA4_0 >= T_FOR && LA4_0 <= T_IF)||(LA4_0 >= T_READ && LA4_0 <= T_RETURN)||LA4_0==T_WRITE) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Hello.g:270:34: statement
							{
							pushFollow(FOLLOW_statement_in_funclist948);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funclist976); if (state.failed) return;
					}
					break;

				default :
					break loop5;
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
			if ( state.backtracking>0 ) { memoize(input, 2, funclist_StartIndex); }

		}
	}
	// $ANTLR end "funclist"



	// $ANTLR start "statement"
	// Hello.g:275:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// Hello.g:276:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			// Hello.g:276:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			// Hello.g:276:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
					// Hello.g:276:4: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement1000);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1002); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:277:2: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement1007);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1009); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:278:2: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement1014);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1016); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:279:2: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement1022);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1024); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:280:2: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement1028);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1030); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:281:2: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement1035);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:282:2: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement1040);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:283:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement1045); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement1047);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement1049); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:284:2: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement1054); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1056); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:285:2: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement1061); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 3, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// Hello.g:288:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// Hello.g:289:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:290:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl1079); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl1086); if (state.failed) return;
			// Hello.g:291:37: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:291:38: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl1089); if (state.failed) return;
					// Hello.g:291:53: ( ID | NUMERO )
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
							// Hello.g:291:55: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl1095); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:291:91: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl1099); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl1103); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 4, vardecl_StartIndex); }

		}
	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// Hello.g:294:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// Hello.g:295:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			// Hello.g:295:4: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_lvalue1118); if (state.failed) return;
			// Hello.g:296:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Hello.g:296:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue1124); if (state.failed) return;
					// Hello.g:296:20: ( numexpression )
					// Hello.g:296:22: numexpression
					{
					pushFollow(FOLLOW_numexpression_in_lvalue1128);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue1132); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 5, lvalue_StartIndex); }

		}
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// Hello.g:299:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// Hello.g:300:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			// Hello.g:301:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			pushFollow(FOLLOW_lvalue_in_atribstat1147);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat1153); if (state.failed) return;
			// Hello.g:303:2: ( expression | allocexpression | funccall | TEXTO )
			int alt10=4;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
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
					// Hello.g:303:4: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat1159);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:303:17: allocexpression
					{
					pushFollow(FOLLOW_allocexpression_in_atribstat1163);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:303:35: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat1167);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:303:46: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat1171); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 6, atribstat_StartIndex); }

		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// Hello.g:306:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		int allocexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// Hello.g:306:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			// Hello.g:306:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression1183); if (state.failed) return;
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression1185); if (state.failed) return;
			// Hello.g:306:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
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
					// Hello.g:306:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression1188); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_allocexpression1190);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression1192); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 7, allocexpression_StartIndex); }

		}
	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// Hello.g:309:1: funccall : FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// Hello.g:310:2: ( FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES )
			// Hello.g:310:4: FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall1205); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall1216); if (state.failed) return;
			// Hello.g:312:17: ( paramlistcall )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= ID && LA12_0 <= TEXTO)||LA12_0==T_ABREPARENTESES||(LA12_0 >= T_SOMA && LA12_0 <= T_SUBTRACAO)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Hello.g:312:19: paramlistcall
					{
					pushFollow(FOLLOW_paramlistcall_in_funccall1237);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1250); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, funccall_StartIndex); }

		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// Hello.g:316:1: paramlistcall : ( lvalue | TEXTO | expression ) ( T_VIRGULA ( ID | NUMERO ) )* ;
	public final void paramlistcall() throws RecognitionException {
		int paramlistcall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// Hello.g:317:2: ( ( lvalue | TEXTO | expression ) ( T_VIRGULA ( ID | NUMERO ) )* )
			// Hello.g:317:6: ( lvalue | TEXTO | expression ) ( T_VIRGULA ( ID | NUMERO ) )*
			{
			// Hello.g:317:6: ( lvalue | TEXTO | expression )
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
					// Hello.g:317:8: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_paramlistcall1265);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:317:17: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1269); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:317:25: expression
					{
					pushFollow(FOLLOW_expression_in_paramlistcall1273);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// Hello.g:318:9: ( T_VIRGULA ( ID | NUMERO ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==T_VIRGULA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Hello.g:318:10: T_VIRGULA ( ID | NUMERO )
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall1285); if (state.failed) return;
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
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

				default :
					break loop14;
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
			if ( state.backtracking>0 ) { memoize(input, 9, paramlistcall_StartIndex); }

		}
	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "printstat"
	// Hello.g:321:1: printstat : T_WRITE ( ID | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// Hello.g:322:2: ( T_WRITE ( ID | TEXTO | expression ) )
			// Hello.g:322:4: T_WRITE ( ID | TEXTO | expression )
			{
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1307); if (state.failed) return;
			// Hello.g:322:11: ( ID | TEXTO | expression )
			int alt15=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA15_1 = input.LA(2);
				if ( (synpred27_Hello()) ) {
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
					// Hello.g:322:13: ID
					{
					match(input,ID,FOLLOW_ID_in_printstat1310); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:322:18: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1314); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:322:26: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1318);
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
			if ( state.backtracking>0 ) { memoize(input, 10, printstat_StartIndex); }

		}
	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// Hello.g:325:1: readstat : T_READ ( ID | TEXTO | expression ) ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// Hello.g:326:2: ( T_READ ( ID | TEXTO | expression ) )
			// Hello.g:326:4: T_READ ( ID | TEXTO | expression )
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1333); if (state.failed) return;
			// Hello.g:326:10: ( ID | TEXTO | expression )
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
					// Hello.g:326:12: ID
					{
					match(input,ID,FOLLOW_ID_in_readstat1336); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:326:17: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_readstat1340); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:326:25: expression
					{
					pushFollow(FOLLOW_expression_in_readstat1344);
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
			if ( state.backtracking>0 ) { memoize(input, 11, readstat_StartIndex); }

		}
	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// Hello.g:329:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// Hello.g:330:2: ( T_RETURN ( TEXTO | expression )? )
			// Hello.g:330:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1359); if (state.failed) return;
			// Hello.g:330:13: ( TEXTO | expression )?
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TEXTO) ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= ID && LA17_0 <= NUMERO)||LA17_0==T_ABREPARENTESES||(LA17_0 >= T_SOMA && LA17_0 <= T_SUBTRACAO)) ) {
				alt17=2;
			}
			switch (alt17) {
				case 1 :
					// Hello.g:330:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1363); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:330:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1367);
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
			if ( state.backtracking>0 ) { memoize(input, 12, returnstat_StartIndex); }

		}
	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// Hello.g:333:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// Hello.g:333:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE )
			// Hello.g:333:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1381); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1384); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1386);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1388); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1394); if (state.failed) return;
			// Hello.g:334:16: ( statement )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==EOL||LA18_0==ID||(LA18_0 >= TIPOS && LA18_0 <= T_ABRECHAVE)||LA18_0==T_BREAK||(LA18_0 >= T_FOR && LA18_0 <= T_IF)||(LA18_0 >= T_READ && LA18_0 <= T_RETURN)||LA18_0==T_WRITE) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Hello.g:334:17: statement
					{
					pushFollow(FOLLOW_statement_in_ifstat1397);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			// Hello.g:335:4: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==T_FECHACHAVE) ) {
					int LA20_1 = input.LA(2);
					if ( (synpred35_Hello()) ) {
						alt20=1;
					}

				}

				switch (alt20) {
				case 1 :
					// Hello.g:335:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
					{
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1406); if (state.failed) return;
					match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_ifstat1408); if (state.failed) return;
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1410); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_ifstat1412);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1414); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1416); if (state.failed) return;
					// Hello.g:335:86: ( statement )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==EOL||LA19_0==ID||(LA19_0 >= TIPOS && LA19_0 <= T_ABRECHAVE)||LA19_0==T_BREAK||(LA19_0 >= T_FOR && LA19_0 <= T_IF)||(LA19_0 >= T_READ && LA19_0 <= T_RETURN)||LA19_0==T_WRITE) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// Hello.g:335:87: statement
							{
							pushFollow(FOLLOW_statement_in_ifstat1419);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

				default :
					break loop20;
				}
			}

			// Hello.g:336:4: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==T_FECHACHAVE) ) {
				int LA22_1 = input.LA(2);
				if ( (synpred37_Hello()) ) {
					alt22=1;
				}
			}
			switch (alt22) {
				case 1 :
					// Hello.g:336:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
					{
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1431); if (state.failed) return;
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1433); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1435); if (state.failed) return;
					// Hello.g:336:38: ( statement )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==EOL||LA21_0==ID||(LA21_0 >= TIPOS && LA21_0 <= T_ABRECHAVE)||LA21_0==T_BREAK||(LA21_0 >= T_FOR && LA21_0 <= T_IF)||(LA21_0 >= T_READ && LA21_0 <= T_RETURN)||LA21_0==T_WRITE) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// Hello.g:336:39: statement
							{
							pushFollow(FOLLOW_statement_in_ifstat1438);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop21;
						}
					}

					}
					break;

			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1448); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// Hello.g:340:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// Hello.g:340:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			// Hello.g:340:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1459); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1461); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1463);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1465); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1467);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1469); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1471);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1473); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1485); if (state.failed) return;
			// Hello.g:341:22: ( statement )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==EOL||LA23_0==ID||(LA23_0 >= TIPOS && LA23_0 <= T_ABRECHAVE)||LA23_0==T_BREAK||(LA23_0 >= T_FOR && LA23_0 <= T_IF)||(LA23_0 >= T_READ && LA23_0 <= T_RETURN)||LA23_0==T_WRITE) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Hello.g:341:23: statement
					{
					pushFollow(FOLLOW_statement_in_forstat1488);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1492); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, forstat_StartIndex); }

		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "statelist"
	// Hello.g:344:1: statelist : ( statement )* ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// Hello.g:344:11: ( ( statement )* )
			// Hello.g:344:13: ( statement )*
			{
			// Hello.g:344:13: ( statement )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==EOL||LA24_0==ID||(LA24_0 >= TIPOS && LA24_0 <= T_ABRECHAVE)||LA24_0==T_BREAK||(LA24_0 >= T_FOR && LA24_0 <= T_IF)||(LA24_0 >= T_READ && LA24_0 <= T_RETURN)||LA24_0==T_WRITE) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// Hello.g:344:14: statement
					{
					pushFollow(FOLLOW_statement_in_statelist1505);
					statement();
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
			if ( state.backtracking>0 ) { memoize(input, 15, statelist_StartIndex); }

		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "expression"
	// Hello.g:347:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// Hello.g:347:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			// Hello.g:347:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			pushFollow(FOLLOW_numexpression_in_expression1518);
			numexpression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:347:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==T_DIFERENTE||(LA25_0 >= T_IGUAL && LA25_0 <= T_MENOROUIGUAL)) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Hello.g:347:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
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
					pushFollow(FOLLOW_numexpression_in_expression1548);
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
			if ( state.backtracking>0 ) { memoize(input, 16, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// Hello.g:350:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		int numexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// Hello.g:350:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// Hello.g:350:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_numexpression1560);
			term();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:350:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( ((LA26_0 >= T_SOMA && LA26_0 <= T_SUBTRACAO)) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Hello.g:350:23: ( T_SOMA | T_SUBTRACAO ) term
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
					pushFollow(FOLLOW_term_in_numexpression1573);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop26;
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
			if ( state.backtracking>0 ) { memoize(input, 17, numexpression_StartIndex); }

		}
	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// Hello.g:353:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// Hello.g:353:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			// Hello.g:354:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_term1587);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:354:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==T_DIVISAO||LA27_0==T_MULTIPLICACAO) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Hello.g:354:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
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
					pushFollow(FOLLOW_unaryexpr_in_term1600);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop27;
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
			if ( state.backtracking>0 ) { memoize(input, 18, term_StartIndex); }

		}
	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// Hello.g:357:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// Hello.g:357:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			// Hello.g:357:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			// Hello.g:357:14: ( T_SOMA | T_SUBTRACAO )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= T_SOMA && LA28_0 <= T_SUBTRACAO)) ) {
				alt28=1;
			}
			switch (alt28) {
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

			pushFollow(FOLLOW_factor_in_unaryexpr1624);
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
			if ( state.backtracking>0 ) { memoize(input, 19, unaryexpr_StartIndex); }

		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// Hello.g:360:1: factor : ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// Hello.g:360:8: ( ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			// Hello.g:360:10: ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			// Hello.g:360:10: ( NUMERO | lvalue | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt29=3;
			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt29=1;
				}
				break;
			case ID:
				{
				alt29=2;
				}
				break;
			case T_ABREPARENTESES:
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
					// Hello.g:360:12: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1636); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:360:21: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_factor1640);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:360:30: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1644); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_factor1646);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1648); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 20, factor_StartIndex); }

		}
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred23_Hello
	public final void synpred23_Hello_fragment() throws RecognitionException {
		// Hello.g:317:8: ( lvalue )
		// Hello.g:317:8: lvalue
		{
		pushFollow(FOLLOW_lvalue_in_synpred23_Hello1265);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Hello

	// $ANTLR start synpred27_Hello
	public final void synpred27_Hello_fragment() throws RecognitionException {
		// Hello.g:322:13: ( ID )
		// Hello.g:322:13: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred27_Hello1310); if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_Hello

	// $ANTLR start synpred29_Hello
	public final void synpred29_Hello_fragment() throws RecognitionException {
		// Hello.g:326:12: ( ID )
		// Hello.g:326:12: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred29_Hello1336); if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_Hello

	// $ANTLR start synpred35_Hello
	public final void synpred35_Hello_fragment() throws RecognitionException {
		// Hello.g:335:6: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )
		// Hello.g:335:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
		{
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred35_Hello1406); if (state.failed) return;
		match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_synpred35_Hello1408); if (state.failed) return;
		match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_synpred35_Hello1410); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred35_Hello1412);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_synpred35_Hello1414); if (state.failed) return;
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred35_Hello1416); if (state.failed) return;
		// Hello.g:335:86: ( statement )*
		loop34:
		while (true) {
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EOL||LA34_0==ID||(LA34_0 >= TIPOS && LA34_0 <= T_ABRECHAVE)||LA34_0==T_BREAK||(LA34_0 >= T_FOR && LA34_0 <= T_IF)||(LA34_0 >= T_READ && LA34_0 <= T_RETURN)||LA34_0==T_WRITE) ) {
				alt34=1;
			}

			switch (alt34) {
			case 1 :
				// Hello.g:335:87: statement
				{
				pushFollow(FOLLOW_statement_in_synpred35_Hello1419);
				statement();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop34;
			}
		}

		}

	}
	// $ANTLR end synpred35_Hello

	// $ANTLR start synpred37_Hello
	public final void synpred37_Hello_fragment() throws RecognitionException {
		// Hello.g:336:6: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )
		// Hello.g:336:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
		{
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred37_Hello1431); if (state.failed) return;
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred37_Hello1433); if (state.failed) return;
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred37_Hello1435); if (state.failed) return;
		// Hello.g:336:38: ( statement )*
		loop35:
		while (true) {
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EOL||LA35_0==ID||(LA35_0 >= TIPOS && LA35_0 <= T_ABRECHAVE)||LA35_0==T_BREAK||(LA35_0 >= T_FOR && LA35_0 <= T_IF)||(LA35_0 >= T_READ && LA35_0 <= T_RETURN)||LA35_0==T_WRITE) ) {
				alt35=1;
			}

			switch (alt35) {
			case 1 :
				// Hello.g:336:39: statement
				{
				pushFollow(FOLLOW_statement_in_synpred37_Hello1438);
				statement();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop35;
			}
		}

		}

	}
	// $ANTLR end synpred37_Hello

	// Delegated rules

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
	public final boolean synpred27_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_Hello_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_statement_in_program615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funclist652 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funclist656 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funclist683 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_TIPOS_in_funclist763 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_funclist768 = new BitSet(new long[]{0x0000004001000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funclist811 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_funclist816 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_funclist821 = new BitSet(new long[]{0x0000004001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funclist886 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funclist912 = new BitSet(new long[]{0x0000008C06011920L});
	public static final BitSet FOLLOW_statement_in_funclist948 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funclist976 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_vardecl_in_statement1000 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement1007 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement1014 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement1022 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement1028 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement1045 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statelist_in_statement1047 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement1054 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl1079 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl1086 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl1089 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl1095 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl1099 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl1103 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue1118 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue1124 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue1128 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue1132 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat1147 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat1153 = new BitSet(new long[]{0x0000003200004780L});
	public static final BitSet FOLLOW_expression_in_atribstat1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression1183 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression1185 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression1188 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression1190 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression1192 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall1205 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall1216 = new BitSet(new long[]{0x0000003001004700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall1237 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_paramlistcall1265 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1269 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1273 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall1285 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_paramlistcall1287 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1307 = new BitSet(new long[]{0x0000003000004700L});
	public static final BitSet FOLLOW_ID_in_printstat1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1333 = new BitSet(new long[]{0x0000003000004700L});
	public static final BitSet FOLLOW_ID_in_readstat1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_readstat1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_readstat1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1359 = new BitSet(new long[]{0x0000003000004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1381 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1384 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1386 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1388 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1394 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_ifstat1397 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1406 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_ifstat1408 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1410 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1412 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1414 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1416 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_ifstat1419 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1431 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1433 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1435 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_ifstat1438 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1459 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1461 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1463 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1465 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_forstat1467 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1469 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1471 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1473 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1485 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_statement_in_forstat1488 = new BitSet(new long[]{0x0000008C06411920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist1505 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_numexpression_in_expression1518 = new BitSet(new long[]{0x00000000F8040002L});
	public static final BitSet FOLLOW_set_in_expression1522 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1560 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1563 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_term_in_numexpression1573 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1587 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_set_in_term1591 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1600 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1644 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1646 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred23_Hello1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred27_Hello1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred29_Hello1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred35_Hello1406 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_synpred35_Hello1408 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_synpred35_Hello1410 = new BitSet(new long[]{0x0000003000004300L});
	public static final BitSet FOLLOW_expression_in_synpred35_Hello1412 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_synpred35_Hello1414 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred35_Hello1416 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_statement_in_synpred35_Hello1419 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred37_Hello1431 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred37_Hello1433 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred37_Hello1435 = new BitSet(new long[]{0x0000008C06011922L});
	public static final BitSet FOLLOW_statement_in_synpred37_Hello1438 = new BitSet(new long[]{0x0000008C06011922L});
}
