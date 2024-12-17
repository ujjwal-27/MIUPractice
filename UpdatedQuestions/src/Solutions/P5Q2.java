package Solutions;

public class P5Q2 {
    public static void main(String[] args) {
        P5Q2 myClass = new P5Q2();

        int result = myClass.findPorcupineNumber(139);
        System.out.println(result);
    }

    public int findPorcupineNumber(int n) {
        for (int candidate = n + 1; ; candidate++) {
            if (isPrime(candidate) == 1 && (candidate % 10 == 9)) {
                int nextPrime = nextPrime(candidate);

                if (nextPrime % 10 == 9) {
                    return candidate;
                }
            }
        }
    }

    public int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public int nextPrime(int n) {
        int next = n + 1;

        while (isPrime(next) == 0) {
            next++;
        }

        return next;
    }
}
