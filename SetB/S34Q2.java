public class S34Q2 {
    public static void main(String[] args) {
        S34Q2 myClass = new S34Q2();

        int[] a = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p = {1, 2, -1, -1, 1, 2};
        int result = myClass.matches(a, p);
        System.out.println(result);
    }

    public int matches(int[] a, int[] p) {
        int start = 0;

        for (int i = 0; i < p.length; i++) {
            int current = p[i];

            if (current < 0) {
                current *= -1;
            }

            int end = start + current;

            for (int j = start; j < end; j++) {
                if ((p[i] < 0 && a[j] > 0) || (p[i] > 0 && a[j] < 0)) {
                    return 0;
                }
            }

            start = end;
        }

        return 1;
    }
}
