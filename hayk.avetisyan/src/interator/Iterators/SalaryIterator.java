package interator.Iterators;

import interator.company.Employee;
import interator.company.Staff;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;

public class SalaryIterator implements Iterator<Employee> {

	private Iterator<Employee> iterator;
	private int cursor = 0;
	private int size;

	public SalaryIterator(Staff staff) {
		Stream<Employee> stream = staff.values().stream()
				.sorted(Comparator.comparing(employee -> employee.salary));

		this.size = staff.size();
		this.iterator = stream.iterator();
	}

	@Override
	public boolean hasNext() {
		return cursor < size;
	}

	@Override
	public Employee next() {
		cursor++;
		return iterator.next();
	}
}
