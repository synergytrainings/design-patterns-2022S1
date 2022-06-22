public class Adder extends BinaryExpression implements Evaluable {
    public Adder(Evaluable rightSideExpression, Evaluable leftSideExpression) {
        super(rightSideExpression, leftSideExpression);
    }

    @Override
    public Double evaluate() {
        return this.leftSideExpression.evaluate() + this.rightSideExpression.evaluate();
    }
}
