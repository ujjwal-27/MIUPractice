package Solutions;

public class P38Q1 {
    public static void main(String[] args) {
        int result = isHodder(127);
        System.out.println(result);
    }

    public static int isHodder(int n) {
        int power = 1;

        while (power - 1 <= n) {
            power *= 2;

            if (power - 1 == n) return 1;
        }

        return 0;
    }
}
