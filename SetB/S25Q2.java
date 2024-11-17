public class S25Q2 {
    public static void main(String[] args) {
        int[] a = {0, 3, 2, 0, 5, 3};
        int n = 32053;
        int result = repsEqual(a, n);
        System.out.println(result);
    }

    public static int repsEqual(int[] a, int n) {
        int number = 0;

        for (int i = 0; i < a.length; i++) {
            number += a[i];
            number *= 10;
        }

        number /= 10;

        if (number == n) return 1;

        return 0;
    }
}
