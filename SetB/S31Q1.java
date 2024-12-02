public class S31Q1 {
    public static void main(String[] args) {
        S31Q1 myClass = new S31Q1();

        int result = myClass.isFactorialPrime(7);
        System.out.println(result);
    }

    public int isFactorialPrime(int n) {
        if (isPrime(n) == 1) {
            int factorial = 1;

            for (int i = 1; i < n; i++) {
                factorial *= i;

                if ((factorial + 1) == n) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }
}
