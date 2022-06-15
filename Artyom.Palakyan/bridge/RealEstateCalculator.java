package bridge;

public class RealEstateCalculator {


    public static void main(String[] args) {
        HouseAppraiser houseAppraiser = new HouseAppraiser(800);
        House house = new House(houseAppraiser, 200, 600);
        System.out.println("House estimated price: " + house.estimate());


        FlatAppraiser flatAppraiser = new FlatAppraiser(1100);
        Flat flat = new Flat(flatAppraiser, 100);
        System.out.println("Flat estimated price: " + flat.estimate());

    }


}
