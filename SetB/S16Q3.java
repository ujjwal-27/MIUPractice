public class S16Q3 {
    public static void main(String[] args) {
        int[] a = {-2, 5, 0, 5, 12};
        int result = isOnionArray(a);
        System.out.println(result);
    }

    public static int isOnionArray(int[] a) {
        for (int j = 0, k = a.length - 1; j < a.length/2; j++, k--) {
            if (a[j] + a[k] > 10) return 0;
        }

        return 1;
    }
}
