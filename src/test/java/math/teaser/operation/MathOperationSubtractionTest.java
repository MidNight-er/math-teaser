package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.SUBTRACTION;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationSubtractionTest {

    @Test
    void subtractTwoPositiveNumbersTest() {
        int difference = Integer.parseInt(SUBTRACTION.apply(4, 2));
        assertEquals(2, difference);
    }

    @Test
    void subtractPositiveAndNegativeNumbersTest() {
        int difference = Integer.parseInt(SUBTRACTION.apply(4, -2));
        assertEquals(6, difference);
    }

    @Test
    void subtractNegativeAndPositiveNumbersTest() {
        int difference = Integer.parseInt(SUBTRACTION.apply(-4, 2));
        assertEquals(-6, difference);
    }

    @Test
    void subtractTwoNegativeNumbersTest() {
        int difference = Integer.parseInt(SUBTRACTION.apply(-4, -2));
        assertEquals(-2, difference);
    }

}
