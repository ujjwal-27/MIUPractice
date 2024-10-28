public class Set13Question2 {
    public static void main(String[] args) {
        int[] a = {4, 9, 6, 7, 49};
        int result = isBunkerArray(a);
        System.out.println(result);
    }

    public static int isBunkerArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int square = a[i - 1] * a[i - 1];

            if (a[i] == square && a[i - 1] % 2 != 0) {
                return 1;
            }
        }

        return 0;
    }
}
