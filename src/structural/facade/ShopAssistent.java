package structural.facade;

public class ShopAssistent {
    private final TakeOrder takeOrder;
    private final MakeBouquet makeBouquet;
    private final DeliveryOrder deliveryOrder;

    public ShopAssistent(TakeOrder takeOrder, MakeBouquet makeBouquet, DeliveryOrder deliveryOrder) {
        this.takeOrder = takeOrder;
        this.makeBouquet = makeBouquet;
        this.deliveryOrder = deliveryOrder;
    }

    public String workDay() {
        return takeOrder.TakeOrder() + " " + makeBouquet.MakeBouquet() + " " + deliveryOrder.DeliveryOrder();
    }
}
