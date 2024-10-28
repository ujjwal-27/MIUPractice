/**
 * 5 minutes
 */
public class QuestionFour {
    public static void main(String[] args) {
        int result = answerFour(12005);
        System.out.println(result);
    }

    public static int answerFour(int n) {
        int reverse = 0;
        int number = n;

        if (n < 0) {
            number *= -1;
        }

        while (number > 0) {
            int digit = number % 10;
            reverse += digit;
            reverse *= 10;
            number /= 10;
        }

        reverse /= 10;

        if (n < 0) {
            reverse *= -1;
        }

        return reverse;
    }
}
