package Solutions;

public class P33Q2 {
    public static void main(String[] args) {
        P33Q2 myClass = new P33Q2();

        int result = myClass.isDigitIncreasing(7404);
        System.out.println(result);
    }

    public int isDigitIncreasing(int n) {
        for (int i = 1; i <= 9; i++) {
            int num = 0;
            int sum = 0;

            while (sum < n) {
                num = (num * 10) + i;
                sum += num;

                if (sum == n) return 1;
            }
        }

        return 0;
    }
}
