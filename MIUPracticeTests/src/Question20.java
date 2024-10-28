public class Question20 {
    public static void main(String[] args) {
        int[] a = {8,4,2,1} ;
        int result = isGuthrieSequence(a);
        System.out.println(result);
    }

    public static int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1) return 0;

        int guthrieNumber = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != guthrieNumber) return 0;

            if (a[i] % 2 == 0) {
                guthrieNumber = a[i] / 2;

            } else {
                guthrieNumber = (a[i] * 3) + 1;
            }
        }

        return 1;
    }
}
