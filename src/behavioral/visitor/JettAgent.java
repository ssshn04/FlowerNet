package behavioral.visitor;

public class JettAgent extends GameAgent {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
