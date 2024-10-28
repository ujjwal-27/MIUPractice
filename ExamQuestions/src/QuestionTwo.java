/**
 * Create a function which accepts an array of integers, and return 1 if it satisfies following conditions:
 * 1. If the first element of the array is even then the last element must be even, and if the first element of the array is odd then the last element must be odd.
 * 2. For every odd element except the last element, the succeeding value must be even.
 * 3. For every odd element except the first element, the preceding value must be even.
 * If it does not satisfy the above conditions, return 0.
 * The signature of the function is: answerTwo(int[] a)
 */
public class QuestionTwo {
    public static void main(String[] args) {
        int[] a = {8, 8, 3, 10, 12}; // {2, 8, 6, 3, 10, 4}, {7, 8, 6, 3, 10, 1}
        int result = answerTwo(a);
        System.out.println(result);
    }

    public static int answerTwo(int[] a) {
        if ((a[0] % 2 == 0 && a[a.length - 1] % 2 != 0)) {
            return 0;

        } else if (a[0] % 2 != 0 && a[a.length - 1] % 2 == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
//            if ((i == 0 && a[i] % 2 != 0 && a[i + 1] % 2 != 0) || (i == a.length - 1 && a[i] % 2 != 0 && a[i - 1] % 2 != 0) || (i != 0 && i != a.length - 1 && a[i] % 2 != 0 && (a[i - 1] % 2 != 0 || a[i + 1] % 2 != 0))) {
//                return 0;
//            }

            if (i == 0 && a[i] % 2 != 0 && a[i + 1] % 2 != 0) {
                return 0;

            } else if (i == a.length - 1 && a[i] % 2 != 0 && a[i - 1] % 2 != 0) {
                return 0;

            } else if (i != 0 && i != a.length - 1 && a[i] % 2 != 0 && (a[i - 1] % 2 != 0 || a[i + 1] % 2 != 0)) {
                return 0;
            }
        }

        return 1;
    }
}
