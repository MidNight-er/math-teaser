package math.teaser.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static math.teaser.gui.presenter.operation.MathOperationType.ADDITION;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MathOperationAdditionTest {

    @Test
    void addTwoPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(6, Integer.parseInt(ADDITION.apply(4, 2))),
                () -> assertEquals(6, Integer.parseInt(ADDITION.apply(2, 4)))
        );
    }

    @Test
    void addPositiveAndNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(2, Integer.parseInt(ADDITION.apply(4, -2))),
                () -> assertEquals(2, Integer.parseInt(ADDITION.apply(-2, 4)))
        );
    }

    @Test
    void addNegativeAndPositiveNumbersTest() {
        assertAll(
                () -> assertEquals(-2, Integer.parseInt(ADDITION.apply(-4, 2))),
                () -> assertEquals(-2, Integer.parseInt(ADDITION.apply(2, -4)))
        );
    }

    @Test
    void addTwoNegativeNumbersTest() {
        assertAll(
                () -> assertEquals(-6, Integer.parseInt(ADDITION.apply(-4, -2))),
                () -> assertEquals(-6, Integer.parseInt(ADDITION.apply(-2, -4)))
        );
    }
}
