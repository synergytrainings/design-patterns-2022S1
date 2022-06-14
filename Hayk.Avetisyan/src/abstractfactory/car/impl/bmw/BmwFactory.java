package abstractfactory.car.impl.bmw;

import abstractfactory.car.api.*;
import tools.GenericCast;
import tools.Predictions;

import java.util.Arrays;
import java.util.List;

public class BmwFactory implements CarFactory {
	@Override
	public CarDesign createDesign() {
		return new BmwDesign();
	}

	@Override
	public CarMotor createMotor() {
		return new BwmMotor();
	}

	@Override
	public List<CarSeat> createSeats() {
		return Arrays.asList(new BmwSeat(), new BmwSeat(), new BmwSeat(), new BmwSeat());
	}

	@Override
	public Car createCar(CarDesign design, CarMotor motor, List<CarSeat> seats) {

		Predictions.checkInstanceOf(design, BmwDesign.class);
		Predictions.checkInstanceOf(motor, BwmMotor.class);

		return new BMW((BmwDesign) design, (BwmMotor) motor,  GenericCast.castList(seats, BmwSeat.class));
	}
}
