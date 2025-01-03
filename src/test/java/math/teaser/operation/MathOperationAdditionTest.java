package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.ADDITION;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationAdditionTest {

    @Test
    void addTwoPositiveNumbersTest() {
        int sum1 = Integer.parseInt(ADDITION.apply(4, 2));
        int sum2 = Integer.parseInt(ADDITION.apply(2, 4));
        assertAll(
                () -> assertEquals(6, sum1),
                () -> assertEquals(6, sum2)
        );
    }

    @Test
    void addPositiveAndNegativeNumbersTest() {
        int sum1 = Integer.parseInt(ADDITION.apply(4, -2));
        int sum2 = Integer.parseInt(ADDITION.apply(-2, 4));
        assertAll(
                () -> assertEquals(2, sum1),
                () -> assertEquals(2, sum2)
        );
    }

    @Test
    void addNegativeAndPositiveNumbersTest() {
        int sum1 = Integer.parseInt(ADDITION.apply(-4, 2));
        int sum2 = Integer.parseInt(ADDITION.apply(2, -4));
        assertAll(
                () -> assertEquals(-2, sum1),
                () -> assertEquals(-2, sum2)
        );
    }

    @Test
    void addTwoNegativeNumbersTest() {
        int sum1 = Integer.parseInt(ADDITION.apply(-4, -2));
        int sum2 = Integer.parseInt(ADDITION.apply(-2, -4));
        assertAll(
                () -> assertEquals(-6, sum1),
                () -> assertEquals(-6, sum2)
        );
    }
}
