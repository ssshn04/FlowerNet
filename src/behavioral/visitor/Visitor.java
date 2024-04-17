package behavioral.visitor;

public interface Visitor {
    void visit(JettAgent jett);
    void visit(GekkoAgent gekko);
}
