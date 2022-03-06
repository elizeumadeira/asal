# ALAS

Todos os códigos, dados de entrada e ferramentas usadas nesse trabalho, bem como exemplo de todas as saídas estão na raiz do sistema. As classes java existentes foram compiladas usando sistema operacional Windows e podem não funcionar em outros sistemas operacionais.

Para recompilar as classes basta rodar o comando abaixo

    java -cp ./antlr-3.5.2-complete.jar;. org.antlr.Tool LCC.g && javac -cp ./antlr-3.5.2-complete.jar;. *.java

Para rodar um programa na gramática, basta executar na linha de comando na raiz do trabalho

    java -cp ./antlr-3.5.2-complete.jar;. LCCParser programa.lcc

Os arquivos com as respostas das questões do relatório são os seguintes: 

## AL 
**Questão 1: Produção das definições regulares para cada token**

Arquivo LCC.g

**Questão 3: Descrição de uma tabela de símbolos (a tabela deverá guardar tokens identificadores seguido por pelo menos um atributo do token guardado na tabela);**

Ao testar o programa, o sistema gerará um arquivo txt com o conteúdo da tabela de tokens. O nome do arquivo é "Tabela de tokens " + <nome do programa> + ".txt". Estamos enviando a tabela de tokens dos programas de teste exigidos no trabalho, sendo eles "**Tabela de tokens programa.lcc.txt**", "**Tabela de tokens programa2.lcc.txt**", "**Tabela de tokens programa3.lcc.txt**" e "**Tabela de tokens test.lcc.txt**"

**Questão 5: Se usou ferramenta, uma descrição detalhada da entrada exigida pela ferramenta e da saída dada por ela. É necessário haver exemplos pequenos da entrada e da saída gerada pela ferramenta com essa entrada.**

Nesse trabalho foi usada a ferramenta Antlr v3.5.2. A gramática é escrita em um arquivo com extensão “.g” onde as regras Léxicas e Sintáticas ficam armazenadas (é possível separar em múltiplos arquivos para facilitar a organização). Segue um exemplo pequeno de uma gramática que reconhece expressões matemáticas:

```
grammar SimpleCalc;

tokens {
  PLUS  = '+' ;
  MINUS = '-' ;
  MULT  = '*' ;
  DIV = '/' ;
}

@members {
    public static void main(String[] args) throws Exception {
        SimpleCalcLexer lex = new SimpleCalcLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SimpleCalcParser parser = new SimpleCalcParser(tokens);

        try {
            parser.expr();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

expr  : term ( ( PLUS | MINUS )  term )* ;

term  : factor ( ( MULT | DIV ) factor )* ;

factor  : NUMBER ;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER  : (DIGIT)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+  { $channel = HIDDEN; } ;

fragment DIGIT  : '0'..'9' ;
```

A ferramenta então exporta a gramática para classes java. O nome das classes são: 
SimpleCalcLexer: exporta as regras léxicas da gramática;
SimpleCalcParser: exporta as regras sintáticas da gramática;
Com as classes exportadas, basta criar compilar usando comandos do java. É possível adicionar outras classes java para auxiliar com as regras léxicas/sintáticas ou quaisquer outras atividades que envolvam o projeto


## AS

**Questão 1: CC-2021-2 está na forma BNF. Coloque-a na forma convencional de gramática. Chame tal gramática de LCC-2021-2.**

A versão convencional da gramática encontra-se no arquivo **gramatica_convencional.txt** na raiz do projeto.

**Questão 4: Faça LCC-2021-2 ser uma gramática em LL(1). É permitido adicionar novos terminais na gramática, se achar necessário. Depois disso, mostre que LCC-2021-2 está em LL(1) (você pode usar o Teorema ou a tabela de reconhecimento sintático vistos em videoaula).**

A tabela de parseamento para garantir que a linguagem se encontra em LL(1) esta presente na planilha **"first-follow.ods"**.

## Mudanças na linguagem

Mudanças na linguagem
Algumas mudanças na linguagem solicitada pelo professor foram necessárias, muitas delas para ser possível implementar os exemplos de programas corretamente. A linguagem foi “aumentada” visto que a sugestão inicial definida no enunciado do trabalho é bastante limitada. As mudanças solicitada/sugeridas nos enunciados das questões de AS e AL foram comentadas e explicadas nas respostas do relatório. Abaixo estão apenas as mudanças implementadas fora do escopo das questões do trabalho.
Entre as mudanças estão:
- As regras foram escritas com letras minúsculas e as os tokens em letras maiúsculas para ficarem na convenção da ferramenta usada (antlrworks);
- As variáveis possuem escopo de função (mas não de bloco). A ferramenta até implementa um escopo de bloco, mas eu inseri apenas o de função para poder repetir nomes de variáveis em funções diferentes e facilitar a nomenclatura das variáveis nos exemplos;
- "returnstat" agora aceita opcionalmente textos ou expressões;
- "atribstat" agora aceita textos como valor de atribuição, pois string é um tipo possível na nossa linguagem;
- "paramlistcall" agora aceita textos e expressões como parâmetro de envio;
- "printstat" agora permite a escrita de textos ou expressões;