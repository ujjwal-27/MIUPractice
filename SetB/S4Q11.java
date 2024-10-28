// COUNT DIGIT
public class S4Q11 {
    public static void main(String[] args) {
        int result = countDigit(33331, 3);
        System.out.println(result);
    }

    public static int countDigit(int n, int digit) {
        if (n < 0 || digit < 0) return 0;

        int count = 0;

        while (n > 0) {
            if (n % 10 == digit) {
                count++;
            }

            n /= 10;
        }

        return count;
    }
}
