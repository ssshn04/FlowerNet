package structural.bridge;

public class Reyna implements Duelist {
    private final Ultimate ultimate;

    public Reyna(Ultimate ultimate) {
        this.ultimate = ultimate;
    }

    @Override
    public void heal() {
        System.out.println("Reyna is healing...");
        ultimate.activate();
    }

    @Override
    public void flash() {
        System.out.println("Reyna is flashing...");
        ultimate.deactivate();
    }

    @Override
    public Ultimate getUltimate() {
        return ultimate;
    }
}
