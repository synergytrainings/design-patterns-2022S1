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
	Queue<HotelRoom> hotelRooms;

	public HotelImpl(int numberOfReceptionists, int numberOfHousekeepers, int numberOfSecurityGuards, int numberOfHotelRooms) {
		receptionists = new ArrayDeque<>(numberOfReceptionists);
		for (int i = 0; i < numberOfReceptionists; i++) {
			receptionists.offer(new Receptionist());
		}
		housekeepers = new ArrayDeque<>(numberOfHousekeepers);
		for (int i = 0; i < numberOfHousekeepers; i++) {
			housekeepers.offer(new Housekeeper());
		}
		security = new ArrayDeque<>(numberOfSecurityGuards);
		for (int i = 0; i < numberOfHousekeepers; i++) {
			security.offer(new SecurityGuard());
		}
		hotelRooms = new ArrayDeque<>(numberOfHotelRooms);
		for (int i = 0; i < numberOfHousekeepers; i++) {
			hotelRooms.offer(new HotelRoom(i + 1));
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
	public HotelRoom getAvailableRoom() {
		return hotelRooms.peek();
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

	@Override
	public void returnRoom(HotelRoom room) {
		hotelRooms.offer(room);
	}

}
