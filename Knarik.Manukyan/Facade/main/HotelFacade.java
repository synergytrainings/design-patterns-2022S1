package main;

import main.Hotel.Hotel;
import main.Hotel.HotelImpl;
import main.Hotel.HotelRoom;
import main.HotelStaff.Housekeeper;
import main.HotelStaff.Receptionist;
import main.HotelStaff.SecurityGuard;

public class HotelFacade {
	Hotel hotel;

	HotelFacade(int numberOfReceptionists, int numberOfHousekeepers, int numberOfSecurityGuards, int numberOfHotelRooms) {
		hotel = new HotelImpl(numberOfReceptionists, numberOfHousekeepers, numberOfSecurityGuards, numberOfHotelRooms);
	}

	HotelRoom checkin() {
		Receptionist availableReceptionist = hotel.getAvailableReceptionist();
		Housekeeper availableHousekeeper = hotel.getAvailableHousekeeper();
		SecurityGuard availableSecurity = null;
		boolean isPassportValid = availableReceptionist.checkPassport();
		if (!isPassportValid) {
			availableSecurity = hotel.getAvailableSecurity();
			availableSecurity.call();
			returnBackStaff(availableReceptionist, availableHousekeeper, availableSecurity);
			return null;
		}
		HotelRoom availableRoom = hotel.getAvailableRoom();
		availableReceptionist.assignToRoom(availableRoom);
		availableReceptionist.makePayment();
		availableReceptionist.explainTermsAndConditions();
		boolean isTheRoomClean = availableHousekeeper.checkIfTheRoomIsClean(availableRoom);
		if (!isTheRoomClean) {
			availableHousekeeper.cleanTheRoom(availableRoom);
		}
		returnBackStaff(availableReceptionist, availableHousekeeper, availableSecurity);
		return availableRoom;
	}

	void checkout(HotelRoom hotelRoom) {
		Receptionist availableReceptionist = hotel.getAvailableReceptionist();
		Housekeeper availableHousekeeper = hotel.getAvailableHousekeeper();
		SecurityGuard availableSecurity = null;
		availableHousekeeper.checkMiniBar(hotelRoom);
		boolean anythingBroken = availableHousekeeper.checkIfAnythingBroken(hotelRoom);
		boolean anythingStolen = availableHousekeeper.checkIfAnythingStolen(hotelRoom);
		boolean isPaymentDone = availableReceptionist.makePayment();
		if(anythingBroken || anythingStolen || isPaymentDone) {
			availableSecurity = hotel.getAvailableSecurity();
			availableSecurity.call();
		}
		hotel.returnRoom(hotelRoom);
		availableHousekeeper.cleanTheRoom(hotelRoom);
		availableHousekeeper.updateMiniBar(hotelRoom);
		returnBackStaff(availableReceptionist, availableHousekeeper, availableSecurity);
	}

	private void returnBackStaff(Receptionist availableReceptionist, Housekeeper availableHousekeeper, SecurityGuard availableSecurity) {
		if(availableReceptionist != null) {
			hotel.returnBackReceptionist(availableReceptionist);
		}
		if(availableHousekeeper != null) {
			hotel.returnBackHousekeeper(availableHousekeeper);
		}
		if(availableSecurity != null) {
			hotel.returnBackSecurity(availableSecurity);
		}
	}
}
