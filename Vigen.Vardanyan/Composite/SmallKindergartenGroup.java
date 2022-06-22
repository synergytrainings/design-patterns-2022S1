package Composite;

public class SmallKindergartenGroup implements KindergartenGroup {

    @Override
    public void activity() {
        System.out.println("Collect puzzle or lego");
    }

    @Override
    public void printGroupName() {
        System.out.println("Small Kindergarten Group: This group consists of children between 1 and 2 years old.");
    }
}
