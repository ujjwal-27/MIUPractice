public class Set11Question1 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 11};
        int result = isMaxMinEqual(a);
        System.out.println(result);
    }

    public static int isMaxMinEqual(int[] a) {
        if (a.length < 2) return 0;

        int countMax = 0;
        int countMin = 0;
        int maxValue = a[0];
        int minValue = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];

            } else if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        if (maxValue == minValue) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == maxValue) {
                countMax++;

            } else if (a[i] == minValue) {
                countMin++;
            }
        }

        if (countMax == countMin) return 1;

        return 0;
    }
}
