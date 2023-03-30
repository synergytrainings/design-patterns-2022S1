package main;

public enum Duration {
	YEARLY(12),
	SEMI_ANNUALLY(6),
	QUARTERLY(3),
	MONTHLY(1);

	private final int numberOfMonths;

	Duration(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}
}
