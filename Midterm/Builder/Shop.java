package Builder;

public class Shop {
    public void Construct(VehicleBuilder vehicleBuilder){
        vehicleBuilder.buildSeats();
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildDoors();
    }
}
