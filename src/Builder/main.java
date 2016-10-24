package Builder;

public class main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        
        VehicleBuilder minivanBuilder = new MiniVan();
        VehicleBuilder sportscarBuilder = new SportsCar();
        VehicleBuilder motorcycleBuilder = new Motorcycle();
        
        shop.Construct(minivanBuilder);
        Vehicle minivan = minivanBuilder.getResult();
        System.out.println("---Minivan---");
        minivan.show();
        
        shop.Construct(sportscarBuilder);
        Vehicle sportscar = sportscarBuilder.getResult();
        System.out.println("---Sportscar---");
        sportscar.show();
        
        shop.Construct(motorcycleBuilder);
        Vehicle motorcycle = motorcycleBuilder.getResult();
        System.out.println("---Motorcycle---");
        motorcycle.show();
    }

}
