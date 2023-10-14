import java.util.*;

public class phoneDirectory2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> directory = new HashMap<>();
        
        int choice;
        do {
            choice = scanner.nextInt();
            scanner.nextLine();  
            
            switch (choice) {
                case 1: 
                    String name = scanner.nextLine();
                    String phoneNumber = scanner.nextLine();
                    directory.put(name, phoneNumber);
                    break;
                case 2: 
                    String searchName = scanner.nextLine();
                    String searchNumber = directory.getOrDefault(searchName, "-1");
                    System.out.println(searchNumber);
                    break;
                case 3: 
                    String deleteName = scanner.nextLine();
                    directory.remove(deleteName);
                    break;
                case 4: 
                    break;
                default:
                    break;
            }
        } while (choice != 4);
         
    }
}