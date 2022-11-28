import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void addNums() {
        assertEquals(13, calculator.add(6,7));
    }

    @Test
    public void subtractNums() {
        assertEquals(1, calculator.subtract(7, 6));
    }

    @Test
    public void multiplyNums() {
        assertEquals(42, calculator.multiply(6, 7));
    }

    @Test
    public void divideNums() {
        assertEquals(1.5, calculator.divide(3.0, 2.0), 0);
    }


}
