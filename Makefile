all: gerar compilar rodarprograma rodarprograma2 rodarprograma

gerar:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool LCC.g

compilar: 
	javac -cp antlr-3.5.2-complete.jar *.java
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	
rodarprograma:
	@echo "Rodando primeiro exemplo"
	java -cp antlr-3.5.2-complete.jar:. LCCParser programa.lcc
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."

rodarprograma2:
	@echo "Rodando segundo exemplo"
	java -cp antlr-3.5.2-complete.jar:. LCCParser programa2.lcc
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."

rodarprograma3:
	@echo "Rodando segundo exemplo"
	java -cp antlr-3.5.2-complete.jar:. LCCParser programa3.lcc
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."
	@echo "."

clean:
	@echo "Cleaning up..."
	rm *.class