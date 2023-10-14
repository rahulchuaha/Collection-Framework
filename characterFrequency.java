
public class characterFrequency{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        TreeMap<Character, Integer> hm = new TreeMap<>();
        
        for(int i=0; i<n; i++){
            char ch = sc.next().charAt(0);
            int oldfreq = hm.getOrDefault(ch, 0);
            hm.put(ch, oldfreq+1);
        }
        
        for(char key : hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }
    }
}