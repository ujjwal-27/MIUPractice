public class S1Q2 {
    public static void main(String[] args) {
        int result = isFancy(17);
        System.out.println(result);
    }

    public static int isFancy(int n) {
        int first = 1;
        int second = 1;

        while (second < n) {
            int fancy = 3 * second + 2 * first;

            if (fancy == n) {
                return 1;
            }

            first = second;
            second = fancy;
        }

        return 0;
    }
}
