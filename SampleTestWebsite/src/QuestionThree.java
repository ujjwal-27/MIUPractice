/**
 * 16 minutes
 */

import java.util.Arrays;

public class QuestionThree {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        int start = 1;
        int length = 2;
        char[] result = answerThree(a, start, length);
        System.out.println(Arrays.toString(result));
    }

    public static char[] answerThree(char[] a, int start, int len) {
        if (start < 0 || len < 0 || start + len > a.length) {
            return null;
        }

        char[] a2 = new char[len];
        int index = 0;

        for (int i = start; i < start + len; i++) {
            a2[index] = a[i];
            index++;
        }

        return a2;
    }
}
