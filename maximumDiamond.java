import java.util.*;

//Question statement
//There are bags with diamonds in them. The i'th of these bags contains diamonds. 
//If you drop a bag with diamonds, it changes to diamonds, and you gain diamonds, where is the greatest integer less than .
 //Dropping a bag takes 1 minute. Find the maximum number of diamonds that you can take if you are given minutes.

public class maximumDiamond {
    public static int maxDiamond(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        for(int i=0; i<k; i++){
            int diamond = pq.remove();
            sum += diamond;
            pq.add(diamond/2);
        }
        return sum;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxDiamond(arr, k));
    }
}
