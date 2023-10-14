import java.util.*;

public class nextGreaterElement {
    public static int[] printResult(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(stk.size()>0 && stk.peek() <= arr[i]){
                stk.pop();
            }
            if(stk.size() == 0)  res[i] = -1;
            else res[i] = stk.peek();
            stk.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = printResult(arr);
        for(int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
    }
}