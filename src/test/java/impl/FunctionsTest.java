package impl;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {

    private Calculator calculator;

    @BeforeClass
    private void init() {
        calculator = new Calculator();
    }

    @Test
    private void shouldSum() {
        assertEquals(calculator.sum(5, 6), 11);
    }

    @Test
    private void shouldSub() {
        assertEquals(calculator.sub(10, 5), 5);
    }

    @Test
    private void shouldDivide() {
        assertEquals(calculator.divide(10, 2), 5);
    }

    @Test
    private void shouldMultiply() {
        assertEquals(calculator.multiply(10, 10), 100);
    }
}
