import java.util.*;

public class MaximumProduct {
    public static int printResult(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        
        int a = pq.remove();
        int b = pq.remove();
        int ans = (a-1)*(b-1);
        return ans;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =  new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(printResult(arr));
    }
}