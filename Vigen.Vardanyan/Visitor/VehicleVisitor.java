package Visitor;

public interface VehicleVisitor {

    public void visit(Car car);

    public void visit(Crossover crossover);

    public void visit(Van van);

}
