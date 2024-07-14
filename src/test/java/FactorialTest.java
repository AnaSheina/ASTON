import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test(description = "Zero testing")
    public void zeroFactorialTest() {
        Assert.assertEquals(1, Factorial.countFactorial(0));
    }

    @DataProvider
    public static Object[][] positiveNumber() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
    }

    @Test(dataProvider = "positiveNumber")
    public void positiveFactorialTest(int m, int expected) {
        int actual = Factorial.countFactorial(m);
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Negative number testing")
    public void negativeFactorialTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Factorial.countFactorial(-1));
    }
}