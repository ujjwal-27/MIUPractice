public class Question17 {
    public static void main(String[] args) {
        int[] a = {11,4,20,9,2,8};
        int result = isInertial(a);
        System.out.println(result);
    }

    public static int isInertial(int[] a) {
        int maxValue = 0;
        boolean hasOddValue = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        if (maxValue % 2 != 0) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOddValue = true;

                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        if (a[j] != maxValue && a[i] < a[j]) {
                            return 0;
                        }
                    }
                }
            }
        }

        if (hasOddValue) return 1;

        return 0;
    }
}
