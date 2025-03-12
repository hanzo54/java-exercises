package Payment;

public class CreditCardPayment extends AbstractPaymentMethod
{
    public CreditCardPayment(String accountHolder, Currency fromCurrency, Currency toCurrency) 
        {
            super(accountHolder, fromCurrency, toCurrency);
        }
}