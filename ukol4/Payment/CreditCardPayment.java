package Payment;

public class CreditCardPayment extends AbstractPaymentMethod
{
    public CreditCardPayment(String accountHolder, Currency currency) 
        {
            super(accountHolder, currency);
        }
}