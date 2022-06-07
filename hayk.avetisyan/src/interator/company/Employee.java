package interator.company;

public class Employee {

	public final String name;
	public final String surname;
	public final Position position;
	public final Salary salary;

	public Employee(String name, String surname, Position position, Salary salary) {
		this.name = name;
		this.surname = surname;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{" +
				"name: '" + name + '\'' +
				",surname: '" + surname + '\'' +
				",position: " + position +
				",salary: " + salary +
				'}';
	}
}
