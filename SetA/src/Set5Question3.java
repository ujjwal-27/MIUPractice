public class Set5Question3 {
    public static void main(String[] args) {
        int[] a = {7, 2, 9, 10, 5};
        int result = isWave(a);
        System.out.println(result);
    }

    public static int isWave (int [] a) {
        for (int i = 1; i < a.length; i++) {
            if ((a[i] % 2 == 0 && a[i - 1] % 2 == 0) || (a[i] % 2 != 0 && a[i - 1] % 2 != 0)) {
                return 0;
            }
        }

        return 1;
    }
}
