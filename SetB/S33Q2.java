public class S33Q2 {
    public static void main(String[] args) {
        S33Q2 myClass = new S33Q2();

        int[] a = {3, 3, 3, 3, 3, 3};
        int result = myClass.isMercurial(a);
        System.out.println(result);
    }

    public int isMercurial(int[] a) {
        boolean firstOneFlag = false;
        boolean secondOneFlag = false;
        boolean threeFlag = false;

        for (int i = 0; i < a.length; i++) {
            if (!firstOneFlag && a[i] == 1) {
                firstOneFlag = true;

            } else if (firstOneFlag && a[i] == 3) {
                threeFlag = true;

            } else if (firstOneFlag && threeFlag && a[i] == 1) {
                secondOneFlag = true;
            }
        }

        if (firstOneFlag && threeFlag && secondOneFlag) return 0;

        return 1;
    }
}
