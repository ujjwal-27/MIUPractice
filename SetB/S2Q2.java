public class S2Q2 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 1, 1};
        int result = is121Array(a);
        System.out.println(result);
    }

    public static int is121Array(int[] a) {
        int countFirstOnes = 0;
        int countLastOnes = 0;
        int countTwos = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countFirstOnes++;

            } else {
                break;
            }
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 1) {
                countLastOnes++;

            } else {
                break;
            }
        }

        if (countLastOnes == 0 || countFirstOnes != countLastOnes) return 0;

        for (int i = countFirstOnes; i < a.length - countLastOnes; i++) {
            if (a[i] == 2) {
                countTwos++;

            } else {
                return 0;
            }
        }

        if (countTwos == 0) return 0;

        return 1;
    }
}
