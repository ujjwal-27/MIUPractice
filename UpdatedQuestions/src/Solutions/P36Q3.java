package Solutions;

import java.util.Arrays;

public class P36Q3 {
    public static void main(String[] args) {
        P36Q3 myClass = new P36Q3();

        int[] result = myClass.encodeArray(999);
        System.out.println(Arrays.toString(result));
    }

    public int[] encodeArray(int n) {
        int length = (n <= 0) ? 1 : 0;
        int num = (n < 0) ? n * -1 : n;

        while (num > 0) {
            int digit = num % 10;
            length += digit;
            length++;
            num /= 10;
        }

        int[] a = new int[length];
        int index = 0;
        num = n;

        if (n < 0) {
            a[0] = -1;
            index = 1;
            num *= -1;

        } else if (n == 0) {
            a[index] = 1;
            return a;
        }

        while (num > 0) {
            int digit = num % 10;

            for (int i = 0; i < digit; i++) {
                a[index] = 0;
                index++;
            }

            a[index] = 1;
            index++;
            num /= 10;
        }

        return a;
    }
}
