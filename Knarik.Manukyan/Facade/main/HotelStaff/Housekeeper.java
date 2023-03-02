package main.HotelStaff;

import main.Hotel.HotelRoom;

public class Housekeeper {
	public boolean checkIfTheRoomIsClean(HotelRoom hotelRoom) {
		System.out.printf("checking if the room %s is clean", hotelRoom.number);
		System.out.println();
		return true;
	}

	public void cleanTheRoom(HotelRoom hotelRoom) {
		System.out.printf("cleaning the room %s", hotelRoom.number);
		System.out.println();
	}

	public void checkMiniBar(HotelRoom hotelRoom) {
		System.out.printf("checking minibar in the room %s", hotelRoom.number);
		System.out.println();
	}

	public void updateMiniBar(HotelRoom hotelRoom) {
		System.out.printf("updating minibar in the room %s", hotelRoom.number);
		System.out.println();
	}

	public boolean checkIfAnythingBroken(HotelRoom hotelRoom) {
		System.out.printf("checking if anything is broken in the room %s", hotelRoom.number);
		System.out.println();
		return false;
	}

	public boolean checkIfAnythingStolen(HotelRoom hotelRoom) {
		System.out.printf("checking if anything is stolen in the room %s", hotelRoom.number);
		System.out.println();
		return false;
	}
}
