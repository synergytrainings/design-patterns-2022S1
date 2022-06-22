package Composite;

public class ExpressionTree implements Expression{
    private Operator operator;
    private Expression leftExpression;
    private Expression rightExpression;

    public ExpressionTree(Operator operator, Expression leftExpresion, Expression rightExpression) {
        this.operator = operator;
        this.leftExpression = leftExpresion;
        this.rightExpression = rightExpression;
    }


    public int computeValue() {
        return this.operator.compute(leftExpression.computeValue(), rightExpression.computeValue());
    }


    public String getAsString() {
        return "(" + leftExpression.getAsString() + operator.toString() + rightExpression.getAsString() + ")";
    }

}
