import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void sortInDescendingOrder(List<Integer> sequence) {
       // for (int i = 0; i < sequence.size(); i++) {
       //     for (int j = 0; j < sequence.size(); j++)
       // }
       Collections.sort(sequence);
       List<Integer> oldSeq = new ArrayList<>();
       oldSeq.addAll(sequence);
       sequence.clear();
       for (int i = oldSeq.size() - 1; i >= 0; i--) {
           sequence.add(oldSeq.get(i));
       }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> seq = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        sortInDescendingOrder(seq);
        seq.forEach(e -> System.out.print(e + " "));
    }
}
