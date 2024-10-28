public class S14Q1 {
    public static void main(String[] args) {
        int[] a = {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
        int result = is235Array(a);
        System.out.println(result);
    }

    public static int is235Array(int[] a) {
        int countDivisibleByFive = 0;
        int countDivisibleByNone = 0;
        int countDivisibleByThree = 0;
        int countDivisibleByTwo = 0;

        for (int n : a) {
            if (n % 2 == 0) {
                countDivisibleByTwo++;
            }

            if (n % 3 == 0) {
                countDivisibleByThree++;
            }

            if (n % 5 == 0) {
                countDivisibleByFive++;
            }

            if ((n % 2 != 0) && (n % 3 != 0) && (n % 5 != 0)){
                countDivisibleByNone++;
            }
        }

        int sum = countDivisibleByTwo + countDivisibleByThree + countDivisibleByFive + countDivisibleByNone;

        System.out.println(sum);

        if (sum == a.length) return 1;

        return 0;
    }
}
