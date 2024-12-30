package Solutions;

import java.util.Arrays;

public class P19Q2 {
    public static void main(String[] args) {
        P19Q2 myClass = new P19Q2();

        int[] a = {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4};

        int[] result = myClass.clusterCompression(a);
        System.out.println(Arrays.toString(result));
    }

    public int[] clusterCompression(int[] a) {
        int[] a2 = new int[0];
        if (a.length == 0) return a2;

        int length = 1;
        int element = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != element) {
                element = a[i];
                length++;
            }
        }

        a2 = new int[length];
        element = a[0];
        a2[0] = a[0];
        int index = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != element) {
                a2[index] = a[i];
                element = a[i];
                index++;;
            }
        }

        return a2;
    }
}
