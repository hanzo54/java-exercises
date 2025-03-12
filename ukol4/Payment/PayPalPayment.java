package Payment;

public class PayPalPayment extends AbstractPaymentMethod
{
    public PayPalPayment(String accountHolder, Currency fromCurrency, Currency toCurrency)
        {
            super(accountHolder, fromCurrency, toCurrency);
        }

}