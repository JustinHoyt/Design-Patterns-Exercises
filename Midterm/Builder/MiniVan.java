package Builder;

public class MiniVan extends VehicleBuilder {
    private Vehicle vehicle = new Vehicle();
    
    @Override
    public void buildDoors() {
        vehicle.add("Doors: 4 doors");
    }

    @Override
    public void buildSeats() {
        vehicle.add("Sears: 7 seat");
    }

    @Override
    public void buildWheels() {
        vehicle.add("Wheels: 4 wheels");
    }

    @Override
    public Vehicle getResult() {
        return vehicle;
    }
    
}
