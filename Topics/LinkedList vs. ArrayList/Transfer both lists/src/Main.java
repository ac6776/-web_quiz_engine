import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        // write your code here
        var arrayListCopy = new ArrayList<String>(arrayList);
        arrayList.clear();
        arrayList.addAll(linkedList);
        linkedList.clear();
        linkedList.addAll(arrayListCopy);
    }
}