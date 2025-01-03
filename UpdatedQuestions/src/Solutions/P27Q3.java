package Solutions;

public class P27Q3 {
    public static void main(String[] args) {
        P27Q3 myClass = new P27Q3();

        int[] a = {2, 2, 3, 4, 4, 4, 5};
        int m = 2;
        int n = 5;

        int result = myClass.isSequencedArray(a, m, n);
        System.out.println(result);
    }

    public int isSequencedArray(int[ ] a, int m, int n) {
        if (a[0] != m || a[a.length - 1] != n) return 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) return 0;

            boolean flag = false;

            for (int num = m; num <= n; num++) {
                if (a[i] == num) {
                    flag = true;
                    break;
                }
            }

            if (!flag) return 0;
        }

        return 1;
    }
}
