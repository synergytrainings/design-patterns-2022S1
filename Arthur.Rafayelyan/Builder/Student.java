package Builder;

public class Student {
    private final int id;
    private final String name;
    private final String mobileNumber;
    private double salary;

    public Student(int id,String name, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
