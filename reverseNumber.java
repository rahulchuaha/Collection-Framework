import java.util.*;

public class reverseNumber {
    public static int printReverse(int n){
        Stack<Integer> stk = new Stack<>();
        while(n>0){
            int digit = n%10;
            stk.push(digit);
            n /= 10;
        }
        int reverse = 0;
        int multiplier = 1;
        while(stk.size() > 0){
            reverse += stk.pop()*multiplier;
            multiplier *= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            System.out.println(printReverse(n));
        }
    }
}