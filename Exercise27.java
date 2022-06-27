public class Exercise27 {
    public static boolean isPalindrome(String str) {
        MyStack<Character> s = new MyStack<>();
        str = str.replaceAll("[-+.^:, ]", "").toLowerCase();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                s.push(str.charAt(i));
            }
        }
        for (int i = 0; i < length; i++) {
            if (s.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        // String str = "saaas";
        // String str = "12521";
        System.out.println(str);
        if (isPalindrome(str)) {
            System.out.println("The input String is a palindrome.");
        } else {
            System.out.println("The input String is not a palindrome.");
        }
    }
}
