package Payment;

public class PaymentFactory
{
    public static PaymentMethod getPaymentMethod (String type, String accountHolder, Currency fromCurrency, Currency toCurrency)
    {
        return switch (type.toLowerCase())
        {
            case "creditcard" -> new CreditCardPayment(accountHolder, fromCurrency, toCurrency);
            
            case "paypal" -> new PayPalPayment(accountHolder, fromCurrency, toCurrency);
            
            case "bank" -> new BankTransferPayment (accountHolder, fromCurrency, toCurrency);
            
            default -> throw new IllegalArgumentException ("Invalid payment type");

        };
    }
}
