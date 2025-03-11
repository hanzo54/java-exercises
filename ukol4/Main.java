import Payment.*;

public class Main
{
    public static void main (String []args)
    {
        PaymentMethod creditCardPayment = PaymentFactory.getPaymentMethod("creditcard", "Karlos");
        PaymentMethod payPalPayment = PaymentFactory.getPaymentMethod("payPal", "Venda");
        PaymentMethod bankTransferPayment = PaymentFactory.getPaymentMethod("bank", "Pepa");

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.pay(creditCardPayment, 100);
        paymentProcessor.pay(payPalPayment, 0.34);
        paymentProcessor.pay(bankTransferPayment, 0);
        
        NoDiscount noDiscount = new NoDiscount();
        noDiscount.applyDiscount(0);

        PercentageDiscount percentageDiscount = new PercentageDiscount(30);
        percentageDiscount.applyDiscount(30);
    }  
}