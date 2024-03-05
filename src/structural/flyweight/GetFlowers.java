package structural.flyweight;

public class GetFlowers implements Flyweight {

    private String type;
    private String color;
    private int size;

    public GetFlowers(String type, String color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Type: " + type + ", " + "color: " + color + ", " + "size: " + size);;
    }
}
