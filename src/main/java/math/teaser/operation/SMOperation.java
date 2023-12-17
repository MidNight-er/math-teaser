package math.teaser.operation;

public class SMOperation {

    private final MathOperationType mathOperationType;
    private final Object textRepresentation;

    public SMOperation(MathOperationType mathOperationType, Object textRepresentation) {
        this.mathOperationType = mathOperationType;
        this.textRepresentation = textRepresentation;
    }

    public String getRepresentation() {
        // TODO add language representation
        return String.valueOf(mathOperationType.getRepresentation());
    }

    public MathOperationType getMathOperation() {
        return mathOperationType;
    }
}
