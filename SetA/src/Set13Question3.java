public class Set13Question3 {
    public static void main(String[] args) {
        int[] a = {3, 5, -2};
        int result = isMeera(a);
        System.out.println(result);
    }

    public static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == 0) return 0;
            }
        }

        return 1;
    }
}
