public class S8Q2 {
    public static void main(String[] args) {
        int[] a = {1, 2, -2, -1};
        int result = isZeroBalanced(a);
        System.out.println(result);
    }

    public static int isZeroBalanced(int[] a) {
        if (a.length == 0) return 0;

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            sum += a[i];

            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == 0) {
                    flag = true;
                }
            }

            if (!flag) return 0;
        }

        if (sum == 0) return 1;

        return 0;
    }
}
