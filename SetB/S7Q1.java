public class S7Q1 {
    public static void main(String[] args) {
        int[] a = {8, 8, 8, 4, 4, 7, 2};
        int result = isOddValent(a);
        System.out.println(result);
    }

    public static int isOddValent(int[] a) {
        boolean multipleOccurence = false;
        boolean containOddNumber = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                containOddNumber = true;
            }

            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 1) {
                multipleOccurence = true;
            }

            if (containOddNumber && multipleOccurence) return 1;
        }

        return 0;
    }
}
