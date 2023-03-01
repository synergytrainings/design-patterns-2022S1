package abstractfactory.car.impl.lada;

import abstractfactory.car.api.Car;

import java.util.List;

public class Lada implements Car {

	private LadaDesign design;
	private LadaMotor motor;
	private List<LadaSeat> seats;

	public Lada(LadaDesign design, LadaMotor motor, List<LadaSeat> seats) {
		this.design = design;
		this.motor = motor;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Lada{" +
				"design=" + design +
				", motor=" + motor +
				", seats=" + seats +
				'}';
	}
}
