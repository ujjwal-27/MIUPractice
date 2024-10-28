public class S14Q3 {
    public static void main(String[] args) {
        int result = isFibonacci(55);
        System.out.println(result);
    }

    public static int isFibonacci(int n) {
        if (n == 1) return 1;

        int first = 1;
        int second = 1;

        while (second < n) {
            int fibonacciNumber = first + second;

            if (n == fibonacciNumber) return 1;

            first = second;
            second = fibonacciNumber;
        }

        return 0;
    }
}
