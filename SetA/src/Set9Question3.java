public class Set9Question3 {
    public static void main(String[] args) {
        int result = isRiley(2428);
        System.out.println(result);
    }

    public static int isRiley(int n) {
        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) return 0;

            n /= 10;
        }

        return 1;
    }
}
