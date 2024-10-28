public class Set12Question2 {
    public static void main(String[] args) {
        int[] a = {200, 10, 151, 160};
        int result = isEvenSpaced(a);
        System.out.println(result);
    }

    public static int isEvenSpaced(int[] a) {
        int maxValue = a[0];
        int minValue = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }

            if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        int difference = maxValue - minValue;

        if (difference % 2 == 0) return 1;

        return 0;
    }
}
