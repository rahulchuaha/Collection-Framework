import java.util.*;

public class ImplementingQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String option = sc.next();
            
            if(option.equals("enqueue")){
                
                int x = sc.nextInt();
                q.add(x);
                
            } else if(option.equals("dequeue")){
                
                if(q.size() != 0) q.remove();
                
            } else if(option.equals("size")){
                
                System.out.println(q.size());
                
            } else if(option.equals("display")){
                
                for(int val : q){
                    System.out.print(val+" ");
                }
                    System.out.println();
            }
        }
    }
}