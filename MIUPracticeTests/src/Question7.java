public class Question7 {
    public static void main(String[] args) {
        int result = nextPerfectSquare(0);
        System.out.println(result);
    }

    public static boolean isPerfectSquare(int n) {
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }

    public static int nextPerfectSquare(int n) {
        int nextNumber = n + 1;

        while(!isPerfectSquare(nextNumber)) {
            nextNumber++;
        }

        return nextNumber;
    }
}
