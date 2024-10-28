import java.util.Arrays;

public class S19Q2 {
    public static void main(String[] args) {
        int[] a = {0, 9, 12, 18, -6};
        int n = 11;
        int[] result = filterArray(a, n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] filterArray(int[] a, int n) {
        int count = 0;
        int i = 0;
        int number = n;

        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }

            i++;
            number /= 2;
        }

        if (i > a.length) return null;

        int[] a2 = new int[count];
        i = 0;
        int index = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                a2[index] = a[i];
                index++;
            }

            i++;
            n /= 2;
        }

        return a2;
    }
}
