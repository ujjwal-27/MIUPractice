public class Set8Question2 {
    public static void main(String[] args) {
        int result = isNormal(8);
        System.out.println(result);
    }

    public static int isNormal(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                return 0;
            }
        }

        return 1;
    }
}
