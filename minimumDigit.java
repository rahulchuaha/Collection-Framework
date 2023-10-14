import java.util.*;

public class minimumDigit {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         int n = sc.nextInt();
         for(int i=0; i<n; i++){
             int x = sc.nextInt();
             pq.add(x);
         }
        int num1 = 0, num2 = 0;
        for(int count=0; count<n; count++){
            int digit = pq.remove();
            
            if(count % 2 == 0) num1 = num1*10+digit;
            else num2 = num2*10+digit;
        } 
        System.out.println(num1+num2);
    }
}