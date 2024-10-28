public class Question8 {
    public static void main(String[] args) {
        int[] a = {2,3,1,-6,8,-3,-1,2};
        int n = 5;
        int result = nUpCount(a, n);
        System.out.println(result);
    }

    public static int nUpCount(int[] a, int n) {
        int count = 0;
        int partialSum = 0;

        for (int i = 0; i < a.length; i++) {
            int currentSum = partialSum + a[i];

            if (partialSum <= n && currentSum > n) {
                count++;
            }

            partialSum = currentSum;
        }

        return count;
    }
}
