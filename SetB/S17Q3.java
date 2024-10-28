public class S17Q3 {
    public static void main(String[] args) {
        int[] a = {111, 115, 118, 127, 125};
        int result = decodeArray(a);
        System.out.println(result);
    }

    public static int decodeArray(int[] a) {
        int encodedNumber = 0;

        for (int i = 1; i < a.length; i++) {
            int abs = a[i - 1] - a[i];

            if (abs < 0) {
                abs *= -1;
            }

            encodedNumber += abs;
            encodedNumber *= 10;
        }

        encodedNumber /= 10;

        if (a[0] < 0) {
            encodedNumber *= -1;
        }

        return encodedNumber;
    }
}
