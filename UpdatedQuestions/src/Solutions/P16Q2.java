package Solutions;

public class P16Q2 {
    public static void main(String[] args) {
        P16Q2 myClass = new P16Q2();

        int result = myClass.isStacked(15);
        System.out.println(result);
    }

    public int isStacked(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum += i;

            if (sum == n) return 1;
        }

        return 0;
    }
}
