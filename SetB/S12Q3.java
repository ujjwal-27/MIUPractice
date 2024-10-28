public class S12Q3 {
    public static void main(String[] args) {
        int[] a = {5, 15, 27};
        int n = 2;
        int result = isNPrimeable(a, n);
        System.out.println(result);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int isNPrimeable(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            int sum = a[i] + n;

            if (isPrime(sum) == 0) return 0;
        }

        return 1;
    }
}
