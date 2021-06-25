import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        var sum = 0;
        Collections.reverse(items);
        sum = items.stream().mapToInt(f -> {
            try {
                return f.get().call();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }).sum();
        return sum;
    }

}