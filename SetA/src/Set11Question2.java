public class Set11Question2 {
    public static void main(String[] args) {
        int[] a = {100, 19, 131, 140};
        int result = isOddSpaced(a);
        System.out.println(result);
    }

    public static int isOddSpaced(int[] a) {
        int maxValue = a[0];
        int minValue = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];

            } else if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        int difference = maxValue - minValue;

        if (difference % 2 != 0) return 1;

        return 0;
    }
}
