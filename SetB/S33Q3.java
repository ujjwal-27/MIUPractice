public class S33Q3 {
    public static void main(String[] args) {
        S33Q3 myClass = new S33Q3();

        int result = myClass.fullnessQuotient(-4);
        System.out.println(result);
    }

    public boolean hasZero(int n, int base) {
        while (n > 0) {
            int digit = n % base;
            if (digit == 0) return true;
            n /= base;
        }

        return false;
    }

    public int fullnessQuotient(int n) {
        if (n < 1) return -1;

        int count = 0;

        for (int i = 2; i <= 9; i++) {
            boolean hasZero = hasZero(n, i);

            if (!hasZero) count++;
        }

        return count;
    }
}
