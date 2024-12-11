public class S34Q3 {
    public static void main(String[] args) {
        S34Q3 myClass = new S34Q3();

        int result = myClass.smallest(7);
        System.out.println(result);
    }

    public int smallest(int n) {
        for (int i = 1; ; i++) {
            int count = 0;

            for (int j = 1; j <= n; j++) {
                boolean flag = false;
                int multiple = i * j;

                while (multiple > 0) {
                    int digit = multiple % 10;

                    if (digit == 2) {
                        count++;
                        flag = true;
                        break;
                    }

                    multiple /= 10;
                }

                if (!flag) break;
            }

            if (count == n) return i;
        }
    }
}
