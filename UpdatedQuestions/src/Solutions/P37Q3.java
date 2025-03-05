package Solutions;

public class P37Q3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 1, 4, 1, 6, 4};
        int result = largestDifferenceOfEvens(a);
        System.out.println(result);
    }

    public static int largestDifferenceOfEvens(int[] a) {
        int largestDifference = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    if (i != j && a[j] % 2 == 0) {
                        int difference = a[i] - a[j];

                        if (difference > largestDifference) {
                            largestDifference = difference;
                        }
                    }
                }
             }
        }

        return largestDifference;
    }
}
