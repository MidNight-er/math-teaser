package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.DIVISION;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationDivisionTest {

    @Test
    void divideTwoPositiveNumbersTest() {
        int quotient = Integer.parseInt(DIVISION.apply(4, 2));
        assertEquals(2, quotient);
    }

    @Test
    void dividePositiveAndNegativeNumbersTest() {
        int quotient = Integer.parseInt(DIVISION.apply(4, -2));
        assertEquals(-2, quotient);
    }

    @Test
    void divideNegativeAndPositiveNumbersTest() {
        int quotient = Integer.parseInt(DIVISION.apply(-4, 2));
        assertEquals(-2, quotient);
    }

    @Test
    void divideTwoNegativeNumbersTest() {
        int quotient = Integer.parseInt(DIVISION.apply(-4, -2));
        assertEquals(2, quotient);
    }
}
