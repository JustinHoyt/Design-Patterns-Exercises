package Builder;

public class SportsCar extends VehicleBuilder {
    private Vehicle vehicle = new Vehicle();
    
    @Override
    public void buildDoors() {
        // TODO Auto-generated method stub
        vehicle.add("Doors: 2 doors");
    }

    @Override
    public void buildSeats() {
        // TODO Auto-generated method stub
        vehicle.add("Sears: 4 seat");
    }

    @Override
    public void buildWheels() {
        // TODO Auto-generated method stub
        vehicle.add("Wheels: 4 wheels");
    }

    @Override
    public Vehicle getResult() {
        // TODO Auto-generated method stub
        return vehicle;
    }

}
