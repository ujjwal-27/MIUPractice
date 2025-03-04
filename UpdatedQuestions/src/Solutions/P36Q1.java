package Solutions;

public class P36Q1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5};
        int result = isSystematicallyIncreasing(a);
        System.out.println(result);
    }

    public static int isSystematicallyIncreasing(int[] a) {
        int round = 1;
        int start = 0;
        int end = start + round;

        while (end <= a.length) {
            int number = 1;

            for (int i = start; i < end; i++) {
                if (a[i] != number) return 0;
                number++;
            }

            round++;
            start = end;
            end = start + round;
        }

        if (start != a.length) return 0;

        return 1;
    }
}
