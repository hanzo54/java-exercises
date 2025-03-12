package Payment;

public class PaymentFactory
{
    public static PaymentMethod getPaymentMethod (String type, String accountHolder, Currency currency)
    {
        return switch (type.toLowerCase())
        {
            case "creditcard" -> new CreditCardPayment(accountHolder, currency);
            
            case "paypal" -> new PayPalPayment(accountHolder, currency);
            
            case "bank" -> new BankTransferPayment (accountHolder, currency);
            
            default -> throw new IllegalArgumentException ("Invalid payment type");

        };
    }
}
