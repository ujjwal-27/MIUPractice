public class Set6Question2 {
    public static void main(String[] args) {
        int result = isMeera(30);
        System.out.println(result);
    }

    public static int isMeera(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0 && i == count) {
                return 1;
            }
        }

        return 0;
    }
}
