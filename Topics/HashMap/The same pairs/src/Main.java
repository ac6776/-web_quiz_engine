import java.util.*;


class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        int counter = 0;
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey()) &&
                    entry.getValue().equals(map2.get(entry.getKey()))) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}