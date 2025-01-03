package Solutions;

import java.util.Arrays;

public class P28Q2 {
    public static void main(String[] args) {
        P28Q2 myClass = new P28Q2();

        int[] result = myClass.encodeNumber(6936);
        System.out.println(Arrays.toString(result));
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int[] encodeNumber(int n) {
        int length = 0;
        int divisor = 2;
        int num = n;

        while (num > 1) {
            if (isPrime(divisor) && num % divisor == 0) {
                num /= divisor;
                length++;

            } else {
                divisor++;
            }
        }

        int[] a2 = new int[length];
        divisor = 2;
        int index = 0;
        num = n;

        while (num > 1) {
            if (isPrime(divisor) && num % divisor == 0) {
               a2[index] = divisor;
               num /= divisor;
               index++;

            } else {
                divisor++;
            }
        }

        return a2;
    }
}
