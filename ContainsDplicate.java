import java.util.*;

public class ContainsDplicate  {

     public static boolean noOfOccurences(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int oldFreq = hm.getOrDefault(arr[i], 0);
                hm.put(arr[i], oldFreq+1);
            }
            for(int key : hm.keySet()){
                int freq = hm.get(key);
                
                if(freq >= 2) return true;
            }
         return false;
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(noOfOccurences(arr));
    }
}
