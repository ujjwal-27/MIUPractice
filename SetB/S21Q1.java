public class S21Q1 {
    public static void main(String[] args) {
        int[] a = {2, 3, 3, 99, 99, 99, 99, 99};
        int result = isSequentiallyBounded(a);
        System.out.println(result);
    }

    public static int isSequentiallyBounded(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) return 0;
        }

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count >= a[i]) return 0;
        }

        return 1;
    }
}
