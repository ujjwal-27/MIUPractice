public class Set2Question2 {
    public static void main(String[] args) {
        int[] a = {-4, 0, 1, 0, 2};
        int result = isMeera(a);
        System.out.println(result);
    }

    public static int isMeera (int[ ] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= i) {
                return 0;
            }
        }

        return 1;
    }
}
