package synisys.training.designPatterns.composite;

/**
 * @author harut.arakelyan
 */
public class QA extends Employee {
    private boolean manualQA;

    public QA(String name, boolean manualQA) {
        super(name);
        this.manualQA = manualQA;
    }

    public boolean isManualQA() {
        return manualQA;
    }

    @Override
    public void printInformation() {
        System.out.println(name + " is " + (manualQA ? "manual" : "automation") + " QA specialist.");
    }

    //QA specific other functions and implementations
}
