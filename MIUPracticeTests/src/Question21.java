public class Question21 {
    public static void main(String[] args) {
        int[] a = {1,3,1,1,3,3,2,3,3,3,4};
        int result = stantonMeasure(a);
        System.out.println(result);
    }

    public static int stantonMeasure(int[] a) {
        int n = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                n++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }

        return count;
    }
}
