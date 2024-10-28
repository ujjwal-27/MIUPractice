public class S15Q3 {
    public static void main(String[] args) {
        int result = isHodder(127);
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int isHodder(int n) {
        if (n == 0) return 1;

        int power = 1;

        while (power <= n) {
            power *= 2;

            int hodder = power - 1;

            if (isPrime(hodder) && hodder == n) return 1;
        }

        return 0;
    }
}
