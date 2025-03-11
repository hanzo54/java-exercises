package Payment;

public class PaymentFactory
{
    public static PaymentMethod getPaymentMethod (String type, String accountHolder)
    {
        return switch (type.toLowerCase())
        {
            case "creditcard" -> new CreditCardPayment(accountHolder);
            
            case "paypal" -> new PayPalPayment(accountHolder);
            
            case "bank" -> new BankTransferPayment (accountHolder);
            
            default -> throw new IllegalArgumentException ("Invalid payment type");

        };
    }
}
