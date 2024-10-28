public class S7Q2 {
    public static void main(String[] args) {
//        int[] a = {1, 1, 9, 9, 1};
        int[] a = {2, 2, 0, 4, 2};
        int result = isDaphne(a);
        System.out.println(result);
    }

    public static int isDaphne (int[] a) {
        for (int i = 1; i < a.length; i++) {
            if ((a[0] % 2 == 0 && a[i] % 2 != 0) || (a[0] % 2 != 0 && a[i] % 2 == 0)) {
                return 0;
            }
        }

        return 1;
    }
}
