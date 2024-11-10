public class S24Q3 {
    public static void main(String[] args) {
        int result = henry(1, 3);
        System.out.println(result);
    }

    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) return true;

        return false;
    }

    public static int henry (int i, int j) {
        int count = 0;
        int sum = 0;

        for (int n = 1; ; n++) {
            if (isPerfect(n)) {
                count++;

                if (count == i) {
                    sum += n;

                } else if (count == j) {
                    sum += n;
                    break;
                }
            }
        }

        return sum;
    }
}
