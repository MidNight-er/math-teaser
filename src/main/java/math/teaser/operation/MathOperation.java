package math.teaser.operation;

public class MathOperation {

    private final MathOperationType type;
    private final int firstNumberBound;
    private final int secondNUmberBound;

    public MathOperation(MathOperationType type, int firstNumberBound, int secondNUmberBound) {
        this.type = type;
        this.firstNumberBound = firstNumberBound;
        this.secondNUmberBound = secondNUmberBound;
    }

    public MathOperationType getType() {
        return type;
    }

    public int getFirstNumberBound() {
        return firstNumberBound;
    }

    public int getSecondNumberBound() {
        return secondNUmberBound;
    }
}
