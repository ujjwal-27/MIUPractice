public class S10Q3 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1, 3, 3};
        int n = 2;
        int result = hasNValues(a, n);
        System.out.println(result);
    }

    public static int hasNValues(int[] a, int n) {
        int index = 0;
        boolean zeroFlag = false;

        int[] a2 = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j < a2.length; j++) {
                if (a[i] == 0 && !zeroFlag && a[i] == a2[j]) {
                    found = true;
                    index++;
                    zeroFlag = true;

                } else if (a[i] == a2[j]) {
                    found = true;
                }
            }

            if (!found) {
                a2[index] = a[i];
                index++;
            }
        }

        if (index != n) return 0;

        return 1;
    }
}
