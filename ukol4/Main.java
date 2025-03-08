
interface PaymentMethod
{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod
{
    public void processPayment(double amount)
    {
        System.out.println("using Credit Card" + amount);
    }
}

class PayPalPayment implements PaymentMethod
{
    public void processPayment(double amount)
    {
        System.out.println("using PayPal" + amount);
    }
}

class BankTransferPayment implements PaymentMethod
{
    public void processPayment(double amount)
    {
        System.out.println("using Bank Transfer" + " " + amount);
    }
}

class PaymentProcessor
{
    public void pay(PaymentMethod paymentMethod, double amount)
    {
        paymentMethod.processPayment(amount);
    }


}


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
