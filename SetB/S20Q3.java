public class S20Q3 {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 3, 2};
        int result = isMinMaxDisjoint(a);
        System.out.println(result);
    }

    public static int isMinMaxDisjoint(int[] a) {
        if (a.length == 0) return 0;

        int countMaxValue = 0;
        int countMinValue = 0;
        int maxValue = a[0];
        int minValue = a[0];
        int maxValueIndex = 0;
        int minValueIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
                maxValueIndex = i;
            }

            if (a[i] < minValue) {
                minValue = a[i];
                minValueIndex = i;
            }
        }

        if (maxValue == minValue) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == maxValue) {
//                if (i == 0 && a[i + 1] == minValue) {
//                    return 0;
//
//                } else if (i == a.length - 1 && a[i - 1] == minValue) {
//                    return 0;
//
//                } else if (i != 0 && i != a.length - 1 && (a[i - 1] == minValue || a[i + 1] == minValue)) {
//                    return 0;
//                }

                countMaxValue++;

            } else if (a[i] == minValue) {
//                if (i == 0 && a[i + 1] == maxValue) {
//                    return 0;
//
//                } else if (i == a.length - 1 && a[i - 1] == minValue) {
//                    return 0;
//
//                } else if (i != 0 && i != a.length - 1 && (a[i - 1] == minValue || a[i + 1] == minValue)) {
//                    return 0;
//                }

                countMinValue++;
            }
        }

        if (countMaxValue > 1 || countMinValue > 1) return 0;

        if (maxValueIndex - minValueIndex == 1 || maxValueIndex - minValueIndex == -1) return 0;

        return 1;
    }
}
