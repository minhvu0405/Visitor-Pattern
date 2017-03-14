public interface Visitor {

    public void visit (Assignment s,Object o);
    public void visit (Compound s,Object o);
    public void visit (Conditional s,Object o);
    public void visit (While s,Object o);
    public void visit (Expr s,Object o);
}