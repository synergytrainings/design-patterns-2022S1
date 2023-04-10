package Visitor;

public class Car implements Vehicle {
    private String color;
    private String bodyType;

    public Car(String color, String bodyType) {
        this.color = color;
        this.bodyType = bodyType;
    }

    @Override
    public void accept(VehicleVisitor vehicleVisitor) {
        vehicleVisitor.visit(this);
    }

    public String getColor() {
        return color;
    }

    public String getBodyType() {
        return bodyType;
    }
}
