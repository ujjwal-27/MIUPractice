package Solutions;

public class P4Q1 {
    public static void main(String[] args) {
        P4Q1 myClass = new P4Q1();

        int[] a = {9, 0, 2, -5, 7};

        int result = myClass.countSquarePairs(a);
        System.out.println(result);
    }

    public boolean isPerfectSquare(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) return true;
        }

        return false;
    }

    public int countSquarePairs(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0 && a[i] < a[j] && isPerfectSquare(a[i] + a[j])) {
                    count++;
                }
            }
        }

        return count;
    }
}
