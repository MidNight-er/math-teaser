package math.teaser.gui.presenter.number;

import pl.allegro.finance.tradukisto.ValueConverters;

import java.util.Random;

public class SMRandomNumber {

    private final int number;
    private final ValueConverters textRepresentation;
    private final boolean isNegative;

    public SMRandomNumber(Random random, int numberBound, boolean isNegative, ValueConverters textRepresentation) {
        this.isNegative = isNegative;
        int nextInt =  random.nextInt(2, numberBound);
        number = isNegative ? ~nextInt : nextInt;
        this.textRepresentation = textRepresentation;
    }

    public String getRepresentation() {
        if (textRepresentation != null && !isNegative) {
            return textRepresentation.asWords(number);
        } else {
            return String.valueOf(number);
        }
    }

    public int getNumber() {
        return number;
    }
}
