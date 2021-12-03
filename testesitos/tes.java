import org.junit.Test;

import static org.junit.Assert.*;

public class tes {
    @Test
    public void test1() {

        assertEquals(1.5, calc.divide(3.0, 2.0), 0);

        assertEquals(3.5, calc.divide(7.0, 2.0), 0);

        assertEquals(15.0, calc.divide(30.0, 2.0), 0);

        assertEquals(3.5, calc.divide(70.0, 20.0), 0);
    }
}
