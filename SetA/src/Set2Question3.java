public class Set2Question3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 3, 2};
        int result = isDual(a);
        System.out.println(result);
    }

    public static int isDual(int[ ] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count != 2) return 0;
        }

        return 1;
    }
}
