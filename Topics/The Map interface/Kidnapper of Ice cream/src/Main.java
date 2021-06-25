import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var src = Arrays.stream(scanner.nextLine().split("\\s"))
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        var trg = Arrays.stream(scanner.nextLine().split("\\s"))
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        var res = "You get money";
        for (var e : trg.entrySet()) {
            if (!src.containsKey(e.getKey()) || src.getOrDefault(e.getKey(), 0L) < e.getValue()) {
                res = "You are busted";
                break;
            }
        }
        System.out.println(res);
    }
}
