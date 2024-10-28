import java.util.Arrays;

/**
 * Create a function which accepts an array of integers 'a' as input, and returns an array of integers 'b', in which the value of odd index is same as odd index of input array whereas the value of
 * even index is the sum of all the even index before it.
 * Example: if a = {1, 8, 3, 7, 10, 2}, then b[0] = 1, b[1] = 8, b[2] = 3 + 1 = 4, b[3] = 7; b[4] = 10 + 3 + 1 = 14, b[5] = 2.
 * The signature of the function is: answerOne(int[] a)
 */
public class QuestionOne {
    public static void main(String[] args) {
        int[] a = {1, 8, 3, 7, 10, 2};
        int[] result = answerOne(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] answerOne(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                b[i] = a[i];

            } else {
                int sum = 0;

                for (int j = i; j >= 0; j -= 2) {
                    sum += a[j];
                }

                b[i] = sum;
            }
        }

        return b;
    }
}
