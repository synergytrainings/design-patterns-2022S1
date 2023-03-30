package main;

public class SportPackageType {
	private static int instanceCounter;
	private boolean isFitnessIncluded;
	private boolean isCardioIncluded;
	private boolean isMartialArtsIncluded;
	private boolean isGroupWorkoutsIncluded;
	private boolean isSwimmingPoolIncluded;
	private boolean withTrainer;
	private String contractTemplate;

	public SportPackageType(boolean isFitnessIncluded, boolean isCardioIncluded, boolean isMartialArtsIncluded, boolean isGroupWorkoutsIncluded, boolean isSwimmingPoolIncluded, boolean withTrainer) {
		this.isFitnessIncluded = isFitnessIncluded;
		this.isCardioIncluded = isCardioIncluded;
		this.isMartialArtsIncluded = isMartialArtsIncluded;
		this.isGroupWorkoutsIncluded = isGroupWorkoutsIncluded;
		this.isSwimmingPoolIncluded = isSwimmingPoolIncluded;
		this.withTrainer = withTrainer;
		instanceCounter++;
	}

	public boolean isFitnessIncluded() {
		return isFitnessIncluded;
	}

	public boolean isCardioIncluded() {
		return isCardioIncluded;
	}

	public boolean isMartialArtsIncluded() {
		return isMartialArtsIncluded;
	}

	public boolean isGroupWorkoutsIncluded() {
		return isGroupWorkoutsIncluded;
	}

	public boolean isSwimmingPoolIncluded() {
		return isSwimmingPoolIncluded;
	}

	public boolean isWithTrainer() {
		return withTrainer;
	}

	public String getContractTemplate() {
		return contractTemplate;
	}

	public static int getInstanceCounter() {
		return instanceCounter;
	}
}
