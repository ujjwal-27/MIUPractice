public class Question10 {
    public static void main(String[] args) {
        int result = isFancy(17);
        System.out.println(result);
    }

    public static int isFancy(int n) {
        int first = 1;
        int second = 1;

        while (second < n) {
            int sum = 3 * second + 2 * first;

            if (sum == n) {
                return 1;
            }

            first = second;
            second = sum;
        }

        return 0;
    }
}
