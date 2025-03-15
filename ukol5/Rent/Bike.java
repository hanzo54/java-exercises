package Rent;

public class Bike extends Vehicle
{
    protected double baseDayPrice = 15;

    public Bike (String model, String licensePlate)
    {
        super(model, licensePlate);
    }    

    public double calculateRentalPrice (int days)
    {
        double finalPrice = baseDayPrice * days;
        return finalPrice;
    }
}
