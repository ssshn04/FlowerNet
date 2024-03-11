package structural.decorator;

public abstract class AgentDecorator implements Agent {
    Agent agent;

    public AgentDecorator(Agent agent) {
        this.agent = agent;
    }
}
