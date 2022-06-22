package Composite;

public enum Operator {

    SUM("+")  {
        public int compute(int leftOperand, int rightOperand) {
            return leftOperand + rightOperand;
        }
    },
    SUB("-")  {
        public int compute(int leftOperand, int rightOperand) {
            return leftOperand - rightOperand;
        }
    },
    MUL("*")  {
        public int compute(int leftOperand, int rightOperand) {
            return leftOperand * rightOperand;
        }
    },
    DIV("/") {
        public int compute(int leftOperand, int rightOperand) {
            return leftOperand / rightOperand;
        }
    };

    private String operatorAsString;
    Operator(String operatorAsString) {
        this.operatorAsString = operatorAsString;
    }

    @Override
    public String toString() {
        return this.operatorAsString;
    }
    public abstract int compute(int leftOperand, int rightOperand);
}
