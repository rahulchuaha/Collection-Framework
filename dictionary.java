import java.util.*;

public class dictionary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        
        while(true){
            int option = sc.nextInt();
            if(option == 1){
                
                String word = sc.next();
                String meaning = sc.next();
                hm.put(word, meaning);
                
            } else if(option == 2){
                
                String word = sc.next();
                 
                System.out.println(hm.getOrDefault(word, "-1"));
                
            } else if(option == 3){
                
                String word = sc.next();
                hm.remove(word);
                
            } else if(option == 4){
                
                break;
                
            }
        }
    }
}