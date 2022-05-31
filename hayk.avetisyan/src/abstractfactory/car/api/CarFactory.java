package abstractfactory.car.api;

import java.util.List;

public interface CarFactory {
	CarDesign createDesign();
	CarMotor createMotor();
	List<CarSeat> createSeats();
	Car createCar(CarDesign design, CarMotor motor, List<CarSeat> seats);
}
