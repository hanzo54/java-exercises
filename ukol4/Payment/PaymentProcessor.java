package Payment;

public class PaymentProcessor
{
    public void pay(PaymentMethod paymentMethod, double amount)
    {
        paymentMethod.processPayment(amount);
    }
}