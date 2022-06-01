package AbstractFactory.model;

public class BasketballClothing implements Clothing {

    private String modelName;
    private int size;
    private String color;

    public BasketballClothing(String modelName, int size, String color) {
        this.modelName = modelName;
        this.size = size;
        this.color = color;
    }

    public  String getModelName() {
        return modelName;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
