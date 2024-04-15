package behavioral.template;

public class OnlineOrder extends OrderTemplate {
    @Override
    protected void deliverOrder() {
        System.out.println("Receive flower order online");
    }

    @Override
    protected void prepareOrder() {
        System.out.println("Select flowers from online catalog");
    }

    @Override
    protected void selectFlowers() {
        System.out.println("Prepare flowers for shipping");
    }

    @Override
    protected void receiveOrder() {
        System.out.println("Ship flowers to customer's address");
    }
}
