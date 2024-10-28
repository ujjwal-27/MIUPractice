public class S3Q3 {
    public static void main(String[] args) {
        int n = 10;
        int m = 33;
        int result = factorEqual(n, m);
        System.out.println(result);
    }

    public static int factorEqual(int n, int m) {
        int countN = 0;
        int countM = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                countN++;
            }
        }

        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                countM++;
            }
        }

        if (countM == countN) return 1;

        return 0;
    }
}
