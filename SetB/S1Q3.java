public class S1Q3 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 8, 0, 9, 9, 1};
        int result = isMeera(a);
        System.out.println(result);
    }

    public static int isMeera(int[] a) {
        boolean contains1 = false;
        boolean contains9 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                contains1 = true;

            } else if (a[i] == 9) {
                contains9 = true;
            }
        }

        if ((contains1 && contains9) || (!contains1 && !contains9)) {
            return 1;
        }

        return 0;
    }
}
