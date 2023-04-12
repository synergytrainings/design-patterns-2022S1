package Visitor;

public class NaturalDisasterLastOccurrence implements NaturalDisasterVisitor {

    @Override
    public void visit(Earthquake earthquake) {
        System.out.println("Please visit https://www.emsc-csem.org/");
    }

    @Override
    public void visit(Tornado tornado) {
        System.out.println("Please visit https://abcnews.go.com/alerts/tornadoes");
    }

    @Override
    public void visit(VolcanicEruption volcanicEruption) {
        System.out.println("Please visit https://volcano.si.edu/gvp_currenteruptions.cfm");
    }
}
