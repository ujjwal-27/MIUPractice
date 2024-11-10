public class S24Q1 {
    public static void main(String[] args) {
        int[] a = {7, 3, 3, 2, 4};
        int n = 11;
        int result = isNUnique(a, n);
        System.out.println(result);
    }

    public static int isNUnique(int[] a, int n) {
        if (a.length < 2) return 0;

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i != j && a[i] + a[j] == n) {
                    count++;
                }
            }
        }

        if (count == 1) return 1;

        return 0;
    }
}
