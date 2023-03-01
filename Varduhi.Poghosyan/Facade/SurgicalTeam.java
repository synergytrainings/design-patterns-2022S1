package Facade;

import java.util.Objects;

public class SurgicalTeam {
    private final Surgeon operatingSurgeon;
    private final SurgicalNurse surgicalNurse;
    private final Anesthesiologist anesthesiologist;

    private SurgicalTeam(Surgeon operatingSurgeon, SurgicalNurse surgicalNurse, Anesthesiologist anesthesiologist) {
        this.operatingSurgeon = operatingSurgeon;
        this.surgicalNurse = surgicalNurse;
        this.anesthesiologist = anesthesiologist;
    }

    public Surgeon getOperatingSurgeon() {
        return operatingSurgeon;
    }

    public SurgicalNurse getCirculatingNurse() {
        return surgicalNurse;
    }

    public Anesthesiologist getAnesthesiologist() {
        return anesthesiologist;
    }

    public static class Builder {

        private Surgeon operatingSurgeon;
        private SurgicalNurse surgicalNurse;
        private Anesthesiologist anesthesiologist;

        public Builder allocateOperatingSurgeon() {
            // allocate from available surgeons
            this.operatingSurgeon = new Surgeon();
            return this;
        }

        public Builder allocateAnesthesiologist() {
            this.anesthesiologist = new Anesthesiologist();
            return this;
        }

        public Builder allocateCirculatingNurse() {
            this.surgicalNurse = new SurgicalNurse();
            return this;
        }

        public SurgicalTeam build() {
            Objects.requireNonNull(this.operatingSurgeon);
            Objects.requireNonNull(this.anesthesiologist);
            Objects.requireNonNull(this.surgicalNurse);
            return new SurgicalTeam(this.operatingSurgeon, this.surgicalNurse, this.anesthesiologist);
        }

    }


}
