package Payment;

public class PaymentProcessor
{

    private DiscountStrategy discountStrategy;
    

    public PaymentProcessor(DiscountStrategy discountStrategy)
    {
        this.discountStrategy = discountStrategy;
    }

    public void pay(PaymentMethod paymentMethod, double amount)
    {
        double discountedAmount = discountStrategy.applyDiscount(amount);
        
        try
        {
            paymentMethod.processPayment(discountedAmount);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println("Insufficient Fund Transaction Error");
        }
    }
}