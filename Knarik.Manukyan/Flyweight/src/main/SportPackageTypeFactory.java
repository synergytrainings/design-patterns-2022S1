package main;

import java.util.HashMap;
import java.util.Map;

public class SportPackageTypeFactory {
	private static final Map<String, SportPackageType> sportPackageTypes = new HashMap<>();

	public static SportPackageType getSportPackageType(boolean isFitnessIncluded, boolean isCardioIncluded, boolean isMartialArtsIncluded, boolean isGroupWorkoutsIncluded, boolean isSwimmingPoolIncluded, boolean withTrainer) {
		String code = getCode(isFitnessIncluded, isCardioIncluded, isMartialArtsIncluded, isGroupWorkoutsIncluded, isSwimmingPoolIncluded, withTrainer);
		if(sportPackageTypes.containsKey(code)) {
			return sportPackageTypes.get(code);
		}
		SportPackageType sportPackageType = new SportPackageType(isFitnessIncluded, isCardioIncluded, isMartialArtsIncluded, isGroupWorkoutsIncluded, isSwimmingPoolIncluded, withTrainer);
		sportPackageTypes.put(code, sportPackageType);
		return sportPackageType;
	}

	private static String getCode(boolean isFitnessIncluded, boolean isCardioIncluded, boolean isMartialArtsIncluded, boolean isGroupWorkoutsIncluded, boolean isSwimmingPoolIncluded, boolean withTrainer) {
		return new StringBuilder()
				.append(convertBooleanToString(isFitnessIncluded))
				.append(convertBooleanToString(isCardioIncluded))
				.append(convertBooleanToString(isMartialArtsIncluded))
				.append(convertBooleanToString(isGroupWorkoutsIncluded))
				.append(convertBooleanToString(isSwimmingPoolIncluded))
				.append(convertBooleanToString(withTrainer)).toString();
	}

	private static String convertBooleanToString(boolean bool) {
		return bool ? "1" : "0";
	}

}
