import java.util.stream.IntStream;

class TestHelper {
    public static int[] primeGenerator() {
        // your code here
        return IntStream
                .range(10, 1000)
                .filter(TestHelper::isPrime)
                .limit(40)
                .toArray();
    }

    private static boolean isPrime(int num) {
        if (num >= 2) {
            if (num == 2) {
                return true;
            }
            if (num % 2 == 0) {
                return false;
            }
            int count = 0;
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    if (i * j == num) {
                        count++;
                    }
                }
            }
            return count == 2;
        }
        return false;
    }
}