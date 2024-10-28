public class Question18 {
    public static void main(String[] args) {
        int[] a = {9,0,2,-5,7};
        int result = countSquarePairs(a);
        System.out.println(result);
    }

    private static boolean isPerfectSquare(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }

    public static int countSquarePairs(int[] a) {
        if (a.length < 2) return 0;

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0 && a[i] < a[j]) {
                    int sum = a[i] + a[j];

                    if (isPerfectSquare(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
