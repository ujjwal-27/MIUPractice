public class Set1Question1 {
    public static void main(String[] args) {
        int result = factorTwoCount(27);
        System.out.println(result);
    }

    public static int factorTwoCount(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                count++;

            } else {
                break;
            }

            n /= 2;
        }

        return count;
    }
}
