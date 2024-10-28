public class Set14Question2 {
    public static void main(String[] args) {
        int result = maxOccurDigit(327277);
        System.out.println(result);
    }

    public static int maxOccurDigit(int n) {
        if (n < 0) {
            n *= -1;
        }

        boolean maxFlag = false;
        int maxCount = 0;
        int maxOccurDigit = 0;
        int num = n;

        while (num > 0) {
            int count = 0;
            int digit = num % 10;
            int temp = n;

            while (temp > 0) {
                if (temp % 10 == digit) {
                    count++;
                }

                temp /= 10;
            }

            if (count > maxCount) {
                maxCount = count;
                maxFlag = true;
                maxOccurDigit = digit;

            } else if (count == maxCount && maxOccurDigit != digit) {
                maxFlag = false;
            }

            num /= 10;
        }

        if (maxFlag) {
            return maxOccurDigit;

        } else {
            return -1;
        }
    }
}
