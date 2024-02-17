package creational.singleton;

public class FlowerShop {
    private static FlowerShop shop = null;
    private static final String name = "Dahlia";
    private static String location = "просп. Незалежності, 211А";
    private static String phoneNumber = "+380995283169";

    private FlowerShop() {}

    public static FlowerShop getInstance() {
        if (shop == null) {
            shop = new FlowerShop();
            return shop;
        }
        return shop;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String number) {
        phoneNumber = number;
    }
}
