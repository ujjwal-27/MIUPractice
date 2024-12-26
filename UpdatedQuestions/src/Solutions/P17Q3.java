package Solutions;

public class P17Q3 {
    public static void main(String[] args) {
        P17Q3 myClass = new P17Q3();

        int[] a = {22, 19, 10, 10, 19, 22, 22, 10};

        int result = myClass.isTrivalent(a);
        System.out.println(result);
    }

    public int isTrivalent (int[] a) {
        boolean zeroFlag = false;
        int index = 0;
        int[] temp = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;

            for (int j = 0; j < temp.length; j++) {
                if (a[i] == temp[j] && a[i] == 0 && !zeroFlag) {
                    flag = true;
                    zeroFlag = true;
                    index++;
                    break;

                } else if (a[i] == temp[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                temp[index] = a[i];
                index++;
            }
        }

        if (index != 3) return 0;

        return 1;
    }
}
