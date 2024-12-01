public class S30Q3 {
    public static void main(String[] args) {
        S30Q3 myClass = new S30Q3();

        int[] a = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        int result = myClass.isSystematicallyIncreasing(a);
        System.out.println(result);
    }

    public int isSystematicallyIncreasing(int[] a) {
        int round = 1;
        int start = 0;
        int end = round + start;

        while (end <= a.length) {
            int digit = 1;

            for (int i = start; i < end; i++) {
                if (a[i] != digit) return 0;

                digit++;
            }

            round++;
            start = end;
            end = round + start;
        }

        if (start == a.length) {
            return 1;

        } else {
            return 0;
        }
    }
}
