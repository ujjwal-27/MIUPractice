// KSmallFactors
public class S4Q22 {
    public static void main(String[] args) {
        boolean result = hasKSmallFactors(7, 20);
        System.out.println(result);
    }

    public static boolean hasKSmallFactors(int k, int n) {
        if (k < 0 || n < 0) return false;

        for (int i = 2; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (i * j == n) {
                    return true;
                }
            }
        }

        return false;
    }
}
