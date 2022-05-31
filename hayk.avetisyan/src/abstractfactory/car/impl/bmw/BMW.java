package abstractfactory.car.impl.bmw;

import abstractfactory.car.api.Car;

import java.util.List;

public class BMW implements Car {

	private BmwDesign design;
	private BwmMotor motor;
	private List<BmwSeat> seats;

	public BMW(BmwDesign design, BwmMotor motor, List<BmwSeat> seats) {
		this.design = design;
		this.motor = motor;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "BMW{" +
				"design=" + design +
				", motor=" + motor +
				", seats=" + seats +
				'}';
	}
}
