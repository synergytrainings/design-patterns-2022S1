package Composite;

public class CompositeDemo {

    public static void main(String[] args) {
        KindergartenGroup smallGroup = new SmallKindergartenGroup();
        KindergartenGroup mediumGroup = new MediumKindergartenGroup();
        KindergartenGroup highGroup = new HighKindergartenGroup();

        KindergartenGroupImpl kindergartenGroup = new KindergartenGroupImpl();
        kindergartenGroup.addGroup(smallGroup);
        kindergartenGroup.addGroup(mediumGroup);
        kindergartenGroup.addGroup(highGroup);

        kindergartenGroup.printGroupName();
        kindergartenGroup.activity();
    }
}
