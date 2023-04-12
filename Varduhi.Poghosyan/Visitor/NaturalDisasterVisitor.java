package Visitor;

public interface NaturalDisasterVisitor {

    void visit(Earthquake earthquake);

    void visit(Tornado tornado);

    void visit(VolcanicEruption volcanicEruption);

}
