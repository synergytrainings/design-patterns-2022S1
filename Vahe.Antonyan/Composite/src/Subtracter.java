public class Subtracter extends BinaryExpression implements Evaluable {
    public Subtracter(Evaluable leftSideExpression, Evaluable rightSideExpression) {
        super(leftSideExpression, rightSideExpression);
    }

    @Override
    public Double evaluate() {
        return this.leftSideExpression.evaluate() - this.rightSideExpression.evaluate();
    }
}
