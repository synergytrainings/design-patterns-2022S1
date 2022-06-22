public class Mint implements CanBeUsedToMakeTea {
    @Override
    public String getPartUsedInTea() {
        return "Mint Leaves";
    }

    @Override
    public String getEffect() {
        return "Digestive and Calming";
    }
}
