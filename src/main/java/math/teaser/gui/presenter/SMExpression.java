package math.teaser.gui.presenter;

import math.teaser.gui.presenter.number.SMRandomNumber;
import math.teaser.gui.presenter.operation.MathOperationType;
import math.teaser.gui.presenter.operation.SMOperation;

public class SMExpression {

    private final SMRandomNumber number1;
    private final SMRandomNumber number2;
    private final SMOperation operation;

    public SMExpression(SMRandomNumber number1, SMRandomNumber number2, SMOperation operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public String getResult() {
        MathOperationType mathOperationType = operation.getMathOperation();
        return mathOperationType.apply(number1.getNumber(), number2.getNumber());
    }

    public String getRepresentation() {
        return number1.getRepresentation()
                + " " + operation.getRepresentation()
                + " " + number2.getRepresentation();
    }
}
