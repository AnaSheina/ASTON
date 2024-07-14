import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    @DisplayName("Проверка нуля")
    public void zeroFactorialTest() {
        assertEquals(1, Factorial.countFactorial(0));
    }

    @DisplayName("Проверка позитивных значений")
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,6",
            "4,24",
            "5,120"
    })
    public void positiveFactorialTest(int m, int expected) {
        int actual = Factorial.countFactorial(m);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка негативного значения")
    public void negativeFactorialTest() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.countFactorial(-1));
    }
}