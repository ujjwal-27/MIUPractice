public class Question15 {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,3,4,6,1};
        int result = answerThree(a);
        System.out.println(result);
    }

    public static int answerThree(int[] a) {
        int length = a.length;

        if (length % 2 != 0) return 0;

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0, j = length - 1; i < length/2; i++, j--) {
            firstHalfSum += a[i];
            secondHalfSum += a[j];
        }

        if (firstHalfSum == secondHalfSum) return 1;

        return 0;
    }
}
