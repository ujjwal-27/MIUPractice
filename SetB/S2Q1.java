public class S2Q1 {
    public static void main(String[] args) {
        int[] a = {4, 9, 8};
        int result = isBean(a);
        System.out.println(result);
    }

    public static int isBean(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] * 2 || a[i] == (2 * a[j]) + 1 || a[i] == a[j] / 2) {
                    flag = true;
                    break;
                }
            }

            if (!flag) return 0;
        }

        return 1;
    }
}
