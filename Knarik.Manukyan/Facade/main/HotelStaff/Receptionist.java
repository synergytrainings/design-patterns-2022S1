package main.HotelStaff;

import main.Hotel.HotelRoom;

public class Receptionist {
	public boolean checkPassport() {
		System.out.println("Checking guest's passport");
		return true;
	}
	
	public boolean makePayment() {
		System.out.println("Making Payment");
		return true;
	}

	public void explainTermsAndConditions() {
		System.out.println("Explain Terms and Conditions");
	}
	
	public void assignToRoom(HotelRoom availableRoom) {
		System.out.println("Assigning the room");
	}
}
