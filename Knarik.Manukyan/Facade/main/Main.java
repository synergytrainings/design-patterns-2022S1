package main;

import main.Hotel.HotelRoom;

public class Main {
	public static void main(String[] args) {
		HotelFacade hotelFacade = new HotelFacade(2, 3, 1, 10);
		HotelRoom room = hotelFacade.checkin();
		hotelFacade.checkout(room);
	}
}
