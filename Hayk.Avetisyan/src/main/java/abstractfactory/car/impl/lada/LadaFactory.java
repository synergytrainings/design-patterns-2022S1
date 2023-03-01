package abstractfactory.car.impl.lada;

import abstractfactory.car.api.*;
import tools.GenericCast;


import java.util.Arrays;
import java.util.List;

public class LadaFactory implements CarFactory {
	@Override
	public CarDesign createDesign() {
		return new LadaDesign();
	}

	@Override
	public CarMotor createMotor() {
		return new LadaMotor();
	}

	@Override
	public List<CarSeat> createSeats() {
		return Arrays.asList(new LadaSeat(), new LadaSeat(), new LadaSeat(), new LadaSeat());
	}

	@Override
	public Car createCar(CarDesign design, CarMotor motor, List<CarSeat> seats) {
		return new Lada((LadaDesign) design, (LadaMotor) motor, GenericCast.castList(seats, LadaSeat.class));
	}
}
