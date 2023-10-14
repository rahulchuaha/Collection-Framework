package Collection-Framework;

import java.io.*;
import java.util.*;

public class ArrayListPrinting {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
