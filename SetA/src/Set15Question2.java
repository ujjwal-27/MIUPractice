public class Set15Question2 {
    public static void main(String[] args) {
        int[] a = {7, 1, 2, 1, 7, 4, 2, 7};
        int result = hasSingleMode(a);
        System.out.println(result);
    }

    public static int hasSingleMode(int[] a) {
        boolean maxFlag = false;
        int maxCount = 0;
        int maxOccurDigit = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxFlag = true;
                maxOccurDigit = a[i];

            } else if (count == maxCount && maxOccurDigit != a[i]) {
                maxFlag = false;
            }
        }

        if (maxFlag) {
            return 1;

        } else {
            return 0;
        }
    }
}
