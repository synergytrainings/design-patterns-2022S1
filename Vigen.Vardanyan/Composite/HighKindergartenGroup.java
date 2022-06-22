package Composite;

public class HighKindergartenGroup implements KindergartenGroup {

    @Override
    public void activity() {
        System.out.println("Reading");
    }

    @Override
    public void printGroupName() {
        System.out.println("High Kindergarten Group: This group consists of children between 3 and 5 years old.");
    }
}
