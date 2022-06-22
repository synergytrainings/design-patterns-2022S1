package synisys.training.designPatterns;

import synisys.training.designPatterns.composite.Developer;
import synisys.training.designPatterns.composite.Employee;
import synisys.training.designPatterns.composite.QA;
import synisys.training.designPatterns.composite.Team;

/**
 * @author harut.arakelyan
 */
public class Application {

    public static void main(String[] args) {
        Employee harut =  new Developer("Harut", "Full-stack");
        Employee luiz = new Developer("Luiza", "Full-stack");
        Employee arev = new Developer("Arevik", "Front-end");
        Employee arpin = new Developer("Arpine", "Backend");
        Employee mariam = new QA("Mariam", true);
        Employee diana = new QA("Diana", false);
        Employee eagles = new Team("Eagles", "Harut");
        eagles.add(harut);
        eagles.add(luiz);
        eagles.add(arev);
        eagles.add(arpin);
        eagles.add(mariam);
        eagles.add(diana);
        eagles.printInformation();
    }
}
