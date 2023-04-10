package Visitor;

public class VehicleVisitorImpl implements VehicleVisitor {
    @Override
    public void visit(Car car) {
        int serviceCharge = 2000;
        if (car.getColor().equals("Black") || car.getColor().equals("Grey")) {
            serviceCharge += 500;
        }
        if (!car.getBodyType().equals("Sedan")) {
            serviceCharge += 500;
        }
        System.out.println("Service Charge for Car: " + serviceCharge);
    }

    @Override
    public void visit(Crossover crossover) {
        int serviceCharge = 4000;
        if (crossover.getSize().equals("Large")) {
            serviceCharge += 500;
        }
        System.out.println("Service Charge for Crossover: " + serviceCharge);
    }

    @Override
    public void visit(Van van) {
        int serviceCharge = 3500;
        if (van.getNumberOfDoors() > 4) {
            serviceCharge += 500;
        }
        System.out.println("Service Charge for Van: " + serviceCharge);
    }
}
