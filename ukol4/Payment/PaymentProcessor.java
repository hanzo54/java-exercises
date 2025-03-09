package Payment;

public class PaymentProcessor
{
    public void pay(PaymentMethod paymentMethod, double amount) throws InsufficientFundsException
    {
        paymentMethod.processPayment(amount);
    }
}