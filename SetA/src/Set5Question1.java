public class Set5Question1 {
    public static void main(String[] args) {
        int[] a = {0, -1, 1};
        int result = isBean(a);
        System.out.println(result);
    }

    public static int isBean(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] - 1 || a[i] == a[j] + 1) {
                    flag = true;
                }
            }

            if (!flag) return 0;
        }

        return 1;
    }
}
