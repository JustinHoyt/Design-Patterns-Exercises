package Builder;

public class Motorcycle extends VehicleBuilder {
    private Vehicle vehicle = new Vehicle();
    
    @Override
    public void buildDoors() {
        // TODO Auto-generated method stub
        vehicle.add("Doors: 0 doors");
    }

    @Override
    public void buildSeats() {
        // TODO Auto-generated method stub
        vehicle.add("Sears: 1 seat");
    }

    @Override
    public void buildWheels() {
        // TODO Auto-generated method stub
        vehicle.add("Wheels: 2 wheels");
    }

    @Override
    public Vehicle getResult() {
        // TODO Auto-generated method stub
        return vehicle;
    }

}
