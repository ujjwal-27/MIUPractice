import java.util.Arrays;

public class S20Q2 {
    public static void main(String[] args) {
        int[] a = {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4};
        int[] result = clusterCompression(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] clusterCompression(int[] a) {
        int[] a2 = new int[0];

        if (a.length == 0) return a2;

        int count = 1;
        int element = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != element) {
                count++;
                element = a[i];
            }
        }

        a2 = new int[count];
        a2[0] = a[0];
        element = a[0];
        int index = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != element) {
                a2[index] = a[i];
                element = a[i];
                index++;
            }
        }

        return a2;
    }
}
