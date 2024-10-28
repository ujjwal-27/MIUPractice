/**
 * 21 minutes
 */

import java.util.Arrays;

public class QuestionFive {
    public static void main(String[] args) {
        int[] first = {1, 8, 3, 2, 6};
        int[] second = {2, 6, 1};
        int[] result = answerFive(first, second);
        System.out.println(Arrays.toString(result));
    }

    public static int[] answerFive(int[] first, int[] second) {
        if (first == null || second == null) return null;

        int[] commonElements = new int[0];

        if (first.length == 0 || second.length == 0) {
            return commonElements;
        }

        int[] a;
        int[] b;

        if (first.length < second.length || first.length == second.length) {
            a = first;
            b = second;

        } else {
            a = second;
            b = first;
        }

        int length = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    length++;
                }
            }
        }

        commonElements = new int[length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    commonElements[index] = a[i];
                    index++;
                }
            }
        }

        return commonElements;
    }
}
