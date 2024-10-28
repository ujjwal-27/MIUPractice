import java.util.Arrays;

public class S13Q3 {
    public static void main(String[] args) {
        int[] result = computeHMS(3735);
        System.out.println(Arrays.toString(result));
    }

    public static int[] computeHMS(int seconds) {
        int[] hms = new int[3];

        int hour = seconds / 3600;
        int remainder = (seconds % 3600);
        int minute =  remainder / 60;
        int sec = remainder % 60;

        hms[0] = hour;
        hms[1] = minute;
        hms[2] = sec;

        return hms;
    }
}
