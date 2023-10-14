import java.util.*;

public class phoneDirectory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap();
        while(true){
            int option = sc.nextInt();
            if(option == 1){
                
                String name = sc.next();
                String phone = sc.next();
                hm.put(name, phone);
                
            } else if(option == 2){
                
                String name = sc.next();
                System.out.println(hm.getOrDefault(name, "-1"));
                
            } else if(option == 3){
                
                String name = sc.next();
                hm.remove(name);
                
            } else if(option == 4){
                
                return;
                
            }
        }
    }
}