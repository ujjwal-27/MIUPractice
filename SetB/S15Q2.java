public class S15Q2 {
    public static void main(String[] args) {
        char[] a1 = {'s', 'i', 't'}; // {'p', 'o', 'o', 'l'}
        char[] a2 = {'i', 't', 's'}; // {'p', 'o', 'l', 'l'}
        int result = areAnagrams(a1, a2);
        System.out.println(result);
    }

    public static char[] removeElement(char[] a, int i) {
        if (a.length < i) return null;

        char[] a2 = new char[a.length - 1];
        int index = 0;

        for (int j = 0; j < a.length; j++) {
            if (j != i) {
                a2[index] = a[j];
                index++;
            }
        }

        return a2;
    }

    public static int areAnagrams(char[] a1, char[] a2) {
        char[] a3 = a2;

        for (int i = 0; i < a1.length; i++) {
            boolean flag = false;

            for (int j = 0; j < a3.length; j++) {
                if (a1[i] == a3[j]) {
                    flag = true;
                    a3 = removeElement(a3, j);
                }
            }

            if (!flag) {
                return 0;
            }
        }

        return 1;
    }
}
