import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxNumberTest {
    @Test
    public void testMaxWithPositiveNumbers() {
        MaxNumber mn = new MaxNumber();
        assertEquals(10, mn.max(5, 10));
        assertEquals(20, mn.max(20, 15));
    }

    @Test
    public void testMaxWithNegativeNumbers() {
        MaxNumber mn = new MaxNumber();
        assertEquals(-5, mn.max(-10, -5));
    }

    @Test
    public void testMaxWithEqualNumbers() {
        MaxNumber mn = new MaxNumber();
        assertEquals(5, mn.max(5, 5));
    }
}
