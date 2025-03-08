import Payment.*;

public class Main
{
    public static void main (String []args)
    {
        PaymentMethod creditCard = new CreditCardPayment();
        
        PaymentMethod payPal = new PayPalPayment();
        
        PaymentMethod bankTransfer = new BankTransferPayment ();

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.print("platba" + " ");
        paymentProcessor.pay(creditCard, 12.34);
        
        System.out.print("platba" + " ");
        paymentProcessor.pay(payPal, 32.34);
        
        System.out.print("platba" + " ");
        paymentProcessor.pay(bankTransfer, 22.34);
    }
    
}
