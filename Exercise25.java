public class Exercise25 {
    public static boolean checkBracketsBalanced(String str) {
        MyStack<Character> s = new MyStack<>();
        for (int i = 0; i < str.length(); i++) {

            char temp = str.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                s.push(temp);
                continue;
            }

            if (s.isEmpty()) {
                return false;
            }

            char check;
            switch (temp) {
                case ')':
                    check = s.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = s.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;

                case ']':
                    check = s.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(([{}]))";
        if (checkBracketsBalanced(str)) {
            System.out.print("Balanced");
        } else {
            System.out.print("Not Balanced");
        }
    }
}
