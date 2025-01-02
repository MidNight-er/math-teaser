package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.operation.MathOperationType.ADDITION;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationAdditionTest {

    @Test
    void addTwoPositiveNumbersTest() {
        int sum = Integer.parseInt(ADDITION.apply(2, 2));
        assertEquals(4, sum);
    }

    @Test
    void addPositiveAndNegativeNumbersTest() {
        int sum = Integer.parseInt(ADDITION.apply(2, -2));
        assertEquals(0, sum);
    }

    @Test
    void addNegativeAndPositiveNumbersTest() {
        int sum = Integer.parseInt(ADDITION.apply(-2, 2));
        assertEquals(0, sum);
    }

    @Test
    void addTwoNegativeNumbersTest() {
        int sum = Integer.parseInt(ADDITION.apply(-2, -2));
        assertEquals(-4, sum);
    }
}
