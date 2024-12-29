package Solutions;

public class P19Q1 {
    public static void main(String[] args) {
        P19Q1 myClass = new P19Q1();

        int result = myClass.smallest(7);
        System.out.println(result);
    }

    public int smallest(int n) {
        for (int num = 1; ; num++) {
            for (int m = 1; m <= n; m++) {
                int multiple = num * m;
                boolean flag = false;

                while (multiple > 0) {
                    int digit = multiple % 10;

                    if (digit == 2) {
                        flag = true;
                        break;
                    }

                    multiple /= 10;
                }

                if (!flag) {
                    break;

                } else if (m == n) {
                    return num;
                }
            }
        }
    }
}
