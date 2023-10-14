import java.util.*;

public class BinaryNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> q = new ArrayDeque<>();
        q.add("1");
        for(int i=0; i<n; i++){
            String front = q.remove();
            System.out.print(front+" ");
            q.add(front+"0");
            q.add(front+"1");
        }
    }
}