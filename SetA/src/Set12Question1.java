public class Set12Question1 {
    public static void main(String[] args) {
        int[] a = {2, 7, 9, 10, 11, 5, 8};
        int result = isSym(a);
        System.out.println(result);
    }

    public static int isSym (int[] a) {
        for (int i = 0, j = a.length - 1; i < a.length/2; i++, j--) {
            if ((a[i] % 2 == 0 && a[j] % 2 != 0) || (a[i] % 2 != 0 && a[j] % 2 == 0)) {
                return 0;
            }
        }

        return 1;
    }
}
