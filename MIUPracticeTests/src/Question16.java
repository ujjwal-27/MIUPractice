public class Question16 {
    public static void main(String[] args) {
        int[] a = {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1};
        int result = isMadhavArray(a);
        System.out.println(result);
    }

    public static int isMadhavArray(int[] a) {
        int length = a.length;
        boolean hasMadhavLength = false;

        for (int i = 0; i < length; i++) {
            int madhavLength = i * (i + 1) / 2;

            if (length == madhavLength) {
                hasMadhavLength = true;
                break;
            }
        }

        if (!hasMadhavLength) return 0;

        int round = 1;
        int start = 1;
        int end = start + round;

        while (end < length) {
            int sum = 0;

            for (int i = start; i <= end; i++) {
                sum += a[i];
            }

            if (sum != a[0]) return 0;

            round++;
            start = end + 1;
            end = round + start;
        }

        return 1;
    }
}
