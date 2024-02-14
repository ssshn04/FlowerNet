import creational.singleton.FlowerShop;
public class Main {
    public static void main(String[] args) {
        FlowerShop flowerShop = FlowerShop.getInstance();
        FlowerShop flowerShop2 = FlowerShop.getInstance();
        System.out.println(flowerShop.getName());
        System.out.println(flowerShop.getLocation());
        System.out.println(flowerShop2.getLocation());

        flowerShop2.setLocation("вул. Головна, 4Б");
        System.out.println(flowerShop.getLocation());
        System.out.println(flowerShop2.getLocation());
        System.out.println(flowerShop.equals(flowerShop2));
    }
}