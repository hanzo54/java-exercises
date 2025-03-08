package Payment;

public class CreditCardPayment implements PaymentMethod
{
    public void processPayment(double amount)
    {
        System.out.println("using Credit Card" + amount);
    }
}