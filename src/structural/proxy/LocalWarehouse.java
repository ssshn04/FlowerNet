package structural.proxy;

public class LocalWarehouse implements Warehouse {
    @Override
    public void fullNow() {
        System.out.println("Flowers are available in that warehouse");
    }
}
