public class S35Q3 {
    public static void main(String[] args) {
        S35Q3 myClass = new S35Q3();

        int result = myClass.countRepresentations(12);
        System.out.println(result);
    }

    public int countRepresentations(int numRupees) {
        int count = 0;

        for (int rupee20 = 0; rupee20 <= numRupees / 20; rupee20++) {
            int count20 = rupee20 * 20;

            for (int rupee10 = 0; rupee10 <= numRupees / 10; rupee10++) {
                int count10 = rupee10 * 10;

                for (int rupee5 = 0; rupee5 <= numRupees / 5; rupee5++) {
                    int count5 = rupee5 * 5;

                    for (int rupee2 = 0; rupee2 <= numRupees / 2; rupee2++) {
                        int count2 = rupee2 * 2;

                        for (int rupee1 = 0; rupee1 <= numRupees; rupee1++)
                        {
                            if (count20 + count10 + count5 + count2 + rupee1 == numRupees) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
