public class Demo {
    public static void main(String[] args) {
        Evaluable expression1 = new Adder(
                new Negate(new Constant(5.0)),
                new Constant(4.0)
        );
        System.out.println("-5 + 4 = " + expression1.evaluate());

        Evaluable expression2 = new Subtracter(
                new Divider(
                        new Constant(8.0),
                        new Adder(
                                new Constant(1.0),
                                new Constant(1.0)
                        )
                ),
                new Negate(new Constant(1.0))
        );
        System.out.println("(8.0 / (1.0 + 1.0)) - (-1) = " + expression2.evaluate());
    }
}
