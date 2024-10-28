public class Set10Question3 {
    public static void main(String[] args) {
        int result = isEvenSubset(18, 32);
        System.out.println(result);
    }

    public static int isEvenSubset(int m, int n) {
        for (int i = 1; i < m; i++) {
            if (i % 2 == 0 && m % i == 0 && n % i != 0) {
                return 0;
            }
        }

        return 1;
    }
}
