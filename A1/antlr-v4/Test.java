import org.antlr.v4.runtime.*;

 
public class Test {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprTestLexer lexer = new ExprTestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprTestParser parser = new ExprTestParser(tokens);
        parser.prog();
    }
}
