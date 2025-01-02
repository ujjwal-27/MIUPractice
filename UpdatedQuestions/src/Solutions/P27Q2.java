package Solutions;

public class P27Q2 {
    public static void main(String[] args) {
        P27Q2 myClass = new P27Q2();

        int result = myClass.checkConcatenatedSum(13332, 4);
        System.out.println(result);
    }

    public int checkConcatenatedSum(int n, int catlen) {
        int num = n;
        int sum = 0;

        while (num > 0) {
            int concatNum = 0;
            int length = catlen;
            int digit = num % 10;

            while (length > 0) {
                concatNum += digit;
                concatNum *= 10;
                length--;
            }

            concatNum /= 10;
            num /= 10;
            sum += concatNum;
        }

        if (sum == n) return 1;

        return 0;
    }
}
