import java.io.*;
import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int T = scn.nextInt();
        for(int i = 0; i < T; i++){
            int option = scn.nextInt();
            
            if(option == 1){
                // Print Size: O(1)
                System.out.println(arr.size()); 
                
            } else if(option == 2){
                if(arr.size() == 0){
                    System.out.println("invalid-move");
                } else {
                    // Remove Last Element: O(1)
                    int val = arr.remove(arr.size() - 1);
                    System.out.println(val);
                }
                
            } else if(option == 3){
                // Add at Last Index: O(1)
                int x = scn.nextInt();
                System.out.println(x);
                arr.add(x);
                
            } else if(option == 4){
                if(arr.size() == 0){
                    System.out.println("invalid-move");
                } else {
                    // Remove First Element: O(n)
                    int val = arr.remove(0);
                    System.out.println(val);
                }
                
            } else if(option == 5){
                // Add at Starting Index: O(n)
                int x = scn.nextInt();
                System.out.println(x);
                arr.add(0, x);
                
            } else if(option == 6){
                if(arr.size() == 0){
                    System.out.println("invalid-move");
                } else {
                    // Iteration or Printing all values: O(n)
                    for(int idx = 0; idx < arr.size(); idx++){
                        System.out.print(arr.get(idx) + " ");
                    }
                    System.out.println();
                }
                
            }
        }
    }
}