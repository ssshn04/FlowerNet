package structural.composite;

public class LeafFlower implements  FlowerComponent {
    private String name;

    public LeafFlower(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Flower : " + name);
    }
}
