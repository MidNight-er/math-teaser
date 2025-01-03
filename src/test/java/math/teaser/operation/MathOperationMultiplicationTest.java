package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.MULTIPLICATION;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationMultiplicationTest {

    @Test
    void multiplyTwoPositiveNumbersTest() {
        int product = Integer.parseInt(MULTIPLICATION.apply(4, 2));
        assertEquals(8, product);
    }

    @Test
    void multiplyPositiveAndNegativeNumbersTest() {
        int product = Integer.parseInt(MULTIPLICATION.apply(4, -2));
        assertEquals(-8, product);
    }

    @Test
    void multiplyNegativeAndPositiveNumbersTest() {
        int product = Integer.parseInt(MULTIPLICATION.apply(-4, 2));
        assertEquals(-8, product);
    }

    @Test
    void multiplyTwoNegativeNumbersTest() {
        int product = Integer.parseInt(MULTIPLICATION.apply(-4, -2));
        assertEquals(8, product);
    }
}
