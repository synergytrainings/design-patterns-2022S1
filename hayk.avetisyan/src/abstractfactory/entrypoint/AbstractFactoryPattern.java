package abstractfactory.entrypoint;

import abstractfactory.car.api.Car;
import abstractfactory.car.api.CarFactory;
import abstractfactory.car.impl.bmw.BmwFactory;
import abstractfactory.car.impl.lada.LadaFactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {

		Car car;

		car = createCar(new BmwFactory());
		System.out.println(car);


		car = createCar(new LadaFactory());
		System.out.println(car);
	}


	public static Car createCar(CarFactory factory) {
		return factory.createCar(factory.createDesign(), factory.createMotor(), factory.createSeats());
	}

}
