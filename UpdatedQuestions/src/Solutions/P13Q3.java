package Solutions;

public class P13Q3 {
    public static void main(String[] args) {
        P13Q3 myClass = new P13Q3();

        int[] a = {3, 2, 5};
        int base = 8;

        int result = myClass.convertToBase10(a, base);
        System.out.println(result);
    }

    /**
     * For this problem, the core logic  is the implementation of formula: num = num * base + current value;
     * @param a Base number represented in array. {3, 2, 5} --> 325
     * @param base Actual base number
     * @return Base number converted to base 10.
     */
    public int convertToBase10(int[] a, int base) {
        P13Q2 p13Q2 = new P13Q2();

        if (p13Q2.isLegalNumber(a, base) == 0) return -1;

        int num = 0;

        for (int n : a) {
            num = num * base + n;
        }

        return num;
    }
}
