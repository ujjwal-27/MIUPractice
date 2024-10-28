public class Set10Question2 {
    public static void main(String[] args) {
        int[] a = {6, 3, 1, 3, 4, 3, 6, 5};
        int result = countMax(a);
        System.out.println(result);
    }

    public static int countMax (int[] a) {
        int countMax = 0;
        int maxValue = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == maxValue) {
                countMax++;
            }
        }

        return countMax;
    }
}
