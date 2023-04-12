package Visitor;

public class Tornado implements NaturalDisaster {
    @Override
    public String getDefinition() {
        return "A mobile, destructive vortex of violently rotating winds having the appearance of a funnel-shaped cloud and advancing beneath a large storm system.";
    }

    @Override
    public void accept(NaturalDisasterVisitor naturalDisasterVisitor) {
        naturalDisasterVisitor.visit(this);
    }
}
