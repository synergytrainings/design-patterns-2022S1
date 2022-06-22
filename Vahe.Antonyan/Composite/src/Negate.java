public class Negate extends UnaryExpression implements Evaluable {

    public Negate(Evaluable rightSideExpression) {
        super(rightSideExpression);
    }

    @Override
    public Double evaluate() {
        return -this.rightSideExpression.evaluate();
    }
}
