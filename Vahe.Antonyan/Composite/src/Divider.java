public class Divider extends BinaryExpression implements Evaluable {

    public Divider(Evaluable leftSideExpression, Evaluable rightSideExpression) {
        super(leftSideExpression, rightSideExpression);
    }

    @Override
    public Double evaluate() {
        return this.leftSideExpression.evaluate() / this.rightSideExpression.evaluate();
    }
}
