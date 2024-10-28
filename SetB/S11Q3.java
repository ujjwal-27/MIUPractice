public class S11Q3 {
    public static void main(String[] args) {
        int[] a = {3, 2, 9, 5};
        int result = isComplete(a);
        System.out.println(result);
    }

    public static boolean isPerfectSquare(int n) {
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }

    public static int isComplete(int[] a) {
        boolean hasEven = false;
        boolean hasPerfectSquare = false;
        boolean hasSumToEight = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                hasEven = true;
            }

            if (isPerfectSquare(a[i])) {
                hasPerfectSquare = true;
            }

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    hasSumToEight = true;
                    break;
                }
            }

            if (hasEven && hasPerfectSquare && hasSumToEight) {
                return 1;
            }
        }

        return 0;
    }
}
