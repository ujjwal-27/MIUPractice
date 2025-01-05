package Solutions;

public class P29Q3 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 1, 1, 3};
        int[] p = {1, 2, 1, 3};

        int result = matchPattern(a, p);
        System.out.println(result);
    }

    static int matchPattern(int[] a, int[] pattern) {
        // len is the number of elements in the array 'a', patternLen is the number of elements in the pattern.
        int i = 0; // index into a
        int k = 0; // index into pattern
        int len = a.length;
        int matches = 0; // how many times current pattern character has been matched so far
        int patternLen = pattern.length;

        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k]) {
                matches++; // current pattern character was matched

            } else if (matches == 0 || k == patternLen - 1) {
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)

            } else // advance to next pattern character {
                !!You write this code!!
            }
        }

        // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i == len && k == patternLen-1){
            return 1;

        } else {
            return 0;
        }
}
