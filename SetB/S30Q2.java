import java.util.Arrays;

public class S30Q2 {
    public static void main(String[] args) {
        S30Q2 myClass = new S30Q2();

        int[] result = myClass.encodeArray(999);
        System.out.println(Arrays.toString(result));
    }

    public int[] encodeArray(int n) {
        int[] a = new int[1];

        if (n == 0) {
            a[0] = 1;
            return a;
        }

        int arrayLength = 0;
        int number = n;
        int reverse = 0;

        if (n < 0) {
            arrayLength++;
            number *= -1;
        }

        while (number > 0) {
            int digit = number % 10;
            arrayLength += digit;
            arrayLength++;

            reverse += digit;
            reverse *= 10;

            number /= 10;
        }

        reverse /= 10;
        a = new int[arrayLength];
        int index = 0;

        if (n < 0) {
            a[0] = -1;
            index = 1;
        }

        while (reverse > 0) {
            int digit = reverse % 10;

            for (int i = 0; i < digit; i++) {
                a[index] = 0;
                index++;
            }

            a[index] = 1;
            index++;

            reverse /= 10;
        }

        return a;
    }
}
