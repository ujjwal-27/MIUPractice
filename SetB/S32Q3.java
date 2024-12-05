public class S32Q3 {
    public static void main(String[] args) {
        S32Q3 myClass = new S32Q3();

        int result = myClass.isDigitIncreasing(24);
        System.out.println(result);
    }

    public int isDigitIncreasing(int n) {
        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int number = i;

            while (sum < n) {
                sum += number;

                if (sum == n) return 1;

                number *= 10;
                number += i;
            }
        }

        return 0;
    }
}
