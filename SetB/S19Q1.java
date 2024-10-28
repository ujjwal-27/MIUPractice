public class S19Q1 {
    public static void main(String[] args) {
        int result = checkConcatenatedSum(2997, 3);
        System.out.println(result);
    }

    public static int checkConcatenatedSum(int n, int catlen) {
        int number = n;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            int concat = 0;
            int i = 0;

            while (i < catlen) {
                concat += digit;
                concat *= 10;
                i++;
            }

            concat /= 10;
            sum += concat;
            number /= 10;
        }

        if (sum == n) return 1;

        return 0;
    }
}
