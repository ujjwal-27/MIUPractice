public class Set4Question2 {
    public static void main(String[] args) {
        int result = isFibonacci(8);
        System.out.println(result);
    }

    public static int isFibonacci(int n) {
        int num1 = 1;
        int num2 = 1;

        while (num2 < n) {
            int fibonacci = num1 + num2;

            if (fibonacci == n) return 1;

            num1 = num2;
            num2 = fibonacci;
        }

        return 0;
    }
}
