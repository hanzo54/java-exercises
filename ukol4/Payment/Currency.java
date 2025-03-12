package Payment;

public enum Currency
{
    USD, EUR, GBP;
    public static double convert (double amount, Currency from, Currency to)
    {
        if (from == to)
        {
            return amount;
        }
        if (from == USD && to == EUR)
        {
            return amount * 0.8;
        }
        else if (from == EUR && to == USD)
        {
            return amount * 1.1;
        }
        else if (from == USD && to == GBP)
        {
            return amount * 0.7;
        }
        else if (from == GBP && to == USD)
        {
            return amount * 1.3;
        }
        return amount;
    }
    
}
