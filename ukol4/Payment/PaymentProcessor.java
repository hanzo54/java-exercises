package Payment;

public class PaymentProcessor
{
    public void pay(PaymentMethod paymentMethod, double amount)
    {
        try
        {
            paymentMethod.processPayment(amount);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println("Insufficient Fund Transaction Error");
        }
    }
}