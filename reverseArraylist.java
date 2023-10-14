 
import java.util.*;

public class reverseArraylist {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
             arr.add(val);
        }
        for(int i=arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        
         Collections.reverse(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}

