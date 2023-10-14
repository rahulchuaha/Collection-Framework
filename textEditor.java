import java.util.*;

public class TextEditor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stk = new Stack<>();
        stk.push("");
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int option = sc.nextInt();
            if(option == 1){
                
                String str = sc.next();
                stk.push(stk.peek()+str);
                
            } else if(option == 2){
                
                int k = sc.nextInt();
                String str = stk.peek();
                int n = str.length();
                stk.push(str.substring(0,n-k));
                
                
            } else if(option == 3){
                
                int k = sc.nextInt();
                String str = stk.peek();
                System.out.println(str.charAt(k-1));
                
            } else if(option == 4){
                
                stk.pop();
                
            }
        }
    }
}