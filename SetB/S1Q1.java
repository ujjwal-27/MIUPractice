public class S1Q1 {
    public static void main(String[] args) {
        int result = minDistance(63);
        System.out.println(result);
    }

    public static int minDistance(int n) {
        int count = 0;
        int minimumDistance = n;
        int previousFactor = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;

                int difference = i - previousFactor;

                if (difference < minimumDistance) {
                    minimumDistance = difference;
                }

                previousFactor = i;
            }
        }

        if (count == 1) {
            return 0;

        } else if (count == 0) {
            return -1;
        }

        return minimumDistance;
    }
}
