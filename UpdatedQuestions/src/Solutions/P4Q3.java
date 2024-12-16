package Solutions;

public class P4Q3 {
    public static void main(String[] args) {
        P4Q3 myClass = new P4Q3();

        int[] a = {2, 12, 12, 4, 6, 8, 11};

        int result = myClass.isInertial(a);
        System.out.println(result);
    }

    public int isInertial(int[] a) {
        boolean hasOddValue = false;
        int maxValue = 0;


        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOddValue = true;
            }

            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        if (!hasOddValue && maxValue % 2 != 0) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] != maxValue) {
                        if (a[j] > a[i]) return 0;
                    }
                }
            }
        }

        return 1;
    }
}
