package Solutions;

public class P8Q3 {
    public static void main(String[] args) {
        P8Q3 myClass = new P8Q3();

        int result = myClass.guthrieIndex(42);
        System.out.println(result);
    }

    public int guthrieIndex(int n) {
        int count = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;

            } else {
                n *= 3;
                n++;
            }

            count++;
        }

        return count;
    }
}
