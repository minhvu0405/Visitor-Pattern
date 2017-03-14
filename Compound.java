public class Compound extends Statement {
	private Statement[] stmList;
	public Compound(Statement stm1,Statement stm2) {
		stmList = new Statement[2];
		stmList[0] = stm1;
		stmList[1] = stm2;
	}
	public Statement[] getStmList() { return stmList; }
	public Compound(Statement[] stmList){
		this.stmList = stmList;
	}
	public void print(int indent) {
		printIndent(indent);
		System.out.print("begin ");
		for(int i = 0; i < stmList.length;i++)
		{
			stmList[i].print(indent+1);
			if(i < stmList.length-1) System.out.print(";");
		}
		printIndent(indent);
		System.out.print("end");
	}
	public void accept(Visitor visitor,Object o) {
		visitor.visit(this,o);
	}
}