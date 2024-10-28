public class S8Q1 {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1};
        int result = isCubePerfect(a);
        System.out.println(result);
    }

    public static boolean isCube(int n) {
        if (n < 0) {
            n *= -1;
        }

        for (int i = 0; i * i * i <= n; i++) {
            if (i * i * i == n) return true;
        }

        return false;
    }

    public static int isCubePerfect(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (!isCube(a[i])) return 0;
        }

        return 1;
    }
}
