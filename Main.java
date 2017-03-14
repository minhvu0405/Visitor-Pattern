public class Main {
	public static void main(String[] args) {
        // While myCase = new While(new Expr(),new Assignment("y",new Expr()));
        Compound myCase = new Compound(
            new Assignment("n",new Expr()),
                new Conditional(new Expr(),new Assignment("a",new Expr()),
                    new While(new Expr(),new Assignment("x",new Expr()))
        ));
       	// myCase.print(0);
       	// System.out.println();
        PrintVisitor pv = new PrintVisitor();
        pv.visit(myCase,0);
        System.out.println();
	}
}