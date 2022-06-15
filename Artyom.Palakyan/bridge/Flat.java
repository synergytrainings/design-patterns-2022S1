package bridge;

public class Flat extends RealEstate {

    double floorArea;

    Flat(Appraiser appraiser, double floorArea) {
        super(appraiser);
        this.floorArea = floorArea;
    }

    @Override
    double estimate() {
        return appraiser.estimate(floorArea);
    }

}
