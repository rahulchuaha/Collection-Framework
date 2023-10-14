import java.util.*;

public class stackSyntax {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Stack<Integer> stk = new Stack<>();
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            int option = sc.nextInt();
            
            if(option == 1){
                System.out.println(stk.size());
            } 
            else if(option == 2){
                if(stk.size() == 0) System.out.println("-1");
                else stk.pop();
            } 
            else if(option == 3){
                int x = sc.nextInt();
                stk.push(x);
            } 
            else if(option == 4){
                if(stk.size() == 0) System.out.println("-1");
                else System.out.println(stk.peek());
            }
        }
    }
}
