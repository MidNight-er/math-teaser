package math.teaser.operation;

public class MathOperation {

    private final MathOperationType type;
    private final int firstNumberBound;
    private final int secondNumberBound;
    private final boolean isNegative;
    private final boolean isRandomRepresented;

    public MathOperation(MathOperationType type, int firstNumberBound, int secondNumberBound, boolean isNegative, boolean isRandomRepresented) {
        this.type = type;
        this.firstNumberBound = firstNumberBound;
        this.secondNumberBound = secondNumberBound;
        this.isNegative = isNegative;
        this.isRandomRepresented = isRandomRepresented;
    }

    public MathOperationType getType() {
        return type;
    }

    public int getFirstNumberBound() {
        return firstNumberBound;
    }

    public int getSecondNumberBound() {
        return secondNumberBound;
    }

    public boolean isNegative() {
        return isNegative;
    }

    public boolean isRandomRepresented() {
        return isRandomRepresented;
    }
}
