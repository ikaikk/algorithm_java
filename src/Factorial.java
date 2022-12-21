/**
 * 阶乘
 */
public class Factorial {

    public static long factorial(int n) {
        if (0 == n) {
            return 0;
        } else if (1 == n) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static long factorialCycle(int n) {
        if (0 == n) {
            return 0;
        }
        if (1 == n) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(10));
        System.out.println(factorialCycle(10));
    }

}
