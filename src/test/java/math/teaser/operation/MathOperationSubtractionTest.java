package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.SUBTRACTION;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationSubtractionTest {

    @Test
    void subtractTwoPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(2, Integer.parseInt(SUBTRACTION.apply(4, 2))),
                () -> assertEquals(-2, Integer.parseInt(SUBTRACTION.apply(2, 4)))
        );
    }

    @Test
    void subtractPositiveAndNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(6, Integer.parseInt(SUBTRACTION.apply(4, -2))),
                () -> assertEquals(-6, Integer.parseInt(SUBTRACTION.apply(-2, 4)))
        );
    }

    @Test
    void subtractNegativeAndPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(-6, Integer.parseInt(SUBTRACTION.apply(-4, 2))),
                () -> assertEquals(6, Integer.parseInt(SUBTRACTION.apply(2, -4)))
        );
    }

    @Test
    void subtractTwoNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(-2, Integer.parseInt(SUBTRACTION.apply(-4, -2))),
                () -> assertEquals(2, Integer.parseInt(SUBTRACTION.apply(-2, -4)))
        );
    }
}
