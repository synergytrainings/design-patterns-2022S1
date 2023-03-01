package tools;

import java.util.ArrayList;
import java.util.List;

public class GenericCast {

	private GenericCast() {}

	public static  <T, E, C extends List<E>> List<T> castList(C list, Class<T> ignore) {

		List<T> casted = new ArrayList<>();
		for (E element : list) {
			casted.add((T) element);
		}
		return casted;
	}

}
