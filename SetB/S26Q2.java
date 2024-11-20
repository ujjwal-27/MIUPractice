public class S26Q2 {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 1, 2, 3, 2};
        int result = stantonMeasure(a);
        System.out.println(result);
    }

    public static int stantonMeasure(int[] a) {
        int count = 0;
        int n = 0;

        for (int number : a) {
            if (number == 1) {
                n++;
            }
        }

        for (int number : a) {
            if (number == n) {
                count++;
            }
        }

        return count;
    }
}
