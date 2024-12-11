public class S35Q1 {
    public static void main(String[] args) {
        S35Q1 myClass = new S35Q1();

        int[] a = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0};
        int result = myClass.isZeroLimited(a);
        System.out.println(result);
    }

    public int isZeroLimited(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((i % 3 == 1 && a[i] != 0) || (i % 3 != 1 && a[i] == 0)) {
                return 0;
            }
        }

        return 1;
    }
}
