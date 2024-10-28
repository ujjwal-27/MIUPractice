public class S9Q3 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3, 3};
        int result = isLayered(a);
        System.out.println(result);
    }

    public static int isLayered(int[] a) {
        if (a.length == 0) return 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count < 2) return 0;
        }

        return 1;
    }
}
