package Composite;

import java.util.ArrayList;
import java.util.List;

public class KindergartenGroupImpl implements KindergartenGroup {

    private List<KindergartenGroup> childGroups;

    public KindergartenGroupImpl() {
        this.childGroups = new ArrayList<>();
    }

    @Override
    public void activity() {
        childGroups.forEach(KindergartenGroup::activity);
    }

    @Override
    public void printGroupName() {
        childGroups.forEach(KindergartenGroup::printGroupName);
    }

    public void addGroup(KindergartenGroup group) {
        childGroups.add(group);
    }

    public void removeGroup(KindergartenGroup group) {
        childGroups.remove(group);
    }
}
