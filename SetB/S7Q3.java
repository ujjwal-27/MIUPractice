public class S7Q3 {
    public static void main(String[] args) {
        int result = countOnes(15);
        System.out.println(result);
    }

    public static int countOnes(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }

            n /= 2;
        }

        return count;
    }
}
