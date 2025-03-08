package Payment;

public class PayPalPayment implements PaymentMethod
{
    public void processPayment(double amount)
    {
        System.out.println("using PayPal" + amount);
    }
}