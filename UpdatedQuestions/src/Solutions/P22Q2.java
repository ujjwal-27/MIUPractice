package Solutions;

public class P22Q2 {
    public static void main(String[] args) {
        P22Q2 myClass = new P22Q2();

        int[] a = {7, 7, 7,
                7, 7, 7, 7, 1};

        int result = myClass.isPacked(a);
        System.out.println(result);
    }

    public int isPacked(int[] a) {
        if (a.length == 0) return 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1) return 0;

            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }

            if (count != a[i]) return 0;
        }

        int count = 0;
        int element = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                count++;

            } else {
                if (count != element) return 0;

                count = 0;
                element = a[i];
                i--;
            }
        }

        return 1;
    }
}
