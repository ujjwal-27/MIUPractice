public class Set10Question1 {
    public static void main(String[] args) {
        int[] a = {3, 2, 5, 6, 7, 8};
        int result = lastEven(a);
        System.out.println(result);
    }

    public static int lastEven(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }

        return -1;
    }
}
