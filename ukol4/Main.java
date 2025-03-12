import Payment.*;

public class Main
{
    public static void main (String []args)
    {
        PaymentMethod creditCardPayment = PaymentFactory.getPaymentMethod("creditcard", "Karlos");
        PaymentMethod payPalPayment = PaymentFactory.getPaymentMethod("payPal", "Venda");
        PaymentMethod bankTransferPayment = PaymentFactory.getPaymentMethod("bank", "Pepa");

        DiscountStrategy noDiscount = new NoDiscount();
        DiscountStrategy percentageDiscount = new PercentageDiscount(30);

        PaymentProcessor paymentProcessorNoDiscount = new PaymentProcessor(noDiscount);
        PaymentProcessor paymentProcessorDiscount = new PaymentProcessor(percentageDiscount);
        
        paymentProcessorDiscount.pay(creditCardPayment, 100);
        
        paymentProcessorNoDiscount.pay(payPalPayment, 0.34);
        
        paymentProcessorNoDiscount.pay(bankTransferPayment, 0);
    }  
}