public class Question12 {
    public static void main(String[] args) {
        int[] a = {9,8,4};
        int result = isBean(a);
        System.out.println(result);
    }

    public static int isBean(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isBean = false;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2 * a[j] || a[i] == (2 * a[j]) + 1 || a[i] == a[j] / 2) {
                    isBean = true;
                    break;
                }
            }

            if (!isBean) return 0;
        }

        return 1;
    }
}
