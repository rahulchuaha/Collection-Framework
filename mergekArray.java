import java.util.*;

public class mergekArray  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();  

        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.value)); // Min heap

         
        for (int i = 0; i < k; i++) {
            int size = scanner.nextInt(); 
 
            for (int j = 0; j < size; j++) {
                int value = scanner.nextInt();
                minHeap.offer(new Element(i, value));
            }
        }
 
        List<Integer> mergedArray = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            Element element = minHeap.poll();
            mergedArray.add(element.value);
        } 
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    static class Element {
        int arrayIndex;
        int value;

        Element(int arrayIndex, int value) {
            this.arrayIndex = arrayIndex;
            this.value = value;
        }
    }
}