public class S18Q1 {
    public static void main(String[] args) {
        int result = isCubePowerful(153);
        System.out.println(result);
    }

    public static int isCubePowerful(int n) {
        if (n < 1) return 0;

        int number = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int cube = digit * digit * digit;
            sum += cube;
            n /= 10;
        }

        if (sum == number) return 1;

        return 0;
    }
}
