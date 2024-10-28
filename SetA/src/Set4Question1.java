public class Set4Question1 {
    public static void main(String[] args) {
        int[] a = {9, 6, 18};
        int result = isFilter(a);
        System.out.println(result);
    }

    public static int isFilter(int[ ] a) {
        boolean contains7 = false;
        boolean contains9 = false;
        boolean contains11 = false;
        boolean contains13 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 7) {
                contains7 = true;

            } else if (a[i] == 9) {
                contains9 = true;

            } else if (a[i] == 11) {
                contains11 = true;

            } else if (a[i] == 13) {
                contains13 = true;
            }
        }

        if ((contains9 && contains11) || (contains7 && !contains13) || (!contains7 && contains13)) {
            return 1;
        }

        return 0;
    }
}
