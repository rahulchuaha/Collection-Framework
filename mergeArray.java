 
import java.util.*;

public class mergeArray{
    public static ArrayList<Integer> merge(int arr1[], int arr2[]){
        ArrayList<Integer> res = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1] <= arr2[p2]){
                if(res.size() == 0 || res.get(res.size()-1) != arr1[p1]){
                    res.add(arr1[p1]);
                }
                p1++;
            } else{
                if(res.size() == 0 || res.get(res.size()-1) != arr2[p2]){
                    res.add(arr2[p2]);
                } 
                p2++;
            }
        }
        while(p1<arr1.length){
            if(res.size() == 0 || res.get(res.size()-1) != arr1[p1]){
                res.add(arr1[p1]);
        }
            p1++;
    }
        while(p2<arr2.length){
            if(res.size() == 0 || res.get(res.size()-1) != arr2[p2]){
                res.add(arr2[p2]);
            } 
            p2++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> res = merge(arr1, arr2);
        for(int num : res){
            System.out.print(num+" ");
        }
         
        }
    }