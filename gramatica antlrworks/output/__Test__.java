import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        LCCLexer lex = new LCCLexer(new ANTLRFileStream("C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\programa.lcc", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        LCCParser g = new LCCParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}