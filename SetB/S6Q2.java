public class S6Q2 {
    public static void main(String[] args) {
        int result = isDigitSum(32121,10);
        System.out.println(result);
    }

    public static int isDigitSum(int n, int m) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        if (sum < m) return 1;

        return 0;
    }
}
