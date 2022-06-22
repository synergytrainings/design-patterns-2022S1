package synisys.training.designPatterns.composite;

import java.util.List;

/**
 * @author harut.arakelyan
 */
public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Employee e) {
        throw new UnsupportedOperationException();
    }

    public void remove(Employee e) {
        throw new UnsupportedOperationException();
    }

    public Employee getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public List<Employee> getMembers() {
        throw new UnsupportedOperationException();
    }

    public abstract void printInformation();

}
