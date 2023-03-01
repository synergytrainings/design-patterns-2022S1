package Facade;

import java.text.DateFormat;

public class Main {

    public static void main(String[] args) throws Exception {
        Patient patient = new Patient(
                "Kidney Kidneyan",
                "AJ13213",
                DateFormat.getDateInstance(DateFormat.MEDIUM).parse("Oct 12, 1991")
        );
        SurgicalTeam surgicalTeam = new SurgicalTeam.Builder()
                .allocateOperatingSurgeon()
                .allocateAnesthesiologist()
                .allocateCirculatingNurse()
                .build();
        SurgicalTeamOperationsFacade surgicalTeamOperationsFacadeImpl =
                new SurgicalTeamOperationsFacadeImpl(surgicalTeam);
        boolean operationSuccessful = surgicalTeamOperationsFacadeImpl.transplantKidney(patient, Side.LEFT);
        System.out.printf("Operation completed %s%n", operationSuccessful ? "successfully!" : "ruefully :(");
    }
}
