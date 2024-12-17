package Solutions;

public class P6Q3 {
    public static void main(String[] args) {
        P6Q3 myClass = new P6Q3();

        int[] a = {8, 4, 2, 1};

        int result = myClass.isGuthrieSequence(a);
        System.out.println(result);
    }

    public int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1) return 0;

        int guthrieNumber = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != guthrieNumber) return 0;

            if (a[i] % 2 == 0) {
                guthrieNumber = a[i] / 2;

            } else {
                guthrieNumber = a[i] * 3;
                guthrieNumber++;
            }
        }

        return 1;
    }
}
