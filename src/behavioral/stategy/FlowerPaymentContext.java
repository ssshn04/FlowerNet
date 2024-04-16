package behavioral.stategy;

public class FlowerPaymentContext {
    private PaymentStrategy paymentStrategy;

    public FlowerPaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payForBouquet(double amount) {
        paymentStrategy.pay(amount);
    }
}
