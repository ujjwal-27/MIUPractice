public class Question9 {
    public static void main(String[] args) {
        int result = primeCount(11, 29);
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int primeCount(int start, int end) {
        int count = 0;

        if (start > end) {
            return count;
        }

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }
}
