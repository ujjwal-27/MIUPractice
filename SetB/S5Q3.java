public class S5Q3 {
    public static void main(String[] args) {
        int[] a = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
        int result = isComplete(a);
        System.out.println(result);
    }

    public static int isComplete (int[] a) {
        int evenNumber = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenNumber = a[i];
                break;
            }
        }

        int max = evenNumber;
        int min = evenNumber;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] > max) {
                    max = a[i];
                }

                if (a[i] < min) {
                    a[i] = min;
                }
            }
        }

        if (max == min) return 0;

        for (int i = min; i < max; i++) {
            boolean flag = false;

            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) return 0;
        }

        return 1;
    }
}
