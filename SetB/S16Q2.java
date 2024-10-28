public class S16Q2 {
    public static void main(String[] args) {
        int result = isFactorialPrime(7);
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int isFactorialPrime(int n) {
        if (!isPrime(n)) return 0;

        for (int i = 1; i < n; i++) {
            int factorial = factorial(i);

            if (n == (factorial + 1)) return 1;
        }

        return 0;
    }
}
