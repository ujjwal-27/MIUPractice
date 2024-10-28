public class Set2Question1 {
    public static void main(String[] args) {
        int result = sumDigits(3114);
        System.out.println(result);
    }

    public static int sumDigits (int n) {
        if (n < 0) {
            n *= -1;
        }

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}
