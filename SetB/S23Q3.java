public class S23Q3 {
    public static void main(String[] args) {
        int result = isSquare(25);
        System.out.println(result);
    }

    public static int isSquare(int n) {
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) return 1;
        }

        return 0;
    }
}
