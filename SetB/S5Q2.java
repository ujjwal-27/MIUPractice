public class S5Q2 {
    public static void main(String[] args) {
        int result = isPrimeProduct(22);
        System.out.println(result);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int isPrimeProduct(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) == 1){
                for (int j = i + 1; j <= n / 2; j++) {
                    if (isPrime(j) == 1) {
                        if (i * j == n) {
                            return 1;
                        }
                    }
                }
            }
        }

        return 0;
    }
}
