package Rent;

public class Car extends Vehicle
{
    protected double baseDayPrice = 50;
    
    public Car (String model, String licensePlate)
    {
        super(model, licensePlate);
    }

    public double calculateRentalPrice (int days)
    {
        double finalPrice = baseDayPrice * days;
        return finalPrice;
    }
}
