public class S28Q4 {
    public static void main(String[] args) {
        S28Q4 myClass = new S28Q4();

        int[] a = {2, 3, 1, -6, 8, -3, -1, 2};
        int n = 5;
        int result = myClass.nUpCount(a, n);
        System.out.println(result);
    }

    public int nUpCount(int[] a, int n) {
        int count = 0;
        int partialSum = a[0];

        for (int i = 1; i < a.length; i++) {
            int currentSum = a[i] + partialSum;

            if (partialSum <= n && currentSum > n) {
                count++;
            }

            partialSum = currentSum;
        }

        return count;
    }
}
