package Facade;



interface SurgicalTeamOperationsFacade {

    public boolean transplantKidney(Patient recipient, Side side);

    public Object getKidney(Side side, Patient donor);
}
