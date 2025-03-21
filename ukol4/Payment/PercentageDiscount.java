package Payment;

public class PercentageDiscount implements DiscountStrategy
{
    private double percentage;
    public PercentageDiscount (double percentage)
    {
        this.percentage = percentage;
    }
    public double applyDiscount (double amount)
    {
        return amount - (amount * percentage / 100);
    }
}