public class S3Q1 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1, 3, 1, 3, 2, 2};
        int result = isTriple(a);
        System.out.println(result);
    }

    public static int isTriple(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count != 3) return 0;
        }

        return 1;
    }
}
