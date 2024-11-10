public class S24Q2 {
    public static void main(String[] args) {
        int[] a = {3, 3, 6, 36};
        int divisor = 3;
        int result = isDivisible(a, divisor);
        System.out.println(result);
    }

    public static int isDivisible(int [] a, int divisor) {
        for (int n : a) {
            if (n % divisor != 0) return 0;
        }

        return 1;
    }
}
