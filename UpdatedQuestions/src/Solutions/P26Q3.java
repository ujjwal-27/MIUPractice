package Solutions;

import java.util.Arrays;

public class P26Q3 {
    public static void main(String[] args) {
        P26Q3 myClass = new P26Q3();

        int[] a = {8, 4, 9, 0, 3, 1, 2};
        int n = 88;

        int[] result = myClass.filterArray(a, n);
        System.out.println(Arrays.toString(result));
    }

    public int[] filterArray(int[] a, int n) {
        int count = 0;
        int length = 0;
        int num = n;

        while (num > 0) {
            if (num % 2 == 1) {
                length++;
            }

            num /= 2;
            count++;
        }

        if (a.length < count) return null;

        int[] a2 = new int[length];
        int i = 0;
        int index = 0;
        num = n;

        while (num > 0) {
            if (num % 2 == 1) {
                a2[index] = a[i];
                index++;
            }

            num /= 2;
            i++;
        }

        return a2;
    }
}
