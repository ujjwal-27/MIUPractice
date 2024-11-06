public class S23Q1 {
    public static void main(String[] args) {
        int[] a = {3, 2, 5};
        int base = 8;
        int result = convertToBase10(a, base);
        System.out.println(result);
    }

    public static int convertToBase10(int[] a, int base) {
        int exponent = 0;
        int sum = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] >= base) return 0;

            int power = getPower(base, exponent);
            int value = a[i] * power;
            sum += value;
            exponent++;
        }

        return sum;
    }

    public static int getPower(int base, int exponent) {
        int power = 1;
        if (exponent == 0) return power;

        for (int i = 1; i <= exponent; i++) {
            power *= base;
        }

        return power;
    }
}
