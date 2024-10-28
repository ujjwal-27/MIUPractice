public class S14Q2 {
    public static void main(String[] args) {
        int result = isTriangular(10);
        System.out.println(result);
    }

    public static int isTriangular(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

            if (sum == n) return 1;
        }

        return 0;
    }
}
