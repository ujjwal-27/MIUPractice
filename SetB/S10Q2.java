public class S10Q2 {
    public static void main(String[] args) {
        int result = sameNumberOfFactors(23, 97);
        System.out.println(result);
    }

    public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) return -1;

        int countFactorsN1 = 0;
        int countFactorsN2 = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                countFactorsN1++;
            }
        }

        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) {
                countFactorsN2++;
            }
        }

        if (countFactorsN1 == countFactorsN2) return 1;

        return 0;
    }
}
