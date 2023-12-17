package math.teaser.operation;

public class MathOperation {

    private final MathOperationType type;
    private final int numberBound;
    private final int numberOffset;

    public MathOperation(MathOperationType type, int numberBound, int numberOffset) {
        this.type = type;
        this.numberBound = numberBound;
        this.numberOffset = numberOffset;
    }

    public MathOperationType getType() {
        return type;
    }

    public int getNumberBound() {
        return numberBound;
    }

    public int getNumberOffset() {
        return numberOffset;
    }
}
