package math.teaser.gui.presenter;

import java.util.Random;

import math.teaser.gui.presenter.number.SMRandomNumber;
import math.teaser.gui.presenter.operation.MathOperation;
import math.teaser.gui.presenter.operation.SMOperation;
import math.teaser.gui.view.SMPanelView;
import pl.allegro.finance.tradukisto.ValueConverters;

import static math.teaser.gui.presenter.operation.MathOperationType.ADDITION;
import static math.teaser.gui.presenter.operation.MathOperationType.DIVISION;
import static math.teaser.gui.presenter.operation.MathOperationType.LOGICAL_AND;
import static math.teaser.gui.presenter.operation.MathOperationType.LOGICAL_OR;
import static math.teaser.gui.presenter.operation.MathOperationType.LOGICAL_XOR;
import static math.teaser.gui.presenter.operation.MathOperationType.MULTIPLICATION;
import static math.teaser.gui.presenter.operation.MathOperationType.SUBTRACTION;
import static pl.allegro.finance.tradukisto.ValueConverters.ENGLISH_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.POLISH_INTEGER;
import static pl.allegro.finance.tradukisto.ValueConverters.RUSSIAN_INTEGER;

public class SMPresenter implements SMPanelView.Presenter {

    private static final int logicalNumberBound = 16;
    private static final int additionAndSubtractionBound = 5000;
    private static final int multiplicationBound = 40;

    private static final MathOperation[] mathOperations = {
            new MathOperation(ADDITION, additionAndSubtractionBound, additionAndSubtractionBound, true, false),
            new MathOperation(SUBTRACTION, additionAndSubtractionBound, additionAndSubtractionBound, true,  false),
            new MathOperation(MULTIPLICATION, multiplicationBound, multiplicationBound, true, false),
            new MathOperation(DIVISION, 150, 10, true, false),
            new MathOperation(LOGICAL_AND, logicalNumberBound, logicalNumberBound, false, false),
            new MathOperation(LOGICAL_OR, logicalNumberBound, logicalNumberBound, false, false),
            new MathOperation(LOGICAL_XOR, logicalNumberBound, logicalNumberBound, false, false)
    };

    private static final ValueConverters[] valueConverters = {ENGLISH_INTEGER, RUSSIAN_INTEGER, POLISH_INTEGER};
    private static final Random random = new Random();

    private boolean showResult = false;
    private SMExpression expression = null;

    private final SMPanelView smpPanelView;

    public SMPresenter(SMPanelView smpPanelView) {
        this.smpPanelView = smpPanelView;
        smpPanelView.setPresenter(this);
    }

    @Override
    public void onTease() {
        if (!showResult) {
            expression = calculate();
            smpPanelView.setRepresentation(expression.getRepresentation() + " = ");
        } else {
            smpPanelView.setRepresentation(expression.getRepresentation() + " = " + expression.getResult());
        }
        showResult = !showResult;
    }

    private SMExpression calculate() {
        final int languageSelector = random.nextInt(valueConverters.length);
        final int operationSelector = random.nextInt(mathOperations.length);
        final MathOperation mathOperation = mathOperations[operationSelector];
        final boolean isRepresentationChanged = mathOperation.isRandomRepresented() && random.nextBoolean();
        final boolean isFirstNumberNegative = mathOperation.isNegative() && !isRepresentationChanged && random.nextBoolean();
        final boolean isSecondNumberNegative = mathOperation.isNegative() && !isRepresentationChanged && random.nextBoolean();

        return new SMExpression(
                new SMRandomNumber(random, mathOperation.getFirstNumberBound(), isFirstNumberNegative,
                        isRepresentationChanged ? valueConverters[languageSelector] : null),
                new SMRandomNumber(random, mathOperation.getSecondNumberBound(), isSecondNumberNegative,
                        isRepresentationChanged ? valueConverters[languageSelector] : null),
                new SMOperation(mathOperation.getType(), null)
        );
    }
}
