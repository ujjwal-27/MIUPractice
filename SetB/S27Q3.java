public class S27Q3 {
    public static void main(String[] args) {
        int[] a = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int result = isMadhavArray(a);
        System.out.println(result);
    }

    public static int isMadhavArray(int[] a) {
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            int length = i * (i + 1) / 2;

            if (length == a.length) {
                flag = true;
                break;
            }
        }

        if (!flag) return 0;

        int round = 1;
        int start = 0;
        int end = round + start;

        while (end <= a.length) {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += a[i];
            }

            if (sum != a[0]) return 0;

            round++;
            start = end;
            end = round + start;
        }

        return 1;
    }
}
