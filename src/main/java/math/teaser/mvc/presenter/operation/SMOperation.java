package math.teaser.mvc.presenter.operation;

public class SMOperation {

    private final MathOperationType mathOperationType;
    private final Object textRepresentation;

    public SMOperation(MathOperationType mathOperationType, Object textRepresentation) {
        this.mathOperationType = mathOperationType;
        this.textRepresentation = textRepresentation;
    }

    public String getRepresentation() {
        return String.valueOf(mathOperationType.getRepresentation());
    }

    public MathOperationType getMathOperation() {
        return mathOperationType;
    }
}
