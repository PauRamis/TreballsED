import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class tes {
    @Test
    public void testInt() {
        assertEquals(1, calc.add(0, 1));
        assertEquals(5, calc.add(4, 1));
        assertEquals(44, calc.add(34, 10));

        assertEquals(1, calc.subtract(2, 1));
        assertEquals(2, calc.subtract(3, 1));
        assertEquals(19, calc.subtract(20, 1));

        assertEquals(1, calc.multiply(1, 1));
        assertEquals(25, calc.multiply(5, 5));
        assertEquals(0, calc.multiply(100, 0));

        assertEquals(1, calc.divide(2, 2));
        assertEquals(1, calc.divide(10, 10));
        assertEquals(4, calc.divide(8, 2));

        assertEquals(0, calc.remainder(2, 2));
        assertEquals(1, calc.remainder(5, 2));
        assertEquals(0, calc.remainder(47, 1));

    }
    @Test
    public void testDouble() {

        assertEquals(1.5, calc.add(0, 1.5), 0);
        assertEquals(2.5, calc.add(1.0, 1.5), 0);
        assertEquals(3.0, calc.add(1.5, 1.5), 0);

        assertEquals(0.5, calc.subtract(2.0, 1.5), 0);
        assertEquals(1.0, calc.subtract(2.5, 1.5), 0);
        assertEquals(18.5, calc.subtract(20.0, 1.5), 0);

        assertEquals(1.5, calc.multiply(1, 1.5), 0);
        assertEquals(2.5, calc.multiply(1, 2.5), 0);
        assertEquals(15.0, calc.multiply(10, 1.5), 0);

        assertEquals(1.5, calc.divide(3.0, 2.0), 0);
        assertEquals(15.0, calc.divide(30.0, 2.0), 0);
        assertEquals(3.5, calc.divide(70.0, 20.0), 0);

        assertEquals(0.0, calc.power(2.5, 2.5), 0);
        assertEquals(2.0, calc.power(50.0, 3.0), 0);
        assertEquals(0.0, calc.power(47, 1), 0);
    }
}
