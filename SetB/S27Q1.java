public class S27Q1 {
    public static void main(String[] args) {
        int result = findPorcupineNumber(139);
        System.out.println(result);
    }

    public static int findPorcupineNumber(int n) {
        for (int candidate = n + 1; ; candidate++) {
            if (isPrime(candidate) == 1 && hasLastDigitNine(candidate)) {
                int nextPrimeNumber = nextPrimeNumber(candidate);

                if (hasLastDigitNine(nextPrimeNumber)) {
                    return candidate;
                }
            }
        }
    }

    public static boolean hasLastDigitNine(int n) {
        return (n % 10 == 9);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int nextPrimeNumber(int n) {
        int nextPrime = n + 1;

        while (isPrime(nextPrime) != 1) {
            nextPrime++;
        }

        return nextPrime;
    }
}
