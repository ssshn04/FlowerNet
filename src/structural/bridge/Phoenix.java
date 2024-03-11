package structural.bridge;

public class Phoenix implements Duelist {
    private final Ultimate ultimate;

    public Phoenix(Ultimate ultimate) {
        this.ultimate = ultimate;
    }

    @Override
    public void heal() {
        System.out.println("Phoenix is healing...");
        ultimate.activate();
    }

    @Override
    public void flash() {
        System.out.println("Phoenix is flashing...");
        ultimate.deactivate();
    }

    @Override
    public Ultimate getUltimate() {
        return ultimate;
    }
}
