/**
 * 12 minutes
 */
public class QuestionSix {
    public static void main(String[] args) {
        int[] a = {1, 8, 3, 7, 10, 2};
        int result = answerSix(a);
        System.out.println(result);
    }

    public static int answerSix(int[] a) {
        int leftSum = 0;
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            int rightSum = total - (leftSum + a[i]);

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += a[i];
        }

        return -1;
    }
}
