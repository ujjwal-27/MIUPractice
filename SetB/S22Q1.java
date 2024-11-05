public class S22Q1 {
    public static void main(String[] args) {
        int result = isIsolated(58);
        System.out.println(result);
    }

    public static int isIsolated(long n) {
        if (n > 2_097_151 || n < 1) return -1;

        long square = n * n;

        while (square > 0) {
            int squareDigit = (int) square % 10;
            long cube = n * n * n;

            while (cube > 0) {
                int cubeDigit = (int) cube % 10;

                if (squareDigit == cubeDigit) return 0;

                cube /= 10;
            }

            square /= 10;
        }

        return 1;
    }
}
