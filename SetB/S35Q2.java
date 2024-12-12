public class S35Q2 {
    public static void main(String[] args) {
        S35Q2 myClass = new S35Q2();

        int[] a = {1, 1, 1, 2, 3, -18, 45, 1};
        int result = myClass.isOneBalanced(a);
        System.out.println(result);
    }

    public int isOneBalanced(int[] a) {
        int firstOnes = 0;
        int i = 0;
        int nonOnes = 0;
        int secondOnes = 0;

        while (i < a.length && a[i] == 1) {
            firstOnes++;
            i++;
        }

        while (i < a.length && a[i] != 1) {
            nonOnes++;
            i++;
        }

        while (i < a.length && a[i] == 1) {
            secondOnes++;
            i++;
        }

        if (firstOnes + secondOnes == nonOnes && firstOnes + secondOnes + nonOnes == a.length) return 1;

        return 0;
    }
}
