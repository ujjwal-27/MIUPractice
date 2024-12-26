package Solutions;

public class P16Q1 {
    public static void main(String[] args) {
        P16Q1 myClass = new P16Q1();

        int result = myClass.isIsolated(28);
        System.out.println(result);
    }


    public int isIsolated(long n) {
        if (n < 1 || n > 2_097_151) return -1;

        long square = n * n;

        while (square > 0) {
            int squareDigit = (int)(square % 10);
            long cube = n * n * n;

            while (cube > 0) {
                int cubeDigit = (int)(cube % 10);

                if (cubeDigit == squareDigit) return 0;

                cube /= 10;
            }

            square /= 10;
        }

        return 1;
    }
}
