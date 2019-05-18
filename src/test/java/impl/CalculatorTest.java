package impl;

import exception.CalculatorException;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

public class CalculatorTest {


    private Map<String, Integer> map = new HashMap<>();

    private Calculator calculator;

    @Before
    public void init() {
        map = Map.of("1 + 2", 3, "15 - 3", 12);
        calculator = new Calculator();
    }

    @After
    public void clear() {

    }


    @BeforeClass
    public static void setup() {
        System.out.println("Starting Calculator tests...");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("Finishing Calculator tests...");
    }

    @Test(timeout = 5, expected = CalculatorException.class)
    public void shouldThrowOnDivisionByZero() {
        calculator.evaluate("5 / 0");
    }

    @Test
    public void shouldParseExpressions() {
        map.forEach((k, v) -> Assert.assertEquals((Integer) calculator.evaluate(k), v));
    }

    @Test(expected = CalculatorException.class)
    public void shouldNotParseExpresion() {
        calculator.evaluate("5 % 3");
    }


}
