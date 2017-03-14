public class PrintVisitor implements Visitor {
	public PrintVisitor() {};

    private void visit (int indent) {
		System.out.println ();
		for (int i = 0; i < indent; i++) System.out.print ("  ");
    }

    public void visit (Assignment s, Object o) {
    	int indent = (int) o;
		visit(indent);
		System.out.print(s.getVariable()); 		// String
		System.out.print(" := ");
		visit(s.getExpr(),indent);
    }

    public void visit (Compound s,Object o) {
    	int indent = (int) o;
		visit (indent);
		System.out.print("begin ");
		for(int i = 0; i < s.getStmList().length;i++)
		{
			s.getStmList()[i].accept(this,new Integer(indent+1));
			if(i < s.getStmList().length-1) System.out.print(";");
		}
		visit(indent);
		System.out.print("end");
    }

    public void visit (Conditional s,Object o) {
    	int indent = (int) o;
		visit (indent);
		System.out.print("if ");
		visit(s.getIfExpr(),new Integer(indent));
		visit(indent);
		System.out.print("then");
		s.getThenStatement().accept(this,new Integer(indent+1));
		visit(indent);
		System.out.print("else");
		s.getElseStatement().accept(this,new Integer(indent+1));
    }

    public void visit (While s,Object o) {
    	int indent = (int) o;
		visit(indent);
		System.out.print("while ");
		visit(s.getWhile(),new Integer(indent));
		System.out.print(" do");
		s.getDo().accept(this,new Integer(indent+1));
    }

    public void visit(Expr s, Object o) {
    	System.out.print("Expr");
    }
} 
