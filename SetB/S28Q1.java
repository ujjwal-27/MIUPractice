public class S28Q1 {
    public static void main(String[] args) {
        int[] a = {2, 12, 12, 4, 6, 8, 11};
        int result = isInertial(a);
        System.out.println(result);
    }

    public static int isInertial(int[] a) {
        boolean containsOddValue = false;
        int maxValue = 0;

        for (int number : a) {
            if (number % 2 != 0) {
                containsOddValue = true;
            }

            if (number > maxValue) {
                maxValue = number;
            }
        }

        if (!containsOddValue || maxValue % 2 != 0) return 0;

        for (int num1 : a) {
            if (num1 % 2 != 0) {
                for (int num2 : a) {
                    if (num2 % 2 == 0 && num2 != maxValue) {
                        if (num1 < num2) return 0;
                    }
                }
            }
        }

        return 1;
    }
}
