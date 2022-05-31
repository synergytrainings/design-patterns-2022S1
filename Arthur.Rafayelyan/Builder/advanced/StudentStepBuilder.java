package Builder.advanced;

import Builder.Student;

public class StudentStepBuilder {
    public static IdFiled newBuilder() {
        return new Steps();
    }

    public interface IdFiled {
        NameFiled setId(int id);
    }

    public interface NameFiled {
        MobileNumber setName(String name);
    }

    public interface MobileNumber {
        BuildStep setMobile(String mobile);
    }

    public interface BuildStep {
        BuildStep setSalary(double salary);
        Student build();
    }

    private static class Steps implements IdFiled, NameFiled, MobileNumber, BuildStep {

        private int id;
        private String name;
        private String mobileNumber;
        private double salary;


        @Override
        public NameFiled setId(int id) {
            this.id = id;
            return this;
        }

        public MobileNumber setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public BuildStep setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public BuildStep setMobile(String mobile) {
            this.mobileNumber = mobile;
            return this;
        }

        @Override
        public Student build() {
            if (id == 0) {
                throw new NullPointerException("ID Can't be 0");
            }
            if (name == null) {
                throw new NullPointerException("Name can't be null");
            }

            if (mobileNumber == null) {
                throw new NullPointerException("Mobile Number can't be null");
            }
            Student student = new Student(id, name, mobileNumber);
            student.setSalary(salary);

            return student;
        }
    }
}
