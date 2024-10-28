public class Set14Question1 {
    public static void main(String[] args) {
        int result = maxDistance(8);
        System.out.println(result);
    }

    public static int maxDistance(int n) {
        boolean flag = false;
        int maxValue = 0;
        int minValue = n;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;

                if (i < minValue) {
                    minValue = i;
                }

                if (i > maxValue) {
                    maxValue = i;
                }
            }
        }

        if (!flag) return -1;

        return maxValue - minValue;
    }
}
