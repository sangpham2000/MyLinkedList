public class Exercise24 {
    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int n = str.length();
        MyStack<Character> s = new MyStack<>();
        int i;
        for (i = 0; i < n; i++) {
            s.push(charArr[i]);
        }
        for (i = 0; i < n; i++) {
            charArr[i] = s.pop();
        }
        return String.valueOf(charArr);
    }
    public static void main(String[] args) {
        String str = "Pham Thanh Sang";
        System.out.println(reverse(str));
    }
}
