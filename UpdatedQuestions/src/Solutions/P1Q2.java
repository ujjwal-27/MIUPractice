package Solutions;

public class P1Q2 {
    public static void main(String[] args) {
        P1Q2 myClass = new P1Q2();

        int[] a = {6, 3, 1};
        int n = 6;

        int result = myClass.nUpCount(a, n);
        System.out.println(result);
    }

    public int nUpCount(int[] a, int n) {
        int count = 0;
        int currentSum = 0;
        int partialSum = 0;

        for (int i = 0; i < a.length; i++) {
            currentSum = partialSum + a[i];

            if (partialSum <= n && currentSum > n) {
                count++;
            }

            partialSum = currentSum;
        }

        return count;
    }
}
