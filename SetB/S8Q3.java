public class S8Q3 {
    public static void main(String[] args) {
        int[] a = {18, -12, 9, -10};
        int result = largestAdjacentSum(a);
        System.out.println(result);
    }

    public static int largestAdjacentSum(int[] a) {
        int largestSum = 0;

        for (int i = 1; i < a.length; i++) {
            int sum = a[i] + a[i - 1];

            if (sum > largestSum) {
                largestSum = sum;
            }
        }

        return largestSum;
    }
}
