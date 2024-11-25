public class S28Q2 {
    public static void main(String[] args) {
        S28Q2 myClass = new S28Q2();

        int[] a = {9, 0, 2, -5, 7};
        int result = myClass.countSquarePairs(a);
        System.out.println(result);
    }

    public int countSquarePairs(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] > 0 && a[j] > 0 && a[i] < a[j]) {
                    int sum = a[i] + a[j];

                    if (isPerfectSquare(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public boolean isPerfectSquare(int n) {
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }
}
