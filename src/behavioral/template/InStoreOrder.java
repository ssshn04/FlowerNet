package behavioral.template;

public class InStoreOrder extends OrderTemplate {
    @Override
    protected void receiveOrder() {
        System.out.println("Receive flower order in-store");
    }

    @Override
    protected void selectFlowers() {
        System.out.println("Select flowers from in-store display");
    }

    @Override
    protected void prepareOrder() {
        System.out.println("Wrap flowers for customer");
    }

    @Override
    protected void deliverOrder() {
        System.out.println("Hand flowers to customer");
    }
}
