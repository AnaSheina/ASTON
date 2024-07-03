import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    public void zeroFactorialTest(){
        assertEquals(1,Factorial.countFactorial(0));
    }
    @Test
    public void positiveFactorialTest(){
        assertEquals(1,Factorial.countFactorial(1));
        assertEquals(24,Factorial.countFactorial(4));
        assertEquals(120,Factorial.countFactorial(5));
    }
    @Test
    public void negativeFactorialTest(){
        assertThrows(IllegalArgumentException.class,()->Factorial.countFactorial(-1));
    }
}