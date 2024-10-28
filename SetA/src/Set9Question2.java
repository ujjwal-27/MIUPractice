public class Set9Question2 {
    public static void main(String[] args) {
        int[] a = {1,2, 0,0, 3,4};
        int result = isHollow(a);
        System.out.println(result);
    }

    public static int isHollow(int[ ] a) {
        int countFirstNonZero = 0;
        int countLastNonZero = 0;
        int countNonZero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                countFirstNonZero++;

            } else {
                break;
            }
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                countLastNonZero++;

            } else {
                break;
            }
        }

        if (countFirstNonZero != countLastNonZero) return 0;

        for (int i = countFirstNonZero; i < a.length - countLastNonZero; i++) {
            if (a[i] == 0) {
                countNonZero++;

            } else {
                return 0;
            }
        }

        if (countNonZero >= 3) return 1;

        return 0;
    }
}
