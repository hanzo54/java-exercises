import Payment.*;

public class Main
{
    public static void main (String []args)
    {
        CreditCardPayment creditCard = new CreditCardPayment("Pepa");
        
        PayPalPayment payPal = new PayPalPayment("Venda");
        
        BankTransferPayment bankTransfer = new BankTransferPayment ("Karlos");

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.pay(creditCard, 12.34);
        paymentProcessor.pay(payPal, 32.34);
        paymentProcessor.pay(bankTransfer, 0);
    }  
}
