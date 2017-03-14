public abstract class Statement {
	public abstract void print(int indent);
	public void printIndent(int indent) {
		System.out.println();
		for(int i = 0; i < indent; i++)
			System.out.print(" ");
	}
	public abstract void accept(Visitor visitor,Object o);
}