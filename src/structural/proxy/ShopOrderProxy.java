package structural.proxy;

import java.util.Date;

public class ShopOrderProxy {
    private ShopOrder shopOrder;

    public ShopOrderProxy() {
        System.out.println("Taking order at shop at " + new Date());
    }

    public void makeOrder() {
        if (shopOrder == null) {
            shopOrder = new ShopOrder();
        }
        shopOrder.makeOrder();
    }
}
