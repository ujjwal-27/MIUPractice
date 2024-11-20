public class S26Q1 {
    public static void main(String[] args) {
        int[] a = {};
        int result = sumFactor(a);
        System.out.println(result);
    }

    public static int sumFactor(int[] a) {
        int count = 0;
        int sum = 0;

        for (int number : a) {
            sum += number;
        }

        for (int number : a) {
            if (number == sum) {
                count++;
            }
        }

        return count;
    }
}
