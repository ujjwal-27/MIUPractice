package Solutions;

public class P37Q2 {
    public static void main(String[] args) {
        P37Q2 myClass = new P37Q2();

        int result = myClass.isFactorialPrime(7);
        System.out.println(result);
    }

    public int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int isFactorialPrime(int n) {
        if (!isPrime(n)) return 0;

        int number = 1;

        while (factorial(number) + 1 <= n) {
            if (factorial(number) + 1 == n) return 1;
            number++;
        }

        return 0;
    }
}
