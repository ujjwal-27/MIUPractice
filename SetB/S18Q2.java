import java.util.Arrays;

public class S18Q2 {
    public static void main(String[] args) {
        int[] result = encodeNumber(6936);
        System.out.println(Arrays.toString(result));
    }

    public static int isPrime(int n) {
        if (n < 2) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    public static int[] encodeNumber(int n) {
        if (n <= 1) return null;

        int count = 0;
        int divisor = 2;
        int number = n;

        while (number > 1) {
            if ((isPrime(divisor) == 1) && (number % divisor == 0)) {
                count++;
                number /= divisor;

            } else {
                divisor++;
            }
        }

        int[] a = new int[count];
        int index = 0;
        divisor = 2;

        while (n > 1) {
            if ((isPrime(divisor) == 1) && (n % divisor == 0)) {
                a[index] = divisor;
                index++;
                n /= divisor;

            } else {
                divisor++;
            }
        }

        return a;
    }
}
