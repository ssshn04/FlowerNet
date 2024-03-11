package structural.decorator;

public class UltiDecorator extends AgentDecorator {
    public UltiDecorator(Agent agent) {
        super(agent);
    }

    @Override
    public void describe() {
        agent.describe();
        System.out.println("I have ultimate.");
        use();
    }

    private void use() {
        System.out.println("Welcome to my world!");
    }
}
