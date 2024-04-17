package behavioral.visitor;

public class JettVisitor implements Visitor {
    @Override
    public void visit(JettAgent jett) {
        System.out.println("Jett agent is visiting.");
    }

    @Override
    public void visit(GekkoAgent gekko) {
        System.out.println("Jett agent is visiting Gekko agent.");
    }
}
