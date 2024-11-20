public class S26Q3 {
    public static void main(String[] args) {
        int[] a = {8, 4, 2, 1};
        int result = isGuthrieSequence(a);
        System.out.println(result);
    }

    public static int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1) return 0;

        int guthrieValue = a[0];

        for (int number : a) {
            if (number != guthrieValue) return 0;

            if (guthrieValue % 2 == 0) {
                guthrieValue /= 2;

            } else {
                guthrieValue *= 3;
                guthrieValue += 1;
            }
        }

        return 1;
    }
}
