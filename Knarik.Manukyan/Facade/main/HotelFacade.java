package main;

import main.Hotel.Hotel;
import main.Hotel.HotelImpl;
import main.Hotel.HotelRoom;
import main.HotelStaff.Housekeeper;
import main.HotelStaff.Receptionist;
import main.HotelStaff.SecurityGuard;

public class HotelFacade {
	Hotel hotel;

	HotelFacade(int numberOfReceptionists, int numberOfHousekeepers, int numberOfSecurityGuards) {
		hotel = new HotelImpl(numberOfReceptionists, numberOfHousekeepers, numberOfSecurityGuards);
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
		HotelRoom hotelRoom = availableReceptionist.assignToRoom();
		availableReceptionist.makePayment();
		availableReceptionist.explainTermsAndConditions();
		boolean isTheRoomClean = availableHousekeeper.checkIfTheRoomIsClean(hotelRoom);
		if (!isTheRoomClean) {
			availableHousekeeper.cleanTheRoom(hotelRoom);
		}
		returnBackStaff(availableReceptionist, availableHousekeeper, availableSecurity);
		return hotelRoom;
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
			return;
		}
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
