import java.util.*;

public class FirstNegativeInteger {
    public static ArrayList<Integer> printResult(int arr[], int k, int n){
        int left = 0, right = k-1;
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=left; i<right; i++){
            if(arr[i] < 0) q.add(arr[i]);
        }
        while(right < n){
            if(left > 0 && arr[left-1] < 0) q.remove();
            if (arr[right] < 0) q.add(arr[right]);
            
            left++;
            right++;
            
            if(q.size() == 0) res.add(0);
            else res.add(q.peek());
        }
        
         
        return res;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = printResult(arr, k, n);
        for(int val : res){
            System.out.print(val+" ");
        }
    }
}