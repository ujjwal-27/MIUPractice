public class S21Q3 {
    public static void main(String[] args) {
        int[] a = {2147483647, -1, -1, -2147483648};
        int result = isTrivalent(a);
        System.out.println(result);
    }

    public static int isTrivalent (int[] a) {
        boolean zeroFlag = false;
        int index = 0;
        int[] a2 = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;

            for (int j = 0; j < a2.length; j++) {
                if (a[i] == 0 && !zeroFlag && a[i] == a2[j]) {
                    flag = true;
                    zeroFlag = true;
                    index++;

                } else if (a[i] == a2[j]) {
                    flag = true;
                }
            }

            if (!flag) {
                a2[index] = a[i];
                index++;
            }
        }

        if (index != 3) return 0;

        return 1;
    }
}
