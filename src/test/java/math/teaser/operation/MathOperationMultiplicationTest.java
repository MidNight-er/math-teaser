package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.MULTIPLICATION;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationMultiplicationTest {

    @Test
    void multiplyTwoPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(8, Integer.parseInt(MULTIPLICATION.apply(4, 2))),
                () -> assertEquals(8, Integer.parseInt(MULTIPLICATION.apply(2, 4)))
        );
    }

    @Test
    void multiplyPositiveAndNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(-8, Integer.parseInt(MULTIPLICATION.apply(4, -2))),
                () -> assertEquals(-8, Integer.parseInt(MULTIPLICATION.apply(-2, 4)))
        );
    }

    @Test
    void multiplyNegativeAndPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(-8, Integer.parseInt(MULTIPLICATION.apply(-4, 2))),
                () -> assertEquals(-8, Integer.parseInt(MULTIPLICATION.apply(2, -4)))
        );
    }

    @Test
    void multiplyTwoNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(8, Integer.parseInt(MULTIPLICATION.apply(-4, -2))),
                () -> assertEquals(8, Integer.parseInt(MULTIPLICATION.apply(-2, -4)))
        );
    }
}
