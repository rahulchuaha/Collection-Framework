import java.util.*;

public class QueueUsingStack {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int option = sc.nextInt();
            if(option == 1){
                
                int x = sc.nextInt();
                stk1.push(x);
                
            } else if(option == 2){
                
                while(stk1.size() > 0){
                   stk2.push(stk1.pop()); 
                }
                stk2.pop();
                while(stk2.size() > 0){
                    stk1.push(stk2.pop());
                }
                
            } else if(option == 3){
                
                while(stk1.size() > 0){
                    stk2.push(stk1.pop());
                }
                System.out.println(stk2.peek());
                
                while(stk2.size() > 0){
                    stk1.push(stk2.pop());
                }
                
            }
        }
    }
}