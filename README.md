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

**Questão 2: Construção dos diagramas de transição para cada token**
![EOL](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/EOL.jpg)

![ESPACO_BRANCO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/ESPACO_BRANCO.jpg)

![FUNCAO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/FUNCAO.jpg)

![ID](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/ID.jpg)

![NUMERO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/NUMERO.jpg)

![T_ABRECHAVE](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_ABRECHAVE.jpg)

![T_FECHACHAVE](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_FECHACHAVE.jpg)

![T_ABRECOLCHETE](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_ABRECOLCHETE.jpg)

![T_FECHACOLCHETE](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_FECHACOLCHETE.jpg)

![T_ABREPARENTESES](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_ABREPARENTESES.jpg)

![T_FECHAPARENTESES](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_FECHAPARENTESES.jpg)

![T_ATRIBUICAO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_ATRIBUICAO.jpg)

![T_BREAK](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_BREAK.jpg)

![T_DEF](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_DEF.jpg)

![T_DIFERENTE](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_DIFERENTE.jpg)

![T_ELSE](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_ELSE.jpg)

![T_DIVISAO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_DIVISAO.jpg)

![T_FLOAT](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_FLOAT.jpg)

![T_FOR](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_FOR.jpg)

![T_IF](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_IF.jpg)

![T_IGUAL](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_IGUAL.jpg)

![T_INT](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_INT.jpg)

![T_MAIOR](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_MAIOR.jpg)

![T_MAIOROUIGUAL](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_MAIOROUIGUAL.jpg)

![T_MENOR](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_MENOR.jpg)

![T_MENOROUIGUAL](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_MENOROUIGUAL.jpg)

![T_MULTIPLICACAO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_MULTIPLICACAO.jpg)

![T_SUBTRACAO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_SUBTRACAO.jpg)

![T_NEW](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_NEW.jpg)

![T_NULL](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_NULL.jpg)

![T_READ](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_READ.jpg)

![T_RETURN](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_RETURN.jpg)

![T_SOMA](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_SOMA.jpg)

![T_STRING](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_STRING.jpg)

![T_WRITE](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/T_WRITE.jpg)

![TEXTO](https://github.com/elizeumadeira/asal/blob/main/gramatica_antlrworks/rules/TEXTO.jpg)


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

**Questão 2: A sua LCC-2021-2 possui recursão à esquerda? Justifique detalhadamente sua resposta. Se ela tiver recursão à esquerda, então remova tal recursão.**

A nossa LCC-2021-2 não possui recursão à esquerda, pois todas as regras jamais aparecem à esquerda de suas produções. Ou seja, sempre que há uma produção recursiva, primeiro vem um valor terminal ou não-terminal antes da recursão como é o caso da produção “statelist”.

![as_2_1](https://github.com/elizeumadeira/asal/main/img/as_2_1.PNG)

Considerando a gramática em sua forma convencional (como pode ser visto no arquivo “gramatica_convencional.txt”) as produções foram quebradas em diversas produções auxiliares, portanto nem recursão direta há mais.

A LLC-2021-2 original também não possui recursão à esquerda. As recursões que possuem, são à direita, como nos exemplos abaixo:

![as_2_2](https://github.com/elizeumadeira/asal/main/img/as_2_2.PNG)

Onde o ‘A’ está à direita de ‘alpha’ (a), portanto com recursão à direita.

**Questão 3: A sua LCC-2021-2 está fatorada à esquerda? Justifique detalhadamente sua resposta. Se ela não estiver fatorada à esquerda, então fatore.**

A linguagem estava fatorada à esquerda na regra “paramlist” pois o início das produções coincidem ( (T_INT | T_STRING | T_FLOAT) ID) e o subsequente é opcional (T_VIRGULA paramlist):

![as_3_1](https://github.com/elizeumadeira/asal/main/img/as_3_1.PNG)

Para arrumar a fatoração, criou-se a regra “paramlist_linha”

![as_3_2](https://github.com/elizeumadeira/asal/main/img/as_3_2.PNG)

Desta forma sempre que o interpretador produzir “TIPOS ID” ele não precisará voltar na árvore de parseamento quando o programa não possuir “T_VIRGULA paramlist” e produzir somente a primeira parte pois agora a segunda parte da produção é uma produção separada (paramlist_linha) e pode dar continuidade ou não à lista de parametros.


Da mesma forma “paramlistcall”:

![as_3_3](https://github.com/elizeumadeira/asal/main/img/as_3_3.PNG)

para:

![as_3_4](https://github.com/elizeumadeira/asal/main/img/as_3_4.PNG)



Da mesma forma “funclist”:
![as_3_5](https://github.com/elizeumadeira/asal/main/img/as_3_5.PNG)

para:

![as_3_6](https://github.com/elizeumadeira/asal/main/img/as_3_6.PNG)



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