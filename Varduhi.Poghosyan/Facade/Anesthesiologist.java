package Facade;

public class Anesthesiologist extends MedicalSpecialist {

    public void giveGeneralAnesthetic(Patient patient) {
        System.out.printf("Giving %s general anesthetic...\n...%n", patient.name);
    }

    public void giveLocalAnesthetic(Patient patient) {
        System.out.printf("Giving %s local anesthetic...\n...%n", patient.name);
    }

    public void wakeUpFromAnesthesia(Patient patient) {
        System.out.printf("Waking %s up from anesthesia...\n...%n", patient.name);
    }
}
