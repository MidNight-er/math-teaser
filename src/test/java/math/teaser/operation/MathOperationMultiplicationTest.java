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
        int product1 = Integer.parseInt(MULTIPLICATION.apply(4, 2));
        int product2 = Integer.parseInt(MULTIPLICATION.apply(2, 4));
        assertAll(
                () -> assertEquals(8, product1),
                () -> assertEquals(8, product2)
        );
    }

    @Test
    void multiplyPositiveAndNegativeNumbersTest() {
        int product1 = Integer.parseInt(MULTIPLICATION.apply(4, -2));
        int product2 = Integer.parseInt(MULTIPLICATION.apply(-2, 4));
        assertAll(
                () -> assertEquals(-8, product1),
                () -> assertEquals(-8, product2)
        );
    }

    @Test
    void multiplyNegativeAndPositiveNumbersTest() {
        int product1 = Integer.parseInt(MULTIPLICATION.apply(-4, 2));
        int product2 = Integer.parseInt(MULTIPLICATION.apply(2, -4));
        assertAll(
                () -> assertEquals(-8, product1),
                () -> assertEquals(-8, product2)
        );
    }

    @Test
    void multiplyTwoNegativeNumbersTest() {
        int product1 = Integer.parseInt(MULTIPLICATION.apply(-4, -2));
        int product2 = Integer.parseInt(MULTIPLICATION.apply(-2, -4));
        assertAll(
                () -> assertEquals(8, product1),
                () -> assertEquals(8, product2)
        );
    }
}
