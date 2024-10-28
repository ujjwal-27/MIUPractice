public class Question22 {
    public static void main(String[] args) {
        int[] a = {3,0,2,-5,0};
        int result = sumFactor(a);
        System.out.println(result);
    }

    public static int sumFactor(int[] a) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                count++;
            }
        }

        return count;
    }
}
