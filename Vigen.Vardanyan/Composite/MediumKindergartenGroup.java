package Composite;

public class MediumKindergartenGroup implements KindergartenGroup {

    @Override
    public void activity() {
        System.out.println("Painting");
    }

    @Override
    public void printGroupName() {
        System.out.println("Medium Kindergarten Group: This group consists of children between 2 and 3 years old.");
    }
}
