package Payment;

public class BankTransferPayment extends AbstractPaymentMethod
{
    public BankTransferPayment(String accountHolder, Currency currency)
        {
            super(accountHolder, currency);
        }
}
