import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var src = parseAndGet(scanner.nextLine());
        var trg = parseAndGet(scanner.nextLine());

        var first = Collections.indexOfSubList(src, trg);
        var last = Collections.lastIndexOfSubList(src, trg);
        System.out.println(first + " " + last);
    }

    private static List<Integer> parseAndGet(String input) {
        return Arrays.stream(input.split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}