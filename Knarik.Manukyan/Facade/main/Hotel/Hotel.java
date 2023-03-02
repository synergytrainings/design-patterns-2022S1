package main.Hotel;

import main.HotelStaff.Housekeeper;
import main.HotelStaff.Receptionist;
import main.HotelStaff.SecurityGuard;

public interface Hotel {
	Receptionist getAvailableReceptionist();
	Housekeeper getAvailableHousekeeper();
	SecurityGuard getAvailableSecurity();

	void returnBackReceptionist(Receptionist receptionist);
	void returnBackHousekeeper(Housekeeper housekeeper);
	void returnBackSecurity(SecurityGuard securityGuard);
}
