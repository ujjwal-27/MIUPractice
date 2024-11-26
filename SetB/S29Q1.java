public class S29Q1 {
    public static void main(String[] args) {
        S29Q1 myClass = new S29Q1();

        int result = myClass.largestPrimeFactor(6936);
        System.out.println(result);
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int largestPrimeFactor(int n) {
        if (n <= 1) return 0;

        int largestPrime = 2;

        for (int i = 2; i <= n/2; i++) {
            if (isPrime(i) && n % i == 0) {
                if (i > largestPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }
}
