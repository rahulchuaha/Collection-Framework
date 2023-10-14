import java.util.*;

public class SubtrackNumber {
    public static int printResult(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int count = 0, last = 0;
        while(pq.size() > 0){
            int curr = pq.remove();
            
            if(curr != last){
                count++;
                last = curr;
            }
        }
        return count;
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