package structural.bridge;

public class Empress implements Ultimate {
    @Override
    public void activate() {
        System.out.println("Duelist became invincible!");
    }

    @Override
    public void deactivate() {
        System.out.println("Duelist became mortal again!");
    }
}
