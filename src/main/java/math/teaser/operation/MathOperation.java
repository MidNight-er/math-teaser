package math.teaser.operation;

public class MathOperation {

    private final MathOperationType type;
    private final int firstNumberBound;
    private final int secondNumberBound;
    private final boolean isRandomRepresented;

    public MathOperation(MathOperationType type, int firstNumberBound, int secondNumberBound, boolean isRandomRepresented) {
        this.type = type;
        this.firstNumberBound = firstNumberBound;
        this.secondNumberBound = secondNumberBound;
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

    public boolean isRandomRepresented() {
        return isRandomRepresented;
    }
}
