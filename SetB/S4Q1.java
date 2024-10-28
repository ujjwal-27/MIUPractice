public class S4Q1 {
    public static void main(String[] args) {
        int[] a = {5, 3, 14, 7, 18, 67};
        int result = isTwin(a);
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static boolean hasTwinPrime(int n) {
        return (isPrime(n + 2) || isPrime(n - 2));
    }

    public static int isTwin(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) && hasTwinPrime(a[i])) {
                boolean flag = false;

                for (int j = 0; j < a.length; j++) {
                    if (isPrime(a[j])) {
                        if (a[i] == a[j] + 2 || a[i] == a[j] - 2) {
                            flag = true;
                            break;
                        }
                    }
                }

                if (!flag) return 0;
            }
        }

        return 1;
    }
}
