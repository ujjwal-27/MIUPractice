public class S6Q3 {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 0};
        int result = isAllPossibilities(a);
        System.out.println(result);
    }

    public static int isAllPossibilities(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;

            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) return 0;
        }

        return 1;
    }
}
