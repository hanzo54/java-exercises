import Rent.*;


public class Main
{
    public static void main(String[]args)
    { 
        RentalService rentalService = new RentalService();

        Car car = new Car("Toyota Corolla", "ABC-123");
        Bike bike = new Bike("Yamaha R15", "XYZ-789");
    
        rentalService.rentVehicle(car, 14);
        rentalService.rentVehicle(bike, 7);
        rentalService.rentVehicle(bike, 8);
    }
}
