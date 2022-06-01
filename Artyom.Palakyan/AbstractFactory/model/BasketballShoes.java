package AbstractFactory.model;

public class BasketballShoes  implements Shoes {

    private String modelName;

    private int size;

    public BasketballShoes(String modelName, int size) {
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
