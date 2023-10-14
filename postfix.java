 import java.util.*;

public class postfix  {
    public static int printResult(String str){
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                stk.push(ch-'0');
            }else if(ch == '+'){
                
                int a = stk.pop();
                int b = stk.pop();
                    stk.push(a+b);
                
            } else if(ch == '-'){
                
                int a = stk.pop();
                int b = stk.pop();
                    stk.push(b-a);
                
            }else if(ch == '*'){
                
                int a = stk.pop();
                int b = stk.pop();
                    stk.push(a*b);
                
            }else if(ch == '/'){
                
                int a = stk.pop();
                int b = stk.pop();
                    stk.push(b/a);
                
            }
        }
        return stk.peek();
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(printResult(str));
    }
}