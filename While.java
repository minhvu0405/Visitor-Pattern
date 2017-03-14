public  class While extends Statement {
	private Expr whileExpr;
	private Statement doStatement;
	public While(Expr whileExpr,Statement doStatement){
		this.whileExpr = whileExpr;
		this.doStatement = doStatement;
	}
	public Expr getWhile() { return whileExpr; }
	public Statement getDo() {return doStatement; }
	public void print(int indent) {
		printIndent(indent);
		System.out.print("while ");
		whileExpr.print();
		System.out.print(" do");
		doStatement.print(indent+1);
	}
	
	public void accept (Visitor visitor, Object data) {
	   visitor.visit (this, data);
    }
}