package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.DIVISION;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationDivisionTest {

    @Test
    void divideTwoPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(2, Integer.parseInt(DIVISION.apply(4, 2))),
                () -> assertArrayEquals(new int[] {0, 2}, getQuotientAndReminder(2, 4)),
                () -> assertArrayEquals(new int[] {2, 1}, getQuotientAndReminder(5, 2)),
                () -> assertArrayEquals(new int[] {0, 2}, getQuotientAndReminder(2, 5))
        );
    }

    @Test
    void dividePositiveAndNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(-2, Integer.parseInt(DIVISION.apply(4, -2))),
                () -> assertArrayEquals(new int[] {0, -2}, getQuotientAndReminder(-2, 4)),
                () -> assertArrayEquals(new int[] {-2, 1}, getQuotientAndReminder(5, -2)),
                () -> assertArrayEquals(new int[] {0, -2}, getQuotientAndReminder(-2, 5))
        );
    }

    @Test
    void divideNegativeAndPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(-2, Integer.parseInt(DIVISION.apply(-4, 2))),
                () -> assertArrayEquals(new int[] {0, 2}, getQuotientAndReminder(2, -4)),
                () -> assertArrayEquals(new int[] {-2, -1}, getQuotientAndReminder(-5, 2)),
                () -> assertArrayEquals(new int[] {0, 2}, getQuotientAndReminder(2, -5))
        );
    }

    @Test
    void divideTwoNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(2, Integer.parseInt(DIVISION.apply(-4, -2))),
                () -> assertArrayEquals(new int[] {0, -2}, getQuotientAndReminder(-2, -4)),
                () -> assertArrayEquals(new int[] {2, -1}, getQuotientAndReminder(-5, -2)),
                () -> assertArrayEquals(new int[] {0, -2}, getQuotientAndReminder(-2, -5))
        );
    }

    private static int[] getQuotientAndReminder(int dividend, int divisor) {
        final String[] result = DIVISION.apply(dividend, divisor).split("R");
        return new int[] {Integer.parseInt(result[0]), Integer.parseInt(result[1])};
    }
}
