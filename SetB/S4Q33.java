public class S4Q33 {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 5};
        int result = isCentered(a);
        System.out.println(result);
    }

    public static int isCentered(int[] a) {
        if (a.length % 2 == 0) return 0;

        int middleElement = a[a.length/2];

        for (int i = 0, j = a.length - 1; i < a.length/2; i++, j--) {
            if (a[i] <= middleElement || a[j] <= middleElement) return 0;
        }

        return 1;
    }
}
