package Payment;

public interface PaymentMethod
{
    void processPayment(double amount) throws InsufficientFundsException;
}
