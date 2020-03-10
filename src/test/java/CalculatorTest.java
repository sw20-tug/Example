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
    public void testAddInvalid() {
        assertEquals(8, calculator.add(3, 1));
    }
}
