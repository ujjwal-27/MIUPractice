public class Set5Question2 {
    public static void main(String[] args) {
        int result = minDistance(13013);
        System.out.println(result);
    }

    public static int minDistance(int n) {
        int previousFactor = 1;
        int minDistance = n;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int difference = i - previousFactor;

                if (difference < minDistance) {
                    minDistance = difference;
                }

                previousFactor = i;
            }
        }

        return minDistance;
    }
}
