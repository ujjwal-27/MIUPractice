public class S31Q2 {
    public static void main(String[] args) {
        S31Q2 myClass = new S31Q2();

        int result = myClass.closestFibonacci(-2);
        System.out.println(result);
    }

    public int closestFibonacci(int n) {
        int first = 1;
        int second = 1;

        if (n == 1) return 1;

        while (second < n) {
            int fibonacci = first + second;

            if (fibonacci == n) {
                return fibonacci;

            } else if (fibonacci > n) {
                return second;
            }

            first = second;
            second = fibonacci;
        }

        return 0;
    }
}
