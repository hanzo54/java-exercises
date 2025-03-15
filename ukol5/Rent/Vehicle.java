package Rent;

public abstract class Vehicle implements Rentable
{
    protected String model;
    protected String licensePlate;
    protected boolean available;

    public Vehicle (String model, String licensePlate)
    {
        this.model = model;
        this.licensePlate = licensePlate;
        this.available = true;
    }

    boolean rented = false;
    
    public boolean isRented()
    {
        if (rented)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
