public class Set10Question5 {
    public static void main(String[] args) {
        int[] a = {-2, 3, 2, -3};
        int result = isBalanced(a);
        System.out.println(result);
    }

    public static int isBalanced (int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;

            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == 0) {
                    flag = true;
                }
            }

            if (!flag) return 0;
        }

        return 1;
    }
}
