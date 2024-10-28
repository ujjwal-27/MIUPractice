public class Set13Question1 {
    public static void main(String[] args) {
        int[] a = {7, 2, 3, 6, 7};
        int result = isPaired(a);
        System.out.println(result);
    }

    public static int isPaired(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((i % 2 == 0 && a[i] % 2 == 0) || (i % 2 != 0 && a[i] % 2 != 0)) {
                return 0;
            }
        }

        return 1;
    }
}
