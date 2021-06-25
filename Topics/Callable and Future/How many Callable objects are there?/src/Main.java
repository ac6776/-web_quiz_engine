import java.util.concurrent.*;


class FutureUtils {

    public static int determineCallableDepth(Callable callable) throws Exception {
        // write your code here
        var obj = callable.call();
        if (!(obj instanceof Callable)) {
            return 1;
        }
        return 1 + determineCallableDepth((Callable) obj);
    }

}