package Flyweight;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> basicPrototypesUsedInTask1 = Arrays.asList("basic_table", "drawer", "clock");
        String assignedDev = "Maria Sanchez";
        basicPrototypesUsedInTask1.forEach(prototypeKey -> {
            UIDesignPrototypeFactory.getUIPrototypeByKey(prototypeKey).useImplementation(assignedDev);
        });

        List<String> basicPrototypesUsedInTask2 = Arrays.asList("merging_entities_stepper", "drawer", "eiffel_tower");
        basicPrototypesUsedInTask2.forEach(prototypeKey -> {
            UIDesignPrototypeFactory.getUIPrototypeByKey(prototypeKey).useImplementation(assignedDev);
        });
    }
}
