package Payment;

abstract class AbstractPaymentMethod implements PaymentMethod
{
    protected String accountHolder;
    protected Currency currency;
    
    public AbstractPaymentMethod (String accountHolder, Currency currency)
    {
        this.accountHolder = accountHolder;
        this.currency = currency;
    }
    
    @Override
    public void processPayment (double amount) throws InsufficientFundsException
    {
            if (amount == 0)
            {            
                throw new InsufficientFundsException("Insufficient Funds Error");    
            }
            System.out.println("Processing payment of " + (this.currency.toString()) + " " + amount + " for " + accountHolder);
    }

    public Currency getCurrency()
    {
        return this.currency;
    }
}