import java.util.Arrays;

public class S32Q1 {
    public static void main(String[] args) {
        S32Q1 myClass = new S32Q1();

        int[] a = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int miles = 13;
        myClass.updateMileagecounter(a, miles);
    }

    public void updateMileagecounter(int[] a, int miles) {
        long currentCounter = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            currentCounter += a[i];
            currentCounter *= 10;
        }

        currentCounter /= 10;
        long updatedCounter = currentCounter + miles;

        int index = 0;

        while (index < a.length) {
            int digit = (int)(updatedCounter % 10);
            a[index] = digit;
            index++;
            updatedCounter /= 10;
        }

        System.out.println(Arrays.toString(a));
    }
}
