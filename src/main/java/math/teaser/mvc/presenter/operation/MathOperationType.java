package math.teaser.mvc.presenter.operation;

public enum MathOperationType {

    ADDITION("+") {
        @Override
        public String apply(int number1, int number2) {
            return String.valueOf(Math.addExact(number1, number2));
        }
    },

    SUBTRACTION("-") {
        @Override
        public String apply(int number1, int number2) {
            return String.valueOf(Math.subtractExact(number1, number2));
        }
    },

    MULTIPLICATION("*") {
        @Override
        public String apply(int multiplier, int multiplicand) {
            return String.valueOf(Math.multiplyExact(multiplier, multiplicand));
        }
    },

    DIVISION("/") {
        @Override
        public String apply(int dividend, int divisor) {
            if (dividend % divisor == 0) {
                return String.valueOf(Math.divideExact(dividend, divisor));
            } else {
                final int remainder = dividend % divisor;
                return Math.divideExact(dividend - remainder, divisor) + "R" + remainder;
            }
        }
    },

    LOGICAL_AND("&") {
        @Override
        public String apply(int number1, int number2) {
            return String.valueOf(number1 & number2);
        }
    },

    LOGICAL_OR("|") {
        @Override
        public String apply(int number1, int number2) {
            return String.valueOf(number1 | number2);
        }
    },

    LOGICAL_XOR("^") {
        @Override
        public String apply(int number1, int number2) {
            return String.valueOf(number1 ^ number2);
        }
    };

    private final String representation;

    MathOperationType(String representation) {
        this.representation = representation;
    }

    public abstract String apply(int number1, int number2);

    public String getRepresentation() {
        return representation;
    }

}
