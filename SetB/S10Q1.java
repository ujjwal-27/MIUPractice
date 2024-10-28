public class S10Q1 {
    public static void main(String[] args) {
        double x = 2.0;
        int[] a = {3, 2};
        double result = eval(x, a);
        System.out.println(result);
    }

    public static double power(double n, int e) {
        double power = 1;

        for (int i = 0; i < e; i++) {
            power = power * n;
        }

        return power;
    }

    public static double eval(double x, int[] a) {
        double result = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            double power = power(x, i);
            double value = power * a[i];
            result += value;
        }

        return result;
    }
}
