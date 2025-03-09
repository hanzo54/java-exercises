package Payment;

public class CreditCardPayment extends AbstractPaymentMethod
{
    public CreditCardPayment(String accountHolder) 
        {
            super(accountHolder);
        }
    
        public void processPayment(double amount)
    {
        System.out.println("Processing payment of $" + amount + " for " + accountHolder);
    }
}