package Visitor;

public class Earthquake implements NaturalDisaster {
    @Override
    public String getDefinition() {
        return "A sudden violent shaking of the ground, typically causing great destruction, as a result of movements within the earth's crust or volcanic action.";
    }

    @Override
    public void accept(NaturalDisasterVisitor naturalDisasterVisitor) {
        naturalDisasterVisitor.visit(this);
    }

}
