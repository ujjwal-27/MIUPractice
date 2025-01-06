package Solutions;

public class P32Q3 {
    public static void main(String[] args) {
        P32Q3 myClass = new P32Q3();

        int[] a = {111, 115, 118, 127, 125};

        int result = myClass.decodeArray(a);
        System.out.println(result);
    }

    public int decodeArray(int[] a) {
        int decodedNum = 0;

        for (int i = 1; i < a.length; i++) {
            int difference = a[i - 1] - a[i];
            int absValue = (difference < 0) ? -difference : difference;
            decodedNum += absValue;
            decodedNum *= 10;
        }

        decodedNum /= 10;

        if (a[0] < 0) {
            decodedNum *= -1;
        }

        return decodedNum;
    }
}
