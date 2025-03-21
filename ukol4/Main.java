import Payment.*;

public class Main
{
    public static void main (String []args)
    {
        PaymentMethod creditCardPayment = PaymentFactory.getPaymentMethod("creditcard", "Karlos", Currency.USD, Currency.EUR);
        PaymentMethod payPalPayment = PaymentFactory.getPaymentMethod("payPal","Venda", Currency.GBP, Currency.EUR);
        PaymentMethod bankTransferPayment = PaymentFactory.getPaymentMethod("bank", "Pepa", Currency.GBP, Currency.USD);

        DiscountStrategy noDiscount = new NoDiscount();
        DiscountStrategy percentageDiscount = new PercentageDiscount(0);

        PaymentProcessor paymentProcessorNoDiscount = new PaymentProcessor(noDiscount);
        PaymentProcessor paymentProcessorDiscount = new PaymentProcessor(percentageDiscount);
        
        paymentProcessorDiscount.pay(creditCardPayment, 100);
        
        paymentProcessorNoDiscount.pay(payPalPayment, 100);
        
        paymentProcessorNoDiscount.pay(bankTransferPayment, 100);
    }  
}