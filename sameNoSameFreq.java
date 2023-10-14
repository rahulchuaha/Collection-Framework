import java.util.*;

public class sameNoSameFreq {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>(); 
         int n = sc.nextInt();
         for(int i=0; i<n; i++){
             int num = sc.nextInt();
             int oldFreq = hm.getOrDefault(num, 0);
             hm.put(num, oldFreq+1);
         }
        for(int key : hm.keySet()){
            if(Math.abs(key) == hm.get(key))
                System.out.println(key);
        }
    }
}