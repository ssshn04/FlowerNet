package behavioral.template;

public abstract class OrderTemplate {
    public final void processOrder() {
        receiveOrder();
        selectFlowers();
        prepareOrder();
        deliverOrder();
    }

    protected abstract void deliverOrder();
    protected abstract void prepareOrder();
    protected abstract void selectFlowers();
    protected abstract void receiveOrder();
}
