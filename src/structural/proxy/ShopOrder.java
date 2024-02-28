package structural.proxy;

import java.util.Date;

public class ShopOrder extends Order {
    public ShopOrder() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void makeOrder() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getClass().getSimpleName() + " was made at " + new Date());
    }
}
