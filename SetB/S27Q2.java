public class S27Q2 {
    public static void main(String[] args) {
        int result = primeCount(-10, 6);
        System.out.println(result);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int primeCount(int start, int end) {
        if (start > end) return 0;

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i) == 1) {
                count++;
            }
        }

        return count;
    }
}
