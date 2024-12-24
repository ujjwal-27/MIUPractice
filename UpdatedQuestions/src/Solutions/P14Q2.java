package Solutions;

public class P14Q2 {
    public static void main(String[] args) {
        P14Q2 myClass = new P14Q2();

        int result = myClass.computeDepth(25);
        System.out.println(result);
    }

    public int computeDepth(int n) {
        int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int count = 0;
        int num = 1;

        while (count < 10) {
            int multiple = num * n;

            while (multiple > 0) {
                int digit = multiple % 10;

                if (a[digit] != digit) {
                    a[digit] = digit;
                    count++;
                }

                multiple /= 10;
            }

            num++;
        }

        return num - 1;
    }
}
