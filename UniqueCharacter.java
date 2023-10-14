import java.util.*;

public class UniqueCharacter{
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
         
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
         
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCountMap.get(c) == 1) {
                return i;
            }
        } 
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
         
        int index = firstUniqChar(input);
         
        System.out.println(index);
        
         
    }
}