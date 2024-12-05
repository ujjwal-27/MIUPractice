public class S33Q1 {
    public static void main(String[] args) {
        S33Q1 myClass = new S33Q1();

        int[] a = {7, 7, 7, 7, 7, 7, 7, 1};
        int result = myClass.isPacked(a);
        System.out.println(result);
    }

    public int isPacked(int[] a) {
        int count = 0;
        int number = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) return 0;

            if (count == 0) { // This 'if-block' will execute only if the 'number' is being computed for the first time. This will save computational time.
                int total = 0;

                for (int j = 0; j < a.length; j++) { // Check if the number appears n-times in the array. If not, return 0.
                    if (a[i] == a[j]) total++;
                }

                if (total != number) return 0;
            }

            if (a[i] == number) {
                count++;

            } else {
                if (count != number) { // 'count != number' implies the number was not in consecutive location
                    return 0;

                } else {
                    count = 0; // Reset count to 0
                    number = a[i]; // Assign number with another value from array.
                    i--; // Move iteration one-step back
                }
            }
        }

        return 1;
    }
}
