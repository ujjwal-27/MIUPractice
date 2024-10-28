public class S16Q1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 1, 4, 1, 6, 4};
        int result = largestDifferenceOfEvens(a);
        System.out.println(result);
    }

    public static int largestDifferenceOfEvens(int[] a) {
        int countEven = 0;
        int largestDifference = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) countEven++;
        }

        if (countEven < 2) return -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    if (i != j && a[j] % 2 == 0) {
                        if (a[i] > a[j]) {
                            int difference = a[i] - a[j];

                            if (difference > largestDifference) {
                                largestDifference = difference;
                            }
                        }
                    }
                }
            }
        }

        return largestDifference;
    }
}
