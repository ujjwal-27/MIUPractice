public class Set1Question3 {
    public static void main(String[] args) {
        int[] a = {3, 1, 3 ,1, 3, 5, 5, 3};
        int result = goodSpread(a);
        System.out.println(result);
    }

    public static int goodSpread(int[ ] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 3) return 0;
        }

        return 1;
    }
}
