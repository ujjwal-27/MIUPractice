public class Set3Question1 {
    public static void main(String[] args) {
        int[] a = {0, 6, 8, 20};
        int result = isBeanArray(a);
        System.out.println(result);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int isBeanArray(int[ ] a) {
        int primeSum = 0;
        boolean hasPrime = false;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                hasPrime = true;
                primeSum += a[i];
            }
        }

        if (hasPrime && a[0] == primeSum) {
            return 1;

        } else if (!hasPrime && a[0] == 0) {
            return 1;

        } else {
            return 0;
        }
    }
}
