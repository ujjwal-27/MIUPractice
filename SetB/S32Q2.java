public class S32Q2 {
    public static void main(String[] args) {
        S32Q2 myClass = new S32Q2();

        int result = myClass.findSmallestBEQnumber();
        System.out.println(result);
    }

    public int findSmallestBEQnumber() {
        for (int i = 1; ; i++) {
            int count = 0;
            int cube = i * i * i;

            while (cube > 0) {
                int digit = cube % 10;

                if (digit == 6) count++;

                cube /= 10;
            }

            if (count == 4) return i;
        }
    }
}
