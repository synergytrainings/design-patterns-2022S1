package Visitor;

public class Crossover implements Vehicle {
    private String size;

    public Crossover(String size) {
        this.size = size;
    }

    @Override
    public void accept(VehicleVisitor vehicleVisitor) {
        vehicleVisitor.visit(this);
    }

    public String getSize() {
        return size;
    }
}
