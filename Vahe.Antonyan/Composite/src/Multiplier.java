public class Multiplier extends BinaryExpression implements Evaluable {
    public Multiplier(Evaluable leftSideExpression, Evaluable rightSideExpression) {
        super(leftSideExpression, rightSideExpression);
    }

    @Override
    public Double evaluate() {
        return this.leftSideExpression.evaluate() * this.rightSideExpression.evaluate();
    }
}
