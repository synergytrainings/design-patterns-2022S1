package tools;

public class Predictions {

	public static <T> void checkNotNull(T object) {
		if (object == null) {
			throw new IllegalStateException("The given object is null.");
		}
	}

	public static void checkIsPositive(int number) {
		if (number <= 0) {
			throw new IllegalStateException("The given number is not a positive one.");
		}
	}

	public static void checkIsPositive(double number) {
		if (Double.compare(number, 0) <= 0) {
			throw new IllegalStateException("The given number is not a positive one.");
		}
	}

	public static void checkGraterThan(long number, long target) {
		if (number <= target) {
			throw new IllegalStateException("The given number is not greater than the target one.");
		}
	}

	public static <T> void checkInstanceOf(Object object, Class<T> target) {
		if (!target.isInstance(object)) {
			throw new IllegalStateException("The given objects is not an instance of the given class.");
		}
	}
}
