public class Set7Question2 {
    public static void main(String[] args) {
        int result = isPascal(10);
        System.out.println(result);
    }

    public static int isPascal (int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;

            if (sum == n) return 1;
        }

        return 0;
    }
}
