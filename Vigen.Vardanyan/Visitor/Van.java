package Visitor;

public class Van implements Vehicle {
    private int numberOfDoors;

    public Van(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void accept(VehicleVisitor vehicleVisitor) {
        vehicleVisitor.visit(this);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
