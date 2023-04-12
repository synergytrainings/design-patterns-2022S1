package Visitor;

public interface NaturalDisaster {

    String getDefinition();

    void accept(NaturalDisasterVisitor naturalDisasterVisitor);

}
