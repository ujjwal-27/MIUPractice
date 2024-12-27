package Solutions;

public class P18Q2 {
    public static void main(String[] args) {
        P18Q2 myClass = new P18Q2();

        int[] a = {5, 5, 5, 2, 5};

        int result = myClass.isSequentiallyBounded(a);
        System.out.println(result);
    }

    public int isSequentiallyBounded(int[] a) {
        int count = 0;
        int num = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) return 0; // numbers in array cannot be negative

            if (i != 0 && a[i] < a[i - 1]) return 0; // checking if in ascending order or not

            if (num == a[i]) {
                count++;

            } else {
                if (count >= num) return 0;

                count = 0;
                num = a[i];
                i--;
            }
        }

        return 1;
    }
}
