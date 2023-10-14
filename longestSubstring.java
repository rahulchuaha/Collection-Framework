import java.util.*;

public  class longestSubstring {
    public static int printLongestPalindrom(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0, right = 0, ans = 0;
        while(right < str.length()){
            char ch = str.charAt(right);
            int last = hm.getOrDefault(ch, -1);
            
            if(last >= left) left = last+1;
            hm.put(ch, right);
             
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
        System.out.println(printLongestPalindrom(str));
    }
}