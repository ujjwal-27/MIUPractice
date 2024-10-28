// SET EQUAL
public class S4Q2 {
    public static void main(String[] args) {
        int[] a = {1, 7, 1};
        int[] b = {1, 7, 1, 1};
        int result = isSetEqual(a, b);
        System.out.println(result);
    }

    public static int isSetEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean flagA = false;

            for (int j = 0; j < b.length; j++) {
                boolean flagB = false;

                for (int k = 0; k < a.length; k++) {
                    if (b[j] == a[k]) {
                        flagB = true;
                        break;
                    }
                }

                if (!flagB) return 0;

                if (a[i] == b[j]) {
                    flagA = true;
                }
            }

            if (!flagA) return 0;
        }

        return 1;
    }
}
