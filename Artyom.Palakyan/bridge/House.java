package bridge;

public class House extends RealEstate {

    double floorArea;
    double landArea;

    House(Appraiser appraiser, double floorArea, double landArea) {
        super(appraiser);
        this.floorArea = floorArea;
        this.landArea = landArea;
    }

    @Override
    double estimate() {
        return appraiser.estimate(floorArea + landArea);
    }

}
