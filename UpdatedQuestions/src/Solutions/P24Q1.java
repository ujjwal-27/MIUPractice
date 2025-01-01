package Solutions;

public class P24Q1 {
    public static void main(String[] args) {
        P24Q1 myClass = new P24Q1();

        int result = myClass.getExponent(280, 7);
        System.out.println(result);
    }

    public int getExponent(int n, int p) {
        if (p <= 1) return -1;

        int count = 0;

        while (n % p == 0) {
            count++;
            n /= p;
        }

        return count;
    }
}
