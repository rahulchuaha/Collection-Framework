import java.util.*;
public  class BreakStone{
    public static int printResult(int arr[]){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            q.add(arr[i]);
        }
        while(q.size() > 1){
             int y = q.remove();
        int x = q.remove();
        if(x != y){
            q.add(y-x);
        }
        }
        if(q.size() == 0) return 0;
        else return q.peek();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(printResult(arr));
    }
}