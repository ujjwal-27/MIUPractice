package Solutions;

public class P10Q1 {
    public static void main(String[] args) {
        P10Q1 myClass = new P10Q1();

        int result = myClass.henry(1, 3);
        System.out.println(result);
    }

    public int henry (int i, int j) {
        int count = 0;
        int perfectI = 0;
        int perfectJ = 0;

        for (int n = 1; ; n++) {
            if (isPerfect(n)) {
                count++;

                if (count == i) {
                    perfectI = n;

                }

                if (count == j) {
                    perfectJ = n;
                    break;
                }
            }
        }

        return perfectI + perfectJ;
    }

    public boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return (sum == n);
    }
}
