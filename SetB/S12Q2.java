import java.util.Arrays;

public class S12Q2 {
    public static void main(String[] args) {
        int[] a = {2, 1, 18, -5, -5, -15, 0, 0, 1, -1};
        int[] result = pairwiseSum(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] pairwiseSum(int[ ] a) {
        int length = a.length;

        if (length == 0 || length % 2 != 0) return null;

        int[] a2 = new int[length/2];
        int index = 0;

        for (int i = 1; i < length; i+=2) {
            int sum = a[i] + a[i - 1];
            a2[index] = sum;
            index++;
        }

        return a2;
    }
}
