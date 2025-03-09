package Payment;

public class BankTransferPayment extends AbstractPaymentMethod
{
    
    
    public BankTransferPayment(String accountHolder)
        {
            super(accountHolder);
        }
    
        public void processPayment(double amount)
    {
        System.out.println("Processing payment of $" + amount + " for " + accountHolder);
    }
}
