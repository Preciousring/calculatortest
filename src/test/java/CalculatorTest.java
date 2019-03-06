import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    @Test
    public void add() throws Exception {
        int expectedValue = 12;
        Calculator calculator = new Calculator();
        int actualValue = calculator.add(10, 2);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void sub() throws Exception {
        int expectedValue = 8;
        Calculator calculator = new Calculator();
        int actualValue = calculator.sub(10, 2);
        assertEquals(expectedValue,actualValue);
    }

}