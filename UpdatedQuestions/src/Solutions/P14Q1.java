package Solutions;

public class P14Q1 {
    public static void main(String[] args) {
        P14Q1 myClass = new P14Q1();

        int[] a = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p = {2, 1, -2, 3};

        int result = myClass.matches(a, p);
        System.out.println(result);
    }

    public int matches(int[] a, int[] p) {
        int start = 0;

        for (int i = 0; i < p.length; i++) {
            int abs = (p[i] < 0) ? -p[i] : p[i];
            int end = start + abs;

            for (int j = start; j < end; j++) {
                if ((p[i] < 0 && a[j] > 0) ||(p[i] > 0 && a[j] < 0)) return 0;
            }

            start = end;
        }

        return 1;
    }
}
