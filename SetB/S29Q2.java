import java.util.Arrays;

public class S29Q2 {
    public static void main(String[] args) {
        S29Q2 myClass = new S29Q2();

        int[] result = myClass.encodeNumber(6936);
        System.out.println(Arrays.toString(result));
    }

    public int[] encodeNumber(int n) {
        if (n < 2) return null;

        int count = 0;
        int divisor = 2;
        int number = n;

        while (number > 1) {
            if (isPrime(divisor) && number % divisor == 0) {
                count++;
                number /= divisor;

            } else {
                divisor++;
            }
        }

        int[] a = new int[count];
        divisor = 2;
        int index = 0;

        while (n > 1) {
            if (isPrime(divisor) && n % divisor == 0) {
                a[index] = divisor;
                n /= divisor;
                index++;

            } else {
                divisor++;
            }
        }

        return a;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
