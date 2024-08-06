import java.util.Stack;

public class ValidParanthesis {

    static boolean isValid(String s) {
        if(s.length()==0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.add(s.charAt(i));
                continue;
            }


           

            else {
               char a;
                switch (s.charAt(i)) {
                    case '}':
                        a = st.pop();
                        if(a != '{'){
                            return false;
                        }
                        break;
                    case ')':
                        a = st.pop();
                        if(a != '('){
                            return false;
                        }
                        break;
                        case ']':
                        a = st.pop();
                        if(a != '['){
                            return false;
                        }
                        break;
                    default:
                        break;
                }
            }

        }

      System.out.println(st);
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{{[]}}()";

        System.out.println(isValid(s));
    }
}
