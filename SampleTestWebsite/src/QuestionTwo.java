/**
 * 7 minutes
 */
public class QuestionTwo {
    public static void main(String[] args) {
        int[] a = {1, 1};
        int result = answerTwo(a);
        System.out.println(result);
    }

    public static int answerTwo(int[] a) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumEven += a[i];

            } else {
                sumOdd += a[i];
            }
        }

        return sumOdd - sumEven;
    }
}
