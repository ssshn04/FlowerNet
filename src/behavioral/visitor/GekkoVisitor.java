package behavioral.visitor;

public class GekkoVisitor implements Visitor {
    @Override
    public void visit(JettAgent jett) {
        System.out.println("Gekko agent is visiting Jett agent.");
    }

    @Override
    public void visit(GekkoAgent gekko) {
        System.out.println("Gekko agent is visiting.");
    }
}
