public class Constant implements Evaluable {
    private Double value;

    public Constant(Double value) {
        this.value = value;
    }

    @Override
    public Double evaluate() {
        return this.value;
    }
}
