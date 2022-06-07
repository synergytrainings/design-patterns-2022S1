package interator.company;

import interator.Iterators.IdentifierIterator;
import interator.Iterators.NameIterator;
import interator.Iterators.PositionIterator;
import interator.Iterators.SalaryIterator;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;

public class Staff extends HashMap<Integer, Employee> implements Iterable<Employee> {

	public Staff() {
		put(43531, new Employee("Hayk", "Avetisyan", Position.Engineer, Salary.¢));
		put(23134, new Employee("Tamara", "Aprikyan", Position.Engineer, Salary.$));
		put(23123, new Employee("Hayk", "Andriasyan", Position.Engineer, Salary.¢¢));
		put(88332, new Employee("Pavel", "Arakelyan", Position.TeamLead, Salary.$));
		put(12325, new Employee("Ashot", "Karapetyan", Position.PlatformDirector, Salary.¢¢));
		put(24324, new Employee("Knarik", "Manukyan", Position.Engineer, Salary.¢¢¢));
		put(35721, new Employee("Hayk", "Martirosyan", Position.ChiefTechnologyOfficer, Salary.$$));
		put(23232, new Employee("Ashot", "Hovanesian", Position.ChiefExecutiveOfficer, Salary.$$$));
		put(63354, new Employee("Aghavni", "Grigoryan", Position.Engineer, Salary.$));
		put(32421, new Employee("Hilda", "Karakhanyan", Position.Engineer, Salary.¢¢¢));
		put(34346, new Employee("Hovhannes", "Stepanyan", Position.Engineer, Salary.¢¢));
		put(76456, new Employee("Sergey", "Adamyan", Position.Engineer, Salary.¢));
	}

	@NotNull
	@Override
	public Iterator<Employee> iterator() {
		return new IdentifierIterator(this);
	}

	public Iterator<Employee> salaryIterator() {
		return new SalaryIterator(this);
	}

	public Iterator<Employee> positionIterator() {
		return new PositionIterator(this);
	}

	public Iterator<Employee> nameIterator() {
		return new NameIterator(this);
	}
}
