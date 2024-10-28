public class Set8Question1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1};
        int result = isOddHeavy(a);
        System.out.println(result);
    }

    public static int isOddHeavy(int[] a) {
        boolean hasOdd = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOdd = true;

                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        if (a[i] < a[j]) return 0;
                    }
                }
            }
        }

        if (hasOdd) return 1;

        return 0;
    }
}
