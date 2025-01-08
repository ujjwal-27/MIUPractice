package Solutions;

public class P35Q2 {
    public static void main(String[] args) {
        P35Q2 myClass = new P35Q2();

        int result = myClass.isPrimeHappy(25);
        System.out.println(result);
    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int isPrimeHappy(int n) {
        if (n <= 2) return 0;

        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        if (sum % n == 0) return 1;

        return 0;
    }
}
