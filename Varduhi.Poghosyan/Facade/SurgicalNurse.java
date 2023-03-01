package Facade;

public class SurgicalNurse extends MedicalSpecialist {

    public void observeToHelpSurgeon() {
        System.out.println("Nurse is ready to help the surgeon when needed...\n...");
    }

    public void preparePatientForSurgery(Patient patient, SurgeryType surgeryType) {
        if (surgeryType == SurgeryType.KIDNEY_TRANSPLANTATION) {
            System.out.printf("Preparing %s for surgery...\n...%n", patient.name);
            System.out.println("Shaving place of surgery...\n...");
            System.out.println("A laxative is given for no bowel blockage...\n...");
            System.out.println("Waiting for an effect...\n...");
            System.out.println("An IV is given for medicine to be administered...\n...");
            System.out.println("A sedative is given to reduce stress of the patient...\n...");
            System.out.println("Patient is ready for the surgery, moving them to the OR...\n...");
        } else {
            System.out.println("Nurse is not qualified for current surgery :(");
        }
    }
}
