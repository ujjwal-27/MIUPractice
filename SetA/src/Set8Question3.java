import java.util.Arrays;

public class Set8Question3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5, 9, 12,-2,-1};
        int k = 3;
        int n = 10;
        int[] result = fill(arr, k, n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] fill(int[] arr, int k, int n) {
        if (k <= 0 || n <= 0) return null;

        int[] arr2 = new int[n];
        int i = 0;
        int index = 0;

        while (index < n) {
            arr2[index] = arr[i];
            index++;
            i++;

            if (i == k) {
                i = 0;
            }
        }

        return arr2;
    }
}
