package interator.entrypoint;

import interator.company.Employee;
import interator.company.Staff;

import java.util.Iterator;

public class EntryPoint {

	public static void main(String[] args) {

		Staff staff = new Staff();

		iterate(staff.iterator());
		iterate(staff.nameIterator());
		iterate(staff.positionIterator());
		iterate(staff.salaryIterator());

	}

	private static void iterate(Iterator<Employee> iterator) {

		String iteratorName = iterator.getClass().getName().replaceAll("\\w+?\\.", "");
		System.out.println("\nIteration with " + iteratorName);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
	}
}
