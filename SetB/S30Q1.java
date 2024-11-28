public class S30Q1 {
    public static void main(String[] args) {
        S30Q1 myClass = new S30Q1();

        int[] a = {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1};
        int result = myClass.decodeArray(a);
        System.out.println(result);
    }

    public int decodeArray(int[] a) {
        int count = 0;
        int index = 0;

        if (a[0] < 0) {
            index = 1;
        }

        int number = 0;

        for (int i = index; i < a.length; i++) {
            if (a[i] == 0) {
                count++;

            } else {
                number += count;
                number *= 10;
                count = 0;
            }
        }

        number /= 10;

        if (a[0] < 0) {
            number *= -1;
        }

        return number;
    }
}
