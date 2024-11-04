public class S21Q2 {
    public static void main(String[] args) {
        int[] a = {9, 999, 99999, -9999};
        int result = isVanilla(a);
        System.out.println(result);
    }

    public static int isVanilla(int[] a) {
        int digit = a[0] % 10;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] *= -1;
            }

            while (a[i] > 0){
                if (a[i] % 10 != digit) return 0;

                a[i] /= 10;
            }
        }

        return 1;
    }
}
