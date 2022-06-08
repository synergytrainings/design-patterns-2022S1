package src.main.java.classes;

public class StaffMember extends User {
    private Integer monthlySalary;
    private String position;

    public StaffMember() {
    }

    public StaffMember(String firstName, String lastName, Integer monthlySalary, String position) {
        super(firstName, lastName);
        this.monthlySalary = monthlySalary;
        this.position = position;
    }

    public void setMonthlySalary(Integer monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getMonthlySalary() {
        return monthlySalary;
    }

    public String getPosition() {
        return position;
    }
}
