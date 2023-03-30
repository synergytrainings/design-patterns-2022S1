package main;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<SportPackage> sportPackages = new ArrayList<>();
		Random rd = new Random();
		for(int i = 0; i < 1000000; i++) {
			SportPackageType sportPackageType = SportPackageTypeFactory.getSportPackageType(rd.nextBoolean(), rd.nextBoolean(), rd.nextBoolean(), rd.nextBoolean(), rd.nextBoolean(), rd.nextBoolean());
			User user = new User("firstName", "lastName");
			sportPackages.add(new SportPackage(LocalDate.parse("2023-03-29"), Duration.YEARLY, sportPackageType, user, 500));
		}
		// number of instances should be 64 (2 to the power of 6)
		System.out.printf("There were created %d instances%n", SportPackageType.getInstanceCounter());
	}
}
