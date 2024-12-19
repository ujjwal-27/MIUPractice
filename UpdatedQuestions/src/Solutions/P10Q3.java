package Solutions;

public class P10Q3 {
    public static void main(String[] args) {
        P10Q3 myClass = new P10Q3();

        int[] a = {1, 1, 15 -1,-1};

        int result = myClass.isCentered15(a);
        System.out.println(result);
    }

    public int isCentered15(int[] a) {
        int start = 0;
        int end = a.length;

        while (end > a.length/2) {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += a[i];
            }

            if (sum == 15) return 1;

            start++;
            end--;
        }

        return 0;
    }
}
