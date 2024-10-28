/**
 * Create a function which accepts an array of integers, and return 1 if it satisfies following conditions:
 * 1. If the array has even no. of element.
 * 2. If the sum of elements in the first half is equal to sum of elements in the second half of the array.
 * If it does not satisfy the above conditions, return 0.
 * The signature of the function is: answerTwo(int[] a)
 */
public class QuestionThree {
    public static void main(String[] args) {
        int[] a = {7, 5, 1, 8, 2, 3}; // {2, 8, 6, 3, 10, 4}, {7, 8, 6, 3, 10, 1}
        int result = answerThree(a);
        System.out.println(result);
    }

    public static int answerThree(int[] a) {
        if (a.length % 2 != 0) return 0;

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0, j = a.length - 1; i < a.length/2; i++, j--) {
            firstHalfSum += a[i];
            secondHalfSum += a[j];
        }

        if (firstHalfSum == secondHalfSum) return 1;

        return 0;
    }
}
