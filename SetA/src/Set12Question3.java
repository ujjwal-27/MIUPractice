public class Set12Question3 {
    public static void main(String[] args) {
        int[] a = {13, 6, 3, 2};
        int result = isSub(a);
        System.out.println(result);
    }

    public static int isSub(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int sum = 0;

            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
            }

            if (a[i] <= sum) return 0;
        }

        return 1;
    }
}
