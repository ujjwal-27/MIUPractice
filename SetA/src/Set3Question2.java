public class Set3Question2 {
    public static void main(String[] args) {
        int[] a = {2, 3, 2, 4, 11, 6, 10, 9, 8};
        int result = isComplete(a);
        System.out.println(result);
    }

    public static int isComplete(int[ ] a) {
        int maxEven = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) return 0;

            if (a[i] % 2 == 0 && a[i] > maxEven) {
                maxEven = a[i];
            }
        }

        for (int i = 2; i < maxEven; i+=2) {
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
