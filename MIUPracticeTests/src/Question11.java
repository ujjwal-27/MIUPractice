public class Question11 {
    public static void main(String[] args) {
        int[] a = {7,9,0,10,1};
        int result = isMeera(a);
        System.out.println(result);
    }

    public static int isMeera(int[] a) {
        boolean containsOne = false;
        boolean containsNine = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                containsOne = true;

            } else if (a[i] == 9) {
                containsNine = true;
            }
        }

        if ((containsOne && containsNine) || (!containsOne && !containsNine)) {
            return 1;
        }

        return 0;
    }
}
