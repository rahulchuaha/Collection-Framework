import java.util.*;

public class WeakestRow {
    public static int countSoldiers(int[][] mat, int row){
        int soldiers = 0;
        for(int col = 0; col < mat[0].length; col++){
            if(mat[row][col] == 1) soldiers++;
        }
        return soldiers;
    }
    
    public static void printAnswer(int[][] mat, int k){
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a[1] != b[1]) return a[1] - b[1];
                else return a[0] - b[0];
            }
        );
        
        for(int row = 0; row < mat.length; row++){
            int[] arr = new int[2];
            arr[0] = row;
            arr[1] = countSoldiers(mat, row);
            pq.add(arr);
        }
        
        for(int idx = 0; idx < k; idx++){
            int[] arr = pq.remove();
            System.out.print(arr[0] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int[][] mat = new int[m][n];
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        
        printAnswer(mat, k);
    }
}