all: gerar compilar rodarprograma

gerar:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool SimpleCalc.g

compilar: 
	javac -cp ../antlr-3.5.2-complete.jar *.java
	@echo "."
	@echo "."
	
rodarprograma:
	@echo "Rodando o exemplo"
	java -cp ../antlr-3.5.2-complete.jar:. SimpleCalcParser calc.lcc
	@echo "."
	@echo "."
	@echo "."

clean:
	@echo "Cleaning up..."
	rm *.class