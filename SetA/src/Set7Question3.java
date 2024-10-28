public class Set7Question3 {
    public static void main(String[] args) {
        int[] a = {6, 7, 2, 3, 12};
        int result = isBalanced(a);
        System.out.println(result);
    }

    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((i % 2 == 0 && a[i] % 2 != 0) || (i % 2 != 0 && a[i] % 2 == 0)) {
                return 0;
            }
        }

        return 1;
    }
}
