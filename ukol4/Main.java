import Payment.*;

public class Main
{
    public static void main (String []args)
    {
        PaymentMethod creditCardPayment = PaymentFactory.getPaymentMethod("creditcard", "Karlos");
        PaymentMethod payPalPayment = PaymentFactory.getPaymentMethod("payPal", "Venda");
        PaymentMethod bankTransferPayment = PaymentFactory.getPaymentMethod("bank", "Pepa");

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        NoDiscount noDiscount = new NoDiscount();
        noDiscount.applyDiscount(0);

        PercentageDiscount percentageDiscount = new PercentageDiscount(30);
        percentageDiscount.applyDiscount(30);

        paymentProcessor.pay(creditCardPayment, 100);
        if (percentageDiscount < 0)
        {
            System.out.println(percentageDiscount);
        }
        else
        {
            System.out.println(noDiscount);
        }
        
        paymentProcessor.pay(payPalPayment, 0.34);
        
        paymentProcessor.pay(bankTransferPayment, 0);
    }  
}