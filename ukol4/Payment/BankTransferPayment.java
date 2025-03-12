package Payment;

public class BankTransferPayment extends AbstractPaymentMethod
{
    public BankTransferPayment(String accountHolder, Currency fromCurrency, Currency toCurrency)
        {
            super(accountHolder, fromCurrency, toCurrency);
        }
}
