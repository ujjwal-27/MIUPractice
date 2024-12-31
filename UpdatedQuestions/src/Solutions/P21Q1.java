package Solutions;

public class P21Q1 {
    public static void main(String[] args) {
        P21Q1 myClass = new P21Q1();

        int result = myClass.fullnessQuotient(9);
        System.out.println(result);
    }

    public int fullnessQuotient(int n) {
        if (n < 0) return -1;

        int count = 0;

        for (int base = 2; base <= 9; base++) {
            boolean flag = true;
            int num = n;

            while (num > 0) {
                int digit = num % base;

                if (digit == 0) {
                    flag = false;
                    break;
                }

                num /= base;
            }

            if (flag) count++;
        }

        return count;
    }
}
