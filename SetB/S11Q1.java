public class S11Q1 {
    public static void main(String[] args) {
        int[] a = {};
        int result = allValuesTheSame(a);
        System.out.println(result);
    }

    public static int allValuesTheSame(int[] a) {
        if (a.length == 0) return 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[0]) {
                return 0;
            }
        }

        return 1;
    }
}
