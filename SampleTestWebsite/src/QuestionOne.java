/**
 * 8 minutes
 */
public class QuestionOne {
    public static void main(String[] args) {
        int[] a = {10};
        int result = answerOne(a);
        System.out.println(result);
    }

    public static int answerOne(int[] a) {
        if (a.length % 2 == 0) return 0;

        int middleIndex = a.length/2;
        int middleValue = a[middleIndex];

        for (int i = 0; i < a.length; i++) {
            if (i != middleIndex && a[i] <= middleValue) {
                return 0;
            }
        }

        return 1;
    }
}
