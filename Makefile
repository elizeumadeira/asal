CLASSPATH = ./antlr-3.5.2-complete.jar;.

%.class: %.java
    $(JAVAC) -classpath $(CLASSPATH) $<
