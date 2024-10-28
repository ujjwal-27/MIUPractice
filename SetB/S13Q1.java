public class S13Q1 {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 4, 5, 6};
        int n = 5;
        int result = isPairedN(a, n);
        System.out.println(result);
    }

    public static int isPairedN(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    int sumValue = a[i] + a[j];
                    int sumIndex = i + j;

                    if (sumValue == n && sumIndex == n) return 1;
                }
            }
        }

        return 0;
    }
}
