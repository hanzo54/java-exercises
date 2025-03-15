package Rent;

public class RentalService
{
    public void rentVehicle(Vehicle vehicle, int days)
    {
        if (vehicle.isRented())
        {
            System.out.println("Vehicle is already rented ");
        }
        else
        {
            double finalPrice = vehicle.calculateRentalPrice(days);
            System.out.println("vehicle rented " + vehicle.model + " " + vehicle.licensePlate + " " + finalPrice + "$");
        }
    }
}