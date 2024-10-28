public class S12Q1 {
    public static void main(String[] args) {
        int result = isSquare(4);
        System.out.println(result);
    }

    public static int isSquare(int n) {
        if (n < 0) return 0;

        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) return 1;
        }

        return 0;
    }
}
