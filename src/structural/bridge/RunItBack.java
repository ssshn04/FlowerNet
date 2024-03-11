package structural.bridge;

public class RunItBack implements Ultimate {
    @Override
    public void activate() {
        System.out.println("Phoenix is unstoppable!");
    }

    @Override
    public void deactivate() {
        System.out.println("Phoenix became mortal again!");
    }
}
