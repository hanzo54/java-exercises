package Payment;

abstract class AbstractPaymentMethod implements PaymentMethod
{
    protected String accountHolder;
    
    public AbstractPaymentMethod (String accountHolder)
    {
        this.accountHolder = accountHolder;
    }
    
    @Override
    public void processPayment (double amount)
    {
        System.out.println("Processing payment of $" + amount + "for" + accountHolder);
    }
}

