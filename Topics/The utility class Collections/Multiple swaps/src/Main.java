import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> collection = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            Collections.swap(collection, first, second);
        }
        collection.forEach(i -> System.out.print(i + " "));
    }
}