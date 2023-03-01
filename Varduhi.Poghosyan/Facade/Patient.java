package Facade;

import java.util.Date;

public class Patient {
    String name;
    String passportNumber;
    Date dateOfBirth;

    public Patient(String name, String passportNumber, Date dateOfBirth) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
    }
}
