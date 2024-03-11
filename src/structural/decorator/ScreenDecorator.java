package structural.decorator;

public class ScreenDecorator extends AgentDecorator {
    public ScreenDecorator(Agent agent) {
        super(agent);
    }

    @Override
    public void describe() {
        agent.describe();
        System.out.println("I have a toxic screen.");
        up();
    }

    private void up() {
        System.out.println("Toxins going up.");
    }
}
