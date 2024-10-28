public class Set3Question3 {
    public static void main(String[] args) {
        int result = isBunker(8);
        System.out.println(result);
    }

    public static int isBunker (int n) {
        int previousValue = 1;
        int temp = 0;

        while (previousValue < n) {
            int currentValue = previousValue + temp;

            if (currentValue == n) return 1;

            previousValue = currentValue;
            temp++;
        }

        return 0;
    }
}
