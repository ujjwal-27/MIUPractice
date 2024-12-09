public class S34Q1 {
    public static void main(String[] args) {
        S34Q1 myClass = new S34Q1();

        int[] a = {1, 1, 2, 2, 2, 2};
        int[] pattern = {1, 2};
        int result = myClass.matchPattern(a, pattern);
        System.out.println(result);
    }

    public int matchPattern(int[] a, int[] pattern) {
        int i = 0; // index into a
        int k = 0; // index into pattern
        int length = a.length;
        int matches = 0; // how many times current pattern character has been matched so far
        int patternLen = pattern.length;

        for (i = 0; i < length; i++) {
            if (a[i] == pattern[k]){
                matches++; // current pattern character was matched

            } else if (matches == 0 || k == patternLen - 1) {
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)

            } else {
                k++;
                i--;
                matches = 0;
            } // advance to next pattern character
        }
        // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i == length && k == patternLen - 1) {
            return 1;

        } else {
            return 0;
        }
    }
}
