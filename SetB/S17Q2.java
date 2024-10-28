public class S17Q2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12};
        int result = isZeroPlentiful(a);
        System.out.println(result);
    }

    public static int isZeroPlentiful(int[] a) {
        int countSequence = 0;
        int countZero = 0;
        boolean zeroFlag = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroFlag = true;
                countZero++;

            } else if (zeroFlag && a[i] != 0) {
                if (countZero >= 4) {
                    countSequence++;
                    zeroFlag = false;
                    countZero = 0;

                } else {
                    return 0;
                }
            }
        }

        if (zeroFlag && countZero >= 4) {
            countSequence++;

        } else if (zeroFlag) {
            return 0;
        }

        return countSequence;
    }
}
