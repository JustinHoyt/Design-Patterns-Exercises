package Builder;

public abstract class VehicleBuilder {
    public abstract void buildDoors();
    public abstract void buildSeats();
    public abstract void buildWheels();
    public abstract Vehicle getResult();
}
