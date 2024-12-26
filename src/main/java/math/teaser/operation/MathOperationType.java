package math.teaser.operation;

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
        public String apply(int number1, int number2) {
            return String.valueOf(Math.multiplyExact(number1, number2));
        }
    },

    DIVISION("/") {
        @Override
        public String apply(int number1, int number2) {
            if (number1 < number2 || number1 % number2 == 0) {
                return String.valueOf(Math.divideExact(number1, number2));
            } else {
                int remainder = number1 % number2;
                return Math.divideExact(number1 - remainder, number2) + "R" + remainder;
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
