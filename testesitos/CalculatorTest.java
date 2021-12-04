import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testInt() {
        assertEquals(1, Calculator.add(0, 1));
        assertEquals(5, Calculator.add(4, 1));
        assertEquals(44, Calculator.add(34, 10));

        assertEquals(1, Calculator.subtract(2, 1));
        assertEquals(2, Calculator.subtract(3, 1));
        assertEquals(19, Calculator.subtract(20, 1));

        assertEquals(1, Calculator.multiply(1, 1));
        assertEquals(25, Calculator.multiply(5, 5));
        assertEquals(0, Calculator.multiply(100, 0));

        assertEquals(1, Calculator.divide(2, 2));
        assertEquals(1, Calculator.divide(10, 10));
        assertEquals(4, Calculator.divide(8, 2));

        assertEquals(0, Calculator.remainder(2, 2));
        assertEquals(1, Calculator.remainder(5, 2));
        assertEquals(0, Calculator.remainder(47, 1));

    }
    @Test
    public void testDouble() {

        assertEquals(1.5, Calculator.add(0, 1.5), 0);
        assertEquals(2.5, Calculator.add(1.0, 1.5), 0);
        assertEquals(3.0, Calculator.add(1.5, 1.5), 0);

        assertEquals(0.5, Calculator.subtract(2.0, 1.5), 0);
        assertEquals(1.0, Calculator.subtract(2.5, 1.5), 0);
        assertEquals(18.5, Calculator.subtract(20.0, 1.5), 0);

        assertEquals(1.5, Calculator.multiply(1, 1.5), 0);
        assertEquals(2.5, Calculator.multiply(1, 2.5), 0);
        assertEquals(15.0, Calculator.multiply(10, 1.5), 0);

        assertEquals(1.5, Calculator.divide(3.0, 2.0), 0);
        assertEquals(15.0, Calculator.divide(30.0, 2.0), 0);
        assertEquals(3.5, Calculator.divide(70.0, 20.0), 0);

        assertEquals(0.0, Calculator.power(2.5, 2.5), 0);
        assertEquals(2.0, Calculator.power(50.0, 3.0), 0);
        assertEquals(0.0, Calculator.power(47, 1), 0);
    }
}
