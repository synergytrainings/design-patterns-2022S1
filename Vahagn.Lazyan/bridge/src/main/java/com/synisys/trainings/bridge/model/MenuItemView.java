package com.synisys.trainings.bridge.model;


public record MenuItemView(
		String name,
		Integer price
) {

	@Override
	public String toString() {
		return name + ": " + price;
	}
}
