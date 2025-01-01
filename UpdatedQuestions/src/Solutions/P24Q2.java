package Solutions;

public class P24Q2 {
    public static void main(String[] args) {
        P24Q2 myClass = new P24Q2();

        int[] a = {2, 2, 2};

        int result = myClass.is121Array(a);
        System.out.println(result);
    }

    public int is121Array(int[] a) {
        int countFirstOnes = 0;
        int countLastOnes = 0;
        int countTwo = 0;
        int index = 0;

        while (index < a.length && a[index] == 1) {
            countFirstOnes++;
            index++;
        }

        while (index < a.length && a[index] == 2) {
            countTwo++;
            index++;
        }

        while (index < a.length && a[index] == 1) {
            countLastOnes++;
            index++;
        }

        if (countFirstOnes + countTwo + countLastOnes == a.length) {
            if (countFirstOnes != 0 && countFirstOnes == countLastOnes) {
                return 1;
            }
        }

        return 0;
    }
}
