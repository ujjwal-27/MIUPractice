public class Set10Question4 {
    public static void main(String[] args) {
        int[] a = {3, 3, 2, 8, 7};
        int result = isTwinoid(a);
        System.out.println(result);
    }

    public static int isTwinoid (int [] a) {
        int countEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                countEven++;
            }
        }

        if (countEven != 2) return 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i - 1] % 2 == 0) {
                return 1;
            }
        }

        return 0;
    }
}
