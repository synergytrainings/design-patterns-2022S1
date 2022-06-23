package main;

public abstract class AbstractDirectorySub implements DirectorySub {

    private String name;
    private double size;

    public AbstractDirectorySub(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double size() {
        return size;
    }


}
