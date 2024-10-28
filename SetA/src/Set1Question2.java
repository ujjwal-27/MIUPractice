public class Set1Question2 {
    public static void main(String[] args) {
        int[] a = {2, 8, 7, 10, -4, 6};
        int result = isDaphne(a);
        System.out.println(result);
    }

    public static int isDaphne(int[ ] a) {
        boolean hasOdd = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOdd = true;
                break;
            }
        }

        if (!hasOdd) return 0;

        for (int i = 0, j = a.length - 1; i < a.length/2; i++, j--) {
            if ((a[i] % 2 == 0 && a[j] % 2 != 0) || (a[i] % 2 != 0 && a[j] % 2 == 0)) {
                return 0;
            }
        }

        return 1;
    }
}
