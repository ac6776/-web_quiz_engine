import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> list = new ArrayList<>(Arrays.asList(array));
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if (value.startsWith("J")) {
                listIterator.set(value.substring(1));
            } else {
                listIterator.remove();
            }
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
//        Arrays.stream(array)
//                .filter(s -> s.startsWith("J"))
//                .map(s -> s.substring(1))
//                .collect(Collectors.toCollection(LinkedList::new))
//                .descendingIterator()
//                .forEachRemaining(System.out::println);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}