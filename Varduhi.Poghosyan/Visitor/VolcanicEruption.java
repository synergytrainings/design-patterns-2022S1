package Visitor;

public class VolcanicEruption implements NaturalDisaster {
    @Override
    public String getDefinition() {
        return "A volcanic eruption is when gas and/or lava are released from a volcano—sometimes explosively.";
    }

    @Override
    public void accept(NaturalDisasterVisitor naturalDisasterVisitor) {
        naturalDisasterVisitor.visit(this);
    }
}
