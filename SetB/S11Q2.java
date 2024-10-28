public class S11Q2 {
    public static void main(String[] args) {
        int[] a = {-1, 2, -1};
        int n = 7;
        int result = loopSum(a, n);
        System.out.println(result);
    }

    public static int loopSum(int[] a, int n) {
        int i = 0;
        int index = 0;
        int sum = 0;

        while (i < n) {
            sum += a[index];
            index++;

            if (index == a.length) {
                index = 0;
            }

            i++;
        }

        return sum;
    }
}
