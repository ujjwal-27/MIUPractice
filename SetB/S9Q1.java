public class S9Q1 {
    public static void main(String[] args) {
        int result = isTwinPrime(7);
        System.out.println(result);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int isTwinPrime(int n) {
        if (isPrime(n) == 0) return 0;

        if (isPrime(n + 2) == 1 || isPrime(n - 2) == 1) {
            return 1;
        }

        return 0;
    }
}
