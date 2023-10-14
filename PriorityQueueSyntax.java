import java.util.*;

public class PriorityQueueSyntax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> q = new PriorityQueue<>(); 
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int option = sc.nextInt();
            
            if(option == 1){
                
                System.out.println(q.size());
                
            } else if(option == 2){
                
                if(q.size() == 0) System.out.println("-1");
                else q.remove();
                                                    
            } else if(option == 3){
                
                int x = sc.nextInt();
                q.add(x);
                
            } else if(option == 4){
                
                if(q.size() == 0) System.out.println("-1");
                else System.out.println(q.peek());
                
            }
        }
    }
}