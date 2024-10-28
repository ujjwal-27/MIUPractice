public class Set10Question6 {
    public static void main(String[] args) {
        int result = getExponent(128, 4);
        System.out.println(result);
    }

    public static int getExponent(int n, int p) {
        if (p <= 1) return -1;

        int count = 0;

        while (n % p == 0) {
            count++;
            n /= p;
        }

        return count;
    }
}
