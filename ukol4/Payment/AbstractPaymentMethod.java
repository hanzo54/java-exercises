package Payment;

abstract class AbstractPaymentMethod implements PaymentMethod
{
    protected String accountHolder;
    
    public AbstractPaymentMethod (String accountHolder)
    {
        this.accountHolder = accountHolder;
    }
    
    @Override
    public void processPayment (double amount) throws InsufficientFundsException
    {
            if (amount == 0)
            {            
                throw new InsufficientFundsException("Insufficient Funds Error");    
            }
            System.out.println("Processing payment of $ " + amount + " for " + accountHolder);
    }
}