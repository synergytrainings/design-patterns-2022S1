public class BinaryExpression {
    public Evaluable leftSideExpression;
    public Evaluable rightSideExpression;

    public BinaryExpression(Evaluable leftSideExpression, Evaluable rightSideExpression) {
        this.leftSideExpression = leftSideExpression;
        this.rightSideExpression = rightSideExpression;
    }
}
