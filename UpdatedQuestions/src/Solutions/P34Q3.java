package Solutions;

public class P34Q3 {
    public static void main(String[] args) {
        P34Q3 myClass = new P34Q3();

        int[] a = {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1};

        int result = myClass.decodeArray(a);
        System.out.println(result);
    }

    public int decodeArray(int[] a) {
        int count = 0;
        int num = 0;
        int start = (a[0] == -1) ? 1 : 0;

        for (int i = start; i < a.length; i++) {
            if (a[i] == 0) {
                count++;

            } else {
                num += count;
                num *= 10;
                count = 0;
            }
        }

        num /= 10;

        if (start == 1) {
            num *= -1;
        }

        return num;
    }
}
