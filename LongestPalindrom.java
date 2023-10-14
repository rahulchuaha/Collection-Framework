import java.util.*;

public class LongestPalindrom {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>(); 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        int maxLength = 0;
        boolean hasOddCount = false; 
        for (int count : charCountMap.values()) {
            if (count % 2 == 0) {
               
                maxLength += count;
            } else {
                
                maxLength += count - 1;
                hasOddCount = true;
            }
        } 
        if (hasOddCount) {
            maxLength++;
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine(); 
        int length = longestPalindrome(input); 
        System.out.println(length); 
    }
}