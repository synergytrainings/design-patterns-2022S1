package interator.Iterators;

import interator.company.Employee;
import interator.company.Staff;

import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class IdentifierIterator implements Iterator<Employee> {

	private Iterator<Employee> iterator;
	private int cursor = 0;
	private int size;

	public IdentifierIterator(Staff staff) {
		Stream<Employee> stream = staff.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.map(Map.Entry::getValue);

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
