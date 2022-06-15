package bridge;

public abstract class RealEstate {

    Appraiser appraiser;

    RealEstate(Appraiser appraiser) {
        this.appraiser = appraiser;
    }

    abstract double estimate();

}
