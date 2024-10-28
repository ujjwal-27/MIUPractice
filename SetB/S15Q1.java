public class S15Q1 {
    public static void main(String[] args) {
        int result = isVesuvian(50);
        System.out.println(result);
    }

    public static boolean isSquare(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) return true;
        }

        return false;
    }

    public static int isVesuvian(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (isSquare(i)) {
                for (int j = i; j < n; j++) {
                    if (isSquare(j)) {
                        if (i + j == n) {
                            count++;
                        }
                    }
                }
            }
        }

        if (count == 2) return 1;

        return 0;
    }
}
