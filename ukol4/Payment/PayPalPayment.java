package Payment;

public class PayPalPayment extends AbstractPaymentMethod
{
    public PayPalPayment(String accountHolder)
        {
            super(accountHolder);
        }
    
        public void processPayment(double amount)
    {
        System.out.println("Processing payment of $" + amount + " for " + accountHolder);
    }
}