package structural.proxy;

import java.util.Date;

public class OnlineOrder extends Order {
    @Override
    public void makeOrder() {
        System.out.println(this.getClass().getSimpleName() + " was made at " + new Date());
    }
}
