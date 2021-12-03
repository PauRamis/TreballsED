import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class tes {
    @Test
    public void test1() {
        assertEquals(1, calc.add(0, 1));

        assertEquals(1, calc.subtract(2, 1));

        assertEquals(1, calc.multiply(1, 1));

        assertEquals(1, calc.divide(2, 2));

        assertEquals(0, calc.remainder(2, 2));

    }
    public void test2() {

        assertEquals(1.5, calc.add(0, 1.5), 0);

        assertEquals(0.5, calc.subtract(2, 1.5), 0);

        assertEquals(1.5, calc.multiply(1, 1.5), 0);
        assertEquals(2.5, calc.multiply(1, 2.5), 0);
        assertEquals(15.0, calc.multiply(10, 1.5), 0);

        assertEquals(1.5, calc.divide(3.0, 2.0), 0);
        assertEquals(15.0, calc.divide(30.0, 2.0), 0);
        assertEquals(3.5, calc.divide(70.0, 20.0), 0);

    }
}
