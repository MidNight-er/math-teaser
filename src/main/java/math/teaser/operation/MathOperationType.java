package math.teaser.operation;

public enum MathOperationType {

    PLUS("+") {
        @Override
        public int apply(int number1, int number2) {
            return Math.addExact(number1, number2);
        }
    },
    MINUS("-") {
        @Override
        public int apply(int number1, int number2) {
            return Math.subtractExact(number1, number2);
        }
    },
    MULTIPLY("*") {
        @Override
        public int apply(int number1, int number2) {
            return Math.multiplyExact(number1, number2);
        }
    };

    private final String representation;

    MathOperationType(String representation) {
        this.representation = representation;
    }

    public abstract int apply(int number1, int number2);

    public String getRepresentation() {
        return representation;
    }

}
