import java.util.*;

public class validParanthesis {
    public static boolean printValid(String str){
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')' && stk.size() == 0) return false;
            if(ch == '('){
                stk.push(ch);
            } else{
                stk.pop();
            }
        }
        if(stk.size() == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         System.out.println(printValid(str));
    }
}