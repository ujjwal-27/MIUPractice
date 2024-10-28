public class S13Q2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 1, 2, 1, 2};
        int result = isMartian(a);
        System.out.println(result);
    }

    public static int isMartian(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) return 0;
        }

        int countOnes = 0;
        int countTwos = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countOnes++;
            }

            if (a[i] == 2) {
                countTwos++;
            }
        }

        if (countOnes > countTwos) return 1;

        return 0;
    }
}
