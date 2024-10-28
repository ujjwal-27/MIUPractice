public class Question13 {
    public static void main(String[] args) {
        int result = answerOne(50);
        System.out.println(result);
    }

    public static int answerOne(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i * i + j * j == n) {
                    count++;
                }
            }
        }

        if (count == 2) return 1;

        return 0;
    }
}
