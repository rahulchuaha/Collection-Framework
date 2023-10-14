import java.util.*;

public class deleteCongicutive  {
    public static int printRemaining(String arr[]){
        Stack<String> stk = new Stack<>();
        for(String str : arr){
            if(stk.size()==0 || str.equals(stk.peek()) == false){
                stk.push(str);
            } else{
                stk.pop();
            }
        }
        return stk.size();
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        System.out.println(printRemaining(arr));
    }
}