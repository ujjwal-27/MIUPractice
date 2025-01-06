package Solutions;

public class P32Q1 {
    public static void main(String[] args) {
        P32Q1 myClass = new P32Q1();

        int[] a = {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12};

        int result = myClass.isZeroPlentiful(a);
        System.out.println(result);
    }

    public int isZeroPlentiful(int[] a) {
        boolean zeroFlag = false;
        int countSequence = 0;
        int countZero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                countZero++;
                zeroFlag = true;

            } else {
                if (zeroFlag && countZero >= 4) {
                    countSequence++;
                    countZero = 0;
                    zeroFlag = false;

                } else if (zeroFlag) {
                    return 0;
                }
            }
        }

        if (zeroFlag && countZero >= 4) {
            countSequence++;
        }

        return countSequence;
    }
}
