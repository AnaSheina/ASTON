import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void zeroFactorialTest() {
        Assert.assertEquals(1, Factorial.countFactorial(0));
    }

    @Test
    public void positiveFactorialTest() {
        Assert.assertEquals(1, Factorial.countFactorial(1));
        Assert.assertEquals(24, Factorial.countFactorial(4));
        Assert.assertEquals(120, Factorial.countFactorial(5));
    }

    @Test
    public void negativeFactorialTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Factorial.countFactorial(-1));
    }
}