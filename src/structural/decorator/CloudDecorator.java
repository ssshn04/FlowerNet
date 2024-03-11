package structural.decorator;

public class CloudDecorator extends AgentDecorator {
    public CloudDecorator(Agent agent) {
        super(agent);
    }

    @Override
    public void describe() {
        agent.describe();
        System.out.println("I have a poison cloud.");
        activate();
    }

    private void activate() {
        System.out.println("Poison orb emitting.");
    }
}
