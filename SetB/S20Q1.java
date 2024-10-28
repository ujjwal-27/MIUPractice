public class S20Q1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 1, 2, 0, 1, 2};
        int result = isRailroadTie(a);
        System.out.println(result);
    }

    public static int isRailroadTie(int[] a) {
        if (a[0] == 0 || a[a.length - 1] == 0) return 0;

        boolean hasNonZero = false;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != 0) {
                hasNonZero = true;

                if ((a[i - 1] == 0 && a[i + 1] == 0) || (a[i - 1] != 0 && a[i + 1] != 0)) {
                    return 0;
                }

            } else {
                if (a[i - 1] == 0 || a[i + 1] == 0) {
                    return 0;
                }
            }
        }

        if (!hasNonZero) return 0;

        return 1;
    }
}
