package Composite;

public class Demo {
    public static void main(String[] args) {
        // 1 + 2
        Expression basicExpression = new ExpressionTree(Operator.SUM, new Constant(1), new Constant(2));
        System.out.println(basicExpression.getAsString() + "=" + basicExpression.computeValue());

        //((1+2)-(3*4))/5
        Expression complexExpression = new ExpressionTree(Operator.DIV,
                new ExpressionTree(Operator.SUB,
                        new ExpressionTree(Operator.SUM,
                                new Constant(1),
                                new Constant(2)),
                        new ExpressionTree(Operator.MUL,
                                new Constant(3),
                                new Constant(4))),
                new Constant(5));

        System.out.println(complexExpression.getAsString() + " = " + complexExpression.computeValue());

    }
}
