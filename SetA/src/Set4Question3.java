public class Set4Question3 {
    public static void main(String[] args) {
        int[] a = {6, 10, 1, 0, 7};
        int result = isMeera(a);
        System.out.println(result);
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int isMeera(int [ ] a) {
        boolean hasPrime = false;
        boolean hasZero = false;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                hasPrime = true;
            }

            if (a[i] == 0) {
                hasZero = true;
            }
        }

        if ((hasPrime && hasZero) || (!hasPrime && !hasZero)) return 1;

        return 0;
    }
}
