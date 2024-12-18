package math.teaser.operation;

public enum MathOperationType {

    ADDITION("+") {
        @Override
        public int apply(int number1, int number2) {
            return Math.addExact(number1, number2);
        }
    },
    SUBTRACTION("-") {
        @Override
        public int apply(int number1, int number2) {
            return Math.subtractExact(number1, number2);
        }
    },
    MULTIPLICATION("*") {
        @Override
        public int apply(int number1, int number2) {
            return Math.multiplyExact(number1, number2);
        }
    },
    DIVISION("/") {
        @Override
        public int apply(int number1, int number2) {
            return Math.divideExact(number1, number2);
        }
    },
    REMINDER("%") {
        @Override
        public int apply(int number1, int number2) {
            return number1 % number2;
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
