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
        paymentProcessor.pay(bankTransfer, 22.34);
        try
        {
            paymentProcessor.pay(bankTransfer,0);
            if (amount == 0)
            throw new InsufficientFundsException("Insufficient Funds Error");

        }
        catch (InsufficientFundsException e)
        {
            System.out.println("x");
        }
    }  
}
