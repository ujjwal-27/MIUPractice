public class S25Q3 {
    public static void main(String[] args) {
        int result = guthrieIndex(42);
        System.out.println(result);
    }

    public static int guthrieIndex(int n) {
        int index = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;

            } else {
                n *= 3;
                n += 1;
            }

            index++;
        }

        return index;
    }
}
