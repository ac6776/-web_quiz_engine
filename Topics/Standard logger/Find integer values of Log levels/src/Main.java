import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        var num = (Integer) Arrays.stream(input.split("\\s"))
                .map(string -> Level.parse(string.toUpperCase()))
                .mapToInt(Level::intValue)
                .sum();
        System.out.println(num);
    }
}