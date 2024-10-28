public class S4Q3 {
    public static void main(String[] args) {
        int result = isContinuousFactored(120);
        System.out.println(result);
    }

    public static int isContinuousFactored(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
        }

        return 0;
    }
}
