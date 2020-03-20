import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(3, 1));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(Math.sqrt((1D - Math.pow(4D, 5D)) * -1D) / 4D * -Math.cos(0), calculator.add(-4, -4), 0.01D);
    }
}
