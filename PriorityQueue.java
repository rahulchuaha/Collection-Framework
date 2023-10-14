import java.util.*;

public class PriorityQueue {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         PriorityQueue<Integer> q = new PriorityQueue<>();
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int x = sc.nextInt();
            q.add(x);
            System.out.println(q.peek());
        }
         
    }
}