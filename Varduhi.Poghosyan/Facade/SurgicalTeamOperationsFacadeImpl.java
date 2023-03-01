package Facade;

public class SurgicalTeamOperationsFacadeImpl implements SurgicalTeamOperationsFacade {

    private SurgicalTeam surgicalTeam;

    public SurgicalTeamOperationsFacadeImpl(SurgicalTeam surgicalTeam) {
        this.surgicalTeam = surgicalTeam;
    }

    public boolean transplantKidney(Patient recipient, Side side) {
        this.surgicalTeam.getCirculatingNurse().preparePatientForSurgery(recipient, SurgeryType.KIDNEY_TRANSPLANTATION);
        this.surgicalTeam.getAnesthesiologist().giveGeneralAnesthetic(recipient);
        this.surgicalTeam.getCirculatingNurse().observeToHelpSurgeon();
        this.surgicalTeam.getOperatingSurgeon().replaceOldKidney(recipient, side);
        this.surgicalTeam.getAnesthesiologist().wakeUpFromAnesthesia(recipient);
        return true;
    }

    public Object getKidney(Side side, Patient donor) {
        // get kidney from donor
        return null;
    }
}
