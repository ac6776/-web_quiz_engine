import java.util.stream.Collectors;

class StringUtils {
    public static boolean isPalindrome(String str) {
        // your code here
        if (str == null) {
            return false;
        }
        String res = str.toLowerCase().chars()
                .mapToObj(i -> String.valueOf((char) i))
                .filter(s -> s.matches("\\w"))
                .collect(Collectors.joining());
        if (res.isBlank() || res.length() < 2) {
            return false;
        }
        int start = 0;
        int end = res.length() - 1;
        while (start < end) {
            if (res.charAt(start) != res.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}