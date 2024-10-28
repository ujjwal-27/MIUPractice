public class Question19 {
    public static void main(String[] args) {
        int result = findPorcupineNumber(139);
        System.out.println(result);
    }

    private static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    private static int nextPrime(int n) {
        int nextValue = n + 1;

        while (isPrime(nextValue) == 0) {
            nextValue++;
        }

        return nextValue;
    }

    private static boolean hasLastDigitNine(int n) {
        if (n % 10 == 9) return true;

        return false;
    }

    public static int findPorcupineNumber(int n) {
        for (int candidate = n + 1; ; candidate++) {
            if (isPrime(candidate) == 1 && hasLastDigitNine(candidate)) {
                int nextPrimeNumber = nextPrime(candidate);

                if (hasLastDigitNine(nextPrimeNumber)) {
                    return candidate;
                }
            }
        }
    }
}
