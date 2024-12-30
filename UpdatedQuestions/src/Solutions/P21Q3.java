package Solutions;

public class P21Q3 {
    public static void main(String[] args) {
        P21Q3 myClass = new P21Q3();

        int[] a = {1, 2, 0, 3, -18, 0, 2, 2};

        int result = myClass.isRailroadTie(a);
        System.out.println(result);
    }

    public int isRailroadTie(int[] a) {
        if (a.length < 2) return 0;

        for (int i = 0; i < a.length; i++) {
            if (i == 0 && (a[i] == 0 || a[i + 1] == 0)) {
                return 0;

            } else if (i == a.length - 1 && (a[i] == 0 || a[i - 1] == 0)) {
                return 0;

            } else if (i != 0 && i != a.length - 1 && a[i] == 0) {
                if (a[i - 1] == 0 || a[i + 1] == 0) {
                    return 0;
                }

            } else if (i != 0 && i != a.length - 1 && a[i] != 0) {
                if (a[i - 1] == 0 && a[i + 1] == 0) {
                    return 0;

                } else if (a[i - 1] != 0 && a[i + 1] != 0) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
