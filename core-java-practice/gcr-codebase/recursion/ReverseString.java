public class Problem4ReverseString {
    static String reverseString(String s) {
        if (s.length() <= 1) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
}
