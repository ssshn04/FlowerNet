package behavioral.stategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " UAH in cash.");
    }
}