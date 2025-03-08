package Payment;

public class BankTransferPayment implements PaymentMethod
{
    public void processPayment(double amount)
    {
        System.out.println("using Bank Transfer" + " " + amount);
    }
}
