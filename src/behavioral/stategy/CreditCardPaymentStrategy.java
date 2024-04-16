package behavioral.stategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " UAH by credit card.");
    }
}