package Visitor;

public class VehicleWashService {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Black", "Sedan"),
                new Van(6),
                new Crossover("Over")
        };

        VehicleVisitor vehicleVisitor = new VehicleVisitorImpl();
        for(Vehicle vehicle : vehicles){
            vehicle.accept(vehicleVisitor);
        }
    }
}
