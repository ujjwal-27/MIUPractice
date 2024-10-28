public class Question14 {
    public static void main(String[] args) {
        int[] a = {6,8,1,8,6}  ;
        int result = answerTwo(a);
        System.out.println(result);
    }

    public static int answerTwo(int[] a) {
        int mostOccurringNumber = 0;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                mostOccurringNumber = a[i];
                maxCount = count;
            }
        }

        return mostOccurringNumber;
    }
}
