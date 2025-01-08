package Solutions;

public class P34Q1 {
    public static void main(String[] args) {
        P34Q1 myClass = new P34Q1();

        int[] a = {1, 2, 19, 4, 5};

        int result = myClass.isOnionArray(a);
        System.out.println(result);
    }

    public int isOnionArray(int[] a) {
        for (int j = 0, k = a.length - 1; j < a.length/2; j++, k--) {
            if (a[j] + a[k] > 10) return 0;
        }

        return 1;
    }
}
