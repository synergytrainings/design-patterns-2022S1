package Visitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NaturalDisaster> naturalDisasters = Arrays.asList(new Earthquake(), new Tornado(), new VolcanicEruption());
        NaturalDisasterVisitor naturalDisasterVisitor = new NaturalDisasterLastOccurrence();

        for (NaturalDisaster naturalDisaster : naturalDisasters) {
            naturalDisaster.accept(naturalDisasterVisitor);
        }
    }

}
