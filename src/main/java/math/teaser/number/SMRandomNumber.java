package math.teaser.number;

import pl.allegro.finance.tradukisto.ValueConverters;

import java.util.Random;

public class SMRandomNumber {

    private final int number;
    private final ValueConverters textRepresentation;

    public SMRandomNumber(Random random, int numberBound, int offset, ValueConverters textRepresentation) {
        number = random.nextInt(numberBound) + offset;
        this.textRepresentation = textRepresentation;
    }

    public String getRepresentation() {
        return textRepresentation != null
                ? textRepresentation.asWords(number)
                : String.valueOf(number);
    }

    public int getNumber() {
        return number;
    }
}
