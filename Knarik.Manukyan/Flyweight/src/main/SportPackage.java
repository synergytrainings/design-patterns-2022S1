package main;

import java.time.LocalDate;

public class SportPackage {

	private LocalDate startDate;

	private Duration duration;

	private SportPackageType sportPackageType;

	private User user;

	private int price;

	public SportPackage(LocalDate startDate, Duration duration, SportPackageType sportPackageType, User user, int price) {
		this.startDate = startDate;
		this.duration = duration;
		this.sportPackageType = sportPackageType;
		this.user = user;
		this.price = price;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return startDate.plusMonths(duration.getNumberOfMonths());
	}

	public String getContract() {
		return this.sportPackageType.getContractTemplate()
				.replace("{firstName}", user.getFirstName())
				.replace("{lastName}", user.getLastName());
	}

	public Duration getDuration() {
		return duration;
	}

	public SportPackageType getSportPackageType() {
		return sportPackageType;
	}

	public User getUser() {
		return user;
	}

	public int getPrice() {
		return price;
	}
}
