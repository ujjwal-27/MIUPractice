import java.util.Arrays;

public class S29Q3 {
    public static void main(String[] args) {
        S29Q3 myClass = new S29Q3();

        int[] a = {1, 2, 3, 4, 5};
        int n = 5;
        myClass.doIntegerBasedRounding(a, n);
    }

    public void doIntegerBasedRounding(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && n > 0) {
                int lowerMultiple = (a[i] / n) * n;
                int upperMultiple = lowerMultiple + n;

                int lowerDistance = a[i] - lowerMultiple;
                int upperDistance = upperMultiple - a[i];

                if (upperDistance <= lowerDistance) {
                    a[i] = upperMultiple;

                } else {
                    a[i] = lowerMultiple;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
