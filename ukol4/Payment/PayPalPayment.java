package Payment;

public class PayPalPayment extends AbstractPaymentMethod
{
    public PayPalPayment(String accountHolder, Currency currency)
        {
            super(accountHolder, currency);
        }
}