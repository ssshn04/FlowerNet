package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Shop implements FlowerMediator {
    private List<FlowerItem> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    @Override
    public void placeOrder(String flowerType, int quantity) {
        boolean isAvailable = checkAvailability(flowerType, quantity);
        if (isAvailable) {
            System.out.println(quantity + " " + flowerType + " ordered.");
        } else {
            System.out.println("Sorry, " + flowerType + " is out of stock.");
        }
    }

    @Override
    public void addStock(String flowerType, int quantity) {
        System.out.println(quantity + " " + flowerType + " added to stock.");
        stock.add(new FlowerItem(flowerType, quantity));
    }

    private boolean checkAvailability(String flowerType, int quantity) {
        for (FlowerItem flower : stock) {
            if (flower.getType().equals(flowerType) && flower.getQuantity() >= quantity) {
                return true;
            }
        }
        return false;
    }
}