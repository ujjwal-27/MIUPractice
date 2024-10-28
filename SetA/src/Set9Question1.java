public class Set9Question1 {
    public static void main(String[] args) {
        int[] a = {8,8,8,8};
        boolean result = sumIsPower(a);
        System.out.println(result);
    }

    public static boolean sumIsPower(int[] a) {
        int power = 1;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        if (sum == 1) return true;

        while (power <= sum) {
            power *= 2;

            if (power == sum) return true;
        }

        return false;
    }
}
