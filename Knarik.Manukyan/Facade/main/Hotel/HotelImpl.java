package main.Hotel;

import main.HotelStaff.Housekeeper;
import main.HotelStaff.Receptionist;
import main.HotelStaff.SecurityGuard;

import java.util.ArrayDeque;
import java.util.Queue;

public class HotelImpl implements Hotel{
	Queue<Receptionist> receptionists;
	Queue<Housekeeper> housekeepers;
	Queue<SecurityGuard> security;

	public HotelImpl(int numberOfReceptionists, int numberOfHousekeepers, int numberOfSecurityGuards) {
		receptionists = new ArrayDeque<>(numberOfReceptionists);
		for (int i = 0; i < numberOfReceptionists; i++) {
			receptionists.offer(new Receptionist());
		}
		housekeepers = new ArrayDeque<>(numberOfHousekeepers);
		for (int i = 0; i < numberOfHousekeepers; i++) {
			housekeepers.offer(new Housekeeper());
		}
		security = new ArrayDeque<>(numberOfHousekeepers);
		for (int i = 0; i < numberOfHousekeepers; i++) {
			security.offer(new SecurityGuard());
		}
	}

	@Override
	public Receptionist getAvailableReceptionist() {
		return receptionists.peek();
	}

	@Override
	public Housekeeper getAvailableHousekeeper() {
		return housekeepers.peek();
	}

	@Override
	public SecurityGuard getAvailableSecurity() {
		return security.peek();
	}

	@Override
	public void returnBackReceptionist(Receptionist receptionist) {
		receptionists.offer(receptionist);
	}

	@Override
	public void returnBackHousekeeper(Housekeeper housekeeper) {
		housekeepers.offer(housekeeper);
	}

	@Override
	public void returnBackSecurity(SecurityGuard securityGuard) {
		security.offer(securityGuard);
	}

}
