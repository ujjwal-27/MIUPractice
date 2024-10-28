public class Set11Question3 {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 11};
        int result = isSuper(a);
        System.out.println(result);
    }

    public static int isSuper (int[] a) {
        for (int i = 1; i < a.length; i++) {
            int sum = 0;

            for (int j = i - 1; j >= 0; j--) {
                sum += a[j];
            }

            if (sum >= a[i]) return 0;
        }

        return 1;
    }
}
