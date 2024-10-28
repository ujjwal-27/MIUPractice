public class S18Q3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        int m = 1;
        int n = 5;
        int result = isSequencedArray(a, m, n);
        System.out.println(result);
    }

    public static int isSequencedArray(int[] a, int m, int n) {
        if (a[0] != m || a[a.length - 1] != n) return 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) return 0;
        }

        for (int i = m; i <= n; i++) {
            boolean flag = false;

            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    flag = true;
                }
            }

            if (!flag) return 0;
        }

        return 1;
    }
}
