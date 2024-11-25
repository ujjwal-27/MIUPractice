public class S28Q3 {
    public static void main(String[] args) {
        S28Q3 myClass = new S28Q3();

        int result = myClass.nextPerfectSquare(6);
        System.out.println(result);
    }

    public boolean isPerfectSquare(int n) {
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }

    public int nextPerfectSquare(int n) {
        int nextNumber = n + 1;

        while (!isPerfectSquare(nextNumber)) {
            nextNumber++;
        }

        return nextNumber;
    }
}
