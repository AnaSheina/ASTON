public class Factorial {
    public static long countFactorial(int num) {
        long fac = 1;
        if (num < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        for (int i = num; i > 0; i--) {
            fac = fac * i;
        }
        return fac;
    }
}
