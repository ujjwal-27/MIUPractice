package Solutions;

import java.util.Arrays;

public class P30Q1 {
    public static void main(String[] args) {
        P30Q1 myClass = new P30Q1();

        int[] a = {1, 2, 3, 4, 5};
        int n = 2;

        myClass.doIntegerBasedRounding(a, n);
    }

    public void doIntegerBasedRounding(int[] a, int n) {
        if (n > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 0) {
                    int lowerMultiple = (a[i] / n) * n;
                    int upperMultiple = lowerMultiple + n;

                    int lowerDistance = a[i] - lowerMultiple;
                    int upperDistance = upperMultiple - a[i];

                    if (upperDistance < lowerDistance || upperDistance == lowerDistance) {
                        a[i] = upperMultiple;

                    } else {
                        a[i] = lowerMultiple;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
