package Solutions;

import java.util.Arrays;

public class P8Q1 {
    public static void main(String[] args) {
        P8Q1 myClass = new P8Q1();

        int[] result = myClass.solve10();
        System.out.println(Arrays.toString(result));
    }

    public int getFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int[] solve10() {
        int[] a = new int[2];
        int factorial10 = getFactorial(10);

        for (int i = 0; i <= 10; i++) {
            int factorialX = getFactorial(i);

            for (int j = 0; j <= 10; j++) {
                int factorialY = getFactorial(j);

                if (factorialX + factorialY == factorial10) {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }

        return a;
    }
}
