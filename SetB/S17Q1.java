public class S17Q1 {
    public static void main(String[] args) {
        int result = isPrimeHappy(2);
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int isPrimeHappy(int n) {
        boolean flag = false;
        int sum = 0;

        for (int i = 2; i < n; i++) {
            flag = true;

            if (isPrime(i)) {
                sum += i;
            }
        }

        if (flag && sum % n == 0) return 1;

        return 0;
    }
}
