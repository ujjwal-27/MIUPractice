package Solutions;

public class P3Q1 {
    public static void main(String[] args) {
        P3Q1 myClass = new P3Q1();

        int result = myClass.primeCount(11, 29);
        System.out.println(result);
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int primeCount(int start, int end) {
        if (start > end) return 0;

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }
}
