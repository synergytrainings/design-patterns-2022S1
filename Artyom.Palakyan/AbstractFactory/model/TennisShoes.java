package AbstractFactory.model;

public class TennisShoes implements Shoes {

    private String modelName;

    private int size;

    public TennisShoes(String modelName, int size) {
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
