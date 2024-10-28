public class S4Q4 {
    public static void main(String[] args) {
        int[] a = {4, 9, 6, 7, 3};
        int result = isBunkerArray(a);
        System.out.println(result);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int isBunkerArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (isPrime(a[i]) == 1 && a[i - 1] % 2 != 0) {
                return 1;
            }
        }

        return 0;
    }
}
