package Solutions;

public class P13Q2 {
    public static void main(String[] args) {
        P13Q2 myClass = new P13Q2();

        int[] a = {3, 2, 1};
        int base = 4;

        int result = myClass.isLegalNumber(a, base);
        System.out.println(result);
    }

    public int isLegalNumber(int[] a, int base) {
        for (int i : a) {
            if (i >= base) return 0;
        }

        return 1;
    }
}
