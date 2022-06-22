package synisys.training.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author harut.arakelyan
 */
public class Team extends Employee {
    private List<Employee> members;
    private String leadName;
    //Team specific implementations

    public Team(String name, String leadName) {
        super(name);
        this.leadName = leadName;
        this.members = new ArrayList<>();
    }

    public void add(Employee e) {
        members.add(e);
    }

    public void remove(Employee e) {
        members.remove(e);
    }

    public Employee getChild(int i) {
        return members.get(i);
    }

    public List<Employee> getMembers() {
        return members;
    }

    @Override
    public void printInformation() {
        System.out.println("This is " + name + " team. TL is " + leadName + ". Team members -");
        getMembers().forEach(Employee::printInformation);
    }
}
