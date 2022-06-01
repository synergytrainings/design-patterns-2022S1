package AbstractFactory.model;

public class FootballShoes implements Shoes {

    private String modelName;

    private int size;

    public FootballShoes(String modelName, int size) {
        this.modelName = modelName;
        this.size = size;
    }

    public String getModelName() {
        return modelName;
    }

    public int getSize() {
        return size;
    }
}
