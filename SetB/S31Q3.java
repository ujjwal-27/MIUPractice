public class S31Q3 {
    public static void main(String[] args) {
        S31Q3 myClass = new S31Q3();

        int result = myClass.isFibonacci(8);
        System.out.println(result);
    }

    public int isFibonacci(int n) {
        int first = 1;
        int second = 1;

        while (second < n) {
            int fibonacci = first + second;

            if (fibonacci == n) return 1;

            first = second;
            second = fibonacci;
        }

        return 0;
    }
}
