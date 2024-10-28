public class S9Q2 {
    public static void main(String[] args) {
        int result = isConsectiveFactored(90);
        System.out.println(result);
    }

    public static int isConsectiveFactored(int n) {
        if (n < 0) return 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
        }

        return 0;
    }
}
