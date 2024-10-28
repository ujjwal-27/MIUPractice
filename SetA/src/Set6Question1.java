public class Set6Question1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 10, 11, 12};
        int result = isBean(a);
        System.out.println(result);
    }

    public static int isBean (int[] a) {
        boolean contains7 = false;
        boolean contains9 = false;
        boolean contains13 = false;
        boolean contains16 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 7) {
                contains7 = true;

            } else if (a[i] == 9) {
                contains9 = true;

            } else if (a[i] == 13) {
                contains13 = true;

            } else if (a[i] == 16) {
                contains16 = true;
            }
        }

        if ((contains9 && contains13) || (contains7 && !contains16) || (!contains7 && contains16) || (!contains7 && !contains9 && !contains13 && !contains16)) {
            return 1;
        }

        return 0;
    }
}
