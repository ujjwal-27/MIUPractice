package Solutions;

public class P3Q2 {
    public static void main(String[] args) {
        P3Q2 myClass = new P3Q2();

        int[] a = {2, 1, 1, 4, -1, -1};

        int result = myClass.isMadhavArray(a);
        System.out.println(result);
    }

    public int isMadhavArray(int[] a) {
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            int madhavLength = i * (i + 1) / 2;

            if (madhavLength == a.length) {
                flag = true;
                break;
            }
        }

        if (!flag) return 0;

        int round = 1;
        int start = 0;
        int end = round + start;

        while (end <= a.length) {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += a[i];
            }

            if (sum != a[0]) return 0;

            round++;
            start = end;
            end = round + start;
        }

        return 1;
    }
}
