public class S22Q3 {
    public static void main(String[] args) {
        int[] a = {5, -2, 1};
        int result = isSumSafe(a);
        System.out.println(result);
    }

    public static int isSumSafe(int[] a) {
        int sum = 0;

        for (int m : a) {
            sum += m;
        }

        for (int n : a) {
            if (sum == n) return 0;
        }

        return 1;
    }
}
