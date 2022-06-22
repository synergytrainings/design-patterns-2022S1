package synisys.training.designPatterns.composite;

/**
 * @author harut.arakelyan
 */
public class Developer extends Employee {
    private String type;

    public Developer(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void printInformation() {
        System.out.println(name + " is " + type + " developer.");
    }

    //Developer specific other functions and implementations
}
