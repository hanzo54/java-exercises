package Payment;

abstract class AbstractPaymentMethod implements PaymentMethod
{
    protected String accountHolder;
    protected Currency fromCurrency;
    protected Currency toCurrency;

    
    public AbstractPaymentMethod (String accountHolder, Currency fromCurrency, Currency toCurrency)
    {
        this.accountHolder = accountHolder;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }
    
    @Override
    public void processPayment (double amount) throws InsufficientFundsException
    {
            if (amount == 0)
            {            
                throw new InsufficientFundsException("Insufficient Funds Error");    
            }
            
            double finalAmount = Currency.convert(amount, fromCurrency, toCurrency);

            System.out.println("Processing payment from " + fromCurrency + " to " + toCurrency + " of " + finalAmount + "for" + accountHolder);
    }
}
