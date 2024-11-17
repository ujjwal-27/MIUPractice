public class S25Q1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 15 -1,-1};
        int result = isCentered15(a);
        System.out.println(result);
    }

    public static int isCentered15(int[] a) {
        int index = 0;
        int length = a.length;
        int middleIndex = a.length/2;

        while (length > middleIndex) {
            int sum = 0;

            for (int i = index; i < length; i++) {
                sum += a[i];
            }

            if (sum == 15) return 1;

            index++;
            length--;
        }

        return 0;
    }
}
